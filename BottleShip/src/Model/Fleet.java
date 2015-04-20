/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Zehcnas
 */
public class Fleet {
    private String status;
    private ArrayList<Ship> ships;
    
    public Fleet(){
        status = "ACTIVE";
        ships = new ArrayList<Ship>();
        ships.add(new AircraftCarrier());
        ships.add(new Battleship());
        ships.add(new Submarine());
        ships.add(new Destroyer());
        ships.add(new PatrolBoat());
    }
    
    public String getStatus(){
        System.out.println("FLEET STATUS: ");
         int destroyedShips = 0;
        Ship tempShip = new Ship();
        int ctr1 = 0, ctr2 = 0;
        for(ctr1 = 0; ctr1 < getShips().size(); ctr1++){
               tempShip = getShips().get(ctr1);
               
                
               if((tempShip.getStatus()).equals("SUNK"))
                           destroyedShips++;
            
        }
        
        if(destroyedShips == 5){
            status = "DESTROYED";
           
        }
        
        System.out.println(status);
        
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the ships
     */
    public ArrayList<Ship> getShips() {
        return ships;
    }

    /**
     * @param ships the ships to set
     */
    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }
    
    
     public void displayShipCoordinates(){
         System.out.println("FLEET");
         for(int ctr = 0; ctr < ships.size(); ctr++){
                (ships.get(ctr)).displayCoordinates();
         }
    }
     
     public boolean checkHit(Coordinates missileCoord){
         boolean isHit = false;
         Ship tempShip = new Ship();
         //if missileCoord matches with a ships coord
                //hit
         for(int ctr1 = 0; ctr1 < ships.size(); ctr1++){
             tempShip = ships.get(ctr1);
             
            if(tempShip.hit(missileCoord)){
                ships.set(ctr1, tempShip);
                isHit = true;
            }
             
         }
         
         
         return isHit;
     }
      
}
