import beans.Player;
import beans.Team;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<Team> lista_equipo = new ArrayList<>();
    ArrayList<Player> lista_jugadores = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("|             Menú                    |");
        System.out.println("|1 <- Registrar Nuevo Equipo          |");
        System.out.println("|2 <- Registrar Nuevo Jugador         |");
        System.out.println("|3 <- Lista de jugadores x salario    |");
        System.out.println("|4 <- Lista de equipos                |");
        System.out.println("|5 <- Lista de jugadores x equipo     |");
        System.out.println("|9 <- Salir                           |");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.print("Ingrese opción : ");
        String opcion = sc.nextLine();

        switch(opcion){
            case "1" -> {
                System.out.println("Registrar Nuevo equipo");
            }
            case "2" -> {
                System.out.println("Registrar Nuevo jugador");
            }
            case "3" -> {
                System.out.println("Lista de jugador x salario");
            }
            case "4" -> {
                System.out.println("Lista de equipos");
            }
            case "5" -> {
                System.out.println("Lista de jugadores x equipo");
            }
            case "9" -> {
                System.out.println("--- Cerrado Programa ---");
            }
            default -> {
                System.out.println("Ingrese una opcion valida");
            }
        }
    }
}