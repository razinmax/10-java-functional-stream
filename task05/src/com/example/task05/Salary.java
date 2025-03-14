package com.example.task05;

import java.util.Objects;

// Класс для зарплат
class Salary implements Sendable<Integer> {
    private final String from;
    private final String to;
    private final Integer content;

    public Salary(String from, String to, int salary) {
        this.from = Objects.requireNonNull(from, "Sender cannot be null");
        this.to = Objects.requireNonNull(to, "Recipient cannot be null");
        this.content = Objects.requireNonNull(salary, "Content cannot be null");
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public Integer getContent() {
        return content;
    }
}
