package org.umg.curso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alumno on 26/06/2017.
 */
public class Principal {

    public static void main(String[] args) throws IOException{
        Cliente c = new Cliente();
        c.setNombre("");
        c.setEdad(31);
        c.setSalario(3500);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Su nombre: ");
        c.setNombre(reader.readLine());
        System.out.println("Su edad: ");
        c.setEdad(Integer.parseInt(reader.readLine()));
        System.out.println("Su salario: ");
        c.setSalario(Integer.parseInt(reader.readLine()));

        System.out.println("Estimado cliente: "+c.getNombre()+", su salario es de: "+c.getSalario()+", su edad: "+c.getEdad());
    }
}
