package Interview.toolSqa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import org.apache.commons.exec.ExecuteException;

public class TutorialPoint {
	//static ArrayList<String> songList = new ArrayList<String>();
	static ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Commenting Start for Enumeration
		
	
		
		new TutorialPoint().go();
		//displaySongs();
		System.out.println("Befor sorting");
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println("After sorting");
		System.out.println(songList);
		
		//displaySongs();
	}
	
	
		public void go() throws IOException{
			getSongs();
			
		}
		
		
		void getSongs() throws IOException{
			try{
				File file = new File("C:/Users/Nikunj/Desktop/SongList.txt");
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line = null;
				while((line= reader.readLine())!= null){
					addSong(line);
				}
				
				}catch(ExecuteException ex){
					ex.printStackTrace();
				}
			
		}
		
		void addSong(String lineToParse){
			String[] tockens = lineToParse.split("/");
			
			Song nextSong = new Song(tockens[0], tockens[1], tockens[2], tockens[3]);
			songList.add(nextSong);
			
			
		}
		
		public static void displaySongs(){
			int sizeOfList = songList.size();
			System.out.println(sizeOfList);
			
		for(int i= 0; i<sizeOfList; i++)
			{ 
			System.out.println(songList.get(i));
		
			}
		}


	
}
