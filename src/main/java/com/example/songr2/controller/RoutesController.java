package com.example.songr2.controller;

import com.example.songr2.modal.Album;

import com.example.songr2.modal.Song;
import com.example.songr2.resposity.AlbumRepository;
import com.example.songr2.resposity.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.transaction.Transactional;


@Controller
public class RoutesController {

    @Autowired
    private AlbumRepository albumRepository;

    private final SongRepository songRepository;
    public RoutesController(SongRepository songRepository) {
        this.songRepository = songRepository;
    }


    @GetMapping("/hello")
    public String greetings(@RequestParam(name = "name", required = false, defaultValue = "world") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/capitalize/{name}")
    public String capitalize(@PathVariable String name, Model model) {
        model.addAttribute("name", name.toUpperCase());
        return "capitalize";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message", "This Is Our Albums App");
        return "index";
    }


     // lab 12


    @GetMapping("/albums")
    public String getAlbumsInformation(Model model) {
    model.addAttribute("albums", albumRepository.findAll());
    return "albums";
}

    @PostMapping("/albums")
    public RedirectView createNewAlbum(@ModelAttribute Album album) {
        albumRepository.save(album);
        return new RedirectView("albums");
    }

     // Lab 13


    @GetMapping("/songs")
    public String getSongs(Model model) {
        model.addAttribute("songs", songRepository.findAll());
        return "songs";

    }

    @GetMapping("/albums/{title}")
    public String getOneAlbum(@PathVariable String title, Model model) {
        model.addAttribute("albums", albumRepository.findAlbumByTitle(title));
        return "oneAlbum";

    }

    @GetMapping("/albums/add/{title}")
    public String viewAdd(@PathVariable String title, Model model) {
        model.addAttribute("album", albumRepository.findAlbumByTitle(title));
        return "addSong";

    }


    @Transactional
    @PostMapping("/albums/add/{title}")
    public RedirectView createNewSongs(@PathVariable String title, @ModelAttribute Song song) {
        Album album = albumRepository.findAlbumByTitle(title);
        song.setAlbum(album);
        album.getSongsList().add(song);
        songRepository.save(song);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }

}
