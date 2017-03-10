package event;

import java.util.HashMap;
import java.util.Map;

import astra.core.Agent;
import astra.eis.EISEvent;
import astra.event.Event;
import astra.reasoner.EventUnifier;
import astra.reasoner.Unifier;
import astra.term.Term;

public class SupplyDepotEventUnifier implements EventUnifier {

	@Override
	public Map<Integer, Term> unify(Event source, Event target, Agent agent) {
		SupplyDepotEvent s = (SupplyDepotEvent) source;
		SupplyDepotEvent t = (SupplyDepotEvent) target;
		
		return Unifier.unify(new Term[] {s.term()}, new Term[] {t.term()}, new HashMap<Integer, Term>(), agent);
	}

}
