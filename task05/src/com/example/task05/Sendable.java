package com.example.task05;

// Интерфейс для почты
interface Sendable<T> {
    String getFrom();
    String getTo();
    T getContent();
}
