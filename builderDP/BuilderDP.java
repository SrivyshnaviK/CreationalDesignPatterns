package com.Vyshnavi.builderDP;

import java.util.Scanner;

public class BuilderDP {
    public static void main(String[] args) {
        CarBuilder carBuilder;
        System.out.println("Car building automation process!!\nSelect brand needed to be built:");
        System.out.println("1.Audi\n2.Hyundai");
        Scanner scanner=new Scanner(System.in);
        int type= scanner.nextInt();
        switch (type){
            case 1:
                carBuilder=new AudiCarBuilder("Audi");
                break;
            case 2:
                carBuilder=new HyundaiCarBuilder("Hyundai");
                break;
            default:
                System.out.println("Required brand building not developed..");

        }
    }
}
