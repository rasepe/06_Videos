import java.util.ArrayList;
import java.util.List;

public class Video {
	//Video: esta format por una URL, un títol i una llista de tags*.
	String url;
	String title;
	List<String> tags = new ArrayList<String>();
	public Video(String url, String title, List<String> tags) {
		super();
		this.url = url;
		this.title = title;
		this.tags = tags;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}


}
