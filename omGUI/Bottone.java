package omGUI;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class Bottone extends JPanel{
	public NewButt but;
	
	public Bottone(String x){
		super();
		but=new NewButt(x);
		setBorder(Est.bordo);
		setLayout(new GridBagLayout());
		setBorder(Est.bordo);
		setBackground(Est.backgroundColor);

		but.setMinimumSize(Est.buttSmal);
		but.setMaximumSize(Est.buttSmal);
		but.setPreferredSize(Est.buttSmal);
		
		add(but);
	}
	
	public Bottone(String x, String y){
		super();
		but=new NewButt(x);
		setBorder(Est.bordo);
		setLayout(new GridBagLayout());
		setBorder(Est.bordo);
		setOpaque(false);

		but.setMinimumSize(Est.buttMed);
		but.setMaximumSize(Est.buttMed);
		but.setPreferredSize(Est.buttMed);
		
		add(but);
	}
	
	public Bottone(String x,int y){
		super();
		but=new NewButt(x);
		setBorder(Est.bordo);
		setLayout(new GridBagLayout());
		setBorder(Est.bordo);
		setOpaque(false);

		but.setMinimumSize(Est.buttBig);
		but.setMaximumSize(Est.buttBig);
		but.setPreferredSize(Est.buttBig);
		
		add(but);
	}
}
