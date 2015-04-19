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
        Player c1 = new Player("Admiral Bot");
        
        ArrayList<Ship> p1Ships; Ship p1TempShip;  
        ArrayList<Ship> c1Ships; Ship c1TempShip;
        
        ArrayList<Coordinates> p1ShipCoords = new ArrayList<Coordinates>(); 
        Coordinates p1TempCoord = new Coordinates();
        
        //init
        Fleet p1Fleet = p1.getFleet();
        p1Ships = p1Fleet.getShips();
//        (p1Fleet.getShips()).size()
          for(int ctr1 = 0; ctr1 < (p1Fleet.getShips()).size(); ctr1++){ //loop to access ship
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
       
        while(winner.equals("")){ // game loop
            
            if(p1Turn){ //player 1
                System.out.println("Player: " + p1.getName());
                do{
                    //hit code here
                }while(p1Hit);
                
                p1Turn = false;
                c1Turn = true;
            }
            
             if(c1Turn){ //computer
                 System.out.println("Player: " + c1.getName());
                do{
                    //hit code here
                }while(p1Hit);
                
                c1Turn = false;
                p1Turn = true;
            }
             
             
             //check if there exists a winner
             
             if(p1.getFleet().getStatus().equals("DESTROYED")){
                winner = c1.getName();
             }
             
              if(c1.getFleet().getStatus().equals("DESTROYED")){
                winner = p1.getName();
             }
            
            
        }
        
        
     
        
        
        
        
        
        
    }
    
}
