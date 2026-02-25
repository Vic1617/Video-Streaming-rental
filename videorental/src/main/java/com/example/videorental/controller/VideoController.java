package com.example.videorental.controller;

import com.example.videorental.repository.VideoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VideoController {

    private final VideoRepository videoRepository;

    public VideoController(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @GetMapping("/")
    public String listVideos(Model model) {
        model.addAttribute("videos", videoRepository.findAll());
        return "index";
    }
}