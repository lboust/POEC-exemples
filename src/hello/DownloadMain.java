package hello;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;

public class DownloadMain {

	public static void main(String[] args) {
		URI uri = URI.create("http://www.example.com");
		try {
			InputStream is = uri.toURL().openStream();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		System.out.println("done. ");
		}
	}

}
