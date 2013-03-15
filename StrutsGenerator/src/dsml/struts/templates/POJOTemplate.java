package dsml.struts.templates;

import java.util.*;
import org.eclipse.emf.common.util.*;
import dsml.struts.toolbox.*;
import dsml.visitor.Visitor;
import dsml.visitor.impl.*;
import dsml.web.*;

public class POJOTemplate
{
  protected static String nl;
  public static synchronized POJOTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    POJOTemplate result = new POJOTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package dsml.struts.domain;" + NL + "" + NL + "/**" + NL + "* Class ";
  protected final String TEXT_2 = NL + "*" + NL + "*/" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = " {" + NL + "" + NL + "\t";
  protected final String TEXT_4 = NL + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Form form = (Form) argument; 
    Visitor visitor=new POJOVisitorImpl("");
    stringBuffer.append(TEXT_1);
    stringBuffer.append(form.getAction());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(Tools.capitalize( form.getAction()) );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( form.accept(visitor));
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
