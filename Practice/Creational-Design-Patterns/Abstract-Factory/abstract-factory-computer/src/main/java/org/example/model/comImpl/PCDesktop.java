package org.example.model.comImpl;

import org.example.model.Computer;

public class PCDesktop extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public PCDesktop(String ram, String hdd, String cpu) {
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
        return "The Functionality of PCDesktop";
    }
}
