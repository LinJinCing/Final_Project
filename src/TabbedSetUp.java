import javax.swing.JFrame;


public class TabbedSetUp {

	public static void main(String[] args) {
		
		TabbedSpecies tabbedSpecies = new TabbedSpecies();  
		tabbedSpecies.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		tabbedSpecies.setSize( 900, 800 ); // set frame size
		tabbedSpecies.setVisible( true ); // display frame
		System.out.println("WWW");
	}

}
