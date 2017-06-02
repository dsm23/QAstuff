package project;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

import javax.swing.*;

public class ATM extends JFrame {

	static String nameofcurrentuser;
	static ArrayList<Users> userList = new ArrayList<Users>();	
	boolean isValid;
	private JFrame mainFrame;
	private JLabel headerLabel;
	public JLabel statusLabel;
	private JPanel firstPanel;
	private JPanel secondPanel;
	private JPanel pinPanel;
	JTextField pinText;

	public ATM(){
		prepareGUI();		
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Java SWING Examples");
		mainFrame.setSize(800, 800);
		mainFrame.setLayout(new GridLayout(3, 1));

		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(700, 200);
		mainFrame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent windowEvent) {

				System.exit(0);

			}});


		firstPanel = new JPanel();
		firstPanel.setLayout(new FlowLayout());
		secondPanel = new JPanel();
		secondPanel.setLayout(new FlowLayout());
		pinPanel = new JPanel();
		pinPanel.setLayout(new FlowLayout());		
		mainFrame.add(headerLabel);
		mainFrame.add(pinPanel);
		mainFrame.add(statusLabel);
	}


	private void showEvent(boolean first) {

		headerLabel.setText("Input a 4 digit pin");

		JButton withdrawButton = new JButton("Withdraw");
		JButton balanceButton = new JButton("Display Balance");
		JButton ExitButton = new JButton("Exit");

		JButton enterPin = new JButton("PIN");
		if (first){			
			enterPin.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					for(Users u : userList)
					{
						try{
							isValid = u.CheckPin(Integer.parseInt(pinText.getText()));
							
							if (pinText.getText().length() > 4 || pinText.getText().length() < 4){
								throw new MyExpt();
							}							
							if(isValid)
							{
								headerLabel.setText("Choose Service");
								mainFrame.remove(pinPanel);
								Address A = new Address();
								nameofcurrentuser = u.name;
								A.readFromFile(nameofcurrentuser);						
								mainFrame.add(firstPanel);
								statusLabel.setText("Current User: " + nameofcurrentuser);

								break;
							}
							else
							{
								statusLabel.setText("Enter correct pin");
							}
						}
						catch(NumberFormatException T){
							statusLabel.setText("Please enter only 4 numbers");
						}
						catch(MyExpt E){
							statusLabel.setText("Please enter ONLY 4 numbers");
						}
					}

				}
			}
					);
		}

		pinText = new JTextField(4);		

		JButton pTen = new JButton("�10");
		JButton pTwenty = new JButton("�20");
		JButton pThirty = new JButton("�30");
		JButton pFourty = new JButton("�40");
		JButton pFifty = new JButton("�50");
		JButton pSixty = new JButton("�60");
		JButton pSeventy = new JButton("�70");
		JButton pEighty = new JButton("�80");
		JButton pNinety = new JButton("�90");
		JButton pHundred = new JButton("�100");
		JButton p2Hundred = new JButton("�200");

		withdrawButton.setActionCommand("Withdraw");
		balanceButton.setActionCommand("Balance");
		ExitButton.setActionCommand("Exit");	
		pTen.setActionCommand("�10");
		pTwenty.setActionCommand("�20");
		pThirty.setActionCommand("�30");
		pFourty.setActionCommand("�40");
		pFifty.setActionCommand("�50");
		pSixty.setActionCommand("�60");
		pSeventy.setActionCommand("�70");
		pEighty.setActionCommand("�80");
		pNinety.setActionCommand("�90");
		pHundred.setActionCommand("�100");
		p2Hundred.setActionCommand("�200");
		pinText.setActionCommand("pin");
		enterPin.setActionCommand("Enter");

		pinText.addActionListener(new BCL());
		withdrawButton.addActionListener(new BCL());
		balanceButton.addActionListener(new BCL());
		ExitButton.addActionListener(new BCL());
		pTen.addActionListener(new BCL());
		pTwenty.addActionListener(new BCL());
		pThirty.addActionListener(new BCL());
		pFourty.addActionListener(new BCL());
		pFifty.addActionListener(new BCL());
		pSixty.addActionListener(new BCL());
		pSeventy.addActionListener(new BCL());
		pEighty.addActionListener(new BCL());
		pNinety.addActionListener(new BCL());
		pHundred.addActionListener(new BCL());
		p2Hundred.addActionListener(new BCL());		
		enterPin.addActionListener(new BCL());

		firstPanel.add(withdrawButton);
		firstPanel.add(balanceButton);
		firstPanel.add(ExitButton);
		pinPanel.add(pinText);
		pinPanel.add(enterPin);
		secondPanel.add(pTen);
		secondPanel.add(pTwenty);
		secondPanel.add(pThirty);
		secondPanel.add(pFourty);
		secondPanel.add(pFifty);
		secondPanel.add(pSixty);
		secondPanel.add(pSeventy);
		secondPanel.add(pEighty);
		secondPanel.add(pNinety);
		secondPanel.add(pHundred);
		secondPanel.add(p2Hundred);
		if (first){
			mainFrame.setVisible(true);
		}
	}
	
	
	public void cycle(){
		mainFrame.remove(secondPanel);
		mainFrame.invalidate();
		mainFrame.validate();
		mainFrame.add(firstPanel);
		mainFrame.repaint();
	}

	private class BCL implements ActionListener {
		@Override 
		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			Address A = new Address();

			ATM sD = new ATM();
			switch (command) {

			case "Withdraw":
				mainFrame.remove(pinPanel);
				mainFrame.remove(firstPanel);
				mainFrame.invalidate();
				mainFrame.validate();
				mainFrame.add(secondPanel);
				mainFrame.repaint();
				statusLabel.setText("Select Amount");		      				
				break;
			case "Balance":				
				float temp = Float.parseFloat(A.readFromFile(nameofcurrentuser));
				statusLabel.setText("�"+String.format( "%.2f", temp));
				break;
			case "Exit": 
				System.exit(0);
				break;
			case "�10":					
				if(10< Address.balance){
					A.withdraw(10f,nameofcurrentuser);
				}
				else {
					statusLabel.setText("Insufficient Funds!");
					
				}
				cycle();
				sD.showEvent(false);				
				break;
			case "�20":
				if(20 < Address.balance){
					A.withdraw(20f,nameofcurrentuser);
				}
				else {
					statusLabel.setText("Insufficient Funds!");
				}
				cycle();
				sD.showEvent(false);
				break;
			case "�30":
				if(30< Address.balance){
					A.withdraw(30f,nameofcurrentuser);
				}
				else {
					statusLabel.setText("Insufficient Funds!");
				}
				cycle();
				sD.showEvent(false);
				break;
			case "�40":
				if(40< Address.balance){
					A.withdraw(40f,nameofcurrentuser);
				}
				else {
					statusLabel.setText("Insufficient Funds!");
				}
				cycle();
				sD.showEvent(false);
				break;
			case "�50":
				if(50< Address.balance){
					A.withdraw(50f,nameofcurrentuser);
				}
				else {
					statusLabel.setText("Insufficient Funds!");
				}
				cycle();
				sD.showEvent(false);
				break;
			case "�60":
				if(60< Address.balance){
					A.withdraw(60f,nameofcurrentuser);
				}
				else {
					statusLabel.setText("Insufficient Funds!");
				}
				cycle();
				sD.showEvent(false);
				break;
			case "�70":
				if(70< Address.balance){
					A.withdraw(70f,nameofcurrentuser);
				}
				else {
					statusLabel.setText("Insufficient Funds!");
				}
				cycle();
				sD.showEvent(false);
				break;
			case "�80":
				if(80< Address.balance){
					A.withdraw(80f,nameofcurrentuser);
				}
				else {
					statusLabel.setText("Insufficient Funds!");
				}
				cycle();
				sD.showEvent(false);
				break;
			case "�90":
				if(90< Address.balance){
					A.withdraw(90f,nameofcurrentuser);
				}
				else {
					statusLabel.setText("Insufficient Funds!");
				}
				cycle();
				sD.showEvent(false);
				break;
			case "�100":				
				if(100< Address.balance){
					A.withdraw(100f,nameofcurrentuser);
				}
				else {
					statusLabel.setText("Insufficient Funds!");
				}
				cycle();
				mainFrame.add(firstPanel);
				sD.showEvent(false);
				break;
			case "�200":
				if(200< Address.balance){
					A.withdraw(200f,nameofcurrentuser);
				}
				else {
					statusLabel.setText("Insufficient Funds!");			
				}
				cycle();
				sD.showEvent(false);
				break;
			}		
		}
	}

	public static void main(String[] args){
		ATM sD = new ATM();
		Users Azim = new Users();
		Users David = new Users();
		Users James = new Users();
		Users Jess = new Users();
		Users Rachel = new Users();
		Users Sophie = new Users();

		Azim.process("Azim",1357);
		David.process("David",2345);
		James.process("James",2468);
		Jess.process("Jess",9876);
		Rachel.process("Rachel",9753);
		Sophie.process("Sophie",8642);

		userList.add(Azim);
		userList.add(David);
		userList.add(James);
		userList.add(Jess);
		userList.add(Rachel);
		userList.add(Sophie);
		
		try{
			sD.showEvent(true);
		}
		catch (Exception  e) {
			System.out.println("Other Error");
		}		
	}
}
