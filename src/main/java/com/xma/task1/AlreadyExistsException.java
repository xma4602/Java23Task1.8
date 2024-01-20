package com.xma.task1;

public class AlreadyExistsException extends Exception {
    String value;
    int position;

    public AlreadyExistsException(int position, String value) {
        this.value = value;
        this.position = position;
    }

    @Override
    public String getMessage() {
        return "Ошибка № %s: начение \"%s\" уже существует".formatted(position, value);
    }
}
