package src;

import java.awt.BorderLayout;
import javax.swing.*;


public class View extends JFrame
{
	private JFrame fenetre = this;
	private JButton buttonAjouter;
	private JLabel labelID;
	private JLabel labelTitre;
	private JLabel labelDescription;
	private JLabel labelpriorite;
	
	/*
	 * Constructeur de la vue qui va ccomprend tous les éléments graphiques de mon application
	 * Contient un bouton buttonAjouter
	 * Contient un libellé pour que l'utilisateur entre la tâche
	 */
	public View()
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
			{
				public void run()
				{
					fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
					labelID = new JLabel("Entrez l'id de la tâche");
					JTextField textFieldID = new JTextField(20);
					
					labelTitre = new JLabel("Entrez le Titre de la tâche");
					JTextField textFieldTITRE = new JTextField(20);
					
					labelDescription = new JLabel("Entrez la description de la tâche");
					JTextField textFieldDESCRIPTION = new JTextField(20);
					
					labelpriorite = new JLabel("Entrez la priorite de la tâche");
					JTextField textFieldPRIORITE = new JTextField(20);
					
					buttonAjouter = new JButton("Ajouter");
					
					labelID.setBounds(20,80,200,10);
					labelTitre.setBounds(20,130,200,10);
					labelDescription.setBounds(20,180,200,10);
					labelpriorite.setBounds(20,230,200,10);
					
					textFieldID.setBounds(20,100,200,20);
					textFieldTITRE.setBounds(20,150,200,20);
					textFieldDESCRIPTION.setBounds(20,200,200,20);
					textFieldPRIORITE.setBounds(20,250,200,20);
					//buttonAjouter(20,120,200,20);
					
					fenetre.add(labelID, BorderLayout.NORTH);
					fenetre.add(labelTitre, BorderLayout.NORTH);
					fenetre.add(labelDescription, BorderLayout.NORTH);
					fenetre.add(labelpriorite, BorderLayout.NORTH);
					
					fenetre.add(textFieldID, BorderLayout.NORTH);
					fenetre.add(textFieldTITRE, BorderLayout.NORTH);
					fenetre.add(textFieldDESCRIPTION, BorderLayout.NORTH);
					fenetre.add(textFieldPRIORITE, BorderLayout.NORTH);
					fenetre.add(buttonAjouter, BorderLayout.NORTH);
					
					fenetre.pack();
					fenetre.setVisible(true);
				}
			});
	}
}
