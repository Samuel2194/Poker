package Poker;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    ArrayList<Card> cards = new ArrayList<Card>();
    String [] colores ={"Rojo","Negro"};
    String[] valores = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] palos= {"Corazon","Trebol","Diamante","Espada"};
    Random random = new Random();
    public Deck(){
        //inicializa el Deck y crea todas las cartas
        String color="";
        for (int i=0; i< palos.length;i++){
            for (String valor: valores) {
                if (i%2 !=0){
                    color = colores[1];
                }else{
                    color = colores[0];
                }
                Card card =new Card(palos[i],color,valor);
                cards.add(card);
            }
        }
    }

    public void Shuffle(){
        int cartaNo=0;
        ArrayList<Card> newCards = new ArrayList<Card>();
        while (cards.size()!=0){
            cartaNo =random.nextInt(cards.size());
            Card carta = new Card(cards.get(cartaNo).getPalo(),cards.get(cartaNo).getColor(),cards.get(cartaNo).getValor());
            newCards.add(carta);
            cards.remove(cartaNo);
        }
        cards = newCards;
    }
    public String Head(){
        String carta;
        if (cards.size()>0) {
            carta = cards.get(0).getCard();
            cards.remove(0);
            carta += "Quedan " + cards.size() + " cartas en el deck\n";
        }else{
            carta = "El deck no cuenta con suficientes cartas";
        }
        return carta;
    }

    public String Pick(){
        String carta;
        int cartaNo=0;
        if (cards.size()>0) {
            cartaNo =random.nextInt(cards.size());
            carta = cards.get(cartaNo).getCard();
            cards.remove(cartaNo);
            carta += "Quedan " + cards.size() + " cartas en el deck\n";
        }else{
            carta = "El deck no cuenta con suficientes cartas";
        }
        return carta;
    }

    public String Hand(){
        String carta="";
        if (cards.size()>5) {
            for (int i=1;i<=5;i++){
                carta += cards.get(0).getCard();
                cards.remove(0);
            }
            carta += "Quedan " + cards.size() + " cartas en el deck\n";
        }else{
            carta = "El deck no cuenta con suficientes cartas";
        }
        return carta;
    }
}
