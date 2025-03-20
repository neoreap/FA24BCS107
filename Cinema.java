public class Cinema{



	String name;
	String location;
	int totalScreens;




	Cinema(String name, String location, int totalScreens){


	this.name = name;
	this.location = location;
	this.totalScreens = totalScreens;



}

	public void displayCinema(){


	System.out.println("Cinema Name: "+ name);
	System.out.println("Cinema Location: "+ location);
	System.out.println("Total Screens: "+ totalScreens)


}





}