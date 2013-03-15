package dsml.struts.templates;

import java.lang.reflect.*;
import dsml.struts.toolbox.*;

public class ActionFormTemplate
{
  protected static String nl;
  public static synchronized ActionFormTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    ActionFormTemplate result = new ActionFormTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package dsml.struts.actionForm;" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import org.apache.struts.action.ActionErrors;" + NL + "import org.apache.struts.action.ActionForm;" + NL + "import org.apache.struts.action.ActionMapping;" + NL + "import org.apache.struts.action.ActionMessage;" + NL + "import org.apache.commons.validator.routines.RegexValidator;" + NL + "import org.apache.commons.validator.routines.TimeValidator;" + NL + "import org.apache.commons.validator.*;" + NL + "import ";
  protected final String TEXT_3 = ";";
  protected final String TEXT_4 = " " + NL + "import ";
  protected final String TEXT_5 = ".";
  protected final String TEXT_6 = ";  ";
  protected final String TEXT_7 = NL + NL + "/**" + NL + " * ";
  protected final String TEXT_8 = "ActionForm " + NL + " *" + NL + " */" + NL + "public class ";
  protected final String TEXT_9 = "ActionForm extends ActionForm {" + NL + "" + NL + "" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_10 = NL + "\tprivate ";
  protected final String TEXT_11 = " ";
  protected final String TEXT_12 = "= ";
  protected final String TEXT_13 = ";" + NL + "    ";
  protected final String TEXT_14 = NL + "\t/* Getters */";
  protected final String TEXT_15 = NL + "\tpublic ";
  protected final String TEXT_16 = " get";
  protected final String TEXT_17 = "() {" + NL + "        \treturn ";
  protected final String TEXT_18 = ";" + NL + "\t}";
  protected final String TEXT_19 = " " + NL + "" + NL + "\t/* Setters */";
  protected final String TEXT_20 = NL + "\tpublic void set";
  protected final String TEXT_21 = "(String ";
  protected final String TEXT_22 = "Arg) {" + NL + "\t\t";
  protected final String TEXT_23 = " = ";
  protected final String TEXT_24 = ".valueOf(";
  protected final String TEXT_25 = "Arg);" + NL + "\t}";
  protected final String TEXT_26 = NL + "\tpublic void set";
  protected final String TEXT_27 = "(";
  protected final String TEXT_28 = " ";
  protected final String TEXT_29 = "Arg) {" + NL + "\t\t";
  protected final String TEXT_30 = " = ";
  protected final String TEXT_31 = "Arg;" + NL + "\t}";
  protected final String TEXT_32 = " " + NL + "" + NL + "" + NL + "    public void reset(ActionMapping mapping, HttpServletRequest request) {";
  protected final String TEXT_33 = NL + "\t\t";
  protected final String TEXT_34 = "= ";
  protected final String TEXT_35 = " ;";
  protected final String TEXT_36 = NL + "    }" + NL + "    \t" + NL + "    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {" + NL + "        ActionErrors errors = new ActionErrors();" + NL + "        " + NL + "        // Add your custom Validations here !";
  protected final String TEXT_37 = "       ";
  protected final String TEXT_38 = NL;
  protected final String TEXT_39 = NL + "        return errors;" + NL + "    }" + NL + "    " + NL + "}";
  protected final String TEXT_40 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     Class<?> arg = (Class<?>) argument; 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(arg.getName());
    stringBuffer.append(TEXT_3);
     for (Field field : arg.getDeclaredFields()) { 
if(field.getType().isEnum()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append( arg.getName() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( field.getType().getSimpleName() );
    stringBuffer.append(TEXT_6);
    } } 
    stringBuffer.append(TEXT_7);
    stringBuffer.append(arg.getSimpleName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(arg.getSimpleName());
    stringBuffer.append(TEXT_9);
     for (Field field : arg.getDeclaredFields()) { 
    stringBuffer.append(TEXT_10);
    stringBuffer.append( field.getType().getSimpleName() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( field.getName() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( Tools.getDefaultValue(field.getType()));
    stringBuffer.append(TEXT_13);
     } 
    stringBuffer.append(TEXT_14);
     for (Field field : arg.getDeclaredFields()) { 
    stringBuffer.append(TEXT_15);
    stringBuffer.append( field.getType().getSimpleName() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( Tools.capitalize(field.getName()) );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( field.getName() );
    stringBuffer.append(TEXT_18);
     } 
    stringBuffer.append(TEXT_19);
     for (Field field : arg.getDeclaredFields()) { 
     if(field.getType().isEnum()) {
    stringBuffer.append(TEXT_20);
    stringBuffer.append( Tools.capitalize(field.getName()) );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( field.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append( field.getName() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( field.getType().getSimpleName() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( field.getName() );
    stringBuffer.append(TEXT_25);
    } else{ 
    stringBuffer.append(TEXT_26);
    stringBuffer.append( Tools.capitalize(field.getName()) );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( field.getType().getSimpleName() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( field.getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append( field.getName() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( field.getName() );
    stringBuffer.append(TEXT_31);
     }} 
    stringBuffer.append(TEXT_32);
     for (Field field : arg.getDeclaredFields()) { 
    stringBuffer.append(TEXT_33);
    stringBuffer.append( field.getName() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( Tools.getDefaultValue(field.getType()));
    stringBuffer.append(TEXT_35);
     } 
    stringBuffer.append(TEXT_36);
    if(ValidationMap.get(arg.getSimpleName())!=null){
    stringBuffer.append(TEXT_37);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(ValidationMap.get(arg.getSimpleName()).getAll());
    }
    stringBuffer.append(TEXT_39);
    stringBuffer.append(TEXT_40);
    return stringBuffer.toString();
  }
}
