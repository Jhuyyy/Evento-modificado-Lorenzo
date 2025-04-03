package com.evento.exceptions;

public class ErrorResponse {
    private final String message;
    private final int errorCode;

    public ErrorResponse(String message, int errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "message='" + message + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
