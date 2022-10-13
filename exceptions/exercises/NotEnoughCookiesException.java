public class NotEnoughCookiesException extends Exception {
	
	public NotEnoughCookiesException(){
		super("NotEnoughCookiesException");
	}

	public NotEnoughCookiesException(String message){
		super("NotEnoughCookiesException: "+message);
	}
}

