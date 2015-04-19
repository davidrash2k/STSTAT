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

import Model.Panel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class GameGUI {
    private JFrame main;
    private JPanel leftPanel, midPanel, rightPanel, wPlayerPanel, wEnemyPanel, probPanel, placementPanel;
    private JTextField xField, yField;
    private JButton fireBtn;
    private TitledBorder titledBorder;
    private ArrayList<Panel> playerPanel;
    private ArrayList<Panel> enemyPanel;
    
    public static void main(String[] args){
        new GameGUI();
    }
    
    public GameGUI(){
        playerPanel = new ArrayList<Panel>();
        enemyPanel = new ArrayList<Panel>();
        
        main = new JFrame("BottleShip");
        main.setSize(1024, 600);
        
        leftPanel = new JPanel();
        //leftPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        wPlayerPanel = new JPanel();
        wPlayerPanel.setLayout(new GridLayout(10,10));
        
        wEnemyPanel = new JPanel();
        wEnemyPanel.setLayout(new GridLayout(10,10));
        
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++){
                Panel pPanel = new Panel(j, i); // x, y
                playerPanel.add(pPanel);
                
                // Add JPanel
                JPanel panelPlayer = new JPanel();
                panelPlayer.setPreferredSize(new Dimension(20,20));
                panelPlayer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                wPlayerPanel.add(panelPlayer);
            }
        leftPanel.add(wPlayerPanel);
        main.add(leftPanel, BorderLayout.WEST);
        
        midPanel = new JPanel();
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++){
                Panel ePanel = new Panel(j,i);
                enemyPanel.add(ePanel);
                
                JPanel panelEnemy = new JPanel();
                panelEnemy.setPreferredSize(new Dimension(40,40));
                panelEnemy.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
                wEnemyPanel.add(panelEnemy);
            }
        midPanel.add(wEnemyPanel);
        main.add(midPanel, BorderLayout.CENTER);
        
        rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(2,1));
        
        probPanel = new JPanel();
        titledBorder = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "Probability");
        probPanel.setBorder(titledBorder);
        probPanel.setPreferredSize(new Dimension(300,100));
        rightPanel.add(probPanel);
        
        placementPanel = new JPanel();
        titledBorder = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "Place missile");
        placementPanel.setBorder(titledBorder);
        placementPanel.setPreferredSize(new Dimension(300,100));
        placementPanel.setLayout(new GridLayout(2,1));
        
        JPanel inputPanel = new JPanel(new GridLayout(2,2));
        inputPanel.setPreferredSize(new Dimension(200,50));
        
        xField = new JTextField();
        yField = new JTextField();
        fireBtn = new JButton("Fire");
        
        inputPanel.add(new JLabel("x"));
        inputPanel.add(xField);
        inputPanel.add(new JLabel("y"));
        inputPanel.add(yField);
        placementPanel.add(inputPanel);
        placementPanel.add(fireBtn);
        
        rightPanel.add(placementPanel);
        
        main.add(rightPanel, BorderLayout.EAST);
        
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
