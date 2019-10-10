import java.util.ArrayList;




public class Player {

        private ArrayList<Card> cards;
        private String name;


        public Player(String name) {
            this.name = name;
            this.cards = new ArrayList<Card>();

        }


        public String getName() {
            return this.name;
        }

        public int getCards() {
            return this.cards.size();

        }
}

