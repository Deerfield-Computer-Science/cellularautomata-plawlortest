import java.util.ArrayList;

public class Grass extends Plant {
	
	public Grass(Location l, World w) {
		super(l,w);
		myLifeSpan = 3;
	}
	
	public void reproduce() {
		// this is silly code really, but as an example
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		System.out.println("hopefully this will work");
		System.out.println("hello");
		
		myWorld.getCreatureList().add(new Grass(new Location(newX,newY), myWorld));
	}

}
