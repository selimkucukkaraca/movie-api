package com.example.movieapi.dto;

import com.example.movieapi.model.Episode;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class MovieDto {

    private String Title;
    private String totalSeasons;
    private List<Episode> episodeList;

}