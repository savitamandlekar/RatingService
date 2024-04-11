package com.in.rating.Impl;

import com.in.rating.entities.Rating;
import com.in.rating.repo.Ratingrepo;
import com.in.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private Ratingrepo repo;

    @Override
    public Rating Create(Rating rating) {
        String uuid= UUID.randomUUID().toString();
        rating.setRatingId(uuid);
        return repo.save(rating);
    }


    public List<Rating> getRating(){
            return repo.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return repo.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return repo.findByHotelId(hotelId);
    }
}
