package music.app.controller;

import music.app.model.Song;
import music.persistence.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/songs")
public class SongController {

    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
    public ResponseEntity<List<Song>> getAllSongs() {
        Optional<List<Song>> optionalSongs = songService.getAllSongs();
        List<Song> songs = optionalSongs.orElse(new ArrayList<>());
        return ResponseEntity.ok(songs);
    }

    @PostMapping
    public ResponseEntity<Song> addSong(@RequestBody Song song) {
        Song savedSong = songService.saveSong(song);
        return ResponseEntity.ok(savedSong);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeSong(@PathVariable Integer id) {
        try {
            songService.deleteSong(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    public SongService getSongService() {
        return songService;
    }
}
