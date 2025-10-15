public class Song{
    public String title;
    public String artist;
    public int length;
    public Song next;
    
    public Song(String x, String y, int z){
        title = x;
        artist = y;
        length = z;
        next = null;
    }
    
    public void songInfo(){
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Length: " + length + " minutes");
    }
}


public class Playlist{
    public String name;
    public Song start;
    public int count;
    public Song [] songs;
    public Playlist(String x){
        name = x;
        start = null;
        count = 0;
        songs = new Song[10];
        System.out.println(name + " created.");
    }
    //Task 3,4
    public void addSong(Song s){
        if(start == null){
            start = s;
        }
        else{
            Song now = start;
            while(now.next != null){
                now = now.next;
            }
            now.next = s;
        }
        count++;
        System.out.println(s.title + " added to " + name + ".");
    }
    //Task3,4
    public void info(){
        System.out.println(name + " has the following songs:");
        if(start == null){
            System.out.println("No songs in " + name + ".");
        }
        else{
            Song now = start;
            int count2 = 1;
            while(now != null){
                System.out.println("Song-" + count2);
                now.songInfo();
                now = now.next;
                count2++;
            }
        }
    }
//Task05
	public void addSong(Song s, int i){
        if ((i < 0) || (i > count)) {
            System.out.println("Cannot add song to Index " + i + ".");
            return;
        }
        if (i == 0){
            s.next = start;
            start = s;
        }
        else{
            Song now = start;
            for (int j = 0; j < i - 1; j++) {
                now = now.next;
            }
            s.next = now.next;
            now.next = s;
        }
        count++;
        System.out.println(s.title + " added to " + name + ".");
    }
    
//Task06
    public void playSong(String t){
        Song now = start;
        while (now != null) {
            if (now.title.equals(t)){
                System.out.println("Playing " + now.title + " by " + now.artist + ".");
                return;
            }
            now = now.next;
        }
        System.out.println(t + " not found in playlist " + name + ".");
    }
//Task07
    public void playSong(int i){
        if (i < 0 || i >= count){
            System.out.println("Song at Index " + i + " not found in " + name + ".");
            return;
        }
        Song now = start;
        for (int j = 0; j < i; j++){
            now = now.next;
        }
        System.out.println("Playing " + now.title + " by " + now.artist + ".");
    }
//Task08
    public void deleteSong(String x){
        if (start == null){
            System.out.println(x + " not found in " + name + ".");
            return;
        }
        
        if (start.title.equals(x)){
            start = start.next;
            count--;
            System.out.println(x + " deleted from " + name + ".");
            return;
        }
        
        Song now = start;
        Song back = null;
        while (now != null){
            if (now.title.equals(x)){
                back.next = now.next;
                count--;
                System.out.println(x + " deleted from " + name + ".");
                return;
            }
            back = now;
            now = now.next;
        }
        System.out.println(x + " not found in " + name + ".");
    }
//Task09
    public int totalSong(){
        return count;
    }
//Task10
    public void merge(Playlist a) {
        for (int i = 0; i < a.count; i++) {
            if (count < songs.length) {
                songs[count] = a.songs[i];
                count++;
            }
        }
        System.out.println("Merge Completed!");
    }
}