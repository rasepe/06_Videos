import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws VideosException { 
	//proves
	User prova;
	prova = new User("rafael","serra","motdepas");
	List<String> gus = new ArrayList<String>();
	 gus.add("dog");
	 gus.add("pug");
	 List<String> cuteBunny = new ArrayList<String>();
	 cuteBunny.add("bunny");
	 cuteBunny.add("rabbit");
	 cuteBunny.add("competition");
	prova.addVideo("https://www.youtube.com/watch?v=jZRa3ouHELI","Gus waking up",gus);
	prova.addVideo("https://www.youtube.com/watch?v=qM9YWm6T_hc","Cute bunny jumping competition",cuteBunny);
	prova.viewVideos();
	
	//ArrayList<User> users = new ArrayList<User>();
	
	Console.mainMenu();
	
	System.out.println("fi");
	}
}
