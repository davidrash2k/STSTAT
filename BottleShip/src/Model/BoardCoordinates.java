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
public class BoardCoordinates {
    private int x;
    private int y;
    private boolean isHit;
    private boolean isEmpty;
    
    public BoardCoordinates(){
        x = 0;
        y = 0;
        isHit = false;
        isEmpty = true;
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

    /**
     * @return the isEmpty
     */
    public boolean isIsEmpty() {
        return isEmpty;
    }

    /**
     * @param isEmpty the isEmpty to set
     */
    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
    
   
}
