package rf.aleksper.DZ6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rf.aleksper.DZ6.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
