/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aakov-dy
 */
public class Panel {
    private int x, y;
    private Boolean isOccupied;
    
    public Panel(){
        
    }
    
    public Panel(int x, int y){
        this.x = x;
        this.y = y;
        isOccupied = false;
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
     * @return the isOccupied
     */
    public Boolean getIsOccupied() {
        return isOccupied;
    }

    /**
     * @param isOccupied the isOccupied to set
     */
    public void setIsOccupied(Boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
}
