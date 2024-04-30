package music.persistence;

import music.app.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    private final SongRepository songRepository;
    private final SongMapper songMapper;

    @Autowired
    public SongService(SongRepository songRepository, SongMapper songMapper) {
        this.songRepository = songRepository;
        this.songMapper = songMapper;
    }

    public Optional<List<Song>> getAllSongs() {
        List<SongEntity> songEntities = songRepository.findAll();
        List<Song> songs = new ArrayList<>();
        if(songEntities.isEmpty()) {
            return Optional.empty();
        }
        for(SongEntity s : songEntities) {
            songs.add(songMapper.toSong(s));
        }
        return Optional.of(songs);
    }

    public Song saveSong(Song song) {
        SongEntity songEntity = songMapper.toSongEntity(song);
        return songMapper.toSong(songRepository.save(songEntity));
    }
}
