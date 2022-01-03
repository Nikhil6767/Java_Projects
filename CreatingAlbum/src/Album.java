/*
 * Nikhil Nayyar
 * ECE 325 Assignment 2
 * 1614962
 */
package ece325_assignment2;
// make album sub class of SongCollection
public class Album extends SongCollection {
	
	@Override
	public void addSongToCollection(Song s) {
		/* first check if the album already contains the song, as we only
		want to add unique song titles to the album. Then use the add song
		to collection method from the super class to access the private array
		list of songs */
		if (this.contains(s) == false) {
			super.addSongToCollection(s);
		}
	}
	@Override
	public String toString() {
		// use the super classes toString method to access all the album titles
		String titles = super.toString();
		// remove some of the formatting done by the super class method as we only need
		// the song titles
		titles = titles.replaceAll("\n", " ");
		titles = titles.replaceAll("]", "");
		String [] albumOutputList = titles.split("\t");
		String albumOutput = "";
		// create the output string contains the track numbers and names
		for (int i = 1; i < albumOutputList.length; i++) {
			albumOutput += "Track #" + i + ": " + albumOutputList[i] + "\n";
		}
		return albumOutput;
	}
}