package com.devic.backandfront.exception;

import java.time.LocalDate;

public record ApiError(
    String path,
    String message,
    Integer statusCode,
    LocalDate timestamp) {
}
