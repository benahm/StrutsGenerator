package struts.popup.actions;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;

public class ActionValidator implements IObjectActionDelegate {

	private Shell shell;
	private String filePath;
	private String pluginId = "StrutsProjectNew";

	/**
	 * Constructor for Action1.
	 */
	public ActionValidator() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
		ISelectionService service = targetPart.getSite().getWorkbenchWindow()
				.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service
				.getSelection("org.eclipse.jdt.ui.PackageExplorer");
		IFile file = (IFile) structured.getFirstElement();
		IPath path = file.getLocation();
		filePath = path.toPortableString();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		dsml.struts.test.Validator validator = new dsml.struts.test.Validator(
				filePath);
		validator.validate();
		ArrayList<String> errors = validator.getErrors();
		MultiStatus statusErrors = new MultiStatus(pluginId, 0,
				"See the details", null);
		for (String message : errors) {
			statusErrors.add(new Status(IStatus.ERROR, pluginId, message));
		}

		ErrorDialog.openError(shell, "DSML Errors", "Errors", statusErrors);
		if (statusErrors.isOK())
			MessageDialog.openInformation(shell, "DSML struts",
					"The file is valid ! ");

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
