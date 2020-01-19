
public class VideosException extends Exception {
	private static final long serialVersionUID = 1L;

	public static final String EMPTY_FIELD = "No es poden entrar camps buits";

	public VideosException(String message) {
		super(message);
	}
}
