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
			"terranCommandCenter", new int[] {38,9,38,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranCommandCenter", new int[] {38,18,47,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranCommandCenter", new int[] {39,8,39,29},
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
						"terranCommandCenter", new int[] {40,8,40,18},
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
						"terranCommandCenter", new int[] {41,8,41,43},
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
						"terranCommandCenter", new int[] {42,8,47,5},
						Primitive.newPrimitive(0)
					),
					new While(
						"terranCommandCenter", new int[] {43,8,47,5},
						new Comparison("<",
							new Variable(Type.INTEGER, "i"),
							Primitive.newPrimitive(6)
						),
						new Block(
							"terranCommandCenter", new int[] {43,20,46,9},
							new Statement[] {
								new Subgoal(
									"terranCommandCenter", new int[] {44,12,46,9},
									new Goal(
										new Predicate("trainSCV", new Term[] {})
									)
								),
								new PlusPlus(
									new Variable(Type.INTEGER, "i"),
									"terranCommandCenter", new int[] {45,12,45,15}
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"terranCommandCenter", new int[] {49,9,49,168},
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
				"terranCommandCenter", new int[] {49,167,51,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranCommandCenter", new int[] {50,8,50,31},
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
			"terranCommandCenter", new int[] {53,9,53,23},
			new GoalEvent('+',
				new Goal(
					new Predicate("trainSCV", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranCommandCenter", new int[] {53,22,55,5},
				new Statement[] {
					new Subgoal(
						"terranCommandCenter", new int[] {54,8,55,5},
						new Goal(
							new Predicate("trainSCV", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"terranCommandCenter", new int[] {57,9,57,69},
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
				"terranCommandCenter", new int[] {57,68,60,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranCommandCenter", new int[] {58,8,60,5},
						new Predicate("queueSize", new Term[] {
							new Variable(Type.INTEGER, "prevSize")
						})
					),
					new BeliefUpdate('+',
						"terranCommandCenter", new int[] {59,8,60,5},
						new Predicate("queueSize", new Term[] {
							new Variable(Type.INTEGER, "size")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranCommandCenter", new int[] {62,9,62,118},
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
				"terranCommandCenter", new int[] {62,117,67,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranCommandCenter", new int[] {63,8,67,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "prevM")
						})
					),
					new BeliefUpdate('-',
						"terranCommandCenter", new int[] {64,8,67,5},
						new Predicate("vespeneGas", new Term[] {
							new Variable(Type.INTEGER, "prevG")
						})
					),
					new BeliefUpdate('+',
						"terranCommandCenter", new int[] {65,8,67,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "minerals")
						})
					),
					new BeliefUpdate('+',
						"terranCommandCenter", new int[] {66,8,67,5},
						new Predicate("vespeneGas", new Term[] {
							new Variable(Type.INTEGER, "gas")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranCommandCenter", new int[] {69,9,69,110},
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
				"terranCommandCenter", new int[] {69,109,73,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranCommandCenter", new int[] {70,8,73,5},
						new Predicate("supplyRequest", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new BeliefUpdate('+',
						"terranCommandCenter", new int[] {71,8,73,5},
						new Predicate("supplyRequest", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new Send("terranCommandCenter", new int[] {72,8,72,63},
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
			"terranCommandCenter", new int[] {75,9,75,110},
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
				"terranCommandCenter", new int[] {75,109,77,5},
				new Statement[] {
					new ModuleCall("S",
						"terranCommandCenter", new int[] {76,8,76,21},
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
			"terranCommandCenter", new int[] {79,9,79,74},
			new MessageEvent(
				new Performative("inform"),
				Primitive.newPrimitive("Exploration Manager"),
				new Predicate("content", new Term[] {
					Primitive.newPrimitive("Send Coords")
				})
			),
			Predicate.TRUE,
			new Block(
				"terranCommandCenter", new int[] {79,73,82,5},
				new Statement[] {
					new Query(
						"terranCommandCenter", new int[] {80,8,80,68},
						new ModuleFormula("eis",
							new Predicate("base", new Term[] {
								new Variable(Type.INTEGER, "x",false),
								new Variable(Type.INTEGER, "y",false),
								new Variable(Type.BOOLEAN, "isStart",false),
								new Variable(Type.INTEGER, "regionID",false)
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("terranCommandCenter","eis")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new Send("terranCommandCenter", new int[] {81,8,81,58},
						new Performative("inform"),
						Primitive.newPrimitive("Exploration Manager"),
						new Predicate("explore", new Term[] {
							new Variable(Type.INTEGER, "x"),
							new Variable(Type.INTEGER, "y")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranCommandCenter", new int[] {85,9,85,50},
			new ModuleEvent("eis",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("map", new Term[] {
						new Variable(Type.INTEGER, "width",false),
						new Variable(Type.INTEGER, "height",false)
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
			Predicate.TRUE,
			new Block(
				"terranCommandCenter", new int[] {85,49,87,5},
				new Statement[] {
					new ModuleCall("C",
						"terranCommandCenter", new int[] {86,8,86,40},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								new Variable(Type.INTEGER, "width"),
								Operator.newOperator('+',
									Primitive.newPrimitive(", "),
									new Variable(Type.INTEGER, "height")
								)
							)
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
					)
				}
			)
		));
		addRule(new Rule(
			"terranCommandCenter", new int[] {89,9,89,73},
			new ModuleEvent("eis",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("base", new Term[] {
						new Variable(Type.INTEGER, "x",false),
						new Variable(Type.INTEGER, "y",false),
						new Variable(Type.BOOLEAN, "isStart",false),
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
			Predicate.TRUE,
			new Block(
				"terranCommandCenter", new int[] {89,72,91,5},
				new Statement[] {
					new ModuleCall("C",
						"terranCommandCenter", new int[] {90,8,90,27},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("bases!")
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
