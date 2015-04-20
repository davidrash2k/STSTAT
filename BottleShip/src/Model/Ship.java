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
public class Ship {
    protected String name;
    protected ArrayList<Coordinates> coordList;
    protected int size;
    protected String status;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the coordList
     */
    public ArrayList<Coordinates> getCoordList() {
        return coordList;
    }

    /**
     * @param coordList the coordList to set
     */
    public void setCoordList(ArrayList<Coordinates> coordList) {
        this.coordList = coordList;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean hit(Coordinates hitCoord){
          int ctr1;
       
          Coordinates tempCoord;
          for(ctr1 = 0; ctr1 < coordList.size(); ctr1++){
              tempCoord = coordList.get(ctr1);
             if((tempCoord.getX() == hitCoord.getX()) && (tempCoord.getY() == hitCoord.getY()) ){
                 tempCoord.setIsHit(true);
                 return true;
            }
            
    }
           return false;
    }
    
    /**
     * @return the status
     */
    public String getStatus() {
        int hits, ctr1;
        hits = 0;
         for(ctr1 = 0; ctr1 < coordList.size(); ctr1++){
              if((coordList.get(ctr1).isIsHit())){ 
                    hits++;
                    System.out.println("Hits: " + hits + " " + coordList.get(ctr1).isIsHit());
                     System.out.println("Cood List size :  " + coordList.size());
              }
          }
         
         if(hits == size){
             System.out.println("------------------------------------------");
             return "SUNK";
            
         }
         
         return "ACTIVE";
         
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    public void displayCoordinates(){
        System.out.println("Ship:" + name);
        for(int ctr =0; ctr < size; ctr++){
            System.out.print("X: " + (coordList.get(ctr)).getX());
            System.out.print(" Y: " + (coordList.get(ctr)).getY());
            System.out.println(" Status: " + (coordList.get(ctr)).isIsHit());
        }
         System.out.println("END DISPLAY\n");
    }
}
