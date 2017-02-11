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


public class Player extends ASTRAClass {
	public Player() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"Player", new int[] {20,9,20,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {20,27,52,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.BOOLEAN, "matchFlag"),
						"Player", new int[] {21,8,52,5},
						Primitive.newPrimitive(false)
					),
					new ModuleCall("eis",
						"Player", new int[] {22,8,22,53},
						new Predicate("launch", new Term[] {
							Primitive.newPrimitive("starcraft"),
							Primitive.newPrimitive("localeisbw-dep.jar")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Player","eis")).launch(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("eis",
						"Player", new int[] {23,8,23,18},
						new Predicate("join", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Player","eis")).join(
								);
							}
						}
					),
					new ModuleCall("eis",
						"Player", new int[] {24,8,24,141},
						new Predicate("init", new Term[] {
							new ListTerm(new Term[] {
								new Funct("map", new Term[] {
									Primitive.newPrimitive("(2)Astral Balance.scm")
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
								return ((astra.lang.EIS) intention.getModule("Player","eis")).init(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("eis",
						"Player", new int[] {25,8,25,22},
						new Predicate("startEnv", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Player","eis")).startEnv(
								);
							}
						}
					),
					new ModuleCall("eis",
						"Player", new int[] {26,8,26,27},
						new Predicate("link", new Term[] {
							Primitive.newPrimitive("manager")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Player","eis")).link(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("C",
						"Player", new int[] {27,8,27,34},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Player ready.")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.LIST, "freeEntities"),
						"Player", new int[] {29,8,52,5},
						new ListTerm(new Term[] {

						})
					),
					new While(
						"Player", new int[] {30,8,52,5},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "matchFlag"),
							Primitive.newPrimitive(false)
						),
						new Block(
							"Player", new int[] {30,34,35,9},
							new Statement[] {
								new Assignment(
									new Variable(Type.LIST, "freeEntities"),
									"Player", new int[] {31,12,35,9},
									new ModuleTerm("eis", Type.LIST,
										new Predicate("freeEntities", new Term[] {}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.EIS) intention.getModule("Player","eis")).freeEntities(
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.EIS) visitor.agent().getModule("Player","eis")).freeEntities(
												);
											}
										}
									)
								),
								new If(
									"Player", new int[] {32,12,35,9},
									new Comparison(">",
										new ModuleTerm("P", Type.INTEGER,
											new Predicate("size", new Term[] {
												new ModuleTerm("eis", Type.LIST,
													new Predicate("freeEntities", new Term[] {}),
													new ModuleTermAdaptor() {
														public Object invoke(Intention intention, Predicate predicate) {
															return ((astra.lang.EIS) intention.getModule("Player","eis")).freeEntities(
															);
														}
														public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
															return ((astra.lang.EIS) visitor.agent().getModule("Player","eis")).freeEntities(
															);
														}
													}
												)
											}),
											new ModuleTermAdaptor() {
												public Object invoke(Intention intention, Predicate predicate) {
													return ((astra.lang.Prelude) intention.getModule("Player","P")).size(
														(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((astra.lang.Prelude) visitor.agent().getModule("Player","P")).size(
														(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
													);
												}
											}
										),
										Primitive.newPrimitive(0)
									),
									new Block(
										"Player", new int[] {32,46,34,13},
										new Statement[] {
											new Assignment(
												new Variable(Type.BOOLEAN, "matchFlag"),
												"Player", new int[] {33,16,34,13},
												Primitive.newPrimitive(true)
											)
										}
									)
								)
							}
						)
					),
					new ModuleCall("P",
						"Player", new int[] {37,8,37,32},
						new Predicate("sort_asc", new Term[] {
							new Variable(Type.LIST, "freeEntities")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Prelude) intention.getModule("Player","P")).sort_asc(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("S",
						"Player", new int[] {38,8,38,20},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(2000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Player","S")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("S",
						"Player", new int[] {39,8,39,74},
						new Predicate("createAgent", new Term[] {
							new ModuleTerm("P", Type.STRING,
								new Predicate("headAsString", new Term[] {
									new Variable(Type.LIST, "freeEntities")
								}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.Prelude) intention.getModule("Player","P")).headAsString(
											(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.Prelude) visitor.agent().getModule("Player","P")).headAsString(
											(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
										);
									}
								}
							),
							Primitive.newPrimitive("TerranCommandCenter")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Player","S")).createAgent(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("C",
						"Player", new int[] {40,12,40,70},
						new Predicate("println", new Term[] {
							new ModuleTerm("eis", Type.STRING,
								new Predicate("getEntityType", new Term[] {
									new ModuleTerm("P", Type.STRING,
										new Predicate("headAsString", new Term[] {
											new Variable(Type.LIST, "freeEntities")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Prelude) intention.getModule("Player","P")).headAsString(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Prelude) visitor.agent().getModule("Player","P")).headAsString(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
												);
											}
										}
									)
								}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.EIS) intention.getModule("Player","eis")).getEntityType(
											(java.lang.String) intention.evaluate(predicate.getTerm(0))
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.EIS) visitor.agent().getModule("Player","eis")).getEntityType(
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
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.LIST, "SCVs"),
						"Player", new int[] {42,8,52,5},
						new ModuleTerm("P", Type.LIST,
							new Predicate("tail", new Term[] {
								new Variable(Type.LIST, "freeEntities")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.Prelude) intention.getModule("Player","P")).tail(
										(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.Prelude) visitor.agent().getModule("Player","P")).tail(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new ForAll(
						"Player", new int[] {44,8,44,32},
						new Variable(Type.STRING, "ID",false),
						new Variable(Type.LIST, "SCVs"),
						new Block(
							"Player", new int[] {44,33,52,5},
							new Statement[] {
								new ModuleCall("S",
									"Player", new int[] {45,12,45,42},
									new Predicate("createAgent", new Term[] {
										new Variable(Type.STRING, "ID"),
										Primitive.newPrimitive("TerranSCV")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("Player","S")).createAgent(
												(java.lang.String) intention.evaluate(predicate.getTerm(0)),
												(java.lang.String) intention.evaluate(predicate.getTerm(1))
											);
										}
									}
								),
								new ModuleCall("S",
									"Player", new int[] {46,12,46,23},
									new Predicate("sleep", new Term[] {
										Primitive.newPrimitive(100)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("Player","S")).sleep(
												(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						)
					),
					new While(
						"Player", new int[] {49,8,52,5},
						Predicate.TRUE,
						new Block(
							"Player", new int[] {49,20,51,9},
							new Statement[] {
								new Subgoal(
									"Player", new int[] {50,12,51,9},
									new Goal(
										new Predicate("play", new Term[] {})
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {55,9,55,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("play", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {55,18,68,5},
				new Statement[] {
					new If(
						"Player", new int[] {56,8,68,5},
						new Comparison(">",
							new ModuleTerm("P", Type.INTEGER,
								new Predicate("size", new Term[] {
									new ModuleTerm("eis", Type.LIST,
										new Predicate("freeEntities", new Term[] {}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.EIS) intention.getModule("Player","eis")).freeEntities(
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.EIS) visitor.agent().getModule("Player","eis")).freeEntities(
												);
											}
										}
									)
								}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.Prelude) intention.getModule("Player","P")).size(
											(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.Prelude) visitor.agent().getModule("Player","P")).size(
											(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
										);
									}
								}
							),
							Primitive.newPrimitive(0)
						),
						new Block(
							"Player", new int[] {56,42,66,9},
							new Statement[] {
								new Declaration(
									new Variable(Type.LIST, "freeEntities"),
									"Player", new int[] {57,12,66,9},
									new ModuleTerm("eis", Type.LIST,
										new Predicate("freeEntities", new Term[] {}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.EIS) intention.getModule("Player","eis")).freeEntities(
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.EIS) visitor.agent().getModule("Player","eis")).freeEntities(
												);
											}
										}
									)
								),
								new ForAll(
									"Player", new int[] {58,12,58,44},
									new Variable(Type.STRING, "ID",false),
									new Variable(Type.LIST, "freeEntities"),
									new Block(
										"Player", new int[] {58,45,66,9},
										new Statement[] {
											new If(
												"Player", new int[] {59,16,65,13},
												new Comparison("==",
													new ModuleTerm("eis", Type.STRING,
														new Predicate("getEntityType", new Term[] {
															new Variable(Type.STRING, "ID")
														}),
														new ModuleTermAdaptor() {
															public Object invoke(Intention intention, Predicate predicate) {
																return ((astra.lang.EIS) intention.getModule("Player","eis")).getEntityType(
																	(java.lang.String) intention.evaluate(predicate.getTerm(0))
																);
															}
															public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																return ((astra.lang.EIS) visitor.agent().getModule("Player","eis")).getEntityType(
																	(java.lang.String) visitor.evaluate(predicate.getTerm(0))
																);
															}
														}
													),
													Primitive.newPrimitive("terranSCV")
												),
												new Block(
													"Player", new int[] {59,57,61,17},
													new Statement[] {
														new ModuleCall("S",
															"Player", new int[] {60,20,60,50},
															new Predicate("createAgent", new Term[] {
																new Variable(Type.STRING, "ID"),
																Primitive.newPrimitive("TerranSCV")
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.System) intention.getModule("Player","S")).createAgent(
																		(java.lang.String) intention.evaluate(predicate.getTerm(0)),
																		(java.lang.String) intention.evaluate(predicate.getTerm(1))
																	);
																}
															}
														)
													}
												)
											),
											new If(
												"Player", new int[] {62,16,65,13},
												new Comparison("==",
													new ModuleTerm("eis", Type.STRING,
														new Predicate("getEntityType", new Term[] {
															new Variable(Type.STRING, "ID")
														}),
														new ModuleTermAdaptor() {
															public Object invoke(Intention intention, Predicate predicate) {
																return ((astra.lang.EIS) intention.getModule("Player","eis")).getEntityType(
																	(java.lang.String) intention.evaluate(predicate.getTerm(0))
																);
															}
															public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																return ((astra.lang.EIS) visitor.agent().getModule("Player","eis")).getEntityType(
																	(java.lang.String) visitor.evaluate(predicate.getTerm(0))
																);
															}
														}
													),
													Primitive.newPrimitive("terranCommandCenter")
												),
												new Block(
													"Player", new int[] {62,67,64,17},
													new Statement[] {
														new ModuleCall("S",
															"Player", new int[] {63,20,63,60},
															new Predicate("createAgent", new Term[] {
																new Variable(Type.STRING, "ID"),
																Primitive.newPrimitive("TerranCommandCenter")
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.System) intention.getModule("Player","S")).createAgent(
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
					new ModuleCall("C",
						"Player", new int[] {67,8,67,34},
						new Predicate("println", new Term[] {
							new ModuleTerm("S", Type.LIST,
								new Predicate("getChildren", new Term[] {}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.System) intention.getModule("Player","S")).getChildren(
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.System) visitor.agent().getModule("Player","S")).getChildren(
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
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
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
				((astra.lang.EIS) agent.getModule("Player","eis")).sense();
			}
		});

		agent.initialize(
			new Predicate("minerals", new Term[] {
				Primitive.newPrimitive(50)
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
			new Predicate("unitIDs", new Term[] {
				new ListTerm(new Term[] {

				})
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
			astra.core.Agent agent = new Player().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
