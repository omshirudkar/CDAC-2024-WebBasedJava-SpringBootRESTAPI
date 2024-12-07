package book_library.repositary;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import book_library.entity.Book;
import book_library.store.BookStore;


@Repository  //Marks these class as a repository and it is managed by spring
public class BookRepositary {

	public Collection<Book> getAllBooks(){
		Collection<Book> allAvailBooks = BookStore.getAllBooks();
		return allAvailBooks;
	}
	
	//a method to return one book against its ID
	public Book getOneBook(int bookID) {

		Book foundBook = BookStore.getOneBook(bookID);
		return foundBook; 
	}
	
	//A method to add a new book 
	public void createNewBook(Book newBook) {
		BookStore.createNewBook(newBook);
	}
}