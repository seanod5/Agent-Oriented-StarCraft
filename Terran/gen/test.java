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


public class test extends ASTRAClass {
	public test() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"test", new int[] {14,9,14,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"test", new int[] {14,27,18,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "array"),
						"test", new int[] {15,8,18,5},
						new ListTerm(new Term[] {
							Primitive.newPrimitive(1)
						})
					),
					new ModuleCall("P",
						"test", new int[] {16,8,16,22},
						new Predicate("add", new Term[] {
							new Variable(Type.LIST, "array"),
							Primitive.newPrimitive(2)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((modules.Prelude2) intention.getModule("test","P")).add(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
									(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("C",
						"test", new int[] {17,8,17,24},
						new Predicate("println", new Term[] {
							new Variable(Type.LIST, "array")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("test","C")).println(
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
		agent.initialize(
			new Predicate("array", new Term[] {
				new ListTerm(new Term[] {
					Primitive.newPrimitive(1)
				})
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("strings",modules.Strings.class,agent);
		fragment.addModule("P",modules.Prelude2.class,agent);
		fragment.addModule("math",astra.lang.Math.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("S",astra.lang.System.class,agent);
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
			astra.core.Agent agent = new test().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
