package main;

import classes.Pokemon;

import subclasses.Pokedex;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokedex pokedex = new Pokedex();
		
		Pokemon p1 = pokedex.createPokemon("Pikachu",100,"Electrico");
		Pokemon p2 = pokedex.createPokemon("Charizard",120,"Fuego");
		Pokemon p3 = pokedex.createPokemon("Greninja",80,"Agua");
		Pokemon p4 = pokedex.createPokemon("Gengar", 110, "Fantasma");
		Pokemon p5 = pokedex.createPokemon("Dragonite", 150, "Dragon");
		
		p1.attackPokemon(p2);
		
		System.out.println(pokedex.pokemonInfo(p1));
		System.out.println(pokedex.pokemonInfo(p3));
		
		pokedex.listPokemon();

	}

}
