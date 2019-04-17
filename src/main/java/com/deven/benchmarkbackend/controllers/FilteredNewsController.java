package com.deven.benchmarkbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.deven.benchmarkbackend.entity.News;
import com.deven.benchmarkbackend.service.NewService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class FilteredNewsController {

	@Autowired
	private NewService newsService;

	@PostMapping("/filter-news")
	@ResponseStatus(HttpStatus.OK)
	public List<News> getfilteredNews(@RequestParam(name = "filterwith") String queryString) {
		List<News> filteredNews = newsService.getFilteredNews(queryString);
		return filteredNews;

	}
}
