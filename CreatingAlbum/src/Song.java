/*
 * Nikhil Nayyar
 * ECE 325 Assignment 2
 * 1614962
 */
package ece325_assignment2;

public class Song {
	String title;
	
	public Song(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	@Override
	public boolean equals(Object obj) {
		// check for song titles to match to determine equality
		if (this.title.equals(((Song)obj).title)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}