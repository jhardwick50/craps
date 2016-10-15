
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
public class Game {
    
    private List<Player> playerList = new ArrayList<>();
    
    private List<Player> passline = new ArrayList<>();
    
    private List<Player> noPassline = new ArrayList<>();
    
    private Player shooter;
    
    private Result result;

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public List<Player> getPassline() {
        return passline;
    }

    public void setPassline(List<Player> passline) {
        this.passline = passline;
    }

    public List<Player> getNoPassline() {
        return noPassline;
    }

    public void setNoPassline(List<Player> noPassline) {
        this.noPassline = noPassline;
    }

    public Player getShooter() {
        return shooter;
    }

    public void setShooter(Player shooter) {
        this.shooter = shooter;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
    
   
    
    
}
