
public class MainClass {
	
	public static void main(String[] args)
	{
		PlantIMPL impl = new PlantIMPL();
		Fruit meyve = new Fruit();
		GreenApple yesilelma = new GreenApple();
		
		Tomatoes Domates = new Tomatoes();
		GoldenApple Sar�Elma = new GoldenApple();
		
		RedApple.Peel();
		
		System.out.println(impl.isColored()+"\n"); 
		
		System.out.println(meyve.getName());
	
		System.out.println(yesilelma.getTaste());
		System.out.println(yesilelma.getName()+"\n");
	

		System.out.println(Domates.getSeedCount()+"\n" );
	
		System.out.println(Sar�Elma.getName());
		System.out.println(Sar�Elma.getTaste());
	
		
		
	
		
		
	}

}
