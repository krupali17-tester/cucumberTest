package Interview.toolSqa;

public class Song {
	
	String title;
	String artist;
	String rating;
	String bmp;
	
	Song(String t, String a, String r, String b){
		 title = t;
		 artist = a;
		 rating = r;
		 bmp = b;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public String getRating(){
		return rating;
	}
	
	public String geTBmp(){
		return bmp;
	}
	
	public String toString(){
		return title;
	}

}
