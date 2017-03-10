package modules;

import astra.core.Module;
import astra.term.ListTerm;
import astra.term.Primitive;

// Module containing methods regarding the building of structures in Starcraft

public class Buildings extends Module {
	
	@TERM
	public ListTerm cost(String structure) {
		ListTerm cost = new ListTerm();
		switch(structure) {
			case "Terran Supply Depot": 
				cost.add(Primitive.newPrimitive(50));
				cost.add(Primitive.newPrimitive(0));
				break;
			case "Terran Barracks":
				cost.add(Primitive.newPrimitive(150));
				cost.add(Primitive.newPrimitive(0));
				break;
			case "Terran Academy":
				cost.add(Primitive.newPrimitive(150));
				cost.add(Primitive.newPrimitive(0));
				break;
			case "Terran Engineering Bay":
				cost.add(Primitive.newPrimitive(125));
				cost.add(Primitive.newPrimitive(0));
				break;
			case "Terran Command Center":
				cost.add(Primitive.newPrimitive(400));
				cost.add(Primitive.newPrimitive(0));
				break;
		}
		return cost;
	}
}
