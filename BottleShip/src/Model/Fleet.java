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
         for(Ship ship: ships){
                ship.displayCoordinates();
         }
    }
      
}
