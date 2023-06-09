package assignment5.prb5;

import java.util.Objects;

public class Computer {
    String manufracturer;
    String processor;
    int ramSize;
    double processorSpeed;

    public Computer(String manufracturer, String processor, int ramSize, double processorSpeed) {
        this.manufracturer = manufracturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }
    public int getRamSize(){
        return ramSize;
    }
    public double getProcessorSpeed(){
        return processorSpeed;
    }
    public double computerPower(){
        return ramSize*processorSpeed;
    }

    @Override
    public String toString() {
        return "Computer[ Manufacturer:" + manufracturer + ", CPU :" + processor + " RAM:" + ramSize + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ramSize == computer.ramSize && Double.compare(computer.processorSpeed, processorSpeed) == 0 && Objects.equals(manufracturer, computer.manufracturer) && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufracturer, processor, ramSize, processorSpeed);
    }
}
