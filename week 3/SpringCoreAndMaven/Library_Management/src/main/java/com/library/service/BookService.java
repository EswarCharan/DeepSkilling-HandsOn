package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

	private BookRepository bookRepo;
	public void setBookRepo(BookRepository bookrepo) {
		this.bookRepo=bookrepo;
	}
	public void addBook(String bookName) {
		bookRepo.SaveBook(bookName);
		System.out.println("Book"+bookName+"Added through Bookservice");
	}
}
