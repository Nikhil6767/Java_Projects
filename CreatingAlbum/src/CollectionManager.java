/*
 * Nikhil Nayyar
 * ECE 325 Assignment 2
 * 1614962
 */
package ece325_assignment2;
import java.io.BufferedReader;
import java.io.FileReader;

public class CollectionManager {
	SongCollection allSongs;
	Album album;
	
	public CollectionManager(String file) {
		loadTxt(file);
	}
	// Modified version of loadTxt from Lab 2 
	// Credit to original creators from ECE 325
	private void loadTxt(String file) {
		// create album Object
		album = new Album();
		try {
			// Create a stream to read from the file
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			// The first line of the file contains an integer that represents the number of rows,
			// the rest of the file contains one word on every line
			int totalLines = Integer.parseInt(in.readLine());
			// Read the file
			while ((line = in.readLine()) != null) {
				// Create a new song with title from file, then add it to the album
				Song song = new Song(line);
				album.addSongToCollection(song);
			}
			// Only execute the following block if a problem occurred during reading the file
		} catch (Exception e) {
			// Print some details that should help you solve the problem.
			System.err.println("Problem while reading the data for file: " + file);
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// Create an instance of the Collection Manager class to read the song file and print out
		// the corresponding album
		CollectionManager Collection = new CollectionManager("songs.txt");
		System.out.println(Collection.album.toString());
	}
}
