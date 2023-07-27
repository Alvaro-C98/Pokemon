package interfaces;

import classes.Pokemon;

public interface PokemonInterface {
	
	Pokemon createPokemon(String name, int health, String type);
	String pokemonInfo(Pokemon pokemon);
	void listPokemon();
}
