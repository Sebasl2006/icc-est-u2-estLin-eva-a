package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {
        Stack<String> arr = new Stack<>();
        for ( String c : cola ) {
            while (!arr.isEmpty()) arr.push(c); {
                String s = "";
                while (!cola.isEmpty()) s += arr.pop(); {
                    
                }
                
                
            }

        }
        

        return new LinkedList<>(Arrays.asList()); // Simulación de resultado
    }

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(Queue<String> cola) {
        Stack<Character> arr = new Stack<>();
        for ( String c : cola){
            if (c == "r" || c == "a" || c == "d" || c == "a" || c == "r") arr.push(c);
            if ( c == "a" && arr.pop() != "r" || c == "d" && arr.pop() != " a" || c == "a" && arr.pop() != " r" ) return false;
        }
        

        return arr.isEmpty();
    }

}
