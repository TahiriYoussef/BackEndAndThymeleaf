package org.sid.cinema.service;

import org.sid.cinema.entities.Projection;
import org.springframework.data.domain.Page;

public interface ICinemaInititService {
	public void initVilles();
	public void initCinemas();
	public void initSalles();
	public void initPlaces();
	public void initSeances();
	public void initCategories();
	public void initFilms();
	public void initProjections();
	public void initTickets();
    Page < Projection > findPaginated(int pageNo, int pageSize);

}

