package com.deven.benchmarkbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.deven.benchmarkbackend.entity.News;

public interface NewsRepository extends JpaRepository<News, Long> {

	// JPA does not support UNION. Hence Native query
	String findQuery = "SELECT * FROM newsapi.news WHERE title LIKE %?1% UNION SELECT * FROM newsapi.news WHERE content LIKE %?1%";
	@Query(value = findQuery, nativeQuery = true)
	List<News> findByQueryString(String queryString);
}
