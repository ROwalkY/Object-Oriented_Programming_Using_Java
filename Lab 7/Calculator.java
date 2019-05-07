import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame{

	JTextField outputField;
	JButton numZero;
	JButton numOne;
	JButton numTwo;
	JButton numThree;
	JButton numFour;
	JButton numFive;
	JButton numSix;
	JButton numSeven;
	JButton numEight;
	JButton numNine;
	JButton symbolPlus;
	JButton symbolSubstract;
	JButton symbolMultiple;
	JButton symbolDivide;
	private int currentResult = 0;
	private boolean operationBefore = true;
	
	public Calculator() {
		
		setLayout(new FlowLayout());
		
		outputField = new JTextField("0",10);
		outputField.setEditable(false);
		add(outputField);
		
		numOne = new JButton("1");
		numOne.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(operationBefore) {
					
					outputField.setText("1");
					
					operationBefore = false;
					
				}else {
					
					outputField.setText(""+(Integer.parseInt(outputField.getText()) * 10 + 1));
					
				}
				
			}
		});
		add(numOne);
		
		numTwo = new JButton("2");
		numTwo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(operationBefore) {
					
					outputField.setText("2");
					
					operationBefore = false;
					
				}else {
					
					outputField.setText(""+(Integer.parseInt(outputField.getText()) * 10 + 2));
					
				}
				
			}
		});
		add(numTwo);
		
		numThree = new JButton("3");
		numThree.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(operationBefore) {
					
					outputField.setText("3");
					
					operationBefore = false;
					
				}else {
					
					outputField.setText(""+(Integer.parseInt(outputField.getText()) * 10 + 3));
					
				}
				
			}
		});
		add(numThree);
		
		numFour = new JButton("4");
		numFour.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(operationBefore) {
					
					outputField.setText("4");
					
					operationBefore = false;
					
				}else {
					
					outputField.setText(""+(Integer.parseInt(outputField.getText()) * 10 + 4));
					
				}
				
			}
		});
		add(numFour);
		
		numFive = new JButton("5");
		numFive.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(operationBefore) {
					
					outputField.setText("5");
					
					operationBefore = false;
					
				}else {
					
					outputField.setText(""+(Integer.parseInt(outputField.getText()) * 10 + 5));
					
				}
				
			}
		});
		add(numFive);
		
		numSix = new JButton("6");
		numSix.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(operationBefore) {
					
					outputField.setText("6");
					
					operationBefore = false;
					
				}else {
					
					outputField.setText(""+(Integer.parseInt(outputField.getText()) * 10 + 6));
					
				}
				
			}
		});
		add(numSix);
		
		numSeven = new JButton("7");
		numSeven.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(operationBefore) {
					
					outputField.setText("7");
					
					operationBefore = false;
					
				}else {
					
					outputField.setText(""+(Integer.parseInt(outputField.getText()) * 10 + 7));
					
				}
				
			}
		});
		add(numSeven);
		
		numEight = new JButton("8");
		numEight.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(operationBefore) {
					
					outputField.setText("8");
					
					operationBefore = false;
					
				}else {
					
					outputField.setText(""+(Integer.parseInt(outputField.getText()) * 10 + 8));
					
				}
				
			}
		});
		add(numEight);
		
		numNine = new JButton("9");
		numNine.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(operationBefore) {
					
					outputField.setText("9");
					
					operationBefore = false;
					
				}else {
					
					outputField.setText(""+(Integer.parseInt(outputField.getText()) * 10 + 9));
					
				}
				
			}
		});
		add(numNine);
		
		numZero = new JButton("               0               ");
		numZero.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(operationBefore) {
					
					outputField.setText("0");
					
					operationBefore = false;
					
				}else {
					
					outputField.setText(""+(Integer.parseInt(outputField.getText()) * 10));
					
				}
				
			}
		});
		add(numZero);
		
		symbolPlus = new JButton("   +   ");
		symbolPlus.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				currentResult = Integer.parseInt(outputField.getText()) + currentResult;
				
				outputField.setText(""+currentResult);
				
				operationBefore = true;
			}
		});
		add(symbolPlus);
		
		symbolSubstract = new JButton("   -   ");
		symbolSubstract.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				currentResult = Integer.parseInt(outputField.getText()) - currentResult;
				
				outputField.setText(""+currentResult);
				
				operationBefore = true;
			}
		});
		add(symbolSubstract);
		
		symbolMultiple = new JButton("   *    ");
		symbolMultiple.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				currentResult = Integer.parseInt(outputField.getText()) * currentResult;
				
				outputField.setText(""+currentResult);
				
				operationBefore = true;
			}
		});
		add(symbolMultiple);
		
		symbolDivide = new JButton("    /   ");
		symbolDivide.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				currentResult = Integer.parseInt(outputField.getText()) / currentResult;
				
				outputField.setText(""+currentResult);
				
				operationBefore = true;
			}
		});
		add(symbolDivide);
		
		
		setSize(160,260);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Calculator n = new Calculator();
		
	}
	
}
