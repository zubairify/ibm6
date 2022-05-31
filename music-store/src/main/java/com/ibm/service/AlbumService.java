package com.ibm.service;

import java.util.List;

import com.ibm.entity.Album;

public interface AlbumService {
	
	int save(Album a);
	
	List<Album> list();
	
	Album byTitle(String title);
	
	List<Album> byArtist(String artist);
	
	List<Album> byGenre(String genre);
	
	void remove(int id);
}
