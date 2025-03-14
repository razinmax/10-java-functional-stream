package com.example.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

// Сервис для обработки почты
class MailService<T> implements Consumer<Sendable<T>> {
    private final Map<String, List<T>> mailBox = new HashMap<>();

    @Override
    public void accept(Sendable<T> sendable) {
        mailBox.computeIfAbsent(sendable.getTo(), k -> new ArrayList<>()).add(sendable.getContent());
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> new ArrayList<>(e.getValue()), (a, b) -> a, HashMap::new));
    }
}
