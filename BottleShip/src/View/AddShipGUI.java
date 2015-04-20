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

import java.awt.Dimension;
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
    
    public static void main(String[] args){
        new AddShipGUI();
    }
    
    public AddShipGUI(){
        window = new JFrame("BottleShip - Set boat");
        window.setSize(450,200);
        
        formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        
        namePanel = new JPanel();
        namePanel.add(new JLabel("Boat name:"));
        boatLabel = new JLabel("boat");
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
        
        window.add(formPanel);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
