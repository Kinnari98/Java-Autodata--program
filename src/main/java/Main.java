
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kinna
 */
public class Main {

    public static void main(String args[]) {

        System.out.println("Welcome to Autodata -program!");
        
        // Generate an array, where the data will be stored
        ArrayList<Auto> cars = new ArrayList<>();

        printQuestion();
        // Generate input scanner
        Scanner scanner = new Scanner(System.in);

        // Program loop starts
        boolean program = true;
        while (program) {
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Brand?");
                String brand = scanner.next();
                System.out.println("Model?");
                String model = scanner.next();
                System.out.println("Transmission?");
                String gear = scanner.next();
                System.out.println("Fuel? ");
                String fuel = scanner.next();
                System.out.println("Manufacturing year?");
                int age = scanner.nextInt();
                System.out.println("License plate number?");
                String license = scanner.next();
                System.out.println("Token number?");
                int token = scanner.nextInt();

                // Adds given info to the array
                cars.add(new Auto(brand, model, gear, fuel, age, license, token));
                
                printQuestion();
            }

            if (choice == 2) {
                System.out.println("Give the license plate number of the car you'd like to delete from the list");
                String deleteLicense = scanner.next();
                System.out.println("Car belonging to the plate number: " + deleteLicense + " was deleted succesfully!");
                cars.removeIf(y -> Objects.equals(y.getmLicense(), deleteLicense));

                printQuestion();
            }

            if (choice == 3) {
                System.out.println("Do you wish to sort the list by token number (y/n)?");
                char answer = scanner.next().charAt(0);
                
                    
                if (answer == 'n') {
                  
                    System.out.println("\n------CARS-----");
                    for (Auto x : cars) {
                        System.out.println("------------");
                        x.printInfo();
                        System.out.println("------------\n");
                    }
                      if (cars.size() == 0) {
                    System.out.println("\n\nNO DATA\n\n");
                }
                    printQuestion();
                } else if (answer == 'y') {
                    System.out.println("The list is sorted by the token from the lowest to the highest!");
                    System.out.println("");
                    System.out.println("\n------CARS-----");
                    if (cars.size() == 0) {
                    System.out.println("\n\nNO DATA\n\n");
                }
                    for (int i = 0; i < cars.size(); i++) {
                        for (int j = i + 1; j < cars.size(); j++) {
                            if (cars.get(i).getToken() > cars.get(j).getToken()) {
                                Auto temp = cars.get(i);
                                cars.set(i, cars.get(j));
                                cars.set(j, temp);
                            }
                        }
                    }
                    
                    
                    // Prints the array, where data is stored
                    for (Auto a : cars) {
                        System.out.println("------------");
                        a.printInfo();
                        System.out.println("------------\n");

                    }

                    printQuestion();
                }
            }
            
            if (choice == 4) {
                System.out.println("Enter the license plate number of the car, you'd like to search: ");
                String searchCar = scanner.next().toLowerCase();
                int carLength = searchCar.length();
                boolean found = false;
                int index = 0;
                for (Auto x : cars) {
                    if (x.getmLicense().toLowerCase().equals(searchCar)) {
                        found = true;
                        index = cars.indexOf(x);
                    }
                }
                
                if (found) {
                    System.out.println("Car belonging to the plate number " + searchCar.toUpperCase() + " is at index: " + index);
                    Auto showCar = cars.get(index);
                    Search(carLength, true);
                    showCar.printInfo();
                    Search(carLength, true);
                } else {
                    Search(carLength, false);
                    System.out.println("Car belonging to the plate number " + searchCar + " not found!");
                    Search(carLength, false);
                }
                printQuestion();
            }

            if (choice == 5) {
                System.out.println("Do you wish to exit (y/n)?");
                char exit = scanner.next().charAt(0);
                if (exit == 'y') {
                    System.out.println("Exited successfully");
                    program = false;
                } else if (exit == 'n') {
                    printQuestion();
                }

            }

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid input! Please provide a number between one and four.");
                printQuestion();
            }

        }
        

    }

    // Subroutine for the loop
    private static void printQuestion() {
        System.out.println("");
        System.out.println("Choose action:");
        System.out.println("1. Add cars");
        System.out.println("2. Delete cars");
        System.out.println("3. Print the data of all cars in the database");
        System.out.println("4. Search cars");
        System.out.println("5. Exit");
        System.out.println("");
        System.out.println("");
    }
    
    public static void Search(int stringLength, boolean found) {
        String part1 = "Car ";
        String part2;
        if (found) {
            part2 = "found!";
            
        } else {
            part2 = "not found";
        }
        int part1Length = part1.length();
        int part2Length = part2.length();
        int length = part1Length + part2Length + stringLength;
        for (int a = 0; a > length; a++) {
            System.out.println("-");
        }
        System.out.println("");
    }
    
    
    
    

}
