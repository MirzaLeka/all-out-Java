
public class Timer_tryCatch {

	public static void main(String[] args) {
		
		int x = 5000;

	System.out.println("Proslo je 5 sekundi "+Timer(x));
	// ako ka�em System.out.println(Timer(x)); re�i �e mi x nije varijabla i ja mogu napraviti varijablu int x = 5000; i on onda kad pise Timer(x) on �e executati timer za vrijednost x (5 sekundi)
	// 
	
	
	Timer(4000);
	System.out.println(slusalice(44, "Vilsonovo"));

	
	//metla mora biti tipa String da bih mogao izjednaciti je sa slusalicama koje isto vracaju tip String
	//metli dodijelim vrijednost slusalica i onda mu kazem isprintaj metla
	
	//to sam mogao uraditi lakse ako sam samo napisao System.out.println(slusalice(44)); bez da pravim ikakvu novu varijablu i istoj dodijeljujem vrijednost, te je printam poslije.
	// zna�i ne moram praviti varijable koje se isto zovu kao parametar i onda ubacivati vrijednost (ili tekst) nego odmah napisem vrijednost
	
	System.out.println(createWeatherChange(13, "Sarajevo"));
	// e vidi� po�to unutar argumenta se nalaze int i String, ja mogu napisati 13 i "Sarajevo" i on �e to povezati sa argumentima createWeatherChange metode
	// a kad bi zamjeniti redoslijed imali bismo gre�ku
	
	System.out.println(mojaFlasa());
	
	}
	
	public static String slusalice(int four, String setaliste) {
		
	//	four = 47;
		return setaliste;
	
	//vidi� metoda slusalice nije ni po �emu povezana sa varijablom four, osim �to ona �ivi u scopu te metode.
	//zna�i ja kad budem pozivao metodu mogu napisati slusalice(44) i to nece imati nikakvog znacaja jer varijabla four ne prolazi kroz nikakav proces, kao sto je x prolazio kroz thread.sleep()
	//medjutim ja mogu vratiti four varijablu (ispisati je) ili ako je four dio nekog Stringa, ispisati String (tekst) + four + sta god mi padne na pamet (posto pise gore public static String tj jer vracam String)
		// ali ako vracam int ja mogu napisati return four ili neki izraz  return 151+four;
		//znaci ono sto vracam mora biti tipa onog u naslovu, bilo da se radilo o parametru ili nekoj varijabli ili izrazu/tekstu
		
	}
	
	public static String Timer(int x) {
		
		try {
			Thread.sleep(x);
		}catch (Exception e) {} 
		
		return "Tick-Tack";
	}
	
	public static String createWeatherChange (int temperature, String city) {
		return "I live in " + city + " and today's temperature is " + temperature + " \"CELSIUS\"degrees.";
	}
	
	public static String mojaFlasa () {
		int cep = 4;
		// a mogu i ovo uraditi jer vraca String, iako cep nije ni u parametru niti bilo gdje izvan ove metode
		// pa ja isto tako mogu napisati int povrsina = parametar*parametar i onda napisati return povrsina i on vrati vrijednost povorsine a ne varijablu, bas kao i ovo ovdje
		return "Flasa je do pola puna" + cep;
	}
	
}
