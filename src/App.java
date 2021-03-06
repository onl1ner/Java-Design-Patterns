import java.util.Scanner;

import patterns.singleton.*;

import patterns.factorymethod.creators.*;

import patterns.builder.*;
import patterns.builder.director.*;
import patterns.builder.product.*;

public class App {

    private static void testSingleton() {
        System.out.println("Getting user...");
        System.out.println(Database.getInstance().getUser());
    }

    private static void testFactory(Scanner sc) {
        Factory factory = null;
        int answer = -1;

        System.out.println("How to deliver?");
        System.out.println("1. By truck\n2. By ship");

        answer = sc.nextInt();

        switch (answer) {
            case 1: factory = new TruckFactory(); break;
            case 2: factory = new ShipFactory(); break;
        }

        factory.deliver();
        sc.close();
    }
    
    private static void testBuilder(Scanner sc) {
        HouseBuilder builder = new HouseBuilder();
        HouseDirector director = new HouseDirector();

        int answer = -1;

        System.out.println("Choose house type:");
        System.out.println("1. Default");
        System.out.println("2. With garage");
        System.out.println("3. With swimming pool");
        System.out.println("4. With statues");
        System.out.println("5. With garden");

        answer = sc.nextInt();

        switch (answer) {
            case 1: director.constructHouse(HouseType.DEFAULT, builder); break;
            case 2: director.constructHouse(HouseType.WITHGARAGE, builder); break;
            case 3: director.constructHouse(HouseType.WITHPOOL, builder); break;
            case 4: director.constructHouse(HouseType.WITHSTATUES, builder); break;
            case 5: director.constructHouse(HouseType.WITHGARAGE, builder); break;
        }

        House house = builder.getResult();
        
        house.print();
        sc.close();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Which pattern to test?");
        System.out.println("1. Singleton\n2. Factory Method\n3. Builder");

        int answer = -1;

        Scanner sc = new Scanner(System.in);
        answer = sc.nextInt();

        switch (answer) {
            case 1: testSingleton(); break;
            case 2: testFactory(sc); break;
            case 3: testBuilder(sc); break;
        }
    }
}
