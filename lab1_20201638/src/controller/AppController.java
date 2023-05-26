package controller;
import beans.Player;
import beans.Team;
import java.util.ArrayList;
import java.util.Scanner;

public class AppController {
    Scanner sc = new Scanner(System.in);
    public void registrarNuevoEquipo(ArrayList<Team> lista_equipo){
       Team equipo = new Team();
        System.out.println("Nombre");
        String nombre = sc.nextLine();
        for(Team team: lista_equipo){
            if(team.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Error, ya existe el nombre");
                return;
            }

        }
        System.out.println("Pais");
        String pais = sc.nextLine();
        System.out.println("inicales");
        String iniciales = sc.nextLine();
        if(String.length(iniciales)>3){
            System.out.println("Error, el inicial no tener más de 3 caracteres");
        }
        else{
        System.out.println("Estadio");
        String estadio = sc.nextLine();
        System.out.println("Tecnico");
        String tecnico = sc.nextLine();
        System.out.println("Presupuesto");
        Float presupuesto = Float.parseFloat(sc.nextLine());

        equipo.setNombre(nombre);
        equipo.setPais(pais);
        equipo.setIniciales(iniciales);
        equipo.setEstadio(estadio);
        equipo.setTecnico(tecnico);
        equipo.setPresupuesto(presupuesto);
        lista_equipo.add(equipo);
        }
    }
    public void registrarNuevoJugador(ArrayList<Player> lista_jugadores , ArrayList<Team> lista_equipo){
        System.out.println("--------Lista de Equipos-------");
        for(int i = 0; i < lista_equipo.size(); i++){
            System.out.println(i+"." +lista_equipo.get(i));
        }
    }
}
