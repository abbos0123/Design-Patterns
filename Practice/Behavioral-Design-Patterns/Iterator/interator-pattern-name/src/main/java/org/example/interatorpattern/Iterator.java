package org.example.interatorpattern;

import java.util.Collection;

public interface Iterator<T> {
     boolean hasNext();
     T next();
}
