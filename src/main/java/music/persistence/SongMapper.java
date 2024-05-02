package music.persistence;

import music.app.model.Song;

import org.springframework.stereotype.Component;

@Component
public class SongMapper {

    public SongEntity toSongEntity(Song song) {
        SongEntity songEntity = new SongEntity();
        songEntity.setTitle(song.getTitle());
        songEntity.setArtist(song.getArtist());
        songEntity.setGenre(song.getGenre());
        songEntity.setAlbum(song.getAlbum());
        songEntity.setYear(song.getYear());
        return songEntity;
    }

    public Song toSong(SongEntity songEntity) {
        Integer id = songEntity.getId();
        String title = songEntity.getTitle();
        String artist = songEntity.getArtist();
        String genre = songEntity.getGenre();
        String album = songEntity.getAlbum();
        String year = songEntity.getYear();
        return new Song(id, title, artist, genre, album, year);
    }
}
