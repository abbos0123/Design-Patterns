package org.example.factory.factoryImp;

import org.example.factory.ComputerAbstractFactory;
import org.example.model.Computer;
import org.example.model.comImpl.Laptop;
import org.example.model.comImpl.LaptopHP;
import org.example.model.comImpl.PC;
import org.example.model.comImpl.PCDesktop;

public class LaptopFactory implements ComputerAbstractFactory {
    private String cpu;
    private String ram;
    private String hdd;

    public LaptopFactory(String cpu, String ram, String hdd){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }
    @Override
    public Computer createComputer(String type) {
        if (type.equalsIgnoreCase("LAPTOP"))
            return new Laptop(ram, hdd, cpu);
        if (type.equalsIgnoreCase("LAPTOPHP"))
            return new LaptopHP(ram, hdd, cpu);

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
