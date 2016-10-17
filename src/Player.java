
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class Player {
    private String name;
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;
    private int passline = 0;
    private int nopassline = 0;
    private int shooter = 0;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }
    public void addWin(){
        wins++;
    }

    public int getLosses() {
        return losses;
    }
    public void addLoss(){
        losses++;
    }

    public int getTies() {
        return ties;
    }
    public void addTie(){
        ties++;
    }

    public int getPassline() {
        return passline;
    }
    public void addPassline(){
        passline++;
    }

    public int getNopassline() {
        return nopassline;
    }
    public void addNopassline(){
        nopassline++;
    }

    public int getShooter() {
        return shooter;
    }
    public void addShooter() {
        shooter++;
        passline++;
    }
    
    
    public double getWinPercentage(){
        
        return ((double)wins / (double)(wins + losses + ties))*100;
    }
    public double getlossPercentage(){
        
        return ((double)losses / (double)(wins + losses + ties))*100;
    }
    
    
    
    
}
