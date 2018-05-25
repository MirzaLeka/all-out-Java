
public class superClass {
	
	public int speed;
	public int acceleration;
	public int handling;
	
	public void Hyundai () {
		
		speed = 78;
		acceleration = 74;
		handling = 65;
		
		System.out.println("Hyundai\nUbrzanje je " + acceleration + "%\n"
				+ "Brzina je " + speed + "%\n"
						+ "Upravljanje je " + handling + "%");
		
	}
	
	public void Nissan350Z () {
		
		speed = 91;
		acceleration = 80;
		handling = 50;
		

		System.out.println("Nissan350Z\nUbrzanje je " + acceleration + "%\n"
				+ "Brzina je " + speed + "%\n"
						+ "Upravljanje je " + handling + "%");
		
	}
	
	public void MazdaRX8 () {
		
		speed = 98;
		acceleration = 85;
		handling = 75;
		

		System.out.println("MazdaRX8\nUbrzanje je " + acceleration + "%\n"
				+ "Brzina je " + speed + "%\n"
						+ "Upravljanje je " + handling + "%");
		
	}

}
