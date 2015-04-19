package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zehcnas
 */
public class Player {
    private String name;
    private Fleet fleet;
    
    public Player(String name){
        this.name = name;
        fleet = new Fleet();
    }

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
     * @return the fleet
     */
    public Fleet getFleet() {
        return fleet;
    }

    /**
     * @param fleet the fleet to set
     */
    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }
    
}
