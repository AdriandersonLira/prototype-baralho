package Sueca;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCardsSuecaFactory implements DeckOfCardsFactory, Prototype {
    private List<Card> deckSueca;
    private final int NUMBER_OF_CARDS = 40;
    private String trunfo;
    private Random randomNumbers;

    public DeckOfCardsSuecaFactory(List<Card> deckSueca) {
        this.deckSueca = deckSueca;
    }

    public List getDeckSueca() {
        return deckSueca;
    }

    public void setDeckSueca(List value) {
        this.deckSueca = value;
    }


    // Ace = 11, Seven = 10, King = 4, Queen = 3, Jack = 2
    @Override
    public List<Card> createDeckOfCards() {
        String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Jack", "Queen", "King" };
        String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

        List<Card> deckOfCardsSueca = new ArrayList<Card>(); // cria List de objetos Card

        randomNumbers = new Random();

        trunfo = suits[randomNumbers.nextInt(4)];

        // preenche baralho com objetos Card
        for ( int count = 0; count < NUMBER_OF_CARDS; count++ )   {
            var value = 0;
            switch (faces[ count % 10 ]) {
                case "Ace":
                    value = 11;
                    break;
                case "Seven":
                    value = 10;
                    break;
                case "King":
                    value = 4;
                    break;
                case "Jack":
                    value = 3;
                    break;
                case "Queen":
                    value = 2;
                    break;
                default:
                    value =  0;
            }

            deckOfCardsSueca.add(new Card( faces[ count % 10 ], suits[ count / 10 ], value ));
        }

        return deckOfCardsSueca;
    }

    @Override
    public Prototype clone() {
        List<Card> cartasClone = new ArrayList<>();
        for (Card carta : this.deckSueca) {
            cartasClone.add(carta.clone());
        }
        return new DeckOfCardsSuecaFactory(cartasClone);
    }

    public boolean hasCard() {
        return !deckSueca.isEmpty();
    }

    public void shuffle() {
        for (int first = 0; first < deckSueca.size(); first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deckSueca.remove(second);
            deckSueca.add(0, temp);
        }
    }

    public Card dealCard() {
        return hasCard() ? deckSueca.remove(deckSueca.size() - 1) : null ;
    }

    public int size() {
        return deckSueca.size();
    }

    public String getTrunfo(){
        return this.trunfo;
    }

    public String toString() {
        String formattedSentence = "";

        for (Card card : this.deckSueca) {
            formattedSentence += card.toString() + "\n";
        }
        return formattedSentence;
    }
}
