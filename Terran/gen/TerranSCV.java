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


public class TerranSCV extends ASTRAClass {
	public TerranSCV() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"TerranSCV", new int[] {16,9,16,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"TerranSCV", new int[] {16,18,22,5},
				new Statement[] {
					new ModuleCall("eis",
						"TerranSCV", new int[] {17,8,17,29},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("starcraft")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("TerranSCV","eis")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("eis",
						"TerranSCV", new int[] {18,8,18,18},
						new Predicate("link", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("TerranSCV","eis")).link(
								);
							}
						}
					),
					new ModuleCall("C",
						"TerranSCV", new int[] {19,8,19,32},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("SCV linked.")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("TerranSCV","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"TerranSCV", new int[] {21,8,22,5},
						new Goal(
							new Predicate("gatherMinerals", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"TerranSCV", new int[] {24,9,24,57},
			new GoalEvent('+',
				new Goal(
					new Predicate("gatherMinerals", new Term[] {})
				)
			),
			new Predicate("availableMinerals", new Term[] {
				new Variable(Type.LIST, "L",false)
			}),
			new Block(
				"TerranSCV", new int[] {24,56,27,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.INTEGER, "ID"),
						"TerranSCV", new int[] {25,8,27,5},
						new ModuleTerm("P", Type.INTEGER,
							new Predicate("valueAsInt", new Term[] {
								new Variable(Type.LIST, "L"),
								Primitive.newPrimitive(0)
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.Prelude) intention.getModule("TerranSCV","P")).valueAsInt(
										(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
										(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.Prelude) visitor.agent().getModule("TerranSCV","P")).valueAsInt(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
										(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
									);
								}
							}
						)
					),
					new ModuleCall("eis",
						"TerranSCV", new int[] {26,8,26,22},
						new Predicate("gather", new Term[] {
							new Variable(Type.INTEGER, "ID")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("TerranSCV","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"TerranSCV", new int[] {29,9,29,29},
			new GoalEvent('+',
				new Goal(
					new Predicate("gatherMinerals", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"TerranSCV", new int[] {29,28,31,5},
				new Statement[] {
					new Subgoal(
						"TerranSCV", new int[] {30,8,31,5},
						new Goal(
							new Predicate("gatherMinerals", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"TerranSCV", new int[] {33,9,33,55},
			new GoalEvent('+',
				new Goal(
					new Predicate("gatherVespene", new Term[] {})
				)
			),
			new Predicate("availableVespene", new Term[] {
				new Variable(Type.LIST, "L",false)
			}),
			new Block(
				"TerranSCV", new int[] {33,54,36,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.INTEGER, "ID"),
						"TerranSCV", new int[] {34,8,36,5},
						new ModuleTerm("P", Type.INTEGER,
							new Predicate("valueAsInt", new Term[] {
								new Variable(Type.LIST, "L"),
								Primitive.newPrimitive(0)
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.Prelude) intention.getModule("TerranSCV","P")).valueAsInt(
										(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
										(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.Prelude) visitor.agent().getModule("TerranSCV","P")).valueAsInt(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
										(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
									);
								}
							}
						)
					),
					new ModuleCall("eis",
						"TerranSCV", new int[] {35,8,35,22},
						new Predicate("gather", new Term[] {
							new Variable(Type.INTEGER, "ID")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("TerranSCV","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"TerranSCV", new int[] {38,9,38,59},
			new GoalEvent('+',
				new Goal(
					new Predicate("buildStructure", new Term[] {
						new Variable(Type.STRING, "structure",false),
						new Variable(Type.INTEGER, "x",false),
						new Variable(Type.INTEGER, "y",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"TerranSCV", new int[] {38,58,41,5},
				new Statement[] {
					new ModuleCall("eis",
						"TerranSCV", new int[] {40,8,40,34},
						new Predicate("build", new Term[] {
							new Variable(Type.STRING, "structure"),
							new Variable(Type.INTEGER, "x"),
							new Variable(Type.INTEGER, "y")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("TerranSCV","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"TerranSCV", new int[] {43,9,43,115},
			new ModuleEvent("eis",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("mineralField", new Term[] {
						new Variable(Type.INTEGER, "ID",false),
						new Variable(Type.INTEGER, "resources",false),
						new Variable(Type.INTEGER, "group",false),
						new Variable(Type.INTEGER, "x",false),
						new Variable(Type.INTEGER, "y",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("TerranSCV","eis")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new Predicate("availableMinerals", new Term[] {
				new Variable(Type.LIST, "prev",false)
			}),
			new Block(
				"TerranSCV", new int[] {43,114,48,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "new"),
						"TerranSCV", new int[] {44,8,48,5},
						new Variable(Type.LIST, "prev")
					),
					new ModuleCall("P",
						"TerranSCV", new int[] {45,8,45,22},
						new Predicate("add", new Term[] {
							new Variable(Type.LIST, "new"),
							new Variable(Type.INTEGER, "ID")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Prelude) intention.getModule("TerranSCV","P")).add(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
									(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"TerranSCV", new int[] {46,8,48,5},
						new Predicate("availableMinerals", new Term[] {
							new Variable(Type.LIST, "prev")
						})
					),
					new BeliefUpdate('+',
						"TerranSCV", new int[] {47,8,48,5},
						new Predicate("availableMinerals", new Term[] {
							new Variable(Type.LIST, "new")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"TerranSCV", new int[] {50,9,50,115},
			new ModuleEvent("eis",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("vespeneGeyser", new Term[] {
						new Variable(Type.INTEGER, "ID",false),
						new Variable(Type.INTEGER, "resources",false),
						new Variable(Type.INTEGER, "group",false),
						new Variable(Type.INTEGER, "x",false),
						new Variable(Type.INTEGER, "y",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("TerranSCV","eis")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new Predicate("availableVespene", new Term[] {
				new Variable(Type.LIST, "prev",false)
			}),
			new Block(
				"TerranSCV", new int[] {50,114,55,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "new"),
						"TerranSCV", new int[] {51,8,55,5},
						new Variable(Type.LIST, "prev")
					),
					new ModuleCall("P",
						"TerranSCV", new int[] {52,8,52,22},
						new Predicate("add", new Term[] {
							new Variable(Type.LIST, "new"),
							new Variable(Type.INTEGER, "ID")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Prelude) intention.getModule("TerranSCV","P")).add(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
									(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"TerranSCV", new int[] {53,8,55,5},
						new Predicate("availableVespene", new Term[] {
							new Variable(Type.LIST, "prev")
						})
					),
					new BeliefUpdate('+',
						"TerranSCV", new int[] {54,8,55,5},
						new Predicate("availableVespene", new Term[] {
							new Variable(Type.LIST, "new")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"TerranSCV", new int[] {57,9,57,81},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("content", new Term[] {
					new Variable(Type.STRING, "content",false),
					new Variable(Type.INTEGER, "x",false),
					new Variable(Type.INTEGER, "y",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"TerranSCV", new int[] {57,80,60,5},
				new Statement[] {
					new ModuleCall("C",
						"TerranSCV", new int[] {58,8,58,78},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Message received from "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "sender"),
									Operator.newOperator('+',
										Primitive.newPrimitive(", building "),
										new Variable(Type.STRING, "content")
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("TerranSCV","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"TerranSCV", new int[] {59,8,60,5},
						new Goal(
							new Predicate("buildStructure", new Term[] {
								new Variable(Type.STRING, "content"),
								new Variable(Type.INTEGER, "x"),
								new Variable(Type.INTEGER, "y")
							})
						)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("TerranSCV","eis")).sense();
			}
		});

		agent.initialize(
			new Goal(
				new Predicate("init", new Term[] {})
			)
		);
		agent.initialize(
			new Predicate("availableMinerals", new Term[] {
				new ListTerm(new Term[] {

				})
			})
		);
		agent.initialize(
			new Predicate("availableVespene", new Term[] {
				new ListTerm(new Term[] {

				})
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("eis",astra.lang.EIS.class,agent);
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
			astra.core.Agent agent = new TerranSCV().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
