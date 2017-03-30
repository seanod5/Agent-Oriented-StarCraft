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


public class terranBarracks extends ASTRAClass {
	public terranBarracks() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"terranBarracks", new int[] {26,9,26,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranBarracks", new int[] {26,18,33,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranBarracks", new int[] {27,8,27,29},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("starcraft")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranBarracks","eis")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("eis",
						"terranBarracks", new int[] {28,8,28,18},
						new Predicate("link", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranBarracks","eis")).link(
								);
							}
						}
					),
					new ModuleCall("C",
						"terranBarracks", new int[] {29,8,29,36},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Barracks online")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("terranBarracks","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new While(
						"terranBarracks", new int[] {30,8,33,5},
						Predicate.TRUE,
						new Block(
							"terranBarracks", new int[] {30,20,32,9},
							new Statement[] {
								new Subgoal(
									"terranBarracks", new int[] {31,12,32,9},
									new Goal(
										new Predicate("trainUnit", new Term[] {
											Primitive.newPrimitive("Terran Marine"),
											Primitive.newPrimitive(50),
											Primitive.newPrimitive(0)
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
			"terranBarracks", new int[] {35,9,35,99},
			new GoalEvent('+',
				new Goal(
					new Predicate("trainUnit", new Term[] {
						new Variable(Type.STRING, "unitType",false),
						new Variable(Type.INTEGER, "mCost",false),
						new Variable(Type.INTEGER, "gCost",false)
					})
				)
			),
			new AND(
				new BracketFormula(
					new Predicate("queueSize", new Term[] {
						new Variable(Type.INTEGER, "queue",false)
					})
				),
				new BracketFormula(
					new Comparison("<",
						new Variable(Type.INTEGER, "queue"),
						Primitive.newPrimitive(5)
					)
				)
			),
			new Block(
				"terranBarracks", new int[] {35,98,38,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranBarracks", new int[] {37,8,37,27},
						new Predicate("train", new Term[] {
							new Variable(Type.STRING, "unitType")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranBarracks","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"terranBarracks", new int[] {40,9,40,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("trainUnit", new Term[] {
						new Variable(Type.STRING, "unitType",false),
						new Variable(Type.INTEGER, "mCost",false),
						new Variable(Type.INTEGER, "gCost",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranBarracks", new int[] {40,60,42,5},
				new Statement[] {
					new Subgoal(
						"terranBarracks", new int[] {41,8,42,5},
						new Goal(
							new Predicate("trainUnit", new Term[] {
								new Variable(Type.STRING, "unitType"),
								new Variable(Type.INTEGER, "mCost"),
								new Variable(Type.INTEGER, "gCost")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"terranBarracks", new int[] {44,9,44,172},
			new ModuleEvent("eis",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("resources", new Term[] {
						new Variable(Type.INTEGER, "minerals",false),
						new Variable(Type.INTEGER, "gas",false),
						new Variable(Type.INTEGER, "CS",false),
						new Variable(Type.INTEGER, "TS",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("terranBarracks","eis")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new AND(
				new Predicate("minerals", new Term[] {
					new Variable(Type.INTEGER, "prevM",false)
				}),
				new AND(
					new Predicate("vespeneGas", new Term[] {
						new Variable(Type.INTEGER, "prevG",false)
					}),
					new AND(
						new Predicate("currentSupply", new Term[] {
							new Variable(Type.INTEGER, "prevCS",false)
						}),
						new Predicate("totalSupply", new Term[] {
							new Variable(Type.INTEGER, "prevTS",false)
						})
					)
				)
			),
			new Block(
				"terranBarracks", new int[] {44,171,53,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranBarracks", new int[] {45,8,53,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "prevM")
						})
					),
					new BeliefUpdate('-',
						"terranBarracks", new int[] {46,8,53,5},
						new Predicate("vespeneGas", new Term[] {
							new Variable(Type.INTEGER, "prevG")
						})
					),
					new BeliefUpdate('-',
						"terranBarracks", new int[] {47,8,53,5},
						new Predicate("currentSupply", new Term[] {
							new Variable(Type.INTEGER, "prevCS")
						})
					),
					new BeliefUpdate('-',
						"terranBarracks", new int[] {48,8,53,5},
						new Predicate("totalSupply", new Term[] {
							new Variable(Type.INTEGER, "prevTS")
						})
					),
					new BeliefUpdate('+',
						"terranBarracks", new int[] {49,8,53,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "minerals")
						})
					),
					new BeliefUpdate('+',
						"terranBarracks", new int[] {50,8,53,5},
						new Predicate("vespeneGas", new Term[] {
							new Variable(Type.INTEGER, "gas")
						})
					),
					new BeliefUpdate('+',
						"terranBarracks", new int[] {51,8,53,5},
						new Predicate("currentSupply", new Term[] {
							new Variable(Type.INTEGER, "CS")
						})
					),
					new BeliefUpdate('+',
						"terranBarracks", new int[] {52,8,53,5},
						new Predicate("totalSupply", new Term[] {
							new Variable(Type.INTEGER, "TS")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranBarracks", new int[] {55,9,55,69},
			new ModuleEvent("eis",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("queueSize", new Term[] {
						new Variable(Type.INTEGER, "size",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("terranBarracks","eis")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new Predicate("queueSize", new Term[] {
				new Variable(Type.INTEGER, "prevSize",false)
			}),
			new Block(
				"terranBarracks", new int[] {55,68,58,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranBarracks", new int[] {56,8,58,5},
						new Predicate("queueSize", new Term[] {
							new Variable(Type.INTEGER, "prevSize")
						})
					),
					new BeliefUpdate('+',
						"terranBarracks", new int[] {57,8,58,5},
						new Predicate("queueSize", new Term[] {
							new Variable(Type.INTEGER, "size")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranBarracks", new int[] {60,9,60,159},
			new ModuleEvent("eis",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("unit", new Term[] {
						new Variable(Type.STRING, "isFriendly",false),
						new Variable(Type.STRING, "type",false),
						new Variable(Type.INTEGER, "ID",false),
						new Variable(Type.INTEGER, "health",false),
						new Variable(Type.INTEGER, "shield",false),
						new Variable(Type.LIST, "condition",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("terranBarracks","eis")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new AND(
				new BracketFormula(
					new Comparison("==",
						new Variable(Type.STRING, "isFriendly"),
						Primitive.newPrimitive("false")
					)
				),
				new BracketFormula(
					new Predicate("attackOrdered", new Term[] {
						Primitive.newPrimitive(false)
					})
				)
			),
			new Block(
				"terranBarracks", new int[] {60,158,65,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranBarracks", new int[] {61,8,65,5},
						new Predicate("attackOrdered", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new BeliefUpdate('+',
						"terranBarracks", new int[] {62,8,65,5},
						new Predicate("attackOrdered", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new Send("terranBarracks", new int[] {63,8,63,51},
						new Performative("inform"),
						Primitive.newPrimitive("Combat Manager"),
						new Predicate("content", new Term[] {
							new Variable(Type.INTEGER, "ID")
						})
					),
					new ModuleCall("C",
						"terranBarracks", new int[] {64,8,64,38},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Attack Order sent")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("terranBarracks","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"terranBarracks", new int[] {67,9,67,110},
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
						return ((astra.lang.EIS) agent.getModule("terranBarracks","eis")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new Comparison("==",
				new Variable(Type.INTEGER, "health"),
				Primitive.newPrimitive(0)
			),
			new Block(
				"terranBarracks", new int[] {67,109,69,5},
				new Statement[] {
					new ModuleCall("S",
						"terranBarracks", new int[] {68,8,68,21},
						new Predicate("terminate", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("terranBarracks","S")).terminate(
								);
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
				((astra.lang.EIS) agent.getModule("terranBarracks","eis")).sense();
			}
		});

		agent.initialize(
			new Goal(
				new Predicate("init", new Term[] {})
			)
		);
		agent.initialize(
			new Predicate("queueSize", new Term[] {
				Primitive.newPrimitive(0)
			})
		);
		agent.initialize(
			new Predicate("attackOrdered", new Term[] {
				Primitive.newPrimitive(false)
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("eis",astra.lang.EIS.class,agent);
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
			astra.core.Agent agent = new terranBarracks().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
