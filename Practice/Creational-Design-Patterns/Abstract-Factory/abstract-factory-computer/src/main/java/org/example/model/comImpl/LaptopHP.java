package org.example.model.comImpl;

import org.example.model.Computer;

public class LaptopHP extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public LaptopHP(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }

    @Override
    public String getFunctionality() {
        return "The Functionality of LaptopHP";
    }
}
