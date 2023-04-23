package moon;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Resources {

	public static ImageIcon next;
	public static ImageIcon previous;

	public static ImageIcon newMoon;
	public static ImageIcon waxCrescent;
	public static ImageIcon firstQuarter;
	public static ImageIcon waxGibbous;
	public static ImageIcon fullMoon;
	public static ImageIcon wanGibbous;
	public static ImageIcon lastQuarter;
	public static ImageIcon wanCrescent;

	public static Font font;

	static {
		try {
			Image img = ImageIO.read(Resources.class.getResourceAsStream("/moon/next.png")).getScaledInstance(16, 16,
					Image.SCALE_SMOOTH);
			next = new ImageIcon(img);

			img = ImageIO.read(Resources.class.getResourceAsStream("/moon/previous.png")).getScaledInstance(16, 16,
					Image.SCALE_SMOOTH);
			previous = new ImageIcon(img);

			img = ImageIO.read(Resources.class.getResourceAsStream("/moon/newMoon.png"));
			newMoon = new ImageIcon(img);
			newMoon.setDescription("Luna nueva");

			img = ImageIO.read(Resources.class.getResourceAsStream("/moon/waxCrescent.png"));
			waxCrescent = new ImageIcon(img);
			waxCrescent.setDescription("Luna Creciente");

			img = ImageIO.read(Resources.class.getResourceAsStream("/moon/firstQuarter.png"));
			firstQuarter = new ImageIcon(img);
			firstQuarter.setDescription("Cuarto Creciente");

			img = ImageIO.read(Resources.class.getResourceAsStream("/moon/waxGibbous.png"));
			waxGibbous = new ImageIcon(img);
			waxGibbous.setDescription("Quinto Octante");

			img = ImageIO.read(Resources.class.getResourceAsStream("/moon/fullMoon.png"));
			fullMoon = new ImageIcon(img);
			fullMoon.setDescription("Luna Llena");

			img = ImageIO.read(Resources.class.getResourceAsStream("/moon/wanGibbous.png"));
			wanGibbous = new ImageIcon(img);
			wanGibbous.setDescription("Tercer Octante");

			img = ImageIO.read(Resources.class.getResourceAsStream("/moon/lastQuarter.png"));
			lastQuarter = new ImageIcon(img);
			lastQuarter.setDescription("Cuarto Menguante");

			img = ImageIO.read(Resources.class.getResourceAsStream("/moon/wanCrescent.png"));
			wanCrescent = new ImageIcon(img);
			wanCrescent.setDescription("Luna Menguante");

			font = Font.createFont(Font.PLAIN, Resources.class.getResourceAsStream("/SF-UI-Display-Regular.otf"))
					.deriveFont(14f);
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
