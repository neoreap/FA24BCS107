package users;

import util.PasswordValidator;


	public class UserManager{

		static final String storedUsername = "abc@gmail.com";
		static final String storedPassword = "654321";  




	static boolean authenticate(String username, String password){

	if(username.equals(storedusername) && password.equals(storedPassword)){

	return true;

}
	else{
		return false;}
}






}