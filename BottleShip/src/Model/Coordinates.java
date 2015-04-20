/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Zehcnas
 */
public class Coordinates {
    private int x;
    private int y;
    private boolean isHit;
    
    public Coordinates(){
        x = 0;
        y = 0;
        isHit = false;
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setCoordinates(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the isHit
     */
    public boolean isIsHit() {
        return isHit;
    }

    /**
     * @param isHit the isHit to set
     */
    public void setIsHit(boolean isHit) {
        this.isHit = isHit;
    }
    
      public boolean checkCoordinates( int x, int y){
      if( this.x == x & this.y == y )
         return true;
      else return false;
   }
    
   
    
}
