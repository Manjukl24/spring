package com.bookapp.util;

import com.bookapp.model.Book;
import  java.util.Arrays;
import java.util.List;

//(String title, String author,String category, Integer bookId, double price)
public class BookDetails {

    public static List<Book> showDetails(){
        return  Arrays.asList(
                new Book("Social","Joe","GS",100,3000),
                new Book("Maths","Sam","S",100,4000),
                new Book("Social","Joe","GS",100,3000),
                new Book("Social","Joe","GS",100,3000),
                new Book("Social","Joe","GS",100,3000));
    }
}
