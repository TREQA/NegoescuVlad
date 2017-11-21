package com.company;

public class ControlFluxSwitch {
    public static void main(String[]artg){
        int x = 523134;
        int y = 325423;
        int impartire = x%y;
        switch(impartire){
            case 1:
                System.out.println("Restul nu exista");
                break;
            default:
                if(impartire>1000)
                    System.out.println("Restule este mai mare de 1000");
                else
                    System.out.println("Restul este mai mic de 1000");
        }

    }
}
