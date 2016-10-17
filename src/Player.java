
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Author: Jason Hardwick
 * CIS 214
 * Programming assignment 3
 *
 * @author Jason
 */

//creates all the places to store the numbers and percentages.
public class Player {
    private String name;
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;
    private int passline = 0;
    private int nopassline = 0;
    private int shooter = 0;
    //creates getters and setters for each along with "adds" to increment.
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
        shooter++;//increments shooter
        passline++;//increments passline because shooter plays passline
    }
    
    //calculates win and loss percentages for each player
    public double getWinPercentage(){
        
        return ((double)wins / (double)(wins + losses + ties))*100;
    }
    public double getlossPercentage(){
        
        return ((double)losses / (double)(wins + losses + ties))*100;
    }
    
    
    
    
}
