/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class Tests extends ASTRAClass {
	public Tests() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"Tests", new int[] {6,9,6,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Tests", new int[] {6,27,14,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "a"),
						"Tests", new int[] {7,8,14,5},
						new ListTerm(new Term[] {
							Primitive.newPrimitive(1),
							Primitive.newPrimitive(2)
						})
					),
					new Declaration(
						new Variable(Type.LIST, "b"),
						"Tests", new int[] {8,8,14,5},
						new ListTerm(new Term[] {
							Primitive.newPrimitive(3),
							Primitive.newPrimitive(4)
						})
					),
					new Declaration(
						new Variable(Type.LIST, "c"),
						"Tests", new int[] {9,8,14,5},
						new ListTerm(new Term[] {
							new Variable(Type.LIST, "a"),
							new Variable(Type.LIST, "b")
						})
					),
					new ModuleCall("C",
						"Tests", new int[] {10,8,10,20},
						new Predicate("println", new Term[] {
							new Variable(Type.LIST, "c")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Tests","C")).println(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.LIST, "d"),
						"Tests", new int[] {11,8,14,5},
						new ListTerm(new Term[] {
							Primitive.newPrimitive(5),
							Primitive.newPrimitive(6)
						})
					),
					new Assignment(
						new Variable(Type.LIST, "c"),
						"Tests", new int[] {12,8,14,5},
						Operator.newOperator('+',
							new Variable(Type.LIST, "c"),
							new ListTerm(new Term[] {
								new Variable(Type.LIST, "d")
							})
						)
					),
					new ModuleCall("C",
						"Tests", new int[] {13,8,13,20},
						new Predicate("println", new Term[] {
							new Variable(Type.LIST, "c")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Tests","C")).println(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("P",astra.lang.Prelude.class,agent);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new BasicSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new Tests().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
