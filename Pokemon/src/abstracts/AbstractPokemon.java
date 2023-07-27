package abstracts;

import java.util.ArrayList;

import classes.Pokemon;

import interfaces.PokemonInterface;

public abstract class AbstractPokemon implements PokemonInterface{
	
	protected ArrayList<String> pokemones = new ArrayList<String>();
	
	
	public Pokemon createPokemon(String name, int health, String type) {
		pokemones.add(name);
		return new Pokemon(name,type,health);
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		return "\nInformacion Pokemon: \nNombre:"+pokemon.getName()+" - Tipo: "+pokemon.getType()+" - Salud: "+pokemon.getHealth();
	}
}
