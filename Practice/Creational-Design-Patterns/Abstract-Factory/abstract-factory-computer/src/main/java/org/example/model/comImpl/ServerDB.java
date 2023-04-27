package org.example.model.comImpl;

import org.example.model.Computer;

public class ServerDB extends Computer {
    private String ram;
    private String cpu;
    private  String hdd;

    public ServerDB(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
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
        return "Functionality of ServerDB";
    }
}
