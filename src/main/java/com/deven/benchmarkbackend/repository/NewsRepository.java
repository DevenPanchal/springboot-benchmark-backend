package com.deven.benchmarkbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deven.benchmarkbackend.entity.News;

public interface NewsRepository extends JpaRepository<News, Long> {

}
