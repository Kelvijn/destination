package com.ucll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewRest {

	@Autowired
	private Db service;

	private long counter = new Long("0");

	@RequestMapping(method = RequestMethod.GET)
	public List<Review> findAll() {
		return service.findAll();
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public List<Review> findOne(@PathVariable("name") String name) {
		
		return service.findReviews(name);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void create(@RequestBody Review resource) {
		resource.setId(counter);
		counter++;
		service.create(resource);
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.PUT)
	public void update(@RequestBody Review resource) {
		service.update(resource);
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("name") String name) {
		service.deleteById(name);
	}
}
