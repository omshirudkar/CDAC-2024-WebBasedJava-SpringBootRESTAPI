package book_library.repositary;



import org.springframework.data.jpa.repository.JpaRepository;

import book_library.entity.Book;



//@Repository is not required because JpaRepository is already managed
//since bookrepository is inherited from it it also becomes a managed component
public interface BookRepositary extends JpaRepository<Book, Integer>{
	
	

}