package org.example.interatorpattern;

public class NameRepository<T> implements Container<T>{
    private String names[] = {"Abbos", "Lola", "Nihola", "Ozoda", "Dilzo"};
    @Override
    public Iterator<T> getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<T>{
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public T next() {
            if (this.hasNext()){
                return (T)names[index++];
            }
            return null;
        }
    }
}
