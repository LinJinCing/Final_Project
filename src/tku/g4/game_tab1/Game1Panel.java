package tku.g4.game_tab1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Game1Panel extends JPanel implements ActionListener, ItemListener{
	
	private JPanel centerPanel;
	
    private JPanel GameStartPanel;
    private JButton start;
	
    public Game1Panel(){
    	super();
    	this.setLayout(new BorderLayout());
    	
    	centerPanel = new JPanel();
    	
    	GameStartPanel = new JPanel(new GridLayout(2,1));
    	start = new JButton("START");
    	GameStartPanel.add(start);
    	start.addActionListener(this);
    	
    	centerPanel.add(GameStartPanel, BorderLayout.CENTER);
    	
    }
    
    public void actionPerformed(ActionEvent e){
    	/*if (e.getSource() == start){
    		GameRun run = new GameRun();
    		run.setSize( 800, 800 ); // set frame size
    		run.setVisible( true ); // display frame
    	}*/
    }	
    public void itemStateChanged( ItemEvent e )
    {

    } // end method itemStateChanged
    

}
