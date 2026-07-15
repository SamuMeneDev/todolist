package samumene.todolist.dto.response;

import java.time.LocalDateTime;

public record ExceptionResponse(
    LocalDateTime timestamp,
    String status,
    Integer statusCode,
    String error
) {}
