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
			"terranBarracks", new int[] {19,9,19,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranBarracks", new int[] {19,18,26,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranBarracks", new int[] {20,8,20,29},
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
						"terranBarracks", new int[] {21,8,21,18},
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
						"terranBarracks", new int[] {22,8,22,36},
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
						"terranBarracks", new int[] {23,8,26,5},
						Predicate.TRUE,
						new Block(
							"terranBarracks", new int[] {23,20,25,9},
							new Statement[] {
								new Subgoal(
									"terranBarracks", new int[] {24,12,25,9},
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
			"terranBarracks", new int[] {28,9,28,99},
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
				"terranBarracks", new int[] {28,98,31,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranBarracks", new int[] {30,8,30,27},
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
			"terranBarracks", new int[] {33,9,33,61},
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
				"terranBarracks", new int[] {33,60,35,5},
				new Statement[] {
					new Subgoal(
						"terranBarracks", new int[] {34,8,35,5},
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
			"terranBarracks", new int[] {37,9,37,172},
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
				"terranBarracks", new int[] {37,171,46,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranBarracks", new int[] {38,8,46,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "prevM")
						})
					),
					new BeliefUpdate('-',
						"terranBarracks", new int[] {39,8,46,5},
						new Predicate("vespeneGas", new Term[] {
							new Variable(Type.INTEGER, "prevG")
						})
					),
					new BeliefUpdate('-',
						"terranBarracks", new int[] {40,8,46,5},
						new Predicate("currentSupply", new Term[] {
							new Variable(Type.INTEGER, "prevCS")
						})
					),
					new BeliefUpdate('-',
						"terranBarracks", new int[] {41,8,46,5},
						new Predicate("totalSupply", new Term[] {
							new Variable(Type.INTEGER, "prevTS")
						})
					),
					new BeliefUpdate('+',
						"terranBarracks", new int[] {42,8,46,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "minerals")
						})
					),
					new BeliefUpdate('+',
						"terranBarracks", new int[] {43,8,46,5},
						new Predicate("vespeneGas", new Term[] {
							new Variable(Type.INTEGER, "gas")
						})
					),
					new BeliefUpdate('+',
						"terranBarracks", new int[] {44,8,46,5},
						new Predicate("currentSupply", new Term[] {
							new Variable(Type.INTEGER, "CS")
						})
					),
					new BeliefUpdate('+',
						"terranBarracks", new int[] {45,8,46,5},
						new Predicate("totalSupply", new Term[] {
							new Variable(Type.INTEGER, "TS")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranBarracks", new int[] {48,9,48,69},
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
				"terranBarracks", new int[] {48,68,51,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranBarracks", new int[] {49,8,51,5},
						new Predicate("queueSize", new Term[] {
							new Variable(Type.INTEGER, "prevSize")
						})
					),
					new BeliefUpdate('+',
						"terranBarracks", new int[] {50,8,51,5},
						new Predicate("queueSize", new Term[] {
							new Variable(Type.INTEGER, "size")
						})
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
