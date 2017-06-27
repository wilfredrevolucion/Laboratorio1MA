package org.umg.curso;

/**
 * Created by alumno on 26/06/2017.
 */
public class Banco {
    public static void main(String[] args) {
        Cliente c= new Cliente();
        c.setNombre("Wilfred");
        c.setEdad(31);
        c.setSalario(3500);
        System.out.println("Estimado cliente: "+c.getNombre()+", su salario es de: "+c.getSalario()+", su edad: "+c.getEdad());
    }
}


