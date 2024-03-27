package rf.aleksper.DZ6.controllers;

import lombok.Data;

@Data
public class ReaderRequest {
    private final long readerId;
    private final String readerName;
}
