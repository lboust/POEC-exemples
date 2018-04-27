package music;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	// instance field
	private List<Song> songs;
	
	//constructor
	public PlayList() {
		songs = new ArrayList<Song>();
	}
	
	public void add(Song song) {
		songs.add(song);
	}

	public void sort(SongOrderedByTitle titleComparator) {
		songs.sort(titleComparator);
		
	}

	@Override
	public String toString() {		
		return songs.toString();
	}
	



}
