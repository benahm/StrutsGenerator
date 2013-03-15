package dsml.struts.templates;

import java.util.*;
import org.eclipse.emf.common.util.*;
import dsml.web.*;
import dsml.struts.toolbox.*;

public class StrutsConfigTemplate
{
  protected static String nl;
  public static synchronized StrutsConfigTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    StrutsConfigTemplate result = new StrutsConfigTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>" + NL + "<!DOCTYPE struts-config PUBLIC" + NL + "          \"-//Apache Software Foundation//DTD Struts Configuration 1.1//EN\"" + NL + "          \"http://jakarta.apache.org/struts/dtds/struts-config_1_3.dtd\">" + NL + "<struts-config>" + NL + "" + NL + "\t<form-beans>";
  protected final String TEXT_2 = NL + "            <form-bean name=\"";
  protected final String TEXT_3 = "ActionForm\" type=\"dsml.struts.actionForm.";
  protected final String TEXT_4 = "ActionForm\" />";
  protected final String TEXT_5 = NL + "\t</form-beans>" + NL + "\t" + NL + "\t<action-mappings>";
  protected final String TEXT_6 = NL + "      \t\t  <action path=\"/";
  protected final String TEXT_7 = "\" forward=\"/pages/";
  protected final String TEXT_8 = ".jsp\" />" + NL + "\t\t\t";
  protected final String TEXT_9 = NL + "        <action path=\"/";
  protected final String TEXT_10 = "\" type=\"";
  protected final String TEXT_11 = "Action\"" + NL + "            name=\"";
  protected final String TEXT_12 = "ActionForm\" scope=\"request\" input=\"/pages/";
  protected final String TEXT_13 = ".jsp\">";
  protected final String TEXT_14 = NL + "            <forward name=\"success\" path=\"/pages/";
  protected final String TEXT_15 = ".jsp\" />";
  protected final String TEXT_16 = NL + "            <forward name=\"error\" path=\"/pages/";
  protected final String TEXT_17 = ".jsp\" />" + NL + "        \t";
  protected final String TEXT_18 = NL + "        </action>";
  protected final String TEXT_19 = NL + "\t</action-mappings>" + NL + "" + NL + "\t<message-resources parameter=\"Resources\" />" + NL + "</struts-config>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Website website = (Website) argument; 
    stringBuffer.append(TEXT_1);
     for(Form form :Tools.getFormsFromWebsite(website)) { 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(Tools.capitalize(form.getAction()));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(Tools.capitalize(form.getAction()));
    stringBuffer.append(TEXT_4);
     } 
    stringBuffer.append(TEXT_5);
     for(Page page : website.getPages()) { 
		for(Link link:page.getLinks()){ 
			if(link.getLinkedPage()!=null){
    stringBuffer.append(TEXT_6);
    stringBuffer.append( link.getLinkedPage().getName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(link.getLinkedPage().getName());
    stringBuffer.append(TEXT_8);
    }
		 } 
     } 
     for(Form form : Tools.getFormsFromWebsite(website)) { 
    stringBuffer.append(TEXT_9);
    stringBuffer.append( form.getAction() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( "dsml.struts.servletAction."+Tools.capitalize(form.getAction()) );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(Tools.capitalize(form.getAction()));
    stringBuffer.append(TEXT_12);
    stringBuffer.append( ((Page)form.eContainer()).getName());
    stringBuffer.append(TEXT_13);
     if(form.getSuccess()!=null) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append( form.getSuccess().getSuccessPage().getName() );
    stringBuffer.append(TEXT_15);
    }
     if(form.getError()!=null) {
    stringBuffer.append(TEXT_16);
    stringBuffer.append( form.getError().getErrorPage().getName() );
    stringBuffer.append(TEXT_17);
    }
    stringBuffer.append(TEXT_18);
     } 
    stringBuffer.append(TEXT_19);
    return stringBuffer.toString();
  }
}
