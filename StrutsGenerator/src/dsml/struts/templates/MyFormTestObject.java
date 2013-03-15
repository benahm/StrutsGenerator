package dsml.struts.templates;


/**
*Class MyFormTest
*@generated
*/
public class MyFormTestObject {

	
//Fields
private String TextField;
private String Password;
public enum selectEnumselect { item1,item2}
private selectEnumselect select;
public enum radioEnumName { item1}
private radioEnumName Name;
private String Hudden;
private boolean check;
private String textArea;

//Setters
public void setTextField(String TextFieldArg){
	this.TextField=TextFieldArg;
}
public void setPassword(String PasswordArg){
	this.Password=PasswordArg;
}
public void setSelect(selectEnumselect selectArg){
	this.select=selectArg;
}
public void setName(radioEnumName NameArg){
	this.Name=NameArg;
}
public void setHudden(String HuddenArg){
	this.Hudden=HuddenArg;
}
public void setCheck(boolean checkArg){
	this.check=checkArg;
}
public void setTextArea(String textAreaArg){
	this.textArea=textAreaArg;
}

//Getters
public String getTextField(){
	return TextField;
}
public String getPassword(){
	return Password;
}
public selectEnumselect getSelect(){
	return select;
}
public radioEnumName getName(){
	return Name;
}
public String getHudden(){
	return Hudden;
}
public boolean getCheck(){
	return check;
}
public String getTextArea(){
	return textArea;
}


}