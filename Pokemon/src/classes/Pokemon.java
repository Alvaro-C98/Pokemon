package classes;

public class Pokemon {
	private String name, type;
	private int health;
	static int count=0;
	
	public Pokemon(String name, String type, int health) {
		this.name = name;
		this.type = type;
		this.health = health;
		count++;
	}
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void attackPokemon(Pokemon pokemon) {
		System.out.println("¡"+getName()+" ataco a "+pokemon.getName()+"!");
		pokemon.setHealth(pokemon.getHealth()-10);
		System.out.println("Salud de "+pokemon.getName()+" se redujo de "+(pokemon.getHealth()+10)+" a "+pokemon.getHealth());
	}
		
}
