
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
    

    
    private List<Player> passlinePlayers = new ArrayList<>();
    
    private List<Player> noPasslinePlayers = new ArrayList<>();
    
    private Player shooter;
    
    private Result result;
  

    public List<Player> getPasslinePlayers() {
        return passlinePlayers;
    }

    public void setPasslinePlayers(List<Player> passlinePlayers) {
        this.passlinePlayers = passlinePlayers;
    }

    public void addPasslinePlayer(Player passlinePlayer){
            passlinePlayers.add(passlinePlayer);
    }
    public List<Player> getNoPasslinePlayers() {
        return noPasslinePlayers;
    }

    public void setNoPasslinePlayers(List<Player> noPasslinePlayers) {
        this.noPasslinePlayers = noPasslinePlayers;
    }
    public void addNoPasslinePlayer(Player noPasslinePlayer){
            noPasslinePlayers.add(noPasslinePlayer);
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
