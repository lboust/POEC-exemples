package music;

import java.util.Comparator;

public class SongOrderedByTitle implements Comparator<Song>{

	@Override
	public int compare(Song song1, Song song2) {
		return song1.getTitle().compareTo(song2.getTitle());					
	}
	
	

}
