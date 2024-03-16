
/*
2)Write a Vehicle class with overloaded methods that have a different number of parameters. 
  Demonstrate calling these overloaded methods with various numbers of arguments. 
*/

public class OopjAssignment4Q2 {

    public static class Vehicle {

        public void car(String modelName, String colour, float price) {
            System.out.println("Model Name  : " + modelName);
            System.out.println("Colour      : " + colour);
            System.out.println("Price       : " + price);
        }

        public void car(String modelName, String colour, float price, String owner) {
            System.out.println("Model Name  : " + modelName);
            System.out.println("Colour      : " + colour);
            System.out.println("Price       : " + price);
            System.out.println("Owner Name  : " + owner);
        }

        public void car(String modelName, String colour, float price, String owner, int numberPlate) {
            System.out.println("Model Name   : " + modelName);
            System.out.println("Colour       : " + colour);
            System.out.println("Price        : " + price);
            System.out.println("Owner Name   : " + owner);
            System.out.println("Number Plate : " + numberPlate);
        }

    }

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();

        vehicle.car("Maruti Swift","Blue",1000000);

        System.out.println("----------------------------");

        vehicle.car("Hyundai i20","Red",1200000 ,"Aniket Dhiwar");

        System.out.println("----------------------------");

        vehicle.car("Tata Harrier","White",3000000,"Aditya waje",1729);
       
        System.out.println("----------------------------");

    }
}
