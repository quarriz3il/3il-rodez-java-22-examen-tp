package src;

public class Task {
	private int id;
	private String titre;
	private String description;
	private int priorite;
	
	/*
	 * Représente une tâche dans l'application
	 * @param id identifiant unique
	 * @param titre titre de la tâche
	 * @param description description de la tâche
	 * @param priorite priorite de la tâche
	 */
	public Task(int id, String titre, String description, int priorite)
	{
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.priorite = priorite;
	}
	
	// getteurs et setteurs des attributs de la classe
	public int getid()
	{
		return this.id;
	}
	
	public String gettitre()
	{
		return this.titre;
	}
	
	public String getdescription()
	{
		return this.description;
	}
	
	public int getpriorite()
	{
		return this.priorite;
	}
	
	
	
	
	public void setid(int id)
	{
		this.id = id;
	}
	
	public void settitre(String titre)
	{
		this.titre = titre;
	}
	
	public void setdescription(String description)
	{
		this.description = description;
	}
	
	public void setpriorite(int priorite)
	{
		this.priorite = priorite;
	}
}
