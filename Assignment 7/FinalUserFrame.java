import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FinalUserFrame extends JFrame{

	JLabel topic;
	JTextField countryInputField;
	JTextArea outputArea;
	JButton showStudents;
	JButton ascendingOrder;
	JButton descendingOrder;
	
	public FinalUserFrame(University ourUniversity) {
		
		super("Input Frame");
		
		setLayout(new FlowLayout());
		topic = new JLabel("Enter name of Country");
		add(topic);
		
		countryInputField = new JTextField(20);
		countryInputField.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				String country = e.getActionCommand();
				
				outputArea.setText("Number of Students from " + country + " is " + ourUniversity.numberOfStudents(country) + "\n");
				
				countryInputField.setText("");
			}
		});
		add(countryInputField);
		
		outputArea = new JTextArea(15,50);
		add(outputArea);
		
		showStudents = new JButton("Show Students");
		showStudents.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				outputArea.setText(ourUniversity.toString());
				
			}
		});
		add(showStudents);
		
		ascendingOrder = new JButton("Show Students sorted (Ascending)");
		ascendingOrder.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ourUniversity.sortStudents(false);
				OutputFrame n = new OutputFrame("Sorted List (ascending) of Students",ourUniversity);
				
			}
		});
		add(ascendingOrder);
		
		descendingOrder = new JButton("Show Students sorted (Descending)");
		descendingOrder.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ourUniversity.sortStudents(true);
				OutputFrame n = new OutputFrame("Sorted List (descending) of Students",ourUniversity);
				
			}
		});
		add(descendingOrder);
		
		
		setSize(700,400);
		setVisible(true);
	}
	
}
