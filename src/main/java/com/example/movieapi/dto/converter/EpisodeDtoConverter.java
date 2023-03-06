package com.example.movieapi.dto.converter;

import com.example.movieapi.dto.EpisodeDto;
import com.example.movieapi.model.Episode;
import org.springframework.stereotype.Component;

@Component
public class EpisodeDtoConverter {

    public EpisodeDto convert(Episode from){
        return new EpisodeDto(from.getTitle(), from.getReleased(),
                from.getEpisode(), from.getImdbRating(), from.getImdbRating());
    }
}
