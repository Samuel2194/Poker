package Poker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
     static Deck deck;
    public static void main(String[] args) throws IOException {
        deck = new Deck();
        Menu();
    }

    public static void Menu() throws IOException {
        String opcion;
        System.out.println("¿Que deseas hacer? \n 1) Barajear el deck \n 2) Mostrar la primer carta del deck\n 3) Seleccionar una carta al azar del deck\n 4) Ver 5 cartas del desck \n 5) Salir");
        opcion = scanner.readLine();
        switch(opcion.toUpperCase()) {
            case "1": {
                deck.Shuffle();
                System.out.println("Se mezcló el Deck\n");
                Menu();
                break;
            }
            case "2": {
                System.out.println(deck.Head());
                Menu();
                break;
            }
            case "3": {
                System.out.println(deck.Pick());
                Menu();
                break;
            }
            case "4": {
                System.out.println(deck.Hand());
                Menu();
                break;
            }
            case "5": {
                break;
            }
            default:
                Menu();
        }
    }
}