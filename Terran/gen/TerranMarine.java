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


public class terranMarine extends ASTRAClass {
	public terranMarine() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"terranMarine", new int[] {16,9,16,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranMarine", new int[] {16,18,20,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranMarine", new int[] {17,8,17,29},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("starcraft")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranMarine","eis")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("eis",
						"terranMarine", new int[] {18,8,18,18},
						new Predicate("link", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranMarine","eis")).link(
								);
							}
						}
					),
					new ModuleCall("C",
						"terranMarine", new int[] {19,8,19,35},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Marine online.")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("terranMarine","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"terranMarine", new int[] {22,9,22,38},
			new GoalEvent('+',
				new Goal(
					new Predicate("attackUnit", new Term[] {
						new Variable(Type.STRING, "target",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranMarine", new int[] {22,37,24,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranMarine", new int[] {23,8,23,26},
						new Predicate("attack", new Term[] {
							new Variable(Type.STRING, "target")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranMarine","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"terranMarine", new int[] {26,9,26,41},
			new GoalEvent('+',
				new Goal(
					new Predicate("attackPosition", new Term[] {
						new Variable(Type.INTEGER, "x",false),
						new Variable(Type.INTEGER, "y",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranMarine", new int[] {26,40,28,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranMarine", new int[] {27,8,27,24},
						new Predicate("attack", new Term[] {
							new Variable(Type.INTEGER, "x"),
							new Variable(Type.INTEGER, "y")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranMarine","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"terranMarine", new int[] {30,9,30,159},
			new ModuleEvent("eis",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("status", new Term[] {
						new Variable(Type.INTEGER, "health",false),
						new Variable(Type.INTEGER, "shield",false),
						new Variable(Type.INTEGER, "energy",false),
						new Variable(Type.LIST, "conditions",false),
						new Variable(Type.INTEGER, "x",false),
						new Variable(Type.INTEGER, "y",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("terranMarine","eis")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new AND(
				new Predicate("conditions", new Term[] {
					new Variable(Type.LIST, "prevConds",false)
				}),
				new Predicate("location", new Term[] {
					new Variable(Type.INTEGER, "prevX",false),
					new Variable(Type.INTEGER, "prevY",false)
				})
			),
			new Block(
				"terranMarine", new int[] {30,158,35,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranMarine", new int[] {31,8,35,5},
						new Predicate("conditions", new Term[] {
							new Variable(Type.LIST, "prevConds")
						})
					),
					new BeliefUpdate('+',
						"terranMarine", new int[] {32,8,35,5},
						new Predicate("conditions", new Term[] {
							new Variable(Type.LIST, "conditions")
						})
					),
					new BeliefUpdate('-',
						"terranMarine", new int[] {33,8,35,5},
						new Predicate("location", new Term[] {
							new Variable(Type.INTEGER, "prevX"),
							new Variable(Type.INTEGER, "prevY")
						})
					),
					new BeliefUpdate('+',
						"terranMarine", new int[] {34,8,35,5},
						new Predicate("location", new Term[] {
							new Variable(Type.INTEGER, "x"),
							new Variable(Type.INTEGER, "y")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranMarine", new int[] {37,9,37,111},
			new ModuleEvent("eis",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("unit", new Term[] {
						new Variable(Type.BOOLEAN, "friendly",false),
						new Variable(Type.STRING, "type",false),
						new Variable(Type.STRING, "ID",false),
						new Variable(Type.INTEGER, "health",false),
						new Variable(Type.INTEGER, "shield",false),
						new Variable(Type.LIST, "conditions",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("terranMarine","eis")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"terranMarine", new int[] {37,110,41,5},
				new Statement[] {
					new If(
						"terranMarine", new int[] {38,8,41,5},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "friendly"),
							Primitive.newPrimitive(false)
						),
						new Block(
							"terranMarine", new int[] {38,30,40,9},
							new Statement[] {
								new Subgoal(
									"terranMarine", new int[] {39,12,40,9},
									new Goal(
										new Predicate("attackUnit", new Term[] {
											new Variable(Type.STRING, "ID")
										})
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"terranMarine", new int[] {43,9,43,65},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("explore", new Term[] {
					new Variable(Type.INTEGER, "x",false),
					new Variable(Type.INTEGER, "y",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"terranMarine", new int[] {43,64,45,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranMarine", new int[] {44,8,44,24},
						new Predicate("attack", new Term[] {
							new Variable(Type.INTEGER, "x"),
							new Variable(Type.INTEGER, "y")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranMarine","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("terranMarine","eis")).sense();
			}
		});

		agent.initialize(
			new Goal(
				new Predicate("init", new Term[] {})
			)
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("eis",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
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
			astra.core.Agent agent = new terranMarine().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
