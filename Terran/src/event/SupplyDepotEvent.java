package event;

import astra.event.Event;
import astra.term.Term;

public class SupplyDepotEvent implements Event {
	private Term term;
	
	public SupplyDepotEvent(Term term) {
		this.term = term;
	}

	public Term term() {
		return term;
	}
	
	@Override
	public Object getSource() {
		return null;
	}

	@Override
	public String signature() {
		return "$sd";
	}

}
