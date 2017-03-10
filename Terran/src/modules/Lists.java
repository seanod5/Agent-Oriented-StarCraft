package modules;

import java.util.Collections;
import java.util.Random;

import astra.core.Module;
import astra.term.ListTerm;
import astra.term.Primitive;

//Extends Prelude module
public class Lists extends Module {
	
	/// ACTIONS ///
	
	// REMOVE //
	@ACTION
	public boolean remove(ListTerm list, Object element) {
		list.remove(Primitive.newPrimitive(element));
		return true;
	}
	
	@ACTION
	public boolean remove(ListTerm list, String element) {
		list.remove(Primitive.newPrimitive(element));
		return true;
	}
	
	@ACTION
	public boolean remove(ListTerm list, char element) {
		list.remove(Primitive.newPrimitive(element));
		return true;
	}
	
	@ACTION
	public boolean remove(ListTerm list, int element) {
		list.remove(Primitive.newPrimitive(element));
		return true;
	}
	
	@ACTION
	public boolean remove(ListTerm list, long element) {
		list.remove(Primitive.newPrimitive(element));
		return true;
	}
	
	@ACTION
	public boolean remove(ListTerm list, float element) {
		list.remove(Primitive.newPrimitive(element));
		return true;
	}
	
	@ACTION
	public boolean remove(ListTerm list, double element) {
		list.remove(Primitive.newPrimitive(element));
		return true;
	}
	
	// SHUFFLE //
	@ACTION
	public boolean shuffle(ListTerm list) {
		Collections.shuffle(list);
		return true;
	}
	
	/// TERMS ///
	
	// getRandom //
	@SuppressWarnings("unchecked")
	@TERM
	public Object getRandomObject(ListTerm list) {
		int random = new Random().nextInt(list.size());
		return ((Primitive<Object>) list.get(random)).value();
	}
	
	@SuppressWarnings("unchecked")
	@TERM
	public String getRandomString(ListTerm list) {
		int random = new Random().nextInt(list.size());
		return ((Primitive<String>) list.get(random)).value();
	}
	
	@SuppressWarnings("unchecked")
	@TERM
	public char getRandomChar(ListTerm list) {
		int random = new Random().nextInt(list.size());
		return ((Primitive<Character>) list.get(random)).value();
	}
	
	@SuppressWarnings("unchecked")
	@TERM
	public int getRandomInt(ListTerm list) {
		int random = new Random().nextInt(list.size());
		return ((Primitive<Integer>) list.get(random)).value();
	}
	
	@SuppressWarnings("unchecked")
	@TERM
	public long getRandomLong(ListTerm list) {
		int random = new Random().nextInt(list.size());
		return ((Primitive<Long>) list.get(random)).value();
	}
	
	@SuppressWarnings("unchecked")
	@TERM
	public float getRandomFloat(ListTerm list) {
		int random = new Random().nextInt(list.size());
		return ((Primitive<Float>) list.get(random)).value();
	}
	
	@SuppressWarnings("unchecked")
	@TERM
	public double getRandomDouble(ListTerm list) {
		int random = new Random().nextInt(list.size());
		return ((Primitive<Double>) list.get(random)).value();
	}
}
