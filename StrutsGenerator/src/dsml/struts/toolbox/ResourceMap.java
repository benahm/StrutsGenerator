package dsml.struts.toolbox;

import java.util.Hashtable;
/**
 * 
 * @author Ahmed et Mario
 *
 */
public class ResourceMap {
	public static Hashtable<String, String> hashMap=new Hashtable<String, String>();
	public static void add(String val){
		String[] parts=(val+"key").split("=");
		hashMap.put(parts[1],parts[0]);
	}
	public static String get(String val){
		
		return hashMap.get(val+"key");
	}
	public static void main(String[] args) {
		ResourceMap map=new ResourceMap();
		ResourceMap.add("page.form.label1=dddd");
		ResourceMap.add("page.form.textfield.label2= ");
		System.out.println(ResourceMap.hashMap);
		System.out.println(ResourceMap.hashMap.keySet().contains("ddddkey"));
		System.out.println(ResourceMap.hashMap.keySet());
		System.out.println(ResourceMap.get("dddd"));
	}
}
