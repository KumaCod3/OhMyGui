package src;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Errore extends Frame{
	JLabel tx;
	Bottone ok;
	Bottone ty;
	JPanel c;
	
	public Errore(){
		super("---ERROR---");
		setLocation(Est.locationStandard);
		setBackground(Est.backgroundColor);
		setUndecorated(true);
		c = new JPanel();
		c.setBorder(Est.borColTut);
		c.setOpaque(false);
		add("Center",c);
		
		tx=new JLabel();
		tx.setAlignmentX(Component.CENTER_ALIGNMENT);
		tx.setText("I'm sorry, something went wrong ... ");
		tx.setBorder(Est.bordo);
		tx.setFont(Est.plainFont);
		
		ok=new Bottone("OK", 5);
		
		ty=new Bottone("CANCEL", 5);
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		
		c.add(tx);
		c.add(ok);
		c.add(ty);
		setAlwaysOnTop(true);
		pack();
	}
	
	public Errore(String a){
		this();
		tx.setText(a);

		ok.but.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	setVisible(false);
		    	dispose();
			}
		});
		
		remove(ty);
		ty.but.setText(a);
		ty.but.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	setVisible(false);
		    	dispose();
			}
		});
		ty.setVisible(false);

		pack();
	}

}		
