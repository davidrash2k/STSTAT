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
public class Destroyer extends Ship {
    
     public Destroyer(){
         name = "Destroyer";
        size = 3;
        coordList = new ArrayList<Coordinates>();
        status = "ACTIVE";
    }
    
}
