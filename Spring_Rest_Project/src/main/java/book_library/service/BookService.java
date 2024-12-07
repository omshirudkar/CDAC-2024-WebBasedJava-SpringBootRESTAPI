package book_library.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_library.entity.Book;
import book_library.repositary.BookRepositary;
import book_library.store.BookStore;

@Service //marks thise class as a service and it is managed by spring
public class BookService {
	
	@Autowired
	private BookRepositary bookRepositaryReference;

	public Collection<Book> getAllBooks(){
		Collection<Book> allAvaBooks = bookRepositaryReference.getAllBooks();
		return allAvaBooks;
		
	}
	//a method to return one book against its ID
	
	public Book getOneBook(int bookID) {
	
		Book foundBook = bookRepositaryReference.getOneBook(bookID);
		return foundBook;
	}
	
	
	public void createNewBook(Book newBook) {
		bookRepositaryReference.createNewBook(newBook);
	}
	
}
