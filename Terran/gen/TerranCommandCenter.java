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


public class TerranCommandCenter extends ASTRAClass {
	public TerranCommandCenter() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"TerranCommandCenter", new int[] {22,9,22,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"TerranCommandCenter", new int[] {22,18,30,5},
				new Statement[] {
					new ModuleCall("eis",
						"TerranCommandCenter", new int[] {23,8,23,29},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("starcraft")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("TerranCommandCenter","eis")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("eis",
						"TerranCommandCenter", new int[] {24,8,24,18},
						new Predicate("link", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("TerranCommandCenter","eis")).link(
								);
							}
						}
					),
					new ModuleCall("C",
						"TerranCommandCenter", new int[] {25,8,25,43},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Command Center online.")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("TerranCommandCenter","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new While(
						"TerranCommandCenter", new int[] {27,8,30,5},
						Predicate.TRUE,
						new Block(
							"TerranCommandCenter", new int[] {27,20,29,9},
							new Statement[] {
								new Subgoal(
									"TerranCommandCenter", new int[] {28,12,29,9},
									new Goal(
										new Predicate("trainSCV", new Term[] {})
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"TerranCommandCenter", new int[] {32,9,32,94},
			new GoalEvent('+',
				new Goal(
					new Predicate("trainSCV", new Term[] {})
				)
			),
			new AND(
				new Predicate("minerals", new Term[] {
					new Variable(Type.INTEGER, "minerals",false)
				}),
				new AND(
					new Predicate("currentSupply", new Term[] {
						new Variable(Type.INTEGER, "CS",false)
					}),
					new Predicate("totalSupply", new Term[] {
						new Variable(Type.INTEGER, "TS",false)
					})
				)
			),
			new Block(
				"TerranCommandCenter", new int[] {32,93,39,5},
				new Statement[] {
					new If(
						"TerranCommandCenter", new int[] {33,8,39,5},
						new AND(
							new BracketFormula(
								new Comparison(">=",
									new Variable(Type.INTEGER, "minerals"),
									Primitive.newPrimitive(50)
								)
							),
							new BracketFormula(
								new Comparison("<=",
									new Variable(Type.INTEGER, "CS"),
									new Variable(Type.INTEGER, "TS")
								)
							)
						),
						new Block(
							"TerranCommandCenter", new int[] {33,41,38,9},
							new Statement[] {
								new ModuleCall("C",
									"TerranCommandCenter", new int[] {34,12,34,38},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("Deploying SCV")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("TerranCommandCenter","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new ModuleCall("eis",
									"TerranCommandCenter", new int[] {35,12,35,35},
									new Predicate("train", new Term[] {
										Primitive.newPrimitive("Terran SCV")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.EIS) intention.getModule("TerranCommandCenter","eis")).auto_action(intention,evaluate(intention,predicate));
										}
									}
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"TerranCommandCenter", new int[] {41,9,41,23},
			new GoalEvent('+',
				new Goal(
					new Predicate("trainSCV", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"TerranCommandCenter", new int[] {41,22,43,5},
				new Statement[] {
					new Subgoal(
						"TerranCommandCenter", new int[] {42,8,43,5},
						new Goal(
							new Predicate("trainSCV", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"TerranCommandCenter", new int[] {45,9,45,165},
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
						return ((astra.lang.EIS) agent.getModule("TerranCommandCenter","eis")).event(
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
					new Predicate("gas", new Term[] {
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
				"TerranCommandCenter", new int[] {45,164,54,5},
				new Statement[] {
					new BeliefUpdate('-',
						"TerranCommandCenter", new int[] {46,8,54,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "prevM")
						})
					),
					new BeliefUpdate('-',
						"TerranCommandCenter", new int[] {47,8,54,5},
						new Predicate("gas", new Term[] {
							new Variable(Type.INTEGER, "prevG")
						})
					),
					new BeliefUpdate('-',
						"TerranCommandCenter", new int[] {48,8,54,5},
						new Predicate("currentSupply", new Term[] {
							new Variable(Type.INTEGER, "prevCS")
						})
					),
					new BeliefUpdate('-',
						"TerranCommandCenter", new int[] {49,8,54,5},
						new Predicate("totalSupply", new Term[] {
							new Variable(Type.INTEGER, "prevTS")
						})
					),
					new BeliefUpdate('+',
						"TerranCommandCenter", new int[] {50,8,54,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "minerals")
						})
					),
					new BeliefUpdate('+',
						"TerranCommandCenter", new int[] {51,8,54,5},
						new Predicate("gas", new Term[] {
							new Variable(Type.INTEGER, "gas")
						})
					),
					new BeliefUpdate('+',
						"TerranCommandCenter", new int[] {52,8,54,5},
						new Predicate("currentSupply", new Term[] {
							new Variable(Type.INTEGER, "CS")
						})
					),
					new BeliefUpdate('+',
						"TerranCommandCenter", new int[] {53,8,54,5},
						new Predicate("totalSupply", new Term[] {
							new Variable(Type.INTEGER, "TS")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"TerranCommandCenter", new int[] {56,9,56,69},
			new ModuleEvent("eis",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("queueSize", new Term[] {
						new Variable(Type.INTEGER, "size",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("TerranCommandCenter","eis")).event(
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
				"TerranCommandCenter", new int[] {56,68,59,5},
				new Statement[] {
					new BeliefUpdate('-',
						"TerranCommandCenter", new int[] {57,8,59,5},
						new Predicate("queueSize", new Term[] {
							new Variable(Type.INTEGER, "prevSize")
						})
					),
					new BeliefUpdate('+',
						"TerranCommandCenter", new int[] {58,8,59,5},
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
				((astra.lang.EIS) agent.getModule("TerranCommandCenter","eis")).sense();
			}
		});

		agent.initialize(
			new Predicate("minerals", new Term[] {
				Primitive.newPrimitive(50)
			})
		);
		agent.initialize(
			new Predicate("gas", new Term[] {
				Primitive.newPrimitive(0)
			})
		);
		agent.initialize(
			new Predicate("currentSupply", new Term[] {
				Primitive.newPrimitive(4)
			})
		);
		agent.initialize(
			new Predicate("totalSupply", new Term[] {
				Primitive.newPrimitive(10)
			})
		);
		agent.initialize(
			new Predicate("queueSize", new Term[] {
				Primitive.newPrimitive(0)
			})
		);
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
		fragment.addModule("S",astra.lang.System.class,agent);
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
			astra.core.Agent agent = new TerranCommandCenter().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
