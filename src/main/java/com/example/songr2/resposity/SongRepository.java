package com.example.songr2.resposity;

import com.example.songr2.modal.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {

    List<Song> findAllByAlbum_Title(String title);
}
