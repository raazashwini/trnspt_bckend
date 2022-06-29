package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.FavouriteDto;
import com.example.demo.entity.Favourites;
import com.example.demo.service.FavouriteService;

@RestController
public class FavouritesController {
	
	@Autowired
	private FavouriteService favouriteService;
	
	@PostMapping("/saveFavourite")
	@CrossOrigin(origins = "http://localhost:3000")
	public String saveFavourite(@RequestBody ArrayList<FavouriteDto> favouriteDto) {
		System.out.println("inside set");
//		System.out.println(favouriteDto);
//	favouriteDto.stream().forEach((x)-> System.out.println(x.getStarting_time() +"," + x.getStarting_location()));
//	favouriteDto.stream().forEach((x)-> System.out.println(x.getStarting_time()));
		 favouriteService.saveFavourite(favouriteDto);
		 return "Saved successfully";
	}
	
	@GetMapping("/getFavourite")
	@CrossOrigin(origins = "http://localhost:3000")
	public List<Favourites> getAllFavourites(){
		System.out.print("inside get");
		return favouriteService.getAllFavourites();
	}

}
