package struts.popup.actions;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import dsml.struts.test.Generator;

public class GenerateProject implements IObjectActionDelegate {

	private Shell shell;
	private String filePath;
	private String workspacePath;

	/**
	 * Constructor for Action1.
	 */
	public GenerateProject() {
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

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace()
				.getRoot();
		workspacePath = myWorkspaceRoot.getLocation().toOSString();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, new LabelProvider());
		dialog.setElements(getListProject());
		dialog.setTitle("Which operating system are you using");
		// User pressed cancel
		if (dialog.open() != Window.OK) {
		}
		Object[] result = dialog.getResult();
		final String selectedProject = result[0] + "";
		try {
			ProgressMonitorDialog dialogProgress = new ProgressMonitorDialog(
					shell);
			dialogProgress.run(true, true, new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					monitor.beginTask("Generating the project ...", 100);
					// execute the task ...
					Generator db = new Generator(filePath, workspacePath + "/"
							+ selectedProject);
					db.generateDBPart();
					db.generateStrutsPart();
					monitor.done();
				}
			});
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MessageDialog.openInformation(shell, "DSML struts", "The Struts project "
				+ result[0] + " is generated ! ");

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	private String[] getListProject() {
		ArrayList<String> list = new ArrayList<String>();
		File workspace = new File(workspacePath);
		File[] dirs = workspace.listFiles();
		for (File dir : dirs) {
			if (dir.isDirectory() && !dir.isHidden())
				list.add(dir.getName());
		}
		return list.toArray(new String[list.size()]);
	}

}
