package View;

public class Menu {
    public static int mainMenu(){
        System.out.println("Bienvenidos a ParkingRejano v0.1");
        System.out.println("1. Listar  coches");
        System.out.println("2. Cuantos coches hay");
        System.out.println("3. Aparcar un coche");
        System.out.println("4. Sacar un coche");
        System.out.println("5. Salir");
        return UI.readInt("Elija una opción");
    }
    public static String parkingMenu_step1(){
        return UI.readString("Inserte la Matricula");

    }
    public static String parkingMenu_step2(){
        return UI.readString("Inserte el Modelo");

    }
    public static int parkingMenu_step3(){
        return UI.readInt("Inserte la edad");

    }
    public static String unparkingMenu(){
        return UI.readString("Inserte la Matricula");

    }
}
