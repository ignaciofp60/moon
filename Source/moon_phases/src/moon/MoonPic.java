package moon;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoonPic extends JPanel {

	private static final long serialVersionUID = 1L;
	private ArrayList<ImageIcon> moons = new ArrayList<>();
	private JLabel thumb; // Thumbnail
	private int currentPic; // The index of the pic we're right now

	public MoonPic(ImageIcon... moonPic) {
		for (ImageIcon pic : moonPic) {
			moons.add(pic);
		}

		inicialize();
	}

	public void nextImage() {
		if (currentPic < moons.size() - 1) {
			thumb.setIcon(moons.get(++currentPic));
			thumb.setText(moons.get(currentPic).getDescription());
		} else {
			currentPic = 0;
			thumb.setIcon(moons.get(currentPic));
			thumb.setText(moons.get(currentPic).getDescription());
		}
	}

	public void previousImage() {
		if (currentPic > 0) {
			thumb.setIcon(moons.get(--currentPic));
			thumb.setText(moons.get(currentPic).getDescription());
		} else {
			currentPic = moons.size() - 1;
			thumb.setIcon(moons.get(currentPic));
			thumb.setText(moons.get(currentPic).getDescription());
		}
	}

	private void inicialize() {
		setLayout(new FlowLayout(FlowLayout.CENTER));

		// Initializing currentPic to 0 and setting new JLabel Text using
		// the image description
		currentPic = 0;
		thumb = new JLabel(moons.get(currentPic).getDescription());

		// Getting image and centering it
		ImageIcon pic = moons.get(currentPic);
		thumb.setIcon(pic);
		thumb.setHorizontalAlignment(JLabel.CENTER);
		thumb.setVerticalAlignment(JLabel.CENTER);

		// Placing text and getting it from image description
		thumb.setHorizontalTextPosition(JLabel.CENTER);
		thumb.setVerticalTextPosition(JLabel.BOTTOM);
		thumb.setIconTextGap(-20);

		// Formating text
		thumb.setForeground(Color.WHITE);
		thumb.setFont(Resources.font);

		// Setting background and JLabel size
		// thumb.setBorder(BorderFactory.createLineBorder(new Color(0xb86a80)));
		thumb.setBackground(Color.BLACK);
		thumb.setOpaque(true);

		thumb.setPreferredSize(new Dimension(480, 270));

		add(thumb);
	}

}
