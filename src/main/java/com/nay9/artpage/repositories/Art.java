package com.nay9.artpage.repositories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Art {

	@Id
	@GeneratedValue
	private Long id;
	private String artImage;
	private String artStyle;
	private String artTitle;
	
	public Art() {}

	public Art(String artImage, String artStyle, String artTitle) {
		this.artImage = artImage;
		this.artStyle = artStyle;
		this.artTitle = artTitle;
	}
	
	public Long getId() {
		return id;
	}

	public String getArtImage() {
		return artImage;
	}
	
	public String getArtStyle() {
		return artStyle;
	}
	
	public String getArtTitle() {
		return artTitle;
	}

	@Override
	public String toString() {
		return "Art [id=" + id + ", artImage=" + artImage + ", artStyle=" + artStyle + ", artTitle=" + artTitle + "]";
	}
	
}