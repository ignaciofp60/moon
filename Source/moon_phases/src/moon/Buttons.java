package moon;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Buttons extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private MoonPic moonPic;

	public Buttons(MoonPic moonPic) {
		this.moonPic = moonPic;
		inicialize();
	}

	private void inicialize() {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(newButton("PREVIOUS", Resources.previous));
		add(newButton("NEXT", Resources.next));

	}

	private JButton newButton(String actionCommand, ImageIcon icon) {
		JButton button = new JButton(icon);
		button.setActionCommand(actionCommand);
		button.addActionListener(this);
		return button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("NEXT")) {
			moonPic.nextImage();
		} else {
			moonPic.previousImage();
		}
	}

}
