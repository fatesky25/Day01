package study.a;

public class Card {
	Deck d = new Deck();

	 

	

	public void _str1_() {

		System.out.print("[");

		for(int i = 0; i < d.Card.length; ++i) {

			for(int j = 0; j < d.a.length; ++j) {

				System.out.printf("'%s  %s',",d.Card[i],d.a[j]);
			}
			System.out.println();
		}
		System.out.print("]");
	}

	
	

	public static void main(String[] args) {

		Card c = new Card();

		c._str1_();

		

 

	}
}
