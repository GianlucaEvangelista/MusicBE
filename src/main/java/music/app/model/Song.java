package music.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Song {

    private Integer id;

    private String title;

    private String artist;

    private String genre;

    private String album;

    private String year;
}
