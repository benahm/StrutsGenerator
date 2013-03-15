package dsml.struts.templates;

import java.lang.reflect.*;
import dsml.struts.toolbox.*;

public class ConcretDAOTemplate
{
  protected static String nl;
  public static synchronized ConcretDAOTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    ConcretDAOTemplate result = new ConcretDAOTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package dsml.struts.domain.dao;" + NL + "" + NL + "import java.sql.Connection;" + NL + "import java.sql.PreparedStatement;" + NL + "import java.sql.ResultSet;" + NL + "import java.sql.SQLException;" + NL + "import ";
  protected final String TEXT_2 = ";" + NL + "/**" + NL + "* ";
  protected final String TEXT_3 = "DAO" + NL + "*" + NL + "*/" + NL + "" + NL + "public  class ";
  protected final String TEXT_4 = "DAO extends DAO<";
  protected final String TEXT_5 = "> {" + NL + "\t" + NL + "\t" + NL + "\tprivate Connection connection = null;" + NL + "    private PreparedStatement ptmt = null;" + NL + "    private ResultSet resultSet = null;" + NL + "\t" + NL + "\t// getConnection" + NL + "\tprivate Connection getConnection() throws SQLException {" + NL + "                Connection conn;" + NL + "                conn = ConnectionFactory.getInstance().getConnection();" + NL + "                return conn;" + NL + "    }" + NL + "\t" + NL + "\t" + NL + "\t/**" + NL + "\t * Permet de récupérer un objet via son ID" + NL + "\t * @param id" + NL + "\t * @return" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_6 = " find(long id){" + NL + "\t\t// ADD YOUR CODE HERE!!" + NL + "\t\ttry {" + NL + "\t\t\tString queryString = \"SELECT\";" + NL + "\t\t\tconnection = getConnection();" + NL + "\t\t\tptmt = connection.prepareStatement(queryString);" + NL + "\t\t\tresultSet = ptmt.executeQuery();" + NL + "\t\t} catch (SQLException e) {" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t} finally {" + NL + "\t\t\ttry {" + NL + "\t\t\t\tif (resultSet != null)" + NL + "\t\t\t\t\tresultSet.close();" + NL + "\t\t\t\tif (ptmt != null)" + NL + "\t\t\t\t\tptmt.close();" + NL + "\t\t\t\tif (connection != null)" + NL + "\t\t\t\t\tconnection.close();" + NL + "\t\t\t} catch (SQLException e) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t} catch (Exception e) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t}" + NL + "" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Permet de créer une entrée dans la base de données" + NL + "\t * par rapport à un objet" + NL + "\t * @param obj" + NL + "\t */" + NL + "\tpublic  ";
  protected final String TEXT_7 = " create(";
  protected final String TEXT_8 = " obj){" + NL + "\t\t// ADD YOUR CODE HERE!!" + NL + "\t\ttry {" + NL + "\t\t\tString queryString = \"INSERT_QUERY\";" + NL + "\t\t\tconnection = getConnection();" + NL + "\t\t\tptmt = connection.prepareStatement(queryString);" + NL + "\t\t\t";
  protected final String TEXT_9 = NL + "\t\t\tptmt.setBoolean(";
  protected final String TEXT_10 = ", obj.get";
  protected final String TEXT_11 = "()); ";
  protected final String TEXT_12 = NL + "\t\t\tptmt.setString(";
  protected final String TEXT_13 = ", obj.get";
  protected final String TEXT_14 = "().toString());";
  protected final String TEXT_15 = NL + "\t\t\t" + NL + "\t\t\tptmt.executeUpdate();" + NL + "\t\t\tSystem.out.println(\"Data Added Successfully\");" + NL + "\t\t} catch (SQLException e) {" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t} finally {" + NL + "\t\t\ttry {" + NL + "\t\t\t\tif (ptmt != null)" + NL + "\t\t\t\t\tptmt.close();" + NL + "\t\t\t\tif (connection != null)" + NL + "\t\t\t\t\tconnection.close();" + NL + "\t\t\t} catch (SQLException e) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t} catch (Exception e) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t}" + NL + "" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Permet de mettre à jour les données d'une entrée dans la base " + NL + "\t * @param obj" + NL + "\t */" + NL + "\tpublic  ";
  protected final String TEXT_16 = " update(";
  protected final String TEXT_17 = " obj){" + NL + "\t\t// ADD YOUR CODE HERE!!" + NL + "\t\ttry {" + NL + "\t\t\tString queryString = \"QUERY\";" + NL + "\t\t\tconnection = getConnection();" + NL + "\t\t\tptmt = connection.prepareStatement(queryString);" + NL + "\t\t\t";
  protected final String TEXT_18 = NL + "\t\t\tptmt.setBoolean(";
  protected final String TEXT_19 = ", obj.get";
  protected final String TEXT_20 = "()); ";
  protected final String TEXT_21 = NL + "\t\t\tptmt.setString(";
  protected final String TEXT_22 = ", obj.get";
  protected final String TEXT_23 = "().toString());";
  protected final String TEXT_24 = NL + "\t\t\t" + NL + "\t\t\tptmt.executeUpdate();" + NL + "\t\t\tSystem.out.println(\"Table Updated Successfully\");" + NL + "\t\t} catch (SQLException e) {" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t} finally {" + NL + "\t\t\ttry {" + NL + "\t\t\t\tif (ptmt != null)" + NL + "\t\t\t\t\tptmt.close();" + NL + "\t\t\t\tif (connection != null)" + NL + "\t\t\t\t\tconnection.close();" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tcatch (SQLException e) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t} catch (Exception e) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t/**" + NL + "\t * Permet la suppression d'une entrée de la base" + NL + "\t * @param obj" + NL + "\t */" + NL + "\tpublic  void delete(";
  protected final String TEXT_25 = " obj){" + NL + "\t\t// ADD YOUR CODE HERE!!" + NL + "\t\ttry {" + NL + "\t\t\tString queryString = \"DELETE_QUERY\";" + NL + "\t\t\tconnection = getConnection();" + NL + "\t\t\tptmt = connection.prepareStatement(queryString);" + NL + "\t\t\tptmt.executeUpdate();" + NL + "\t\t\tSystem.out.println(\"Data deleted Successfully\");" + NL + "\t\t} catch (SQLException e) {" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t} finally {" + NL + "\t\t\ttry {" + NL + "\t\t\t\tif (ptmt != null)" + NL + "\t\t\t\t\tptmt.close();" + NL + "\t\t\t\tif (connection != null)" + NL + "\t\t\t\t\tconnection.close();" + NL + "\t\t\t} catch (SQLException e) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t} catch (Exception e) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t}" + NL + "" + NL + "\t\t}" + NL + "\t\t" + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Class<?> clazz=(Class<?>) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(clazz.getName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(clazz.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(clazz.getSimpleName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(clazz.getSimpleName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(clazz.getSimpleName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(clazz.getSimpleName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(clazz.getSimpleName());
    stringBuffer.append(TEXT_8);
    int i=0;
			 for (Field field : clazz.getDeclaredFields()) { if(field.getType()==boolean.class){
    stringBuffer.append(TEXT_9);
    stringBuffer.append(++i);
    stringBuffer.append(TEXT_10);
    stringBuffer.append( Tools.capitalize(field.getName()) );
    stringBuffer.append(TEXT_11);
    }else {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(++i);
    stringBuffer.append(TEXT_13);
    stringBuffer.append( Tools.capitalize(field.getName()) );
    stringBuffer.append(TEXT_14);
     }} 
    stringBuffer.append(TEXT_15);
    stringBuffer.append(clazz.getSimpleName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(clazz.getSimpleName());
    stringBuffer.append(TEXT_17);
     i=0;
			 for (Field field : clazz.getDeclaredFields()) { if(field.getType()==boolean.class){
    stringBuffer.append(TEXT_18);
    stringBuffer.append(++i);
    stringBuffer.append(TEXT_19);
    stringBuffer.append( Tools.capitalize(field.getName()) );
    stringBuffer.append(TEXT_20);
    }else {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(++i);
    stringBuffer.append(TEXT_22);
    stringBuffer.append( Tools.capitalize(field.getName()) );
    stringBuffer.append(TEXT_23);
     }} 
    stringBuffer.append(TEXT_24);
    stringBuffer.append(clazz.getSimpleName());
    stringBuffer.append(TEXT_25);
    return stringBuffer.toString();
  }
}
