package omGUI;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

public class FormVuoto extends JTextField{
	String ret;
	String tt="";
	
	public FormVuoto(String tit){
		super(tit, 15);
		ret=tit;
		tt=tit;
		setForeground(Est.backgroundLighter);
		addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e){
				if (getText().equals(tit)){
					setText("");
					setForeground(Est.textColorDark);
				}
			}
			public void focusLost(FocusEvent e){
				if (getText().isEmpty()){
					setText(tit);
					setForeground(Est.backgroundLighter);
				}
				else ret=getText();
			}
		});
		setFont(Est.plainFont);
		
	}
	
	public void clear(){
		setText(tt);
		setForeground(Est.backgroundLighter);
	}
	
	public void setUnchain() {
		for (FocusListener f:getFocusListeners()) {
			removeFocusListener(f);
		}
	}
}
