package com.bookapp;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappJdbcApplication.class, args);
	}
	
IBookService bookservice;

public void run(String... args) throws Exception {
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println("1.Add Book\n"
				+"2.Update Book price\n"
				+"3.Delete Book \n"
				+"4.Get all Book \n"
				+"5.Find book by substring of starting name\n"
				+"6.Find books by category\n"
				+"7.Find books prices less than\n"
				+"8.Find by both author and category\n"
				+"9.Find by book id\n"
				+"10.Exit");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Adding a book");
			System.out.println("Enter a book title: ");
			String title = sc.next();
			System.out.println("Enter a book category: ");
			String category = sc.next();
			System.out.println("Enter a book author: ");
			String author = sc.next();
			System.out.println("Enter a book price: ");
			double price = sc.nextDouble();
			String cat;
			bookservice.addBook(new Book(title,author,cat, price));
			break;
		case 2:
			System.out.println("Updating a book price");
			System.out.println("Enter the book id:");
			int bookId=sc.nextInt();
			System.out.println("Enter the book price:");
			double conFee = sc.nextDouble();
			bookservice.updateBook(bookId,conFee);
			break;
		case 2:
			System.out.println("Updating a book price");
			System.out.println("Enter the book id:");
			int bookId=sc.nextInt();
			System.out.println("Enter the book price:");
			double conFee = sc.nextDouble();
			bookservice.updateBook(bookId,conFee);
			break;
		case 2:
			System.out.println("Updating a book price");
			System.out.println("Enter the book id:");
			int bookId=sc.nextInt();
			System.out.println("Enter the book price:");
			double conFee = sc.nextDouble();
			bookservice.updateBook(bookId,conFee);
			break;
		case 3:
			System.out.println("Deleting a book ");
			System.out.println("Enter the book id:");
			int bookId=sc.nextInt();
			bookservice.deleteBook(bookId1);
			break;
		case 4:
			System.out.println("List of all books");
			System.out.println("Enter the book id:");
			int bookId=sc.nextInt();
			System.out.println("Enter the book price:");
			double conFee = sc.nextDouble();
			bookservice.updateBook(bookId,conFee);
			break;
		case 2:
			System.out.println("Updating a book price");
			System.out.println("Enter the book id:");
			int bookId=sc.nextInt();
			System.out.println("Enter the book price:");
			double conFee = sc.nextDouble();
			bookservice.updateBook(bookId,conFee);
			break;
		case 2:
			System.out.println("Updating a book price");
			System.out.println("Enter the book id:");
			int bookId=sc.nextInt();
			System.out.println("Enter the book price:");
			double conFee = sc.nextDouble();
			bookservice.updateBook(bookId,conFee);
			break;
			
		}
	

