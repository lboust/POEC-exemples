package music;

import java.util.ArrayList;
import hello.Personne;
import java.util.List;

public class MusicMain {

	public static void main(String[] args) {
		
		Personne Bimba = new Personne("mestre", "Bimba", 74);
		Personne JohnLennon = new Personne("John", "Lennon", 40);
		Personne Pitoco = new Personne("Lucas", "Pitoco", 40);
		
		
		Song song1 = new Song("Iuna", Bimba, "Capoeira", 150);
		Song song2 = new Song("Imagine", JohnLennon, "Pop", 90);
		Song song3 = new Song("Vou vaquejar", Pitoco, "Capoeira", 115);
		
		PlayList playList = new PlayList();
		playList.add(song1);
		playList.add(song2);
		playList.add(song3);
		System.out.println(playList);
		System.out.println(song1);
		
		SongOrderedByTitle titleComparator = new SongOrderedByTitle(); 
		System.out.println(titleComparator.compare(song1,song2));
		playList.sort(titleComparator);
		System.out.println(playList);
		//List<Song> songOrderedByTitle = playList.songsByTitle();
		//List<Song> songOrderedByGenre = playList.songsByGenre();
		//List<Song> songOrderedByDuration = playList.songsByDuration();
		//List<Song> songOrderedByAuthorName = playList.songsByAuthorName();
		
		// "bonjour".compareTo("le monde")

	}

}
