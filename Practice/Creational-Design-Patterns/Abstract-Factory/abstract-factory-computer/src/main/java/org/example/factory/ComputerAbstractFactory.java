package org.example.factory;

import org.example.model.Computer;

public interface ComputerAbstractFactory {
    public Computer createComputer(String type);
}
