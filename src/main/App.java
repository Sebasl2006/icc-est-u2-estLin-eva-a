package main;

import java.util.LinkedList;
import java.util.Queue;

import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {

        LogicaClasificacion lg = new LogicaClasificacion();

        Queue<String> cola = new LinkedList<>();
        cola.add("Ana");
        cola.add("Luis");
        cola.add("Pedro");
        System.out.print(cola);
        System.out.print(lg.invertirColaNombres(cola));
        
        

    }
}
