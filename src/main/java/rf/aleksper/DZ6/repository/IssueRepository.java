package rf.aleksper.DZ6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rf.aleksper.DZ6.entity.Issue;

import java.util.List;

public interface IssueRepository extends JpaRepository<Issue, Long> {
    List<Issue> findAllByReaderId(long readerId);

    Issue findByBookId(long bookId);
}
