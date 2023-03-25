package org.example;

import java.util.Scanner;

public class ClaseCadena {
    public static String DevuelveIniciles (String nombreCompleto){
        if(nombreCompleto == null || nombreCompleto.trim().equals("")){
            return "";
        }
        //el \\s+ es para que tome los espacios en blanco
        String[] partesNombre = nombreCompleto.split("\\s+");
        StringBuilder iniciales = new StringBuilder();
        for(String parte : partesNombre){
            if(parte.length()>0){
                iniciales.append(parte.charAt(0)).append(".");
            }
        }
        return iniciales.toString();
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre y apellido");
        String nombreCompleto = sc.nextLine();

        String iniciales = DevuelveIniciles(nombreCompleto);
        if(iniciales.isEmpty()){
            System.out.println("Nombre invalido");
        }else{
            System.out.println("Tus iniales son: " + iniciales);
        }
    }
}
