package com.design.pattern.composite;

public class CompositeDesignPattern {
    public  static void main(String[] args) {
        //Creating Leaf Objects
        Component hardDisk = new Leaf("Hard Disk", 2000);
        Component ram = new Leaf("RAM", 3000);
        Component cpu = new Leaf("CPU", 2000);
        Component mouse = new Leaf("Mouse", 2000);
        Component keyboard = new Leaf("Keyboard", 2000);
        //Creating composite objects
        Composite motherBoard = new Composite("Peripherals");
        Composite cabinet = new Composite("Cabinet");
        Composite peripherals = new Composite("Peripherals");
        Composite computer = new Composite("Computer");
        //Creating tree structure
        //Ading CPU and RAM in Mother board
        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);
        //Ading mother board and hard disk in Cabinet
        cabinet.addComponent(motherBoard);
        cabinet.addComponent(hardDisk);
        //Ading mouse and keyborad in peripherals
        peripherals.addComponent(mouse);
        peripherals.addComponent(keyboard);
        //Ading cabinet and peripherals in computer
        computer.addComponent(cabinet);
        computer.addComponent(peripherals);
        //To display the Price of Computer
        computer.displayPrice();
        //To display the Price of Keyboard
        keyboard.displayPrice();
        //To display the Price of Cabinet
//        cabinet.displayPrice();
    }
}
