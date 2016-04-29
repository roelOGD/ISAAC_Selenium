package org.Shared;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class CredentialsOpvragen {

	    public static String[] marks;
	    public JTextField[] marksField;
	    public JLabel resultLabel;

	    public CredentialsOpvragen()
	    {
	        marks = new String[50];
	        marksField = new JTextField[5];
	        marksField[0] = new JTextField(20);
	        marksField[1] = new JPasswordField(20);
	        marksField[2] = new JTextField(20);
	        marksField[3] = new JPasswordField(20);
	        marksField[4] = new JTextField(20);
	    }

	    public String[]  displayGUI()
	    {
	        int selection = JOptionPane.showConfirmDialog(
	                null, getPanel(), "Input Form : "
	                                , JOptionPane.OK_CANCEL_OPTION
	                                , JOptionPane.PLAIN_MESSAGE);

	        if (selection == JOptionPane.OK_OPTION) 
	        {
	        	 for ( int i = 0; i < 5; i++)
	             {
	                 marks[i] = String.valueOf(marksField[i].getText());             
	             }
	        	 
	        	 return marks; //returning two values at once
	        
	        }
	        else if (selection == JOptionPane.CANCEL_OPTION)
	        {

	        }
	        else {
   
	        }
			return null;
			 
	    }

	    private JPanel getPanel()
	    {
	        JPanel basePanel = new JPanel();
	        //basePanel.setLayout(new BorderLayout(5, 5));
	        basePanel.setOpaque(true);
	        basePanel.setBackground(Color.BLUE.darker());

	        JPanel centerPanel = new JPanel();
	        centerPanel.setLayout(new GridLayout(3, 2, 5, 5));
	        centerPanel.setBorder(
	            BorderFactory.createEmptyBorder(5, 5, 5, 5));
	        centerPanel.setOpaque(true);
	        centerPanel.setBackground(Color.WHITE);

	        JLabel mLabel1 = new JLabel("Aanvrager Username: ");
	        JLabel mLabel2 = new JLabel("Aanvrager Password: ");
	        JLabel mLabel3 = new JLabel("Admin username: ");
	        JLabel mLabel4 = new JLabel("Admin Password: ");
	        JLabel mLabel5 = new JLabel("Aanvraag Titel: ");

	        centerPanel.add(mLabel1);
	        centerPanel.add(marksField[0]);
	        centerPanel.add(mLabel2);
	        centerPanel.add(marksField[1]);
	        centerPanel.add(mLabel3);
	        centerPanel.add(marksField[2]);
	        centerPanel.add(mLabel4);
	        centerPanel.add(marksField[3]);
	        centerPanel.add(mLabel5);
	        centerPanel.add(marksField[4]);

	        basePanel.add(centerPanel);

	        return basePanel;
	    }
}
