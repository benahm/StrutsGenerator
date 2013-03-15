package dsml.struts.templates;

import java.util.*;
import java.lang.reflect.*;
import dsml.struts.toolbox.*;

public class ActionTemplate
{
  protected static String nl;
  public static synchronized ActionTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    ActionTemplate result = new ActionTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package dsml.struts.servletAction;" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import javax.servlet.http.HttpServletResponse;" + NL + "import org.apache.struts.action.Action;" + NL + "import org.apache.struts.action.ActionForm;" + NL + "import org.apache.struts.action.ActionForward;" + NL + "import org.apache.struts.action.ActionMapping;" + NL + "" + NL + "/**" + NL + " * ";
  protected final String TEXT_2 = "Action" + NL + " *" + NL + " */" + NL + "" + NL + "import dsml.struts.actionForm.";
  protected final String TEXT_3 = "ActionForm;" + NL + "" + NL + "public class ";
  protected final String TEXT_4 = "Action extends Action {" + NL + "    " + NL + "    public ActionForward execute(final ActionMapping pMapping, ActionForm pForm, " + NL + "            final HttpServletRequest pRequest, final HttpServletResponse pResponse) " + NL + "    {";
  protected final String TEXT_5 = NL + "        ";
  protected final String TEXT_6 = "ActionForm form = (";
  protected final String TEXT_7 = "ActionForm) pForm;" + NL + "        boolean failed = false;" + NL + "        " + NL + "        // TODO : Add Your Code Here !!!!" + NL + "        " + NL + "        return pMapping.findForward(failed ? \"error\" : \"success\");" + NL + "    }" + NL + "    " + NL + "}";
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Class<?> arg = (Class<?>)argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( arg.getSimpleName() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( arg.getSimpleName() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( arg.getSimpleName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    stringBuffer.append( arg.getSimpleName() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( arg.getSimpleName() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
