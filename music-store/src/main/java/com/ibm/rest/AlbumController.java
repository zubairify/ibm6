package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Album;
import com.ibm.service.AlbumService;

@RestController
public class AlbumController {

	@Autowired
	private AlbumService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String add(@RequestBody Album a) {
		int id = service.save(a);
		return "Album saved with Id: " + id;
	}
	
	@GetMapping(value = "/list", produces = "application/json")
	public List<Album> list() {
		return service.list();
	}
	
	@GetMapping(value = "/title/{title}", produces = "application/json")
	public Album byTitle(@PathVariable String title) {
		return service.byTitle(title);
	}
	
	@GetMapping(value = "/genre/{genre}", produces = "application/json")
	public List<Album> byGenre(@PathVariable String genre) {
		return service.byGenre(genre);
	}
	
	@GetMapping(value = "/artist/{artist}", produces = "application/json")
	public List<Album> byArtist(@PathVariable String artist) {
		return service.byArtist(artist);
	}
}
