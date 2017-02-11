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
			"TerranCommandCenter", new int[] {25,9,25,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"TerranCommandCenter", new int[] {25,18,33,5},
				new Statement[] {
					new ModuleCall("eis",
						"TerranCommandCenter", new int[] {26,8,26,29},
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
						"TerranCommandCenter", new int[] {27,8,27,18},
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
						"TerranCommandCenter", new int[] {28,8,28,43},
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
						"TerranCommandCenter", new int[] {30,8,33,5},
						Predicate.TRUE,
						new Block(
							"TerranCommandCenter", new int[] {30,20,32,9},
							new Statement[] {
								new Subgoal(
									"TerranCommandCenter", new int[] {31,12,32,9},
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
			"TerranCommandCenter", new int[] {35,9,35,94},
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
				"TerranCommandCenter", new int[] {35,93,42,5},
				new Statement[] {
					new If(
						"TerranCommandCenter", new int[] {36,8,42,5},
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
							"TerranCommandCenter", new int[] {36,41,41,9},
							new Statement[] {
								new ModuleCall("eis",
									"TerranCommandCenter", new int[] {38,12,38,35},
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
			"TerranCommandCenter", new int[] {44,9,44,23},
			new GoalEvent('+',
				new Goal(
					new Predicate("trainSCV", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"TerranCommandCenter", new int[] {44,22,46,5},
				new Statement[] {
					new Subgoal(
						"TerranCommandCenter", new int[] {45,8,46,5},
						new Goal(
							new Predicate("trainSCV", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"TerranCommandCenter", new int[] {48,9,48,31},
			new GoalEvent('+',
				new Goal(
					new Predicate("buildSupplyDepot", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"TerranCommandCenter", new int[] {48,30,62,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "allEntities"),
						"TerranCommandCenter", new int[] {49,8,62,5},
						new ModuleTerm("eis", Type.LIST,
							new Predicate("allEntities", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.EIS) intention.getModule("TerranCommandCenter","eis")).allEntities(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("TerranCommandCenter","eis")).allEntities(
									);
								}
							}
						)
					),
					new Declaration(
						new Variable(Type.BOOLEAN, "flag"),
						"TerranCommandCenter", new int[] {50,8,62,5},
						Primitive.newPrimitive(false)
					),
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"TerranCommandCenter", new int[] {51,8,62,5},
						Primitive.newPrimitive(0)
					),
					new Declaration(
						new Variable(Type.STRING, "ID"),
						"TerranCommandCenter", new int[] {52,8,62,5}
					),
					new While(
						"TerranCommandCenter", new int[] {53,8,62,5},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "flag"),
							Primitive.newPrimitive(false)
						),
						new Block(
							"TerranCommandCenter", new int[] {53,29,59,9},
							new Statement[] {
								new Assignment(
									new Variable(Type.STRING, "ID"),
									"TerranCommandCenter", new int[] {54,12,59,9},
									new ModuleTerm("P", Type.STRING,
										new Predicate("valueAsString", new Term[] {
											new Variable(Type.LIST, "allEntities"),
											new Variable(Type.INTEGER, "i")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Prelude) intention.getModule("TerranCommandCenter","P")).valueAsString(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
													(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Prelude) visitor.agent().getModule("TerranCommandCenter","P")).valueAsString(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
													(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
												);
											}
										}
									)
								),
								new If(
									"TerranCommandCenter", new int[] {55,12,59,9},
									new Comparison("==",
										new ModuleTerm("eis", Type.STRING,
											new Predicate("getEntityType", new Term[] {
												new Variable(Type.STRING, "ID")
											}),
											new ModuleTermAdaptor() {
												public Object invoke(Intention intention, Predicate predicate) {
													return ((astra.lang.EIS) intention.getModule("TerranCommandCenter","eis")).getEntityType(
														(java.lang.String) intention.evaluate(predicate.getTerm(0))
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((astra.lang.EIS) visitor.agent().getModule("TerranCommandCenter","eis")).getEntityType(
														(java.lang.String) visitor.evaluate(predicate.getTerm(0))
													);
												}
											}
										),
										Primitive.newPrimitive("terranSCV")
									),
									new Block(
										"TerranCommandCenter", new int[] {55,53,57,13},
										new Statement[] {
											new Assignment(
												new Variable(Type.BOOLEAN, "flag"),
												"TerranCommandCenter", new int[] {56,16,57,13},
												Primitive.newPrimitive(true)
											)
										}
									)
								),
								new PlusPlus(
									new Variable(Type.INTEGER, "i"),
									"TerranCommandCenter", new int[] {58,12,58,15}
								)
							}
						)
					),
					new Send("TerranCommandCenter", new int[] {60,8,60,56},
						new Performative("inform"),
						new Variable(Type.STRING, "ID"),
						new Predicate("content", new Term[] {
							Primitive.newPrimitive("Terran Supply Depot")
						})
					),
					new ModuleCall("C",
						"TerranCommandCenter", new int[] {61,8,61,34},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Message sent.")
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
					)
				}
			)
		));
		addRule(new Rule(
			"TerranCommandCenter", new int[] {64,9,64,202},
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
						new AND(
							new Predicate("totalSupply", new Term[] {
								new Variable(Type.INTEGER, "prevTS",false)
							}),
							new Predicate("constructing", new Term[] {
								new Variable(Type.BOOLEAN, "constructing",false)
							})
						)
					)
				)
			),
			new Block(
				"TerranCommandCenter", new int[] {64,201,79,5},
				new Statement[] {
					new BeliefUpdate('-',
						"TerranCommandCenter", new int[] {65,8,79,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "prevM")
						})
					),
					new BeliefUpdate('-',
						"TerranCommandCenter", new int[] {66,8,79,5},
						new Predicate("gas", new Term[] {
							new Variable(Type.INTEGER, "prevG")
						})
					),
					new BeliefUpdate('-',
						"TerranCommandCenter", new int[] {67,8,79,5},
						new Predicate("currentSupply", new Term[] {
							new Variable(Type.INTEGER, "prevCS")
						})
					),
					new BeliefUpdate('-',
						"TerranCommandCenter", new int[] {68,8,79,5},
						new Predicate("totalSupply", new Term[] {
							new Variable(Type.INTEGER, "prevTS")
						})
					),
					new BeliefUpdate('+',
						"TerranCommandCenter", new int[] {69,8,79,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "minerals")
						})
					),
					new BeliefUpdate('+',
						"TerranCommandCenter", new int[] {70,8,79,5},
						new Predicate("gas", new Term[] {
							new Variable(Type.INTEGER, "gas")
						})
					),
					new BeliefUpdate('+',
						"TerranCommandCenter", new int[] {71,8,79,5},
						new Predicate("currentSupply", new Term[] {
							new Variable(Type.INTEGER, "CS")
						})
					),
					new BeliefUpdate('+',
						"TerranCommandCenter", new int[] {72,8,79,5},
						new Predicate("totalSupply", new Term[] {
							new Variable(Type.INTEGER, "TS")
						})
					),
					new If(
						"TerranCommandCenter", new int[] {74,8,79,5},
						new AND(
							new BracketFormula(
								new Comparison("==",
									new Variable(Type.INTEGER, "CS"),
									new Brackets(
										new Variable(Type.INTEGER, "TS")
									)
								)
							),
							new BracketFormula(
								new Comparison("==",
									new Variable(Type.BOOLEAN, "constructing"),
									Primitive.newPrimitive(false)
								)
							)
						),
						new Block(
							"TerranCommandCenter", new int[] {74,51,78,9},
							new Statement[] {
								new BeliefUpdate('-',
									"TerranCommandCenter", new int[] {75,12,78,9},
									new Predicate("constructing", new Term[] {
										Primitive.newPrimitive(false)
									})
								),
								new BeliefUpdate('+',
									"TerranCommandCenter", new int[] {76,12,78,9},
									new Predicate("constructing", new Term[] {
										Primitive.newPrimitive(true)
									})
								),
								new Subgoal(
									"TerranCommandCenter", new int[] {77,12,78,9},
									new Goal(
										new Predicate("buildSupplyDepot", new Term[] {})
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"TerranCommandCenter", new int[] {81,9,81,69},
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
				"TerranCommandCenter", new int[] {81,68,84,5},
				new Statement[] {
					new BeliefUpdate('-',
						"TerranCommandCenter", new int[] {82,8,84,5},
						new Predicate("queueSize", new Term[] {
							new Variable(Type.INTEGER, "prevSize")
						})
					),
					new BeliefUpdate('+',
						"TerranCommandCenter", new int[] {83,8,84,5},
						new Predicate("queueSize", new Term[] {
							new Variable(Type.INTEGER, "size")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"TerranCommandCenter", new int[] {86,9,86,67},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("content", new Term[] {
					new Variable(Type.STRING, "content",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"TerranCommandCenter", new int[] {86,66,92,5},
				new Statement[] {
					new ModuleCall("C",
						"TerranCommandCenter", new int[] {87,8,87,69},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Message received from "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "sender"),
									Operator.newOperator('+',
										Primitive.newPrimitive(": "),
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
								return ((astra.lang.Console) intention.getModule("TerranCommandCenter","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new If(
						"TerranCommandCenter", new int[] {88,8,92,5},
						new Comparison("==",
							new Variable(Type.STRING, "content"),
							Primitive.newPrimitive("Supply Depot Built")
						),
						new Block(
							"TerranCommandCenter", new int[] {88,44,91,9},
							new Statement[] {
								new BeliefUpdate('-',
									"TerranCommandCenter", new int[] {89,12,91,9},
									new Predicate("constructing", new Term[] {
										Primitive.newPrimitive(true)
									})
								),
								new BeliefUpdate('+',
									"TerranCommandCenter", new int[] {90,12,91,9},
									new Predicate("constructing", new Term[] {
										Primitive.newPrimitive(false)
									})
								)
							}
						)
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
			new Predicate("constructing", new Term[] {
				Primitive.newPrimitive(false)
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
