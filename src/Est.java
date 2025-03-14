package src;
import java.awt.*;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Est {
	public static Color backgroundColor=new Color(91,138,223);
	public static Color backgroundDarkerColor=new Color(44,100,198);

	public static Color backgroundLighter=new Color(117,223,235);
	
	public static Font boldFont=new Font("Arial Rounded MT Bold", Font.BOLD, 20);
	public static Font plainFont=new Font("Arial Rounded MT Bold", Font.PLAIN, 20);
	
	public static Color reddish=new Color(230,20,21);
	
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static double wi=screenSize.getSize().getWidth();
	private static double he=screenSize.getSize().getSize().getHeight();
	private static double he2=he/2;
	private static double he4=he/4;
	private static double he8=he/8;
	private static double wi2=wi/2;
	private static double wi4=wi/4;
	private static double wi8=wi/8;
	public static Dimension windBig=new Dimension((int)wi, (int)he);
	public static Dimension windMedium=new Dimension((int)wi2, (int)he2);
	public static Dimension windSmall=new Dimension((int)wi4, (int)he4);
	public static Dimension windMinimal=new Dimension((int)wi8, (int)he8);
	
	public static Dimension buttBig=new Dimension((int)wi4, (int)he/11);
	public static Dimension buttMed=new Dimension((int)wi/5, (int)he/16);
	public static Dimension buttSmal=new Dimension((int)wi8, (int)he/24);
	
	public static Dimension choi=new Dimension((int)wi/3,(int)he/12);
	public static Dimension fil=new Dimension((int)wi/3,(int)he/31);
	
	public static DecimalFormat deci = new DecimalFormat("0.00");
	public static DateTimeFormatter dateForm= DateTimeFormatter.ofPattern("yyyy-MM-dd H:mm.ss");
	
	public static Border bordo= BorderFactory.createEmptyBorder(10,10,10,10);
	public static Border borCol= BorderFactory.createMatteBorder(0, 4, 4, 4, backgroundDarkerColor);
	public static Border borColHe= BorderFactory.createMatteBorder(4, 4, 0, 4, backgroundDarkerColor);
	public static Border borColTut= BorderFactory.createMatteBorder(4, 4, 4, 4, backgroundDarkerColor);
	public static Border bordoEt= BorderFactory.createEmptyBorder(25,10,0,10);
	public static Point locationStandard=new Point((int)wi4, (int)he4);
	
}