package com.ucll;

import java.util.ArrayList;
import java.util.List;

public class Db {

	private List<Review> data; 
	
	public Db() {
		this.data = new ArrayList<>();
		create(new Review(1, "diest", "calvin swinnen", "Leuke plek", "Veel wegenwerken", 88));
		create(new Review(2, "diest", "silke sijmons", "Valt mee", "Veel regen", 50));
		create(new Review(4, "diest", "calvin swinnen", "Leuke plek", "Veel wegenwerken", 88));
		create(new Review(5, "diest", "silke sijmons", "Valt mee", "Veel regen", 50));
		create(new Review(3, "bekkevoort", "calvin swinnen", "Veel groen", "Weining winkels", 70));
	
	}

	public List<Review> getData() {
		return data;
	}

	public void setData(List<Review> data) {
		this.data = data;
	}

	public List<Review> findAll() {
		return data;
	}

	public Review findOne(String name) {
		
		for ( Review w : data) {
			if ( w.getName().equals(name)) {
				return w;
			}
		}
		return null;
	}

	public void create(Review resource) {
		data.add(resource);
	}

	public void update(Review resource) {
		
		deleteById(resource.getName());
		create(resource);
	}

	public void deleteById(String name) {
		int i = 0;
		for ( Review w : data) {
			if ( w.getName().equals(name)) {
				data.remove(i);
			}
			i++;
		}
		
	}
	public List<Review> findReviews(String name) {
		List<Review> reviews = new ArrayList<>();
		for ( Review w : data) {
			if ( w.getName().equals(name)) {
				reviews.add(w);
			}
		}
		return reviews;
	}
	

	
}
