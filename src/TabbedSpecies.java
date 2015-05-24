import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import tku.g4.game_tab1.Game1Panel;




public class TabbedSpecies extends JFrame{
	public TabbedSpecies()
	   {
	      super( " TabbedSpecies " );
	      JTabbedPane tabbedPane = new JTabbedPane();
	      
	      Game1Panel g1 = new Game1Panel(); // create first panel
	      tabbedPane.addTab( "Painter" , null , g1 , "First Panel" ); 



	      add( tabbedPane ); 
	   } 

}
