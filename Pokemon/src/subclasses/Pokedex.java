package subclasses;

import abstracts.AbstractPokemon;

public class Pokedex extends AbstractPokemon {
	
	static int myPokemons;
	
	
	public void listPokemon(){
		myPokemons=pokemones.size();
		System.out.println("\nMostrando "+myPokemons+" pokemones de tu pokedex:");
		for(String pokemon : pokemones) {
			System.out.println("Nombre: "+pokemon);
		}
	}
		
}
