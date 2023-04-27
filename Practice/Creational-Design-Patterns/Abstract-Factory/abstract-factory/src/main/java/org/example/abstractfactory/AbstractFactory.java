package org.example.abstractfactory;

public interface AbstractFactory<T> {
    T create(String name);
}
