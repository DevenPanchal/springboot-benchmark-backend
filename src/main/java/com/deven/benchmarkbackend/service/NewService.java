package com.deven.benchmarkbackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deven.benchmarkbackend.entity.News;
import com.deven.benchmarkbackend.repository.NewsRepository;

@Service
public class NewService {

	@Autowired
	private NewsRepository newsRepository;

	@Transactional
	public List<News> getNews() {
		return newsRepository.findAll();
	}

	@Transactional
	public Optional<News> getNews(Long id) {
		return newsRepository.findById(id);
	}

	public News saveNews(News postNews) {
		return newsRepository.save(postNews);
	}

	public void deleteNews(Long id) {
		newsRepository.deleteById(id);
	}
}
