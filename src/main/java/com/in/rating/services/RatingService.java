package com.in.rating.services;

import com.in.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    Rating Create(Rating rating);

    List<Rating> getRating();

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);


}
