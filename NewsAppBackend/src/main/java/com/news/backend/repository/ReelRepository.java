package com.news.backend.repository;

import com.news.backend.entities.Reels;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReelRepository extends ReactiveCrudRepository<Reels, Long> {

}