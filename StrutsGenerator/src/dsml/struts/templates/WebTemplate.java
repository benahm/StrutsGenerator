package dsml.struts.templates;

import java.util.*;

public class WebTemplate
{
  protected static String nl;
  public static synchronized WebTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    WebTemplate result = new WebTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<web-app xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://java.sun.com/xml/ns/javaee\" xmlns:web=\"http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" id=\"WebApp_ID\" version=\"2.5\">" + NL + "\t" + NL + "\t<display-name>";
  protected final String TEXT_2 = "</display-name>" + NL + "\t" + NL + "\t<welcome-file-list>" + NL + "\t\t<welcome-file>pages/index.jsp</welcome-file>" + NL + "\t</welcome-file-list>" + NL + "\t" + NL + "\t<servlet>" + NL + "\t\t<servlet-name>action</servlet-name>" + NL + "\t\t<servlet-class>org.apache.struts.action.ActionServlet</servlet-class>" + NL + "\t\t<init-param>" + NL + "\t\t\t<param-name>config</param-name>" + NL + "\t\t\t<param-value>/WEB-INF/struts-config.xml</param-value>" + NL + "\t\t</init-param>" + NL + "\t\t<load-on-startup>1</load-on-startup>" + NL + "\t</servlet>" + NL + "\t" + NL + "\t<servlet-mapping>" + NL + "\t\t<servlet-name>action</servlet-name>" + NL + "\t\t<url-pattern>*.do</url-pattern>" + NL + "\t</servlet-mapping>" + NL + "\t" + NL + "</web-app>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     String arg = (String) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( arg );
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
