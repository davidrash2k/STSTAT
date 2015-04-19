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
        ArrayList<Coordinates> tempShipCoord;
        Coordinates tempCoord;
        BoardCoordinates tempBoardCoord = new BoardCoordinates();
        int shipCtr = 1;
        int shipsIndex = 0;
        int ctr1, ctr2;
        int coordLimit, coordCnt = 0;
        
        do{
            
            tempShip = ships.get(shipsIndex);
            coordLimit = tempShip.getSize();
            
            tempShipCoord = tempShip.getCoordList();
            
            
            for(ctr1 = 0; ctr1 < 100; ctr1++){ //row
           
                
                
                for(ctr2 = 0; ctr2 < tempShipCoord.size(); ctr2++){
                  
                    tempCoord = tempShipCoord.get(ctr2); // coordinate list of ship
                    tempBoardCoord = boardGrid.get(ctr1); // coordinate of board
                    
                    //check find matching coordinate of ship and board. set board coordinate to not empty.
                    if((tempCoord.getX() == tempBoardCoord.getX()) && (tempCoord.getY() == tempBoardCoord.getY()) ){
                           tempBoardCoord.setIsEmpty(false);
                           boardGrid.add(ctr1, tempBoardCoord);
                           coordCnt++;
                    }
                    //set coord to not empty
                    
                    coordCnt++;
                    
                    if(coordCnt == coordLimit)
                        break;
                    
                    
                }
                
                if(coordCnt == coordLimit)
                        break;
                
                
            }
            
            
            
            
            
    
            shipCtr++;
        }while(shipCtr <= ships.size());
        
    }
    
    
}
