package music.persistence;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "songs")
@Getter
@Setter
@NoArgsConstructor
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
}
