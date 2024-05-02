package music.app;

import lombok.Getter;

import music.app.model.Song;
import music.persistence.SongService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Getter
public class AppController {

    private final SongService songService;

    @Autowired
    public AppController(SongService songService) {
        this.songService = songService;
    }

    public void startApp() {
        Optional<List<Song>> optionalSongs = songService.getAllSongs();
        List<Song> songs = optionalSongs.orElse(new ArrayList<>());
        for (Song s : songs) {
            System.out.println(s.getTitle() + ", " + s.getArtist() + ", " + s.getGenre() + ", " + s.getAlbum() + ", " + s.getYear());
        }
    }
}
