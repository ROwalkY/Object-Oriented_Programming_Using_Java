import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class OutputFrame extends JFrame{

	JLabel type;
	JTextArea outputArea;
	JButton closeWindow;
	
	public OutputFrame(String topic, University ourUniversity) {
		
		super("Output Frame");
		
		setLayout(new FlowLayout());
		
		type = new JLabel(topic);
		add(type);
		
		outputArea = new JTextArea(20,50);
		outputArea.setText(ourUniversity.toString());
		add(outputArea);
		
		closeWindow = new JButton("Close Window");
		closeWindow.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		add(closeWindow);
		
		
		setSize(600,500);
		setVisible(true);
	}
}
