import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Player player;



    public Game() {
        this.players = new ArrayList<Player>();
    }


    public int getAllPlayers() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

//    public Player play() {
//        for (Player player :this.players ) {
//            Card playerCard = player.getCards();
//
//        }
//    }
}
