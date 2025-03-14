package example;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import omGUI.Bottone;
import omGUI.Est;
import omGUI.Etichetta;
import omGUI.Finestra;
import omGUI.FormVuoto;


public class Home extends Finestra{
	String segnapostoString=" ";
	
	
	public Home() {
		super("Name of Program",5);
		
		JPanel contenuto = new JPanel();
		
		contenuto.setBorder(Est.bordo);
		contenuto.setOpaque(false);
		contenuto.setLayout(new GridLayout(1,3));
		
		JPanel topJPanel=new JPanel();
		topJPanel.setBorder(Est.bordo);
		topJPanel.setOpaque(false);
		topJPanel.setLayout(new FlowLayout());
		
		JPanel priJPanel=new JPanel();
		priJPanel.setBorder(Est.bordo);
		priJPanel.setOpaque(false);
		priJPanel.setLayout(new FlowLayout());
		Etichetta commEtichetta=new Etichetta("comment:");
		priJPanel.add(commEtichetta);
		
		JPanel secJPanel=new JPanel();
		secJPanel.setBorder(Est.bordoEt);
		secJPanel.setOpaque(false);
		secJPanel.setLayout(new FlowLayout());
		FormVuoto commFormVuoto=new FormVuoto("comment");
		secJPanel.add(commFormVuoto);
		
		topJPanel.add(priJPanel);
		topJPanel.add(secJPanel);
		c.add("North", topJPanel);
		
			
			JPanel nmJPanel=new JPanel();
			nmJPanel.setBorder(Est.bordo);
			nmJPanel.setOpaque(false);
			nmJPanel.setLayout(new FlowLayout());
			Etichetta nomeE=new Etichetta("ciao");
			nmJPanel.add(nomeE);
			contenuto.add(nmJPanel);
			
			JPanel btJPanel=new JPanel();
			btJPanel.setBorder(Est.bordo);
			btJPanel.setOpaque(false);
			btJPanel.setLayout(new FlowLayout());
			Bottone spingi=new Bottone("PUSH");
			spingi.but.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btJPanel.add(spingi);
			contenuto.add(btJPanel);
			
			JPanel rmJPanel=new JPanel();
			rmJPanel.setBorder(Est.bordo);
			rmJPanel.setOpaque(false);
			rmJPanel.setLayout(new FlowLayout());
			Bottone rimuovi=new Bottone("DEL");
			rimuovi.but.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			    	Home home=new Home();
			    	home.setVisible(true);
			    	dispose();
			    	
				}
			});
			rmJPanel.add(rimuovi);
			contenuto.add(rmJPanel);
		
		c.add("Center", contenuto);
		
		Bottone aggiungi=new Bottone("close","ciao");
		aggiungi.but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		c.add("South", aggiungi);
		pack();
	}
}