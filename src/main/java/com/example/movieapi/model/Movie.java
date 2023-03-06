package com.example.movieapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Movie{

    @JsonProperty(value = "Title")
    private String title;

    @JsonProperty(value = "Season")
    private String season;
    @JsonProperty(value = "totalSeasons")
    private String totalSeasons;

    @JsonProperty(value = "Episodes")
    private List<Episode> episodeList;

}