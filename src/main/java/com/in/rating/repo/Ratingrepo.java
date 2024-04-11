package com.in.rating.repo;

import com.in.rating.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Ratingrepo extends JpaRepository<Rating,String> {

    //custom finder methods

    List<Rating> findByUserId(String userId);

    List<Rating> findByHotelId(String hotelId);

}
