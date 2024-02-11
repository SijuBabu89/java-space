package com.buddywindow.functional_Interface.examples.entity;

import java.util.Objects;

public class Book {

	private int id;
	private String name;
	private String author;
	private int pages;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", pages=" + pages + ", price=" + price
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, id, name, pages, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name)
				&& pages == other.pages && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	public Book(int id, String name, String author, int pages, double price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
