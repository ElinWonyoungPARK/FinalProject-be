package com.example.demo.rev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.rev.domain.Review;
import com.example.demo.rev.domain.ReviewDto;

interface ReviewCustomRepository{
	public List<ReviewDto> findByUserNum(long UserNum);
}

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewCustomRepository {
	
}