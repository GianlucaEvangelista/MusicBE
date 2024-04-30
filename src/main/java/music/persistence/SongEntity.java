package music.persistence;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
@Table(name = "songs")
public class SongEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    @Nonnull
    private String title;

    @Column(name = "artist")
    @Nonnull
    private String artist;

    @Column(name = "genre")
    @Nonnull
    private String genre;

    @Column(name = "album")
    @Nonnull
    private String album;

    @Column(name = "year")
    @Nonnull
    private String year;

    public SongEntity() {
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
