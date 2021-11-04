package com.example.songr2.resposity;

import com.example.songr2.modal.Album;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.JpaRepository;


@Repositiry
public interface AlbumRepository extends JpaRepository<Album,Integer> {

}

//@Repositiry
//public interface AlbumRepository extends JpaRepository<Album,Integer> {
//
//}