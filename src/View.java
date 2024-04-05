package src;

import java.awt.BorderLayout;
import javax.swing.*;


public class View extends JFrame
{
	private JFrame fenetre = this;
	private JButton buttonAjouter;
	private JLabel labelMot;
	
	public View()
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
			{
				public void run()
				{
					fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
					labelMot = new JLabel("Entrez un mot");
					JTextField textField = new JTextField(20);
					buttonAjouter = new JButton("Ajouter");
					
					labelMot.setBounds(20,80,200,10);
					textField.setBounds(20,100,200,20);
					//buttonAjouter(20,120,200,20);
					
					fenetre.add(labelMot, BorderLayout.NORTH);
					fenetre.add(textField, BorderLayout.NORTH);
					fenetre.add(buttonAjouter, BorderLayout.NORTH);
					
					fenetre.pack();
					fenetre.setVisible(true);
				}
			});
	}
}
