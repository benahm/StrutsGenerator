package dsml.struts.templates;

import java.lang.reflect.*;
import dsml.struts.toolbox.*;

public class ConnectionFactoryTemplate
{
  protected static String nl;
  public static synchronized ConnectionFactoryTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    ConnectionFactoryTemplate result = new ConnectionFactoryTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package dsml.struts.domain.dao;" + NL + "" + NL + "import java.sql.Connection;" + NL + "import java.sql.DriverManager;" + NL + "import java.sql.SQLException;" + NL + "" + NL + "public class ConnectionFactory {" + NL + "        String driverClassName = \"com.mysql.jdbc.Driver\";" + NL + "        String connectionUrl = \"jdbc:mysql://localhost\";" + NL + "        String dbUser = \"root\";" + NL + "        String dbPwd = \"root\";" + NL + "" + NL + "        private static ConnectionFactory connectionFactory = null;" + NL + "" + NL + "        private ConnectionFactory() {" + NL + "                try {" + NL + "                        Class.forName(driverClassName);" + NL + "                } catch (ClassNotFoundException e) {" + NL + "                        e.printStackTrace();" + NL + "                }" + NL + "        }" + NL + "" + NL + "        public Connection getConnection() throws SQLException {" + NL + "                Connection conn = null;" + NL + "                conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);" + NL + "                return conn;" + NL + "        }" + NL + "" + NL + "        public static ConnectionFactory getInstance() {" + NL + "                if (connectionFactory == null) {" + NL + "                        connectionFactory = new ConnectionFactory();" + NL + "                }" + NL + "                return connectionFactory;" + NL + "        }" + NL + "}" + NL;
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
