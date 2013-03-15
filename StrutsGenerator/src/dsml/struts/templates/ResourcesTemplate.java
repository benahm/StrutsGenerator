package dsml.struts.templates;

import java.util.*;
import org.eclipse.emf.common.util.*;
import dsml.struts.toolbox.*;
import dsml.visitor.Visitor;
import dsml.visitor.impl.*;
import dsml.web.*;

public class ResourcesTemplate
{
  protected static String nl;
  public static synchronized ResourcesTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    ResourcesTemplate result = new ResourcesTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "errors.header=<ul>" + NL + "errors.prefix=<li style=\"color: red;\">" + NL + "errors.suffix=</li>" + NL + "errors.footer=</ul>" + NL;
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = " ";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = " ";
  protected final String TEXT_6 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Website website = (Website) argument; 
     for(Page page : website.getPages()){ 
    Visitor visitor=new ResourceVisitorImpl(page.getName());
    stringBuffer.append(TEXT_1);
     String entry; 
     EList<Text> texts =page.getTexts();
for (Text text : texts) { 
     entry=text.accept(visitor);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(entry );
    stringBuffer.append(TEXT_3);
    }
     EList<Link> links =page.getLinks();
for (Link link : links) { 
     entry=link.accept(visitor);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(entry );
    stringBuffer.append(TEXT_5);
    }
     Form form=page.getForm(); 
     if(form!=null){
  entry=form.accept(visitor);
     System.out.println(ResourceMap.hashMap);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(entry);
    }}
    return stringBuffer.toString();
  }
}
