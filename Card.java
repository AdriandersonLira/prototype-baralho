// Classe Card representa uma carta de baralho.

public class Card implements Prototype
{
   private String face; // face da carta ("Ace", "Deuce", ...)
   private String suit; // naipe da carta ("Hearts", "Diamonds", ...)
   private int value;

   // construtor de dois argumentos inicializa face e naipe da carta
   public Card( String cardFace, String cardSuit, int cardValue )
   {
      face = cardFace; // inicializa face da carta
      suit = cardSuit; // inicializa naipe da carta
      value = cardValue;
   } // fim do construtor Card de dois argumentos

   @Override
   public Card clone() {
      return new Card(this.face, this.suit, this.value);
   }

   // retorna representa��o String de Card
   public String toString()               
   {                                      
      return face + " of " + suit + ", value " + value;        
   } // fim do m�todo toString
   
   public String getFace() {
	  return face;
   }

   public int getValue() {
	   return value;
   }


   public String getSuit() {
	  return suit;
   }

   public void setValue(int value) {
      this.value = value;
   }

} // fim da classe Card


