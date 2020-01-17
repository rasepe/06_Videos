import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class User {
	//Usuari: esta format per un nom, cognom, password i una data de registre.
	private String name;
	private String surname;
	private String password;
	private Date registrationDate = new Date();
	private List<Video> videos = new ArrayList<Video>();


	public User(String name, String surname, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public List<Video> getVideos() {
		return videos;
	}
	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	//Un usuari pot crear nous vídeos i veure un llistat dels seus videos.

	public void addVideo(String url, String title, List<String> tags) {
		Video video;
		video = new Video(url,title,tags);
		videos.add(video);
	}

	public void viewVideos() {
		if (videos.size() == 0) {
			System.out.println("ENCARA NO HI HA CAP VIDEO ENTRAT");
		}
		for (int i = 0; i < videos.size(); i++) {
			System.out.println(i+1);
			System.out.println(videos.get(i).getUrl());
			System.out.println(videos.get(i).getTitle());
			System.out.println(videos.get(i).getTags());
		}
	}

}
