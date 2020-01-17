import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Console {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<User> users = new ArrayList<User>();
	private static User currentUser;

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
			login();
			break;
		default:
			System.out.println("FI");
			sc.close();
			System.exit(0);
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

	}

	public static void login() throws VideosException {
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
		boolean coincidence = false; // necessària?
		for (User i : users) {
			if (name.equals(i.getName()) && surname.equals(i.getSurname()) && password.equals(i.getPassword())) {
				coincidence = true; // necessària?
				currentUser = i; // necessària???
				userMenu(i);
			} 
		}
		if (coincidence == false) {
			System.out.println("NO EXISTEIX AQUEST USUARI O EL PASSWORD ES INCORRECTE");
			mainMenu();
		}
	}

	public static void userMenu(User user) throws VideosException {
		System.out.println("Benvingut, " + user.getName() + " " + user.getSurname());
		System.out.println("Entra una opció:");

		System.out.println("1. Afegir vídeo");

		System.out.println("2. Veure el meu llistat de vídeos");
		System.out.println("3. Logout");

		int option = sc.nextInt();

		switch(option) {
		case 1:
			addVideo(user);
			break;
		case 2:
			viewVideoList(user);                                                      
			break;
		default:
			mainMenu();
		}


	}

	public static void addVideo(User user) throws VideosException {


		sc.nextLine();
		String url;
		System.out.println("URL?");
		url = sc.nextLine();
		if(url.isEmpty()) {
			throw new VideosException(VideosException.EMPTY_FIELD);
		}  
		String title;
		System.out.println("Títol?");
		title = sc.nextLine();
		if(title.isEmpty()) {
			throw new VideosException(VideosException.EMPTY_FIELD);
		} 
		List<String> tags = new ArrayList<String>();
		String spaceSeparatedList;
		System.out.println("tags?");
		spaceSeparatedList = sc.nextLine();
		if(spaceSeparatedList.isEmpty()) {
			throw new VideosException(VideosException.EMPTY_FIELD);
		}

		String[] arr = spaceSeparatedList.split(" ", 0);  

		for (int i=0; i<arr.length; i++) {
			tags.add(arr[i]);
		}

		user.addVideo(url, title, tags);
		System.out.println("VIDEO AFEGIT CORRECTAMENT");
		userMenu(user);


	}

	public static void viewVideoList(User user) throws VideosException {
		System.out.println("Llistat de vídeos:");
		user.viewVideos();
		sc.nextLine();
		System.out.println("Prem intro per tornar al menú");
		sc.nextLine();
		userMenu(user);
	}



}
