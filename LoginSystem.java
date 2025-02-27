package main;

import java.io.Console;
import users.UserManager;
import util.PasswordValidator;


public class LoginSystem{

	public static void main(String[] args){

 	Systen.out.println("Enter username: ");
	Console co = System.console();
	String s = co.readLine();
	System.out.println("Enter paswword: ");
	String p = String.valueOf(co.readPassword());
	

	if(UserManager.authenticate(s,p)==true){

	system.out.println("True");}
	else{
	system.out.println("True");}

	
}	



	
}



}