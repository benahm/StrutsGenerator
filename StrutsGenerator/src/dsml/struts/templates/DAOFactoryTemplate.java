package dsml.struts.templates;

import java.lang.reflect.*;
import dsml.struts.toolbox.*;

public class DAOFactoryTemplate
{
  protected static String nl;
  public static synchronized DAOFactoryTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    DAOFactoryTemplate result = new DAOFactoryTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package dsml.struts.domain.dao;" + NL + "" + NL + "" + NL + "/**" + NL + "* DAOFactory" + NL + "*" + NL + "*/" + NL + "" + NL + "public class DAOFactory {";
  protected final String TEXT_2 = NL + "\t" + NL + "\t/**" + NL + "\t*Create ";
  protected final String TEXT_3 = "DAO" + NL + "\t*/" + NL + "\tpublic static DAO<";
  protected final String TEXT_4 = "> get";
  protected final String TEXT_5 = "DAO(){" + NL + "\t\treturn new ";
  protected final String TEXT_6 = "DAO();" + NL + "\t}";
  protected final String TEXT_7 = NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Class<?>[] classes=(Class<?>[]) argument; 
    stringBuffer.append(TEXT_1);
     for(int i=0;i<classes.length;i++){ 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(classes[i].getSimpleName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(classes[i].getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append( Tools.capitalize(classes[i].getSimpleName()));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(classes[i].getSimpleName());
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
