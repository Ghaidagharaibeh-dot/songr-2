package com.example.songr2.resposity;


import com.example.songr2.modal.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {

    Album findAlbumByTitle(String title);


}
