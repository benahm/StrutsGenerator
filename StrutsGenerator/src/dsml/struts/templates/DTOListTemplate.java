package dsml.struts.templates;

import java.lang.reflect.*;
import dsml.struts.toolbox.*;

public class DTOListTemplate
{
  protected static String nl;
  public static synchronized DTOListTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    DTOListTemplate result = new DTOListTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package dsml.struts.domain.dao;" + NL + "import ";
  protected final String TEXT_3 = ";" + NL + "import java.io.Serializable;" + NL + "import java.util.List;" + NL + "" + NL + "/*" + NL + "* DTOList";
  protected final String TEXT_4 = " " + NL + "*/" + NL + "" + NL + "public class DTOList";
  protected final String TEXT_5 = " implements Serializable {" + NL + "" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL + "\t" + NL + "\tprivate List<";
  protected final String TEXT_6 = "> listOf";
  protected final String TEXT_7 = " ;" + NL + "\tprivate String error;" + NL + "\t" + NL + "\t" + NL + "\tpublic List<";
  protected final String TEXT_8 = " > getListOf";
  protected final String TEXT_9 = " () {" + NL + "\t\treturn listOf";
  protected final String TEXT_10 = " ;" + NL + "\t}" + NL + "\tpublic void setListOf";
  protected final String TEXT_11 = " (List<";
  protected final String TEXT_12 = " > listOf";
  protected final String TEXT_13 = " ) {" + NL + "\t\tthis.listOf";
  protected final String TEXT_14 = "  = listOf";
  protected final String TEXT_15 = " ;" + NL + "\t}" + NL + "\tpublic String getError() {" + NL + "\t\treturn error;" + NL + "\t}" + NL + "\tpublic void setError(String error) {" + NL + "\t\tthis.error = error;" + NL + "\t}" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     Class<?> arg = (Class<?>) argument; 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(arg.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(arg.getSimpleName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(arg.getSimpleName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(arg.getSimpleName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(arg.getSimpleName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(arg.getSimpleName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(arg.getSimpleName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(arg.getSimpleName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(arg.getSimpleName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(arg.getSimpleName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(arg.getSimpleName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(arg.getSimpleName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(arg.getSimpleName());
    stringBuffer.append(TEXT_15);
    return stringBuffer.toString();
  }
}
