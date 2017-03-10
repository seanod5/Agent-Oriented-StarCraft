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
			"test", new int[] {18,9,18,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"test", new int[] {18,27,26,5},
				new Statement[] {
					new ModuleCall("C",
						"test", new int[] {19,8,19,29},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Start...")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("test","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.BOOLEAN, "check"),
						"test", new int[] {20,8,26,5},
						new QueryTerm(
							new Predicate("hey", new Term[] {
								Primitive.newPrimitive(2)
							})
						)
					),
					new ModuleCall("C",
						"test", new int[] {21,8,21,24},
						new Predicate("println", new Term[] {
							new Variable(Type.BOOLEAN, "check")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("test","C")).println(
									(java.lang.Boolean) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new If(
						"test", new int[] {22,8,26,5},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "check"),
							Primitive.newPrimitive(true)
						),
						new Block(
							"test", new int[] {22,26,24,9},
							new Statement[] {
								new ModuleCall("C",
									"test", new int[] {23,12,23,28},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("hey")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("test","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						)
					),
					new ModuleCall("S",
						"test", new int[] {25,8,25,16},
						new Predicate("exit", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("test","S")).exit(
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
			new Predicate("hey", new Term[] {
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("ho", new Term[] {
				Primitive.newPrimitive(false)
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("SD",modules.SupplyDepot.class,agent);
		fragment.addModule("strings",modules.Strings.class,agent);
		fragment.addModule("lists",modules.Lists.class,agent);
		fragment.addModule("math",astra.lang.Math.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("P",astra.lang.Prelude.class,agent);
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
