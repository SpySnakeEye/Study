package ru.archipov;

public interface TestLoggingInterface {
    @Log
    default void calculation(int param1) {
    }
    @Log
    default void calculation(int param1, int param2) {
    }
}

