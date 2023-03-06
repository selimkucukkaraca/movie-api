package com.example.movieapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EpisodeDto {

    private String Title;
    private String Released;
    private String Episode;
    private String imdbRating;
    private String imdbID;

}