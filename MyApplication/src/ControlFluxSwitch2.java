package com.company;

public class ControlFluxSwitch2 {
    public static void main(String[]args){
        String carMake = "Ford";
        int doors = 4;
        switch(carMake) {
            case"Ford":
                switch(doors){
                    case 1:
                        System.out.println("Ford with two doors");
                        break;
                    case 2:
                        System.out.println("Ford with three doors");
                        break;
                    default:
                        System.out.println("Ford with four doors");
                        break;
                }
            default:
                System.out.println("No Ford car");
                break;
        }
    }
}
