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
public class Board {
    private ArrayList<BoardCoordinates> boardGrid;
    
    public Board(){ //init board
        boardGrid = new ArrayList<BoardCoordinates>();
        int ctr1 = 0; int ctr2 = 0;
        
        BoardCoordinates tempCoord = new BoardCoordinates();
        
        for(ctr1 = 0; ctr1 < 10; ctr1++){ //row
              for(ctr2 = 0; ctr2 < 10; ctr2++){ //col
                  tempCoord.setCoordinates(ctr1, ctr2);
                  boardGrid.add(tempCoord);
              }
        }
        
        
    }
    
    public void placeFleet(ArrayList<Ship> ships){ //called only once
        Ship tempShip = new Ship();
        BoardCoordinates tempCoord = new BoardCoordinates();
        int shipCtr = 1;
        int shipsIndex = 0;
        int ctr1;
        int coordLimit;
        
        do{
            
            tempShip = ships.get(shipsIndex);
            coordLimit = tempShip.size();
            
            tempShip.getCoordList();
            
            
            for(ctr1 = 0; ctr1 < 100; ctr1++){ //row
                tempCoord = boardGrid.get(ctr1);
                
                
                
            }
            
            
            
    
            shipCtr++;
        }while(shipCtr <= ships.size());
        
    }
    
    
}
