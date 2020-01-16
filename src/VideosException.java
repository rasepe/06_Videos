
public class VideosException extends Exception {
	private static final long serialVersionUID = 1L;

	public static final String EMPTY_FIELD = "No es poden entrar camps buits";

	//public static final String WRONG_DIAMETER = "El diametre ha de ser superior a 0.4 i inferior a 4";

	public VideosException(String message) {
		super(message);
	}
}
