package com.deven.benchmarkbackend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.deven.benchmarkbackend.entity.News;
import com.deven.benchmarkbackend.service.NewService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class NewsController {

	@Autowired
	private NewService newsService;

	@GetMapping("/news")
	@ResponseStatus(HttpStatus.OK)
	public List<News> getNews() {
		List<News> news = newsService.getNews();
		return news;
	}

	@GetMapping("/news/{id}")
	@ResponseStatus(HttpStatus.OK)
	public News getNew(@PathVariable Long id) {
		Optional<News> singleNews = newsService.getNews(id);
		if (!singleNews.isPresent())
			System.out.println("Catch this and display no such news etc.");
		return singleNews.get();

	}

	@PostMapping("/news")
	@ResponseStatus(HttpStatus.CREATED)
	public News postNews(@RequestBody News postNews) {
		return newsService.saveNews(postNews);
	}

	@PostMapping("/news/delete/{id}")
	public ResponseEntity<String> deleteNews(@PathVariable Long id) {
		newsService.deleteNews(id);
		return new ResponseEntity("Deleted successfully!", HttpStatus.OK);
	}

}
