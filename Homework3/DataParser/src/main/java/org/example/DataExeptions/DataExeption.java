package org.example.DataExeptions;

public class DataExeption extends RuntimeException {

    private final int errorCode;

    public DataExeption(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
