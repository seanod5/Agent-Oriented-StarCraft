package modules;

import astra.core.Module;

// The purpose of this class is to allow me to extend the Strings module

public class Strings extends Module {
	
	@TERM
	public boolean contains(String total, String substring) {
		if(total.contains(substring)) {
			return true;
		}
		else {
			return false;
		}
	}
}
