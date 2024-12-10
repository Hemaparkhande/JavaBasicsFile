package Package2;

class Google_Properties
{
	private String username= "hemap@yahoo.com";

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}
}

public class Encapsulations {
//making data member of the class private and giving indirect access using getter and setter methods
	public static void main(String[] args) 
	{
		Google_Properties g1= new Google_Properties();
		g1.setUsername("hp@hotmail.com");
		System.out.println(g1.getUsername());
		
	}

}
