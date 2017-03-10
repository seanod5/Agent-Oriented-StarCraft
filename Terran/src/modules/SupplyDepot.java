package modules;

import astra.core.Module;
import astra.event.Event;
import astra.formula.Formula;
import astra.formula.Predicate;
import astra.reasoner.Unifier;
import astra.term.Primitive;
import astra.term.Term;
import event.SupplyDepotEvent;
import event.SupplyDepotEventUnifier;

public class SupplyDepot extends Module {
	static {
		Unifier.eventFactory.put(SupplyDepotEvent.class, new SupplyDepotEventUnifier());
	}
	
	private int supplyLevel;
	private int maxSupplyLevel = -1;
	
	
	@EVENT( symbols={}, types = {"string"}, signature="$sd" )
	public Event event(Term term) {
		return new SupplyDepotEvent(
				term
		);
	}

	@ACTION
	public boolean setMaxSupplyLevel(int level) {
		maxSupplyLevel = level;
		return true;
	}
	
	@ACTION
	public boolean setSupplyLevel(int level) {
		supplyLevel = level;
		if (supplyLevel == maxSupplyLevel && maxSupplyLevel > -1) {
			agent.addEvent(new SupplyDepotEvent(Primitive.newPrimitive("max_supply_reached")));
		}
		return true;
	}
	
	@ACTION
	public boolean incrementSupplyLevel() {
		supplyLevel += 1;
		if (supplyLevel == maxSupplyLevel && maxSupplyLevel > -1) {
			agent.addEvent(new SupplyDepotEvent(Primitive.newPrimitive("max_supply_reached")));
		}
		return true;
	}
	
	@TERM
	public int maxSupplyLevel() {
		return maxSupplyLevel;
	}
	
	@FORMULA
	public Formula supplyLevelMaxed() {
		return supplyLevel == maxSupplyLevel ? Predicate.TRUE:Predicate.FALSE;
	}
}
