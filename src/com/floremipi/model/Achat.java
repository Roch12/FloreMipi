package com.floremipi.model;

import java.util.Date;


public class Achat {
	/**
	 * @param id
	 * @param startDate
	 * @param releaseDate
	 * @param quantity
	 * @param idArticle
	 */
	public Achat(Integer id, Date startDate, Date releaseDate,
			Integer quantity, String idArticle) {
		super();
		this.id = id;
		StartDate = startDate;
		ReleaseDate = releaseDate;
		Quantity = quantity;
		IdArticle = idArticle;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getReleaseDate() {
		return ReleaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		ReleaseDate = releaseDate;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	public String getIdArticle() {
		return IdArticle;
	}

	public void setIdArticle(String idArticle) {
		IdArticle = idArticle;
	}

	public Integer id;
	public Date StartDate;
	public Date ReleaseDate;
	public Integer Quantity;
	public String IdArticle;

}
