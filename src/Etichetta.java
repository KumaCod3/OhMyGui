package src;
import java.awt.Color;
import javax.swing.JLabel;

public class Etichetta extends JLabel{
	public Etichetta(String x){
		setText(x);
		setForeground(Est.textColorLight);
		setBackground(Est.backgroundDarkerColor);
		setFont(Est.plainFont);
		setOpaque(false);
		setBorder(Est.bordoEt);
		
	}
}
