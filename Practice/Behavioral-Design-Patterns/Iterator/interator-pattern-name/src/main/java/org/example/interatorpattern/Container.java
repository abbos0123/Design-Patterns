package org.example.interatorpattern;

public interface Container<T> {
    Iterator<T> getIterator();
}
