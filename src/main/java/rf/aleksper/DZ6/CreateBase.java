package rf.aleksper.DZ6;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import rf.aleksper.DZ6.services.BookService;
import rf.aleksper.DZ6.services.IssueService;
import rf.aleksper.DZ6.services.ReaderService;

@Component
@RequiredArgsConstructor
public class CreateBase {
    private final BookService bookServicey;
    private final ReaderService readerService;
    private final IssueService issueService;

    @EventListener(ContextRefreshedEvent.class)
    public void createdBbase() {
        bookServicey.addBook("Война и мир");
        bookServicey.addBook("Мастер и Маргарита");
        bookServicey.addBook("Приключения Буратино");

        readerService.addReader("Евгений Иванович Трошкин");
        readerService.addReader("Гаврила Петрович Шереметьев");
        readerService.addReader("Фёдор Петрович Ермаков");
        readerService.addReader("Василий Алибабаевич Алибаба");

        issueService.createIssue(0, 0);
        issueService.createIssue(1, 1);
        issueService.createIssue(2, 2);
    }

}
