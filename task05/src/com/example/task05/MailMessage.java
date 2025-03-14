package com.example.task05;

import java.util.Objects;

// Класс для текстовых сообщений
class MailMessage implements Sendable<String> {
    private final String from;
    private final String to;
    private final String content;

    public MailMessage(String from, String to, String content) {
        this.from = Objects.requireNonNull(from, "Sender cannot be null");
        this.to = Objects.requireNonNull(to, "Recipient cannot be null");
        this.content = Objects.requireNonNull(content, "Content cannot be null");
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
    public String getContent() {
        return content;
    }
}
