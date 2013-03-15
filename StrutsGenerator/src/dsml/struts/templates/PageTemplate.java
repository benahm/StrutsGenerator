package dsml.struts.templates;

import java.util.*;
import org.eclipse.emf.common.util.*;
import dsml.struts.toolbox.*;
import dsml.visitor.Visitor;
import dsml.visitor.impl.*;
import dsml.web.*;

public class PageTemplate
{
  protected static String nl;
  public static synchronized PageTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    PageTemplate result = new PageTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\" pageEncoding=\"ISO-8859-1\"%>" + NL + "<%@ taglib prefix=\"";
  protected final String TEXT_2 = "\" uri=\"http://struts.apache.org/tags-html\" %>" + NL + "<%@ taglib prefix=\"";
  protected final String TEXT_3 = "\" uri=\"http://struts.apache.org/tags-bean\" %>" + NL + "<%@ taglib prefix=\"nested\" uri=\"http://struts.apache.org/tags-nested\" %>";
  protected final String TEXT_4 = NL + NL + "<";
  protected final String TEXT_5 = ":html>" + NL + "" + NL + "<head>" + NL + "" + NL + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">" + NL + "<title> ";
  protected final String TEXT_6 = "</title>" + NL + "" + NL + "</head>" + NL + "" + NL + "<body>" + NL;
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL + "<";
  protected final String TEXT_11 = ":errors/>" + NL + "" + NL + "</body>" + NL + "</";
  protected final String TEXT_12 = ":html>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     String htmlTag="html",beanTag="bean";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(htmlTag);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(beanTag);
    stringBuffer.append(TEXT_3);
     Page page = (Page) argument; 
    stringBuffer.append(TEXT_4);
    stringBuffer.append(htmlTag);
    stringBuffer.append(TEXT_5);
    stringBuffer.append( page.getTitle() );
    stringBuffer.append(TEXT_6);
    Visitor visitor=new JSPVisitorImpl(htmlTag);
     EList<Text> texts =page.getTexts();
    for (Text text : texts) { 
    stringBuffer.append(TEXT_7);
    stringBuffer.append( text.accept(visitor) );
    }
     EList<Link> links =page.getLinks();
    for (Link link : links) { 
    stringBuffer.append(TEXT_8);
    stringBuffer.append( link.accept(visitor) );
    }
     if(page.getForm()!=null){ 
    stringBuffer.append(TEXT_9);
    stringBuffer.append( page.getForm().accept(visitor) );
    }
    stringBuffer.append(TEXT_10);
    stringBuffer.append(htmlTag);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(htmlTag);
    stringBuffer.append(TEXT_12);
    return stringBuffer.toString();
  }
}
