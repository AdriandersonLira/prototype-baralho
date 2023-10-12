package Sueca;

public class DeckOfCardsSuecaTest {
    public static void main(String[] args) {
        DeckOfCardsSuecaFactory myDeckOfCardsSueca = new DeckOfCardsSuecaFactory();
        myDeckOfCardsSueca.createDeckOfCards();

        // imprime todas as 40 cartas na ordem em que elas sao distribuidas
        System.out.println( "Size: " + myDeckOfCardsSueca.size());
        System.out.println( myDeckOfCardsSueca);
    }
}
