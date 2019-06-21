package pl.sda.Springbootpractice.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.Springbootpractice.model.Book;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findBookById(Long id);
    Optional<Book> findBookByTitle(String title);

    Optional<List<Book>> findAllBooksByAuthor(String author);

}
