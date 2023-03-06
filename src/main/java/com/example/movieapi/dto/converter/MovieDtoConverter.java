package com.example.movieapi.dto.converter;

import com.example.movieapi.dto.MovieDto;
import com.example.movieapi.model.Movie;
import org.springframework.stereotype.Component;


@Component
public class MovieDtoConverter {

    public MovieDto convert(Movie from){
        return new MovieDto(from.getTitle(), from.getTotalSeasons(), from.getEpisodeList());
    }
}