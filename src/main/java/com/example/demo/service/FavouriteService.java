package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.FavouriteDto;
import com.example.demo.entity.Favourites;
import com.example.demo.repository.FavouriteRepository;

@Service
public class FavouriteService {
	
	@Autowired
	private FavouriteRepository  favouriteRepository;
	
	public void saveFavourite(ArrayList<FavouriteDto> favouriteDtoList) {
//		System.out.println(favouriteDtoList);
//		System.out.println(favouriteDto);
		for(FavouriteDto favouriteDto : favouriteDtoList) {
			Favourites favourite  = new Favourites();
//			System.out.println(favouriteDto);
			
			favourite.setDistance(favouriteDto.getDistance());
			favourite.setDistance_desc(favouriteDto.getDistance_desc());
			favourite.setDuration(favouriteDto.getDuration());
			favourite.setEnding_location(favouriteDto.getTo_point_name());
			favourite.setMode(favouriteDto.getMode());
			favourite.setStarting_location(favouriteDto.getFrom_point_name());
			favourite.setStarting_time(favouriteDto.getDeparture_time());
			favourite.setEnding_time(favouriteDto.getArrival_time());
			favouriteRepository.save(favourite);
			
//			System.out.println(favourite.getDistance());
//			System.out.println(favourite.getEnding_location());
			System.out.println("Inside save");
		}
//		
//		
	}

	public List<Favourites> getAllFavourites() {
		return favouriteRepository.findAll();
	}
}
