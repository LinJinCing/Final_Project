package tku.g4.game_tab1;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game1Panel extends JPanel{
	
	private int Ans1;
	private int Ans2;
	private int Ans3;
	private int Ans4;
	
	private int x1;
	private int x2;
	private int x3;
	private int x4;
	
	private JPanel middlePanel;
	
	private JTextField field;
	
	//顯示板還沒宣告
	private JButton restart;
	
	private int countA = 0;
	private int countB = 0;

	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	
	public Game1Panel(){
		Ans1 = rand.nextInt(10);
		Ans2 = rand.nextInt(10);
		Ans3 = rand.nextInt(10);
		Ans4 = rand.nextInt(10);
		x1 = input.nextInt();
		x2 = input.nextInt();
		x3 = input.nextInt();
		x4 = input.nextInt();
		
		if(x1 == Ans1){
			countA++;
		}
		if(x2 == Ans2){
			countA++;
		}
		if(x3 == Ans3){
			countA++;
		}
		if(x4 == Ans4){
			countA++;
		}
		
		if(x1 == Ans2 || x1 == Ans3 || x1 == Ans4){
			countB++;
		}
		if(x2 == Ans1 || x2 == Ans3 || x2 == Ans4){
			countB++;
		}
		if(x3 == Ans1 || x3 == Ans2 || x3 == Ans4){
			countB++;
		}
		if(x4 == Ans1 || x4 == Ans2 || x4 == Ans3){
			countB++;
		}
	}
}
