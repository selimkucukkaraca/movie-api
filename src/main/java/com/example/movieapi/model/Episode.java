package com.example.movieapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Episode {

    @JsonProperty(value = "Title")
    private String title;

    @JsonProperty(value = "Released")
    private String released;

    @JsonProperty(value = "Episode")
    private String episode;

    @JsonProperty(value = "imdbRating")
    private String imdbRating;

    @JsonProperty(value = "imdbID")
    private String imdbID;

}