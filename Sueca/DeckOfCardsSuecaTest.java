package Sueca;

import java.util.ArrayList;

public class DeckOfCardsSuecaTest {
    public static void main(String[] args) {

        DeckOfCardsSuecaFactory myDeckOfCardsSueca = new DeckOfCardsSuecaFactory(new ArrayList());
        myDeckOfCardsSueca.setDeckSueca(myDeckOfCardsSueca.createDeckOfCards());

        // imprime todas as 40 cartas na ordem em que elas sao distribuidas
        System.out.println( "Size: " + myDeckOfCardsSueca.size());
        // System.out.println( myDeckOfCardsSueca);

        // apresenta trunfo
        System.out.println( "Trunfo: " + myDeckOfCardsSueca.getTrunfo() + "\n");

        myDeckOfCardsSueca.shuffle(); // coloca Cards em ordem aleatória

        System.out.println( myDeckOfCardsSueca);

        System.out.println( "Removendo 26 cartas a partir do topo do Meu baralho: ");

        for ( int i = 0; i < 26; i++ )
        {
            System.out.printf( "%-20s\n", myDeckOfCardsSueca.dealCard());
        } // for final
        System.out.println("\nSize: " + myDeckOfCardsSueca.size());
        System.out.println( "Meu Novo Baralho Size: " + myDeckOfCardsSueca.size());
    }
}
