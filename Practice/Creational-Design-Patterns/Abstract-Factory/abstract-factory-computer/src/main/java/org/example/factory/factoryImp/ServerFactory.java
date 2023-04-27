package org.example.factory.factoryImp;

import org.example.factory.ComputerAbstractFactory;
import org.example.model.Computer;
import org.example.model.comImpl.PC;
import org.example.model.comImpl.PCDesktop;
import org.example.model.comImpl.Server;
import org.example.model.comImpl.ServerDB;

public class ServerFactory implements ComputerAbstractFactory {
    private String cpu;
    private String ram;
    private String hdd;

    public ServerFactory(String cpu, String ram, String hdd){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }
    @Override
    public Computer createComputer(String type) {
        if (type.equalsIgnoreCase("SERVER"))
            return new Server(ram, hdd, cpu);
        if (type.equalsIgnoreCase("SERVERDB"))
            return new ServerDB(ram, hdd, cpu);

        return null;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }
}
