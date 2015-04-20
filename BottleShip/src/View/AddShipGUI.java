/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakov-dy
 */

package View;

import Model.Coordinates;
import Model.Fleet;
import Model.Player;
import Model.Ship;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AddShipGUI {
    
    private JFrame window;
    private JPanel formPanel, namePanel, startPanel, positionPanel;
    private JLabel boatLabel;
    private JTextField xField, yField;
    private JRadioButton horizontalRadio, verticalRadio;
    private JButton submitBtn;
    private int ctr1 = 0;
    
    Player p1 = new Player("Admiral 1");
    ArrayList<Ship> p1Ships;
    Ship p1TempShip;
    ArrayList<Coordinates> p1ShipCoords = new ArrayList<Coordinates>(); 
    Coordinates p1TempCoord = new Coordinates();
    int shipSize;
    
    public static void main(String[] args){
        new AddShipGUI();
    }
    
    public AddShipGUI(){
        
        
        Fleet p1Fleet = p1.getFleet();
        p1Ships = p1Fleet.getShips();
        
        p1TempShip = p1Ships.get(ctr1);
        shipSize = p1TempShip.getSize();
        
        window = new JFrame("BottleShip - Set boat");
        window.setSize(450,200);
        
        formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        
        namePanel = new JPanel();
        namePanel.add(new JLabel("Boat name:"));
        boatLabel = new JLabel("boat");
        boatLabel.setText(p1TempShip.getName());
        namePanel.add(boatLabel);
        formPanel.add(namePanel);
        
        startPanel = new JPanel();
        startPanel.add(new JLabel("Starting point:"));
        startPanel.add(new JLabel("x:"));
        xField = new JTextField();
        xField.setPreferredSize(new Dimension(100,30));
        startPanel.add(xField);
        startPanel.add(new JLabel("y:"));
        yField = new JTextField();
        yField.setPreferredSize(new Dimension(100,30));
        startPanel.add(yField);
        formPanel.add(startPanel);
        
        positionPanel = new JPanel();
        horizontalRadio = new JRadioButton("Horizontal");
        horizontalRadio.setActionCommand("horizontal");
        horizontalRadio.setSelected(true);
        positionPanel.add(horizontalRadio);
        
        verticalRadio = new JRadioButton("Vertical");
        verticalRadio.setActionCommand("vertical");
        positionPanel.add(verticalRadio);
        
        ButtonGroup posGroup = new ButtonGroup();
        posGroup.add(horizontalRadio);
        posGroup.add(verticalRadio);
        formPanel.add(positionPanel);
        
        submitBtn = new JButton("Place ship");
        formPanel.add(submitBtn);
        
        submitBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (ctr1 < (p1Fleet.getShips()).size()-1){
                    int x = Integer.parseInt(xField.getText());
                    int y = Integer.parseInt(yField.getText());
                    p1TempCoord.setX(x);
                    p1TempCoord.setY(y);
                    
                    if (posGroup.isSelected(verticalRadio.getModel())){
                        for(int ctr2 = 1; ctr2 < shipSize; ctr2++){
                            y++;
                            p1TempCoord = new Coordinates();
                            p1TempCoord.setX(x); p1TempCoord.setY(y);
                            p1ShipCoords.add(p1TempCoord);
                        }
                    }
                    else {
                        for(int ctr2 = 1; ctr2 < shipSize; ctr2++){
                            x++;
                            p1TempCoord = new Coordinates();
                            p1TempCoord.setX(x); p1TempCoord.setY(y);
                            p1ShipCoords.add(p1TempCoord); //problem
                        }
                    }
                    p1TempShip.setCoordList(p1ShipCoords);
                    p1Ships.set(ctr1, p1TempShip);
                    
                    ctr1++;
                    p1TempShip = p1Ships.get(ctr1);
                    boatLabel.setText(p1TempShip.getName());
                    shipSize = p1TempShip.getSize();
                }
                else{
                    
                    int x = Integer.parseInt(xField.getText());
                    int y = Integer.parseInt(yField.getText());
                    p1TempCoord.setX(x);
                    p1TempCoord.setY(y);
                    
                    if (posGroup.isSelected(verticalRadio.getModel())){
                        for(int ctr2 = 1; ctr2 < shipSize; ctr2++){
                            y++;
                            p1TempCoord = new Coordinates();
                            p1TempCoord.setX(x); p1TempCoord.setY(y);
                            p1ShipCoords.add(p1TempCoord);
                        }
                    }
                    else {
                        for(int ctr2 = 1; ctr2 < shipSize; ctr2++){
                            x++;
                            p1TempCoord = new Coordinates();
                            p1TempCoord.setX(x); p1TempCoord.setY(y);
                            p1ShipCoords.add(p1TempCoord); //problem
                        }
                    }
                    p1TempShip.setCoordList(p1ShipCoords);
                    p1Ships.set(ctr1, p1TempShip);
                    
                    new GameGUI();
                }
            }
        });
        
        window.add(formPanel);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
