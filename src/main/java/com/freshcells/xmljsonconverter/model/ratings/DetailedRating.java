package com.freshcells.xmljsonconverter.model.ratings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailedRating {

    private RatingDto ratingDto;
    private RatingDto hotelRating;
    private RatingDto locationRating;
    private RatingDto serviceRating;
    private RatingDto foodRating;
    private RatingDto roomRating;
    private RatingDto sportRating;
    private RatingDto recommendation;
}
