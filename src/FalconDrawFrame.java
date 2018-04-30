import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FalconDrawFrame extends JFrame implements ActionListener
{
	private FalconDrawPane drawPane;
	private JPanel controlPane;
	private JTextField filenameTF;
	private JButton loadBtn;
	
	public FalconDrawFrame()
	{
		super("Falcon Draw!");
		setSize(600,600);
		setResizable(false);
		drawPane = new FalconDrawPane();
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(drawPane, BorderLayout.CENTER);
		
		setupControlPane();
		getContentPane().add(controlPane, BorderLayout.NORTH);
		
		setVisible(true);
	}
	
	public void setupControlPane()
	{
		controlPane = new JPanel();
		filenameTF = new JTextField(30);
		loadBtn = new JButton("Load");
		controlPane.setLayout(new FlowLayout());
		controlPane.add(new JLabel("filename: "));
		controlPane.add(filenameTF);
		controlPane.add(loadBtn);
		loadBtn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent theEvent)
	{
		if (theEvent.getSource() == loadBtn)
			drawPane.loadFile(filenameTF.getText());
	}
}
