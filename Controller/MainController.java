package Controller;

import Model.Car;
import Model.Parking;
import View.Menu;

public class MainController {
    /**
     * Modelo
     */
    static Parking parking = new Parking("Ies Francisco de los Rios", 4);
    public static void startApp(){
        int option=-1;
        do{
            option = Menu.mainMenu();
            mainController(option);
        }while (option!=5);
    }
    public static void mainController(int option){
        switch (option){
            case 1:
                System.out.println("*****************");
                System.out.println(parking);
                System.out.println("*****************");
            case 2:
                int nCars = parking.howManyCars();
                if (nCars==0){
                    System.out.println("No hay coches");
                } else if (nCars==1) {
                    System.out.println("Hay 1 coche");
                }else{
                    System.out.println("Hay"+nCars+"Coches aparcados");
                }
            case 3:
                if(parking.isFull()){
                    System.out.println("Lo siento no hay espacio");
                }else{
                    //pido datos del coche
                    String license = Menu.parkingMenu_step1();
                    String model = Menu.parkingMenu_step2();
                    int age = Menu.parkingMenu_step3();
                    Car carToBeInserted = new Car(license,model,age);
                    int parked = parking.parkCar(carToBeInserted);
                    if(parked==-1){
                        System.out.println("Error al aparcar el coche");
                    }else{
                        System.out.println("Hemos aparcado su coche en la plaza"+parked);
                    }
                }
                break;
            case 4:
                String license = Menu.unparkingMenu();
                Car carToBeUnParked = parking.unParkCar(license);
                if(carToBeUnParked==null){
                    System.out.println("Error al sacar el coche");
                }else{
                    System.out.println("El coche que sacamos es"+carToBeUnParked);
                }
                break;
            case 5:
                break;
            default:
                System.out.println("Opción Incorrecta");
        }
    }
}
