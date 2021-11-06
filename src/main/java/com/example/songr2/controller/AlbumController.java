//package com.example.songr2.controller;


//import com.example.songr-2.modal.Album;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.view.RedirectView;
////import com.example.songr-2.resposity.AlbumRepository;
////import com.example.songr.resposity.AlbumRepository;
//
//import java.util.List;
//
//@Controller
//public class AlbumController {
//    @Autowired
//    AlbumRepositorys abumRepository;
//
//    @GetMapping("/Album")
//    public String album (Model model){
//        List<Albums> album = (List<Albums>) abumRepository.findAll();
//        model.addAttribute("albums",album);
//        return "Album.html";
//
//    }
//
//    @GetMapping("/AddAlbum")
//    public String viewAddAlbumForm(){
//        return "AddAlbum.html";
//    }
//
//
//    @PostMapping("/AddAlbum")
//    public RedirectView addAlbum(Model model,
//                                 @RequestParam(value="title") String title,
//                                 @RequestParam(value="artist") String artist,
//                                 @RequestParam(value="songCount") int songCount,
//                                 @RequestParam(value="length") int length,
//                                 @RequestParam(value="imageUrl") String imageUrl){
//        Albums newAlbum = new Albums(title,artist,songCount,length,imageUrl);
//
//        abumRepository.save(newAlbum);
//        return  new RedirectView("/Album");
//    }
//
//
//
//
//}