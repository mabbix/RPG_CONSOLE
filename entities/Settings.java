package entities;


public class Settings {
	
	
	public String ServerName = "RPG Console";
	public Double ServerVersion = 0.1;
	public Integer ExpRate = 1;
	public Boolean DoubleExpRate = true;
	
	
	public Boolean getDoubleExpRate() {
		return DoubleExpRate;
	}
		

	public void settings() {
		String True;
		String False;
		True = "ATIVADO";
		False = "DESATIVADO";
		if (DoubleExpRate == true) {
			System.out.println(True);
		}else {
			System.out.println(False);
			
		}
	}
	
	

	
	
	
	
	
	
	
	

}
