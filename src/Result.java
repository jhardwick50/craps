
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class Result {
    
    private List<Player> winners = new ArrayList<>();

    private List<Player> ties = new ArrayList<>();
    
    public List<Player> getWinners() {
        return winners;
    }

    public void setWinners(List<Player> winners) {
        this.winners = winners;
    }
    
    public void addWinner(Player winner){
        winners.add(winner);
    }
    
}
