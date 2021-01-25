package com.ejemplo.Kyosuke;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// Utiizando arreglos expandibles utilizando ArrayList
        List<String> list = new ArrayList<>();
        list.add("La Guajira");
        list.add("Magdalena");
        list.add("Sucre");
        System.out.println(list);
        list.add("Putumayo");
        System.out.println(list);
        //Ahora quitaremos un elemento del ArrayList
        list.remove(2);
        System.out.println(list);
        //Ahora recuperamos el segundo elemento del ArrayList
        String departamento = list.get(1);
        System.out.println("El segundo departamento de la lista es :"+departamento);
        //Ahora averiguaremos que posicion tiene en la lista un elemento
        int pos = list.indexOf("Putumayo");
        System.out.println("El departamento del Putumayo es el: "+pos);
    }
}
