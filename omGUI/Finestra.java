package omGUI;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Finestra extends Frame {
	public JPanel c;

	public Finestra(String x) {
		super(x);
		addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });
		
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		setLocation(Est.locationStandard);
		setPreferredSize(Est.windMedium);
		setBackground(Est.backgroundColor);
		Header testa = new Header();
		add(testa);
		c = new JPanel();
		c.setLayout(new BorderLayout(100, 10));
		c.setBorder(Est.borCol);
		c.setOpaque(false);
		add(c);

	}
	
	public Finestra(String x, int y) {
		super(x);
		addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });
		
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		setLocation(Est.locationStandard);
		setPreferredSize(Est.windSmallVert);
		setBackground(Est.backgroundColor);
		Header testa = new Header();
		add(testa);
		c = new JPanel();
		c.setLayout(new BorderLayout(100, 10));
		c.setBorder(Est.borCol);
		c.setOpaque(false);
		add(c);

	}
}
