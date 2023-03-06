package com.example.movieapi.controller;

import com.example.movieapi.dto.MovieDto;
import com.example.movieapi.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/movie")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    private ResponseEntity<MovieDto> getMovie(@RequestParam String t,@RequestParam String season){
        return ResponseEntity.ok(movieService.getMovie(t, season));
    }
}