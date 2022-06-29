package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.FavouriteDto;
import com.example.demo.entity.Favourites;

@Repository
public interface FavouriteRepository extends JpaRepository<Favourites,Long> {
	
	
}
