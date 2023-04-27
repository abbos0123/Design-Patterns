package org.example.model;

public abstract class Computer {
    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    public abstract String getFunctionality();

    @Override
    public String toString() {

        return "Computer : " + this.getClass().getSimpleName() + "\nRAM : " + getRAM() + "\nHDD : " + getHDD() + "\nCPU : " + getCPU();
    }
}
