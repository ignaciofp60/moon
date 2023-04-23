package moon;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;

	Main(String[] args) {
		super("Moon Phases");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		contentPane.setPreferredSize(new Dimension(480, 320));

		MoonPic moonPic = new MoonPic(Resources.newMoon, Resources.waxCrescent, Resources.firstQuarter,
				Resources.waxGibbous, Resources.fullMoon, Resources.wanGibbous, Resources.lastQuarter,
				Resources.wanCrescent);
		Buttons buttons = new Buttons(moonPic);

		contentPane.add(moonPic);
		contentPane.add(buttons);

		pack();
		setLocationRelativeTo(null);

	}

	public static void main(final String[] args) {
		SwingUtilities.invokeLater(() -> new Main(args).setVisible(true));
	}

}
