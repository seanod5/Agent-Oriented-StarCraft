package modules;

import astra.core.Module;

// Module containing methods regarding the linking of agents to entities in StarCraft

public class Entities extends Module {
	
	//Allows for adding of entities which do not provide actions and therefore do not require an agent class
	@TERM
	public boolean isAgent(String entity) {
		switch(entity) {
			case "terranSupplyDepot": 
				return false;
			case "terranRefinery":
				return false;
			default:
				return true;
		}
	}
	
	@TERM
	public boolean canAttack(String entity) {
		switch(entity) {
			case "terranMarine":
				return true;
			case "terran SCV":
				return true;
			default:
				return false;
		}
	}
 }
