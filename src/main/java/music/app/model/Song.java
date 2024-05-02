package music.app.model;

public class Song {

    private Integer id;

    private String title;

    private String artist;

    private String genre;

    private String album;

    private String year;

    public Song(Integer id, String title, String artist, String genre, String album, String year) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.album = album;
        this.year = year;
    }

    public Song() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
