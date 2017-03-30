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


public class explorationManager extends ASTRAClass {
	public explorationManager() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"explorationManager", new int[] {21,9,21,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"explorationManager", new int[] {21,18,24,5},
				new Statement[] {
					new ModuleCall("eis",
						"explorationManager", new int[] {22,8,22,29},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("starcraft")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("explorationManager","eis")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("C",
						"explorationManager", new int[] {23,8,23,47},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Exploration Manager Online")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("explorationManager","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"explorationManager", new int[] {26,9,26,64},
			new GoalEvent('+',
				new Goal(
					new Predicate("explore", new Term[] {
						new Variable(Type.INTEGER, "x",false),
						new Variable(Type.INTEGER, "y",false)
					})
				)
			),
			new Predicate("busyAgents", new Term[] {
				new Variable(Type.LIST, "busyAgents",false)
			}),
			new Block(
				"explorationManager", new int[] {26,63,59,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "party"),
						"explorationManager", new int[] {27,8,59,5},
						new ListTerm(new Term[] {

						})
					),
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"explorationManager", new int[] {28,8,59,5},
						Primitive.newPrimitive(0)
					),
					new Declaration(
						new Variable(Type.LIST, "SCVs"),
						"explorationManager", new int[] {29,8,59,5},
						new ModuleTerm("S", Type.LIST,
							new Predicate("getAgentsOfType", new Term[] {
								Primitive.newPrimitive("terranSCV")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.System) intention.getModule("explorationManager","S")).getAgentsOfType(
										(java.lang.String) intention.evaluate(predicate.getTerm(0))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.System) visitor.agent().getModule("explorationManager","S")).getAgentsOfType(
										(java.lang.String) visitor.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new Declaration(
						new Variable(Type.LIST, "marines"),
						"explorationManager", new int[] {30,8,59,5},
						new ModuleTerm("S", Type.LIST,
							new Predicate("getAgentsOfType", new Term[] {
								Primitive.newPrimitive("terranMarine")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.System) intention.getModule("explorationManager","S")).getAgentsOfType(
										(java.lang.String) intention.evaluate(predicate.getTerm(0))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.System) visitor.agent().getModule("explorationManager","S")).getAgentsOfType(
										(java.lang.String) visitor.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new While(
						"explorationManager", new int[] {32,8,59,5},
						new Comparison("<",
							new Variable(Type.INTEGER, "i"),
							Primitive.newPrimitive(1)
						),
						new Block(
							"explorationManager", new int[] {32,20,38,9},
							new Statement[] {
								new Declaration(
									new Variable(Type.STRING, "SCV"),
									"explorationManager", new int[] {33,12,38,9},
									new ModuleTerm("P", Type.STRING,
										new Predicate("getRandomString", new Term[] {
											new Variable(Type.LIST, "SCVs")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((modules.Prelude2) intention.getModule("explorationManager","P")).getRandomString(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((modules.Prelude2) visitor.agent().getModule("explorationManager","P")).getRandomString(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
												);
											}
										}
									)
								),
								new If(
									"explorationManager", new int[] {34,12,38,9},
									new NOT(
										new ModuleFormula("P",
											new Predicate("contains", new Term[] {
												new Variable(Type.LIST, "busyAgents"),
												new Variable(Type.STRING, "SCV")
											}),
										new ModuleFormulaAdaptor() {
												public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((modules.Prelude2) visitor.agent().getModule("explorationManager","P")).contains(
														(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
														(java.lang.String) visitor.evaluate(predicate.getTerm(1))
													);
											}
										}
											)
									),
									new Block(
										"explorationManager", new int[] {34,45,37,13},
										new Statement[] {
											new ModuleCall("P",
												"explorationManager", new int[] {35,16,35,33},
												new Predicate("add", new Term[] {
													new Variable(Type.LIST, "party"),
													new Variable(Type.STRING, "SCV")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((modules.Prelude2) intention.getModule("explorationManager","P")).add(
															(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
															(java.lang.String) intention.evaluate(predicate.getTerm(1))
														);
													}
												}
											),
											new PlusPlus(
												new Variable(Type.INTEGER, "i"),
												"explorationManager", new int[] {36,16,36,19}
											)
										}
									)
								)
							}
						)
					),
					new Assignment(
						new Variable(Type.INTEGER, "i"),
						"explorationManager", new int[] {39,8,59,5},
						Primitive.newPrimitive(0)
					),
					new While(
						"explorationManager", new int[] {40,8,59,5},
						new Comparison("<",
							new Variable(Type.INTEGER, "i"),
							Primitive.newPrimitive(5)
						),
						new Block(
							"explorationManager", new int[] {40,20,47,9},
							new Statement[] {
								new Declaration(
									new Variable(Type.STRING, "marine"),
									"explorationManager", new int[] {41,12,47,9},
									new ModuleTerm("P", Type.STRING,
										new Predicate("getRandomString", new Term[] {
											new Variable(Type.LIST, "marines")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((modules.Prelude2) intention.getModule("explorationManager","P")).getRandomString(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((modules.Prelude2) visitor.agent().getModule("explorationManager","P")).getRandomString(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
												);
											}
										}
									)
								),
								new If(
									"explorationManager", new int[] {42,12,47,9},
									new NOT(
										new ModuleFormula("P",
											new Predicate("contains", new Term[] {
												new Variable(Type.LIST, "busyAgents"),
												new Variable(Type.STRING, "marine")
											}),
										new ModuleFormulaAdaptor() {
												public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((modules.Prelude2) visitor.agent().getModule("explorationManager","P")).contains(
														(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
														(java.lang.String) visitor.evaluate(predicate.getTerm(1))
													);
											}
										}
											)
									),
									new Block(
										"explorationManager", new int[] {42,48,46,13},
										new Statement[] {
											new ModuleCall("P",
												"explorationManager", new int[] {43,16,43,36},
												new Predicate("add", new Term[] {
													new Variable(Type.LIST, "party"),
													new Variable(Type.STRING, "marine")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((modules.Prelude2) intention.getModule("explorationManager","P")).add(
															(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
															(java.lang.String) intention.evaluate(predicate.getTerm(1))
														);
													}
												}
											),
											new ModuleCall("P",
												"explorationManager", new int[] {44,16,44,41},
												new Predicate("remove", new Term[] {
													new Variable(Type.LIST, "marines"),
													new Variable(Type.STRING, "marine")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((modules.Prelude2) intention.getModule("explorationManager","P")).remove(
															(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
															(java.lang.String) intention.evaluate(predicate.getTerm(1))
														);
													}
												}
											),
											new PlusPlus(
												new Variable(Type.INTEGER, "i"),
												"explorationManager", new int[] {45,16,45,19}
											)
										}
									)
								)
							}
						)
					),
					new ModuleCall("C",
						"explorationManager", new int[] {49,8,49,43},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Search party: "),
								new Variable(Type.LIST, "party")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("explorationManager","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"explorationManager", new int[] {51,8,59,5},
						new Predicate("busyAgents", new Term[] {
							new Variable(Type.LIST, "busyAgents")
						})
					),
					new ForAll(
						"explorationManager", new int[] {52,8,52,33},
						new Variable(Type.STRING, "ID",false),
						new Variable(Type.LIST, "party"),
						new Block(
							"explorationManager", new int[] {52,34,59,5},
							new Statement[] {
								new Send("explorationManager", new int[] {53,12,53,43},
									new Performative("inform"),
									new Variable(Type.STRING, "ID"),
									new Predicate("explore", new Term[] {
										new Variable(Type.INTEGER, "x"),
										new Variable(Type.INTEGER, "y")
									})
								),
								new ModuleCall("P",
									"explorationManager", new int[] {54,12,54,33},
									new Predicate("add", new Term[] {
										new Variable(Type.LIST, "busyAgents"),
										new Variable(Type.STRING, "ID")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((modules.Prelude2) intention.getModule("explorationManager","P")).add(
												(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
												(java.lang.String) intention.evaluate(predicate.getTerm(1))
											);
										}
									}
								)
							}
						)
					),
					new BeliefUpdate('+',
						"explorationManager", new int[] {56,8,59,5},
						new Predicate("busyAgents", new Term[] {
							new Variable(Type.LIST, "busyAgents")
						})
					),
					new Send("explorationManager", new int[] {58,8,58,51},
						new Performative("inform"),
						Primitive.newPrimitive("main"),
						new Predicate("content", new Term[] {
							Primitive.newPrimitive("Party Sent")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"explorationManager", new int[] {61,9,61,60},
			new MessageEvent(
				new Performative("inform"),
				Primitive.newPrimitive("main"),
				new Predicate("content", new Term[] {
					new Variable(Type.STRING, "content",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"explorationManager", new int[] {61,59,66,5},
				new Statement[] {
					new ModuleCall("C",
						"explorationManager", new int[] {62,8,62,37},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Explore received")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("explorationManager","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.LIST, "coords"),
						"explorationManager", new int[] {63,8,66,5},
						new ModuleTerm("explore", Type.LIST,
							new Predicate("getRandomBase", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((modules.Exploration) intention.getModule("explorationManager","explore")).getRandomBase(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((modules.Exploration) visitor.agent().getModule("explorationManager","explore")).getRandomBase(
									);
								}
							}
						)
					),
					new ModuleCall("C",
						"explorationManager", new int[] {64,8,64,43},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("New base at: "),
								new Variable(Type.LIST, "coords")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("explorationManager","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"explorationManager", new int[] {65,8,66,5},
						new Goal(
							new Predicate("explore", new Term[] {
								new ModuleTerm("P", Type.INTEGER,
									new Predicate("valueAsInt", new Term[] {
										new Variable(Type.LIST, "coords"),
										Primitive.newPrimitive(0)
									}),
									new ModuleTermAdaptor() {
										public Object invoke(Intention intention, Predicate predicate) {
											return ((modules.Prelude2) intention.getModule("explorationManager","P")).valueAsInt(
												(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
												(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
											);
										}
										public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
											return ((modules.Prelude2) visitor.agent().getModule("explorationManager","P")).valueAsInt(
												(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
												(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
											);
										}
									}
								),
								new ModuleTerm("P", Type.INTEGER,
									new Predicate("valueAsInt", new Term[] {
										new Variable(Type.LIST, "coords"),
										Primitive.newPrimitive(1)
									}),
									new ModuleTermAdaptor() {
										public Object invoke(Intention intention, Predicate predicate) {
											return ((modules.Prelude2) intention.getModule("explorationManager","P")).valueAsInt(
												(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
												(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
											);
										}
										public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
											return ((modules.Prelude2) visitor.agent().getModule("explorationManager","P")).valueAsInt(
												(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
												(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
											);
										}
									}
								)
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
				((astra.lang.EIS) agent.getModule("explorationManager","eis")).sense();
			}
		});

		agent.initialize(
			new Predicate("busyAgents", new Term[] {
				new ListTerm(new Term[] {

				})
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
		fragment.addModule("ent",modules.Entities.class,agent);
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
			astra.core.Agent agent = new explorationManager().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
