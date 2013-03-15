package dsml.struts.templates;

import java.lang.reflect.*;
import dsml.struts.toolbox.*;

public class DAOTemplate
{
  protected static String nl;
  public static synchronized DAOTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    DAOTemplate result = new DAOTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package dsml.struts.domain.dao;" + NL + "" + NL + "/**" + NL + "*Abstract DAO" + NL + "*" + NL + "*/" + NL + "" + NL + "public abstract class DAO<T> {" + NL + "\t/**" + NL + "\t * Permet de récupérer un objet via son ID" + NL + "\t * @param id" + NL + "\t * @return" + NL + "\t */" + NL + "\tpublic abstract T find(long id);" + NL + "\t" + NL + "\t/**" + NL + "\t * Permet de créer une entrée dans la base de données" + NL + "\t * par rapport à un objet" + NL + "\t * @param obj" + NL + "\t */" + NL + "\tpublic abstract T create(T obj);" + NL + "\t" + NL + "\t/**" + NL + "\t * Permet de mettre à jour les données d'une entrée dans la base " + NL + "\t * @param obj" + NL + "\t */" + NL + "\tpublic abstract T update(T obj);" + NL + "\t" + NL + "\t/**" + NL + "\t * Permet la suppression d'une entrée de la base" + NL + "\t * @param obj" + NL + "\t */" + NL + "\tpublic abstract void delete(T obj);" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
