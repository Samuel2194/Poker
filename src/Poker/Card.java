package Poker;

public class Card {
    private String palo, color, valor;
    public  Card(String palo, String color, String valor){
        this.setPalo(palo);
        this.setColor(color);
        this.setValor(valor);
    }

    public String getCard(){
        return getPalo() + " " + getColor() + " " + getValor()+ "\n";
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public String getColor() {
        return color;
    }

    public String getValor() {
        return valor;
    }
}
