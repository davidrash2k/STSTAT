/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bottleship;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zehcnas
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
       
        Scanner sc = new Scanner(System.in);
        int startX, startY, endX, endY;
        String b;
        
        
        Player p1 = new Player("Admiral 1");
        Computer c1 = new Computer("Admiral Bot");
        
        ArrayList<Ship> p1Ships; Ship p1TempShip;  
        ArrayList<Ship> c1Ships; Ship c1TempShip;
        
        ArrayList<Coordinates> p1ShipCoords = new ArrayList<Coordinates>(); 
        Coordinates p1TempCoord = new Coordinates();
        
        //init
        Fleet p1Fleet = p1.getFleet();
        p1Ships = p1Fleet.getShips();
//        (p1Fleet.getShips()).size()
          for(int ctr1 = 0; ctr1 < (p1Fleet.getShips()).size(); ctr1++){ //loop to access ship
              p1ShipCoords = new ArrayList<Coordinates>(); 
              p1TempShip = p1Ships.get(ctr1);//get ship
              int shipSize = p1TempShip.getSize();
              String direction ="";
               p1TempCoord = new Coordinates();
              
              System.out.println("Ship: " + p1TempShip.getName() + " Position Coordinates");
              System.out.println("Ship size: " + p1TempShip.getSize());
              System.out.println("Start x:");
              startX = sc.nextInt();
              b = sc.nextLine();
              
              System.out.println("Start y:");
              startY = sc.nextInt();
              b = sc.nextLine();
              
              System.out.println("[H]orizontal  / [V]ertical:");
              direction = sc.nextLine();
              direction = direction.toUpperCase();
//              b = sc.nextLine();
              
              
              int x = startX, y = startY;
                p1TempCoord.setX(x); p1TempCoord.setY(y);
                p1ShipCoords.add(p1TempCoord);
              
             
                
                  if(direction.equals("V")){
                        for(int ctr2 = 1; ctr2 < shipSize; ctr2++){
                            y++;
                            p1TempCoord = new Coordinates();
                            p1TempCoord.setX(x); p1TempCoord.setY(y);
                            p1ShipCoords.add(p1TempCoord);
                        }
                  }else{
                        for(int ctr2 = 1; ctr2 < shipSize; ctr2++){
                            x++;
                            p1TempCoord = new Coordinates();
                            p1TempCoord.setX(x); p1TempCoord.setY(y);
                            p1ShipCoords.add(p1TempCoord); //problem
                        }
                      
                  }
                  
                  //init  ship coords
              
              
              p1TempShip.setCoordList(p1ShipCoords);
              p1Ships.set(ctr1, p1TempShip);
                           
              
                      
                      
                            //set ship
          }
          
          p1Fleet.setShips(p1Ships);
               
        
        
        p1.setFleet(p1Fleet); // fleet initialized with coordinates
        
        
        p1.getFleet().displayShipCoordinates();
        
       
 
           //init
        Fleet c1Fleet = c1.getFleet(); 
        
        
        
        c1.setFleet(c1Fleet);
        
        
        
        //set ship positions
        
        //player
        
        //bot
        
        // GAME
        
        //game init
        String winner = "";
        boolean p1Turn = true;
        boolean c1Turn = false;
        boolean p1Hit = false;
        boolean c1Hit = false;
        boolean gameFlag = true;
        
//        Fleet p1BattleFleet = new Fleet();
//        ArrayList<Ship> p1BattleShips = new ArrayList<Ship>();
//        
//        Fleet c1BattleFleet = new Fleet();
//        ArrayList<Ship> c1BattleShips = new ArrayList<Ship>();
                
       winner = "none";
        while(gameFlag){ // game loop
            
            if(p1Turn){ //player 1
                System.out.println("Player: " + p1.getName() + "'s turn  P1 TURN");
                  p1.getFleet().displayShipCoordinates();
                  System.out.println("-----------------------------------------------------");
                  
 
                  
//                do{
//                    int x, y;
//                    System.out.println("Missile coord:");
//                     System.out.print("X: ");
//                      x = sc.nextInt();
//                      b = sc.nextLine();
//                      System.out.print("\nY:");
//                        y = sc.nextInt();
//                        b = sc.nextLine();
//                          System.out.println(" ");
//                    Coordinates tempCoord = new Coordinates();
//                    tempCoord.setX(x); tempCoord.setY(y);
//                     if(c1.checkHit(tempCoord))
//                       p1Hit = true;
//                   else
//                       p1Hit = false;
//                }while(p1Hit);
                
                p1Turn = false;
                c1Turn = true;
                
                
                   if((p1.getFleet().getStatus()).equals("DESTROYED") || (c1.getFleet().getStatus()).equals("DESTROYED") ){
                 c1Turn = false;
                 p1Turn = false;
             }
                
                
            }
            
             if(c1Turn){ //computer
                 System.out.println("Player: " + c1.getName() + "'s turn C1 TURN");
                    System.out.println("NO FLEET \n\n\n\n\n");
                do{
                   if(p1.checkHit(c1.generate()))
                       c1Hit = true;
                   else
                       c1Hit = false;
                }while(c1Hit);
                
                c1Turn = false;
                p1Turn = true;
                
                if((p1.getFleet().getStatus()).equals("DESTROYED") || (c1.getFleet().getStatus()).equals("DESTROYED") ){
                 c1Turn = false;
                 p1Turn = false;
             }
                
            }
            
             
             //check if there exists a winner
             
             if((p1.getFleet().getStatus()).equals("DESTROYED")){
                 System.out.println("WINNER p1");
                winner = c1.getName();
                gameFlag = false;
             }
             
              if((c1.getFleet().getStatus()).equals("DESTROYED")){
                    System.out.println("WINNER c1");
                winner = p1.getName();
                 gameFlag = false;
             }
            
            
        }
        
        System.out.println("GAME ENDED! Winner is: " + winner);
        
        
     
        
        
        
        
        
        
    }
    
}
