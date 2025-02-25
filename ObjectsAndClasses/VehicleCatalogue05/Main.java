package ObjectsAndClasses.VehicleCatalogue05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double averageCarHorsePower = 0.00;
        int carHorsePower = 0;
        int carCount = 0;
        double averageTruckHorsePower = 0.00;
        int truckHorsePower = 0;
        int truckCount = 0;

        List<Vehicle> vehicleList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){

            String type = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int horsePower = Integer.parseInt(input.split(" ")[3]);

            if (type.equals("car")){
                type = "Car";
                carCount++;
                carHorsePower += horsePower;
                averageCarHorsePower = (double) carHorsePower / carCount;
            }
            else if (type.equals("truck")){
                type = "Truck";
                truckCount++;
                truckHorsePower += horsePower;
                averageTruckHorsePower = (double) truckHorsePower / truckCount;
            }

            Vehicle vehicle = new Vehicle(type, model, color, horsePower);

            vehicleList.add(vehicle);

            input = scanner.nextLine();
        }

        String object = scanner.nextLine();

        while (!object.equals("Close the Catalogue")){
            for (Vehicle vehicle : vehicleList){

                if (vehicle.getModel().equals(object)){
                    System.out.println("Type: " + vehicle.getType());
                    System.out.println("Model: " + vehicle.getModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Horsepower: " + vehicle.getHorsePower());
                }
            }
            object = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarHorsePower);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruckHorsePower);

    }
}
