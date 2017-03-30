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


public class terranCommandCenter extends ASTRAClass {
	public terranCommandCenter() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"terranCommandCenter", new int[] {39,9,39,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranCommandCenter", new int[] {39,18,48,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranCommandCenter", new int[] {40,8,40,29},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("starcraft")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranCommandCenter","eis")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("eis",
						"terranCommandCenter", new int[] {41,8,41,18},
						new Predicate("link", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranCommandCenter","eis")).link(
								);
							}
						}
					),
					new ModuleCall("C",
						"terranCommandCenter", new int[] {42,8,42,43},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Command Center online.")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("terranCommandCenter","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"terranCommandCenter", new int[] {43,8,48,5},
						Primitive.newPrimitive(0)
					),
					new While(
						"terranCommandCenter", new int[] {44,8,48,5},
						new Comparison("<",
							new Variable(Type.INTEGER, "i"),
							Primitive.newPrimitive(6)
						),
						new Block(
							"terranCommandCenter", new int[] {44,20,47,9},
							new Statement[] {
								new Subgoal(
									"terranCommandCenter", new int[] {45,12,47,9},
									new Goal(
										new Predicate("trainSCV", new Term[] {})
									)
								),
								new PlusPlus(
									new Variable(Type.INTEGER, "i"),
									"terranCommandCenter", new int[] {46,12,46,15}
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"terranCommandCenter", new int[] {50,9,50,168},
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
					new AND(
						new Predicate("totalSupply", new Term[] {
							new Variable(Type.INTEGER, "TS",false)
						}),
						new AND(
							new BracketFormula(
								new Comparison(">=",
									new Variable(Type.INTEGER, "minerals"),
									Primitive.newPrimitive(50)
								)
							),
							new AND(
								new BracketFormula(
									new Comparison("<",
										new Variable(Type.INTEGER, "CS"),
										new Variable(Type.INTEGER, "TS")
									)
								),
								new AND(
									new Predicate("queueSize", new Term[] {
										new Variable(Type.INTEGER, "queueSize",false)
									}),
									new BracketFormula(
										new Comparison("<",
											new Variable(Type.INTEGER, "queueSize"),
											Primitive.newPrimitive(5)
										)
									)
								)
							)
						)
					)
				)
			),
			new Block(
				"terranCommandCenter", new int[] {50,167,52,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranCommandCenter", new int[] {51,8,51,31},
						new Predicate("train", new Term[] {
							Primitive.newPrimitive("Terran SCV")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranCommandCenter","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"terranCommandCenter", new int[] {54,9,54,23},
			new GoalEvent('+',
				new Goal(
					new Predicate("trainSCV", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranCommandCenter", new int[] {54,22,56,5},
				new Statement[] {
					new Subgoal(
						"terranCommandCenter", new int[] {55,8,56,5},
						new Goal(
							new Predicate("trainSCV", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"terranCommandCenter", new int[] {58,9,58,69},
			new ModuleEvent("eis",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("queueSize", new Term[] {
						new Variable(Type.INTEGER, "size",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("terranCommandCenter","eis")).event(
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
				"terranCommandCenter", new int[] {58,68,61,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranCommandCenter", new int[] {59,8,61,5},
						new Predicate("queueSize", new Term[] {
							new Variable(Type.INTEGER, "prevSize")
						})
					),
					new BeliefUpdate('+',
						"terranCommandCenter", new int[] {60,8,61,5},
						new Predicate("queueSize", new Term[] {
							new Variable(Type.INTEGER, "size")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranCommandCenter", new int[] {63,9,63,118},
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
						return ((astra.lang.EIS) agent.getModule("terranCommandCenter","eis")).event(
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
				new Predicate("vespeneGas", new Term[] {
					new Variable(Type.INTEGER, "prevG",false)
				})
			),
			new Block(
				"terranCommandCenter", new int[] {63,117,68,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranCommandCenter", new int[] {64,8,68,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "prevM")
						})
					),
					new BeliefUpdate('-',
						"terranCommandCenter", new int[] {65,8,68,5},
						new Predicate("vespeneGas", new Term[] {
							new Variable(Type.INTEGER, "prevG")
						})
					),
					new BeliefUpdate('+',
						"terranCommandCenter", new int[] {66,8,68,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "minerals")
						})
					),
					new BeliefUpdate('+',
						"terranCommandCenter", new int[] {67,8,68,5},
						new Predicate("vespeneGas", new Term[] {
							new Variable(Type.INTEGER, "gas")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranCommandCenter", new int[] {70,9,70,110},
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
						return ((astra.lang.EIS) agent.getModule("terranCommandCenter","eis")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new AND(
				new BracketFormula(
					new Comparison("==",
						new Variable(Type.INTEGER, "CS"),
						new Variable(Type.INTEGER, "TS")
					)
				),
				new BracketFormula(
					new Predicate("supplyRequest", new Term[] {
						Primitive.newPrimitive(false)
					})
				)
			),
			new Block(
				"terranCommandCenter", new int[] {70,109,74,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranCommandCenter", new int[] {71,8,74,5},
						new Predicate("supplyRequest", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new BeliefUpdate('+',
						"terranCommandCenter", new int[] {72,8,74,5},
						new Predicate("supplyRequest", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new Send("terranCommandCenter", new int[] {73,8,73,63},
						new Performative("inform"),
						Primitive.newPrimitive("Building Manager"),
						new Predicate("content", new Term[] {
							Primitive.newPrimitive("Build Base")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranCommandCenter", new int[] {76,9,76,110},
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
						return ((astra.lang.EIS) agent.getModule("terranCommandCenter","eis")).event(
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
				"terranCommandCenter", new int[] {76,109,78,5},
				new Statement[] {
					new ModuleCall("S",
						"terranCommandCenter", new int[] {77,8,77,21},
						new Predicate("terminate", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("terranCommandCenter","S")).terminate(
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"terranCommandCenter", new int[] {80,9,80,94},
			new ModuleEvent("eis",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("base", new Term[] {
						new Variable(Type.INTEGER, "x",false),
						new Variable(Type.INTEGER, "y",false),
						new Variable(Type.STRING, "isStart",false),
						new Variable(Type.INTEGER, "regionID",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("terranCommandCenter","eis")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new BracketFormula(
				new Comparison("~=",
					new Variable(Type.STRING, "isStart"),
					Primitive.newPrimitive("true")
				)
			),
			new Block(
				"terranCommandCenter", new int[] {80,93,82,5},
				new Statement[] {
					new ModuleCall("explore",
						"terranCommandCenter", new int[] {81,8,81,29},
						new Predicate("addBase", new Term[] {
							new Variable(Type.INTEGER, "x"),
							new Variable(Type.INTEGER, "y")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((modules.Exploration) intention.getModule("terranCommandCenter","explore")).addBase(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0)),
									(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
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
				((astra.lang.EIS) agent.getModule("terranCommandCenter","eis")).sense();
			}
		});

		agent.initialize(
			new Goal(
				new Predicate("init", new Term[] {})
			)
		);
		agent.initialize(
			new Predicate("minerals", new Term[] {
				Primitive.newPrimitive(50)
			})
		);
		agent.initialize(
			new Predicate("vespeneGas", new Term[] {
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
			new Predicate("supplyRequest", new Term[] {
				Primitive.newPrimitive(false)
			})
		);
		agent.initialize(
			new Predicate("waiting", new Term[] {
				Primitive.newPrimitive(true)
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("eis",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("S",astra.lang.System.class,agent);
		fragment.addModule("P",astra.lang.Prelude.class,agent);
		fragment.addModule("explore",modules.Exploration.class,agent);
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
			astra.core.Agent agent = new terranCommandCenter().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
