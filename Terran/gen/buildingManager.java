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


public class buildingManager extends ASTRAClass {
	public buildingManager() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"buildingManager", new int[] {23,9,23,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"buildingManager", new int[] {23,18,26,5},
				new Statement[] {
					new ModuleCall("eis",
						"buildingManager", new int[] {24,8,24,29},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("starcraft")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("buildingManager","eis")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("C",
						"buildingManager", new int[] {25,8,25,44},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Building Manager Online")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("buildingManager","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"buildingManager", new int[] {28,9,28,51},
			new GoalEvent('+',
				new Goal(
					new Predicate("buildBase", new Term[] {})
				)
			),
			new Predicate("isStart", new Term[] {
				new Variable(Type.BOOLEAN, "isStart",false)
			}),
			new Block(
				"buildingManager", new int[] {28,50,50,5},
				new Statement[] {
					new If(
						"buildingManager", new int[] {29,8,50,5},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "isStart"),
							Primitive.newPrimitive(false)
						),
						new Block(
							"buildingManager", new int[] {29,29,33,9},
							new Statement[] {
								new Subgoal(
									"buildingManager", new int[] {30,12,33,9},
									new Goal(
										new Predicate("build", new Term[] {
											Primitive.newPrimitive("Terran Command Center")
										})
									)
								),
								new ModuleCall("C",
									"buildingManager", new int[] {31,12,31,35},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("waiting...")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("buildingManager","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Wait(
									"buildingManager", new int[] {32,12,33,9},
									new Predicate("buildPending", new Term[] {
										Primitive.newPrimitive(false)
									})
								)
							}
						)
					),
					new Subgoal(
						"buildingManager", new int[] {35,8,50,5},
						new Goal(
							new Predicate("build", new Term[] {
								Primitive.newPrimitive("Terran Supply Depot")
							})
						)
					),
					new ModuleCall("C",
						"buildingManager", new int[] {36,8,36,31},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("waiting...")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("buildingManager","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Wait(
						"buildingManager", new int[] {37,8,50,5},
						new Predicate("buildPending", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new Subgoal(
						"buildingManager", new int[] {38,8,50,5},
						new Goal(
							new Predicate("build", new Term[] {
								Primitive.newPrimitive("Terran Refinery")
							})
						)
					),
					new ModuleCall("C",
						"buildingManager", new int[] {39,8,39,31},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("waiting...")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("buildingManager","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Wait(
						"buildingManager", new int[] {40,8,50,5},
						new Predicate("buildPending", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new Subgoal(
						"buildingManager", new int[] {41,8,50,5},
						new Goal(
							new Predicate("build", new Term[] {
								Primitive.newPrimitive("Terran Barracks")
							})
						)
					),
					new ModuleCall("C",
						"buildingManager", new int[] {42,8,42,31},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("waiting...")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("buildingManager","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Wait(
						"buildingManager", new int[] {43,8,50,5},
						new Predicate("buildPending", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new Subgoal(
						"buildingManager", new int[] {44,8,50,5},
						new Goal(
							new Predicate("build", new Term[] {
								Primitive.newPrimitive("Terran Supply Depot")
							})
						)
					),
					new If(
						"buildingManager", new int[] {46,8,50,5},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "isStart"),
							Primitive.newPrimitive(true)
						),
						new Block(
							"buildingManager", new int[] {46,28,49,9},
							new Statement[] {
								new BeliefUpdate('-',
									"buildingManager", new int[] {47,12,49,9},
									new Predicate("isStart", new Term[] {
										Primitive.newPrimitive(true)
									})
								),
								new BeliefUpdate('+',
									"buildingManager", new int[] {48,12,49,9},
									new Predicate("isStart", new Term[] {
										Primitive.newPrimitive(false)
									})
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"buildingManager", new int[] {52,9,52,70},
			new GoalEvent('+',
				new Goal(
					new Predicate("build", new Term[] {
						new Variable(Type.STRING, "structure",false)
					})
				)
			),
			new Predicate("busyBuilders", new Term[] {
				new Variable(Type.LIST, "busyBuilders",false)
			}),
			new Block(
				"buildingManager", new int[] {52,69,68,5},
				new Statement[] {
					new BeliefUpdate('-',
						"buildingManager", new int[] {53,8,68,5},
						new Predicate("buildPending", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new BeliefUpdate('+',
						"buildingManager", new int[] {54,8,68,5},
						new Predicate("buildPending", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new Declaration(
						new Variable(Type.LIST, "SCVs"),
						"buildingManager", new int[] {56,8,68,5},
						new ModuleTerm("S", Type.LIST,
							new Predicate("getAgentsOfType", new Term[] {
								Primitive.newPrimitive("terranSCV")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.System) intention.getModule("buildingManager","S")).getAgentsOfType(
										(java.lang.String) intention.evaluate(predicate.getTerm(0))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.System) visitor.agent().getModule("buildingManager","S")).getAgentsOfType(
										(java.lang.String) visitor.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new Declaration(
						new Variable(Type.STRING, "SCV"),
						"buildingManager", new int[] {57,8,68,5},
						new ModuleTerm("P", Type.STRING,
							new Predicate("getRandomString", new Term[] {
								new Variable(Type.LIST, "SCVs")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((modules.Prelude2) intention.getModule("buildingManager","P")).getRandomString(
										(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((modules.Prelude2) visitor.agent().getModule("buildingManager","P")).getRandomString(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new While(
						"buildingManager", new int[] {58,8,68,5},
						new ModuleFormula("P",
							new Predicate("contains", new Term[] {
								new Variable(Type.LIST, "busyBuilders"),
								new Variable(Type.STRING, "SCV")
							}),
						new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((modules.Prelude2) visitor.agent().getModule("buildingManager","P")).contains(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
										(java.lang.String) visitor.evaluate(predicate.getTerm(1))
									);
							}
						}
							),
						new Block(
							"buildingManager", new int[] {58,45,60,9},
							new Statement[] {
								new Assignment(
									new Variable(Type.STRING, "SCV"),
									"buildingManager", new int[] {59,12,60,9},
									new ModuleTerm("P", Type.STRING,
										new Predicate("getRandomString", new Term[] {
											new Variable(Type.LIST, "SCVs")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((modules.Prelude2) intention.getModule("buildingManager","P")).getRandomString(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((modules.Prelude2) visitor.agent().getModule("buildingManager","P")).getRandomString(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
												);
											}
										}
									)
								)
							}
						)
					),
					new Send("buildingManager", new int[] {62,8,62,45},
						new Performative("inform"),
						new Variable(Type.STRING, "SCV"),
						new Predicate("content", new Term[] {
							new Variable(Type.STRING, "structure")
						})
					),
					new ModuleCall("C",
						"buildingManager", new int[] {63,8,63,56},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								new Variable(Type.STRING, "structure"),
								Operator.newOperator('+',
									Primitive.newPrimitive(" request sent to "),
									new Variable(Type.STRING, "SCV")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("buildingManager","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"buildingManager", new int[] {65,8,68,5},
						new Predicate("busyBuilders", new Term[] {
							new Variable(Type.LIST, "busyBuilders")
						})
					),
					new ModuleCall("P",
						"buildingManager", new int[] {66,8,66,32},
						new Predicate("add", new Term[] {
							new Variable(Type.LIST, "busyBuilders"),
							new Variable(Type.STRING, "SCV")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((modules.Prelude2) intention.getModule("buildingManager","P")).add(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"buildingManager", new int[] {67,8,68,5},
						new Predicate("busyBuilders", new Term[] {
							new Variable(Type.LIST, "busyBuilders")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"buildingManager", new int[] {70,9,70,101},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("content", new Term[] {
					new Variable(Type.STRING, "content",false)
				})
			),
			new Predicate("busyBuilders", new Term[] {
				new Variable(Type.LIST, "busyBuilders",false)
			}),
			new Block(
				"buildingManager", new int[] {70,100,87,5},
				new Statement[] {
					new If(
						"buildingManager", new int[] {71,8,87,5},
						new Comparison("==",
							new Variable(Type.STRING, "content"),
							Primitive.newPrimitive("Building")
						),
						new Block(
							"buildingManager", new int[] {71,34,74,9},
							new Statement[] {
							}
						)
					),
					new If(
						"buildingManager", new int[] {76,8,87,5},
						new Comparison("==",
							new Variable(Type.STRING, "content"),
							Primitive.newPrimitive("Done")
						),
						new Block(
							"buildingManager", new int[] {76,31,82,9},
							new Statement[] {
								new BeliefUpdate('-',
									"buildingManager", new int[] {77,12,82,9},
									new Predicate("buildPending", new Term[] {
										Primitive.newPrimitive(true)
									})
								),
								new BeliefUpdate('+',
									"buildingManager", new int[] {78,12,82,9},
									new Predicate("buildPending", new Term[] {
										Primitive.newPrimitive(false)
									})
								),
								new BeliefUpdate('-',
									"buildingManager", new int[] {79,12,82,9},
									new Predicate("busyBuilders", new Term[] {
										new Variable(Type.LIST, "busyBuilders")
									})
								),
								new ModuleCall("P",
									"buildingManager", new int[] {80,12,80,42},
									new Predicate("remove", new Term[] {
										new Variable(Type.LIST, "busyBuilders"),
										new Variable(Type.STRING, "sender")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((modules.Prelude2) intention.getModule("buildingManager","P")).remove(
												(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
												(java.lang.String) intention.evaluate(predicate.getTerm(1))
											);
										}
									}
								),
								new BeliefUpdate('+',
									"buildingManager", new int[] {81,12,82,9},
									new Predicate("busyBuilders", new Term[] {
										new Variable(Type.LIST, "busyBuilders")
									})
								)
							}
						)
					),
					new If(
						"buildingManager", new int[] {84,8,87,5},
						new Comparison("==",
							new Variable(Type.STRING, "content"),
							Primitive.newPrimitive("Build Base")
						),
						new Block(
							"buildingManager", new int[] {84,36,86,9},
							new Statement[] {
								new Subgoal(
									"buildingManager", new int[] {85,12,86,9},
									new Goal(
										new Predicate("buildBase", new Term[] {})
									)
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
				((astra.lang.EIS) agent.getModule("buildingManager","eis")).sense();
			}
		});

		agent.initialize(
			new Predicate("buildPending", new Term[] {
				Primitive.newPrimitive(false)
			})
		);
		agent.initialize(
			new Predicate("busyBuilders", new Term[] {
				new ListTerm(new Term[] {

				})
			})
		);
		agent.initialize(
			new Predicate("isStart", new Term[] {
				Primitive.newPrimitive(true)
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
		fragment.addModule("P",modules.Prelude2.class,agent);
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
			astra.core.Agent agent = new buildingManager().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
