import java.util.ArrayList;
import java.util.Scanner;



public class Console {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<User> users = new ArrayList<User>();
	static User currentUser;
	
	public static void mainMenu() throws VideosException {
		

		System.out.println("1. Crear usuari nou");
		System.out.println("2. Login usuari existent");
		System.out.println("3. Sortir");

		int option = sc.nextInt();

		switch(option) {
		case 1:
			signUp();
			break;
		case 2:
			// code block
			break;
		case 3:
			// code block
			break;
		default:
			// code block
		}

	}

	public static void signUp() throws VideosException {
		sc.nextLine();
		String name = "";
		System.out.println("Nom?");
		name = sc.nextLine();
		if(name.isEmpty()) {
		throw new VideosException(VideosException.EMPTY_FIELD);
		}  
		String surname = "";
		System.out.println("Cognom?");
		surname = sc.nextLine();
		if(surname.isEmpty()) {
		throw new VideosException(VideosException.EMPTY_FIELD);
		} 
		String password = "";
		System.out.println("Password?");
		password = sc.nextLine();
		if(password.isEmpty()) {
		throw new VideosException(VideosException.EMPTY_FIELD);
		}
		User user = new User(name, surname, password);
		
		users.add(user);
		System.out.println("USUARI CREAT CORRECTAMENT");
		mainMenu();
		//user entered something
		
	
		//System.out.println("Cognom?");
		//String surname = sc.nextLine();
		////sc.next();
		//System.out.println("Password?");
		//String password = sc.nextLine();
		//sc.next();
		//User newUser = new User (name,surname,password);
	}
	
	public static void login() throws VideosException {
		String name;
		String surname = null;
		String password = null;
		System.out.println("Nom?");
		name = sc.next();
		System.out.println("Cognom?");
		name = sc.next();
		System.out.println("Password?");
		name = sc.next();
		boolean coincidence = false;
		 for (User i : users) {
		      if (name == i.name && surname == i.surname && password == i.password) {
		    	  coincidence = true; // necessària?
		    	  currentUser = i; // necessària???
		    	  userMenu(i);
		      }
		    }
	}
	
	public static void userMenu(User user) throws VideosException {
		
	}
	
	
	
}
