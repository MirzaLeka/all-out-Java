import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ReadFile extends JFrame{

	private JTextField addressBar;
	private JEditorPane display;
	
	// constructor
	public ReadFile() {
		super("JAVA KURS Browser");
		
		addressBar = new JTextField("Enter URL");
		addressBar.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent event) {
		loadCrap(event.getActionCommand());		
		
		}
		}
		);
		add(addressBar, BorderLayout.NORTH);
		display = new JEditorPane();
		display.setEditable(false);
		display.addHyperlinkListener(new HyperlinkListener(){
			public void hyperlinkUpdate(HyperlinkEvent event) {
				if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED) {
					loadCrap(event.getURL().toString());
				}
			}
		});
		add(new JScrollPane(display), BorderLayout.CENTER);
		setSize(1024,768);
		setVisible(true);
		}
	
//load crap to display on the screen
private void loadCrap(String userText) {
	try {
		display.setPage(userText);
		addressBar.setText(userText); 
		}catch(Exception e) {
		System.out.println("Invalid URL!");
	}
}
}

