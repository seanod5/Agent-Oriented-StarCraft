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


public class manager extends ASTRAClass {
	public manager() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"manager", new int[] {19,9,19,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"manager", new int[] {19,27,32,5},
				new Statement[] {
					new ModuleCall("eis",
						"manager", new int[] {20,8,20,53},
						new Predicate("launch", new Term[] {
							Primitive.newPrimitive("starcraft"),
							Primitive.newPrimitive("localeisbw-dep.jar")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("manager","eis")).launch(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("eis",
						"manager", new int[] {21,8,21,18},
						new Predicate("join", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("manager","eis")).join(
								);
							}
						}
					),
					new ModuleCall("eis",
						"manager", new int[] {22,8,22,120},
						new Predicate("init", new Term[] {
							new ListTerm(new Term[] {
								new Funct("map", new Term[] {
									Primitive.newPrimitive("")
								}),
								new Funct("own_race", new Term[] {
									Primitive.newPrimitive("terran")
								}),
								new Funct("starcraft_location", new Term[] {
									Primitive.newPrimitive("C:\\Program Files (x86)\\StarCraft")
								}),
								new Funct("debug", new Term[] {
									Primitive.newPrimitive("true")
								})
							})
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("manager","eis")).init(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("eis",
						"manager", new int[] {23,8,23,22},
						new Predicate("startEnv", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("manager","eis")).startEnv(
								);
							}
						}
					),
					new ModuleCall("eis",
						"manager", new int[] {24,8,24,27},
						new Predicate("link", new Term[] {
							Primitive.newPrimitive("manager")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("manager","eis")).link(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("C",
						"manager", new int[] {25,8,25,36},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Manager linked.")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("manager","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("messaging",
						"manager", new int[] {26,8,26,75},
						new Predicate("installService", new Term[] {
							Primitive.newPrimitive("local"),
							Primitive.newPrimitive("astra.messaging.LocalMQService")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Messaging) intention.getModule("manager","messaging")).installService(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("messaging",
						"manager", new int[] {27,8,27,39},
						new Predicate("startService", new Term[] {
							Primitive.newPrimitive("local")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Messaging) intention.getModule("manager","messaging")).startService(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("S",
						"manager", new int[] {28,8,28,60},
						new Predicate("createAgent", new Term[] {
							Primitive.newPrimitive("Building Manager"),
							Primitive.newPrimitive("buildingManager")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("manager","S")).createAgent(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("S",
						"manager", new int[] {29,8,29,56},
						new Predicate("createAgent", new Term[] {
							Primitive.newPrimitive("Combat Manager"),
							Primitive.newPrimitive("combatManager")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("manager","S")).createAgent(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("S",
						"manager", new int[] {30,8,30,66},
						new Predicate("createAgent", new Term[] {
							Primitive.newPrimitive("Exploration Manager"),
							Primitive.newPrimitive("explorationManager")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("manager","S")).createAgent(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new Subgoal(
						"manager", new int[] {31,8,32,5},
						new Goal(
							new Predicate("play", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"manager", new int[] {34,9,34,60},
			new GoalEvent('+',
				new Goal(
					new Predicate("play", new Term[] {})
				)
			),
			new Predicate("exploreRequest", new Term[] {
				new Variable(Type.BOOLEAN, "exploreRequest",false)
			}),
			new Block(
				"manager", new int[] {34,59,54,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "marines"),
						"manager", new int[] {35,8,54,5},
						new ModuleTerm("S", Type.LIST,
							new Predicate("getAgentsOfType", new Term[] {
								Primitive.newPrimitive("terranMarine")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.System) intention.getModule("manager","S")).getAgentsOfType(
										(java.lang.String) intention.evaluate(predicate.getTerm(0))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.System) visitor.agent().getModule("manager","S")).getAgentsOfType(
										(java.lang.String) visitor.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new If(
						"manager", new int[] {36,8,54,5},
						new AND(
							new BracketFormula(
								new Comparison(">",
									new ModuleTerm("P", Type.INTEGER,
										new Predicate("size", new Term[] {
											new Variable(Type.LIST, "marines")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((modules.Prelude2) intention.getModule("manager","P")).size(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((modules.Prelude2) visitor.agent().getModule("manager","P")).size(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
												);
											}
										}
									),
									Primitive.newPrimitive(0)
								)
							),
							new AND(
								new BracketFormula(
									new Comparison("==",
										new Brackets(
											Operator.newOperator('%',
												new ModuleTerm("P", Type.INTEGER,
													new Predicate("size", new Term[] {
														new Variable(Type.LIST, "marines")
													}),
													new ModuleTermAdaptor() {
														public Object invoke(Intention intention, Predicate predicate) {
															return ((modules.Prelude2) intention.getModule("manager","P")).size(
																(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
															);
														}
														public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
															return ((modules.Prelude2) visitor.agent().getModule("manager","P")).size(
																(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
															);
														}
													}
												),
												Primitive.newPrimitive(5)
											)
										),
										Primitive.newPrimitive(0)
									)
								),
								new BracketFormula(
									new Comparison("==",
										new Variable(Type.BOOLEAN, "exploreRequest"),
										Primitive.newPrimitive(false)
									)
								)
							)
						),
						new Block(
							"manager", new int[] {36,90,41,9},
							new Statement[] {
								new Send("manager", new int[] {37,12,37,65},
									new Performative("inform"),
									Primitive.newPrimitive("Exploration Manager"),
									new Predicate("content", new Term[] {
										Primitive.newPrimitive("ready")
									})
								),
								new ModuleCall("C",
									"manager", new int[] {38,12,38,37},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("Explore sent")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("manager","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new BeliefUpdate('-',
									"manager", new int[] {39,12,41,9},
									new Predicate("exploreRequest", new Term[] {
										Primitive.newPrimitive(false)
									})
								),
								new BeliefUpdate('+',
									"manager", new int[] {40,12,41,9},
									new Predicate("exploreRequest", new Term[] {
										Primitive.newPrimitive(true)
									})
								)
							}
						)
					),
					new If(
						"manager", new int[] {42,8,54,5},
						new Comparison(">",
							new ModuleTerm("P", Type.INTEGER,
								new Predicate("size", new Term[] {
									new ModuleTerm("eis", Type.LIST,
										new Predicate("freeEntities", new Term[] {}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.EIS) intention.getModule("manager","eis")).freeEntities(
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.EIS) visitor.agent().getModule("manager","eis")).freeEntities(
												);
											}
										}
									)
								}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((modules.Prelude2) intention.getModule("manager","P")).size(
											(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((modules.Prelude2) visitor.agent().getModule("manager","P")).size(
											(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
										);
									}
								}
							),
							Primitive.newPrimitive(0)
						),
						new Block(
							"manager", new int[] {42,42,52,9},
							new Statement[] {
								new Declaration(
									new Variable(Type.LIST, "freeEntities"),
									"manager", new int[] {43,12,52,9},
									new ModuleTerm("eis", Type.LIST,
										new Predicate("freeEntities", new Term[] {}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.EIS) intention.getModule("manager","eis")).freeEntities(
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.EIS) visitor.agent().getModule("manager","eis")).freeEntities(
												);
											}
										}
									)
								),
								new ForAll(
									"manager", new int[] {44,12,44,44},
									new Variable(Type.STRING, "ID",false),
									new Variable(Type.LIST, "freeEntities"),
									new Block(
										"manager", new int[] {44,45,52,9},
										new Statement[] {
											new If(
												"manager", new int[] {45,16,51,13},
												new Comparison("==",
													new ModuleTerm("ent", Type.BOOLEAN,
														new Predicate("isAgent", new Term[] {
															new ModuleTerm("eis", Type.STRING,
																new Predicate("getEntityType", new Term[] {
																	new Variable(Type.STRING, "ID")
																}),
																new ModuleTermAdaptor() {
																	public Object invoke(Intention intention, Predicate predicate) {
																		return ((astra.lang.EIS) intention.getModule("manager","eis")).getEntityType(
																			(java.lang.String) intention.evaluate(predicate.getTerm(0))
																		);
																	}
																	public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((astra.lang.EIS) visitor.agent().getModule("manager","eis")).getEntityType(
																			(java.lang.String) visitor.evaluate(predicate.getTerm(0))
																		);
																	}
																}
															)
														}),
														new ModuleTermAdaptor() {
															public Object invoke(Intention intention, Predicate predicate) {
																return ((modules.Entities) intention.getModule("manager","ent")).isAgent(
																	(java.lang.String) intention.evaluate(predicate.getTerm(0))
																);
															}
															public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																return ((modules.Entities) visitor.agent().getModule("manager","ent")).isAgent(
																	(java.lang.String) visitor.evaluate(predicate.getTerm(0))
																);
															}
														}
													),
													Primitive.newPrimitive(true)
												),
												new Block(
													"manager", new int[] {45,63,47,17},
													new Statement[] {
														new ModuleCall("S",
															"manager", new int[] {46,20,46,60},
															new Predicate("createAgent", new Term[] {
																new Variable(Type.STRING, "ID"),
																new ModuleTerm("eis", Type.STRING,
																	new Predicate("getEntityType", new Term[] {
																		new Variable(Type.STRING, "ID")
																	}),
																	new ModuleTermAdaptor() {
																		public Object invoke(Intention intention, Predicate predicate) {
																			return ((astra.lang.EIS) intention.getModule("manager","eis")).getEntityType(
																				(java.lang.String) intention.evaluate(predicate.getTerm(0))
																			);
																		}
																		public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																			return ((astra.lang.EIS) visitor.agent().getModule("manager","eis")).getEntityType(
																				(java.lang.String) visitor.evaluate(predicate.getTerm(0))
																			);
																		}
																	}
																)
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.System) intention.getModule("manager","S")).createAgent(
																		(java.lang.String) intention.evaluate(predicate.getTerm(0)),
																		(java.lang.String) intention.evaluate(predicate.getTerm(1))
																	);
																}
															}
														)
													}
												),
												new Block(
													"manager", new int[] {48,21,51,13},
													new Statement[] {
														new ModuleCall("S",
															"manager", new int[] {49,20,49,51},
															new Predicate("createAgent", new Term[] {
																new Variable(Type.STRING, "ID"),
																Primitive.newPrimitive("dummyAgent")
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.System) intention.getModule("manager","S")).createAgent(
																		(java.lang.String) intention.evaluate(predicate.getTerm(0)),
																		(java.lang.String) intention.evaluate(predicate.getTerm(1))
																	);
																}
															}
														)
													}
												)
											)
										}
									)
								)
							}
						)
					),
					new Subgoal(
						"manager", new int[] {53,8,54,5},
						new Goal(
							new Predicate("play", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"manager", new int[] {56,9,56,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("play", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"manager", new int[] {56,18,58,5},
				new Statement[] {
					new Subgoal(
						"manager", new int[] {57,8,58,5},
						new Goal(
							new Predicate("play", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"manager", new int[] {60,9,60,73},
			new MessageEvent(
				new Performative("inform"),
				Primitive.newPrimitive("Exploration Manager"),
				new Predicate("content", new Term[] {
					Primitive.newPrimitive("Party Sent")
				})
			),
			Predicate.TRUE,
			new Block(
				"manager", new int[] {60,72,63,5},
				new Statement[] {
					new BeliefUpdate('-',
						"manager", new int[] {61,8,63,5},
						new Predicate("exploreRequest", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new BeliefUpdate('+',
						"manager", new int[] {62,8,63,5},
						new Predicate("exploreRequest", new Term[] {
							Primitive.newPrimitive(false)
						})
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("manager","eis")).sense();
			}
		});

		agent.initialize(
			new Predicate("exploreRequest", new Term[] {
				Primitive.newPrimitive(false)
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("eis",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("S",astra.lang.System.class,agent);
		fragment.addModule("P",modules.Prelude2.class,agent);
		fragment.addModule("ent",modules.Entities.class,agent);
		fragment.addModule("messaging",astra.lang.Messaging.class,agent);
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
			astra.core.Agent agent = new manager().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
