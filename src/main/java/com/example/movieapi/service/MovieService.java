package com.example.movieapi.service;

import com.example.movieapi.dto.MovieDto;
import com.example.movieapi.dto.converter.MovieDtoConverter;
import com.example.movieapi.model.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    @Value("${apikey}")
    private String apikey;

    private final RestTemplate restTemplate;
    private final MovieDtoConverter movieDtoConverter;

    public MovieService(RestTemplate restTemplate, MovieDtoConverter movieDtoConverter) {
        this.restTemplate = restTemplate;
        this.movieDtoConverter = movieDtoConverter;
    }

    public MovieDto getMovie(String t,String season){

        Movie movie = restTemplate.getForObject("http://www.omdbapi.com/?t=" +t+ "&Season=" + season + "&apikey=" + apikey,Movie.class);
        assert movie != null;
        return  movieDtoConverter.convert(movie);

    }
}