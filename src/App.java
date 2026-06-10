import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        runLinkedList();
        runQueue();
        runStack();

        Ejercicio1 ejercicio1 = new Ejercicio1();
        String texto = "COMPUTACION";
        String invertido = ejercicio1.invertString(texto);
        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + invertido);

        Ejercicio2 ejercicio2 = new Ejercicio2();
        String palabra1 = "radar";
        String palabra2 = "computacion";
        System.out.println(ejercicio2.esPalindromo(palabra1));
        System.out.println(ejercicio2.esPalindromo(palabra2));
        
    }

    private static void runStack() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        String elemento = pila.pop();
        System.out.println(pila.size());
        System.out.println(elemento);

        Deque<String> pila2 = new ArrayDeque<>();
        Deque<String> pila3 = new LinkedList<>();
        pila2.push("a");
        pila3.push("A");
        pila.pop();
        pila.pop();
    }

    private static void runQueue() {
        Queue<String> cola = new ArrayDeque<>();
        cola.offer("Jose");
        cola.offer("Andres");
        cola.add("Ana");
        System.out.println(cola.isEmpty());
        System.out.println(cola.size());

        System.out.println(cola.peek());
        System.err.println(cola.size());
        System.out.println(cola.poll());
        System.err.println(cola.size());

        while(!cola.isEmpty()){
            String cliente = cola.poll();
            System.out.println("Atendi a " + cliente);
        }
    }

    private static void runLinkedList() {
        System.out.println("Lista Enlazada / Linked List");
        LinkedList<String> nombres = new LinkedList<>();
        System.out.println("Esta vacía? " + nombres.isEmpty());
        System.out.println("Tamaño: " + nombres.size());

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Diego");

        System.out.println(nombres.getFirst());
        System.out.println(nombres.get(2));
        System.out.println(nombres.getLast());

        System.out.println(nombres.peek());
        System.err.println(nombres.size());
        System.out.println(nombres.pop());
        System.err.println(nombres.size());
        
        }
        //ofer -> agrega al final
        //peek -> devuelve el primero sin eliminarlo
        //poll -> devuelve el primero y lo elimina
    }
