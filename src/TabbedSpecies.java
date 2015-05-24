import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import tku.g4.game_tab1.Game1Panel;
import tku.g4.game_tab2.Game2Panel;
import tku.g4.game_tab3.Game3Panel;
import tku.g4.game_tab4.Game4Panel;
import tku.g4.game_tab5.Game5Panel;




public class TabbedSpecies extends JFrame{
	public TabbedSpecies()
	   {
	      super( " TabbedSpecies " );
	      JTabbedPane tabbedPane = new JTabbedPane();
	      
	      Game1Panel g1 = new Game1Panel(); // create 1st panel
	      tabbedPane.addTab( "Game1" , null , g1 , "1st panel" ); 
	      
	      Game2Panel g2 = new Game2Panel(); // create 2nd panel
	      tabbedPane.addTab( "Game2" , null , g2 , "2nd panel" );
	      
	      Game3Panel g3 = new Game3Panel(); // create 3rd panel
	      tabbedPane.addTab( "Game3" , null , g3 , "3rd panel" );
	      
	      Game4Panel g4 = new Game4Panel(); // create 4th panel
	      tabbedPane.addTab( "Game4" , null , g4 , "4th panel" );
	      
	      Game5Panel g5 = new Game5Panel(); // create 5th panel
	      tabbedPane.addTab( "Game5" , null , g5 , "5th panel" );

	      add( tabbedPane ); 
	   } 

}
