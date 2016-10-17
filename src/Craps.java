/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * CIS 214 Java Programming
 * @author Jason Hardwick
 * Programming assignment 3
 */
import java.security.SecureRandom;
import java.lang.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Craps {
    
    // create secure random number generator for use in the method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    //enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST };
    
    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    
    
    public static void main(String[] args)
    {
       Player player1 = new Player();
       player1.setName("Ricky Bobby");
       
       Player player2 = new Player();
       player2.setName("El Diablo");
       
       Player player3 = new Player();
       player3.setName("Magic Man");
       
       Player player4 = new Player();
       player4.setName("Cal Naughton Jr.");
       
       Player player5 = new Player();
       player5.setName("Dr. Quinn");
       
       Player player6 = new Player();
       player6.setName("Medicine Woman");
       
       
       
       List<Player> playerList = new ArrayList<>();
       playerList.add(player1);
       playerList.add(player2);
       playerList.add(player3);
       playerList.add(player4);
       playerList.add(player5);
       playerList.add(player6);
       
       
       int shooterIndex = 0;
       for (int i = 0; i < 2; i++){
           
       
        Game game = new Game();
        
        Player shooter = playerList.get(shooterIndex);
        game.setShooter(shooter);
        System.out.println(shooter.getName() + " is the shooter.");
        
            
        
        //randomly assign all non shooters to pass-line or no-pass-line
        for (int j=0; j<playerList.size(); ++j){
            if (j != shooterIndex){
                
                Player player = playerList.get(j);
                double x = Math.random();
                if (x < .5){
                    game.addPasslinePlayer(player);
                    System.out.println(player.getName()+ " is playing the pass line.");
                }
                else if (x >= .5){
                    game.addNoPasslinePlayer(player);
                    System.out.println(player.getName()+ " is playing the No-Pass line.");
                }
            }

         }
        if (shooterIndex < 5 ){
            shooterIndex++;
        }else {
            shooterIndex = 0;
        } 





        play(game);

        Result result = game.getResult();
        for (Player player : result.getWinners()){
         System.out.println(player.getName() + " Won");
        }
        for (Player player : result.getTies()){
         System.out.println(player.getName() + " Tied");
        }
        for (Player player : result.getLosers()){
            System.out.println(player.getName() + " Lost");
        }
        System.out.println("");
       }
       
    }
    //plays one game of craps
    public static void play(Game game)
    {
         int myPoint = 0; //point if no win or loss on first roll
        Status gameStatus; //can contain CONTINUE, WON, or LOST
        
        int sumOfDice = rollDice(); // first roll of the dice
        
        // determine game status and point based on first roll
        switch (sumOfDice)
        {
            case SEVEN: //win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default: // did not win or lose, so remember point
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;//  remember the point
                System.out.printf("Point is %d%n", myPoint);
                break;
                            
        }
        
        Result result = new Result();
        
        
        
        if (sumOfDice == BOX_CARS){
            for (Player player : game.getNoPasslinePlayers()){
                result.addTie(player);
             }
        }
            
        //while game is not complete
        while (gameStatus == Status.CONTINUE) // not WON or LOST
        {
            sumOfDice = rollDice(); // roll dice again
            
            // determine game status
            if (sumOfDice == myPoint) // win by making point
                gameStatus = Status.WON;
            else
                if (sumOfDice == SEVEN) // lose by rolling 7 before point
                    gameStatus = Status.LOST;
            
           
        }
        
        
        if (gameStatus == Status.WON){
            result.addWinner(game.getShooter());
            for (Player player : game.getPasslinePlayers()){
                result.addWinner(player);
            } 
            for (Player player : game.getNoPasslinePlayers()){
                result.addLoser(player);
            }
        } 
       
        game.setResult(result);
            
        
    }
    // roll dice, calculate sum and display results
    public static int rollDice()
    {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); //first die roll
        int die2 = 1 + randomNumbers.nextInt(6); //second die roll
        
        int sum = die1 + die2; //sum of die values
        
        //display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        
        return sum;
    }
} // end class craps
