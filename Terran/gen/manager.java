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
			"manager", new int[] {29,9,29,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"manager", new int[] {29,27,47,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.BOOLEAN, "matchStarted"),
						"manager", new int[] {30,8,47,5},
						Primitive.newPrimitive(false)
					),
					new ModuleCall("eis",
						"manager", new int[] {31,8,31,53},
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
						"manager", new int[] {32,8,32,18},
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
						"manager", new int[] {33,8,33,120},
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
						"manager", new int[] {34,8,34,22},
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
						"manager", new int[] {35,8,35,27},
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
						"manager", new int[] {36,8,36,36},
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
						"manager", new int[] {37,8,37,75},
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
						"manager", new int[] {38,8,38,39},
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
					new While(
						"manager", new int[] {39,8,47,5},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "matchStarted"),
							Primitive.newPrimitive(false)
						),
						new Block(
							"manager", new int[] {39,37,43,9},
							new Statement[] {
								new If(
									"manager", new int[] {40,12,43,9},
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
													return ((astra.lang.Prelude) intention.getModule("manager","P")).size(
														(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((astra.lang.Prelude) visitor.agent().getModule("manager","P")).size(
														(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
													);
												}
											}
										),
										Primitive.newPrimitive(0)
									),
									new Block(
										"manager", new int[] {40,46,42,13},
										new Statement[] {
											new Assignment(
												new Variable(Type.BOOLEAN, "matchStarted"),
												"manager", new int[] {41,16,42,13},
												Primitive.newPrimitive(true)
											)
										}
									)
								)
							}
						)
					),
					new Subgoal(
						"manager", new int[] {46,8,47,5},
						new Goal(
							new Predicate("play", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"manager", new int[] {49,9,49,78},
			new GoalEvent('+',
				new Goal(
					new Predicate("play", new Term[] {})
				)
			),
			new AND(
				new Predicate("partyFormed", new Term[] {
					new Variable(Type.BOOLEAN, "partyFormed",false)
				}),
				new Predicate("newBase", new Term[] {
					new Variable(Type.INTEGER, "x",false),
					new Variable(Type.INTEGER, "y",false)
				})
			),
			new Block(
				"manager", new int[] {49,77,80,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "SCVs"),
						"manager", new int[] {50,8,80,5},
						new ModuleTerm("S", Type.LIST,
							new Predicate("getAgentsOfType", new Term[] {
								Primitive.newPrimitive("terranSCV")
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
					new Declaration(
						new Variable(Type.LIST, "marines"),
						"manager", new int[] {51,8,80,5},
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
						"manager", new int[] {52,8,80,5},
						new AND(
							new BracketFormula(
								new Comparison(">=",
									new ModuleTerm("P", Type.INTEGER,
										new Predicate("size", new Term[] {
											new Variable(Type.LIST, "SCVs")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Prelude) intention.getModule("manager","P")).size(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Prelude) visitor.agent().getModule("manager","P")).size(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
												);
											}
										}
									),
									Primitive.newPrimitive(5)
								)
							),
							new AND(
								new BracketFormula(
									new Comparison(">=",
										new ModuleTerm("P", Type.INTEGER,
											new Predicate("size", new Term[] {
												new Variable(Type.LIST, "marines")
											}),
											new ModuleTermAdaptor() {
												public Object invoke(Intention intention, Predicate predicate) {
													return ((astra.lang.Prelude) intention.getModule("manager","P")).size(
														(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((astra.lang.Prelude) visitor.agent().getModule("manager","P")).size(
														(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
													);
												}
											}
										),
										Primitive.newPrimitive(5)
									)
								),
								new BracketFormula(
									new Comparison("==",
										new Variable(Type.BOOLEAN, "partyFormed"),
										Primitive.newPrimitive(false)
									)
								)
							)
						),
						new Block(
							"manager", new int[] {52,80,70,9},
							new Statement[] {
								new ModuleCall("C",
									"manager", new int[] {53,12,53,45},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("Forming search party")
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
								new Declaration(
									new Variable(Type.LIST, "party"),
									"manager", new int[] {54,12,70,9},
									new ListTerm(new Term[] {

									})
								),
								new Declaration(
									new Variable(Type.INTEGER, "i"),
									"manager", new int[] {55,12,70,9},
									Primitive.newPrimitive(0)
								),
								new ModuleCall("P",
									"manager", new int[] {56,12,56,53},
									new Predicate("add", new Term[] {
										new Variable(Type.LIST, "party"),
										new ModuleTerm("lists", Type.STRING,
											new Predicate("getRandomString", new Term[] {
												new Variable(Type.LIST, "SCVs")
											}),
											new ModuleTermAdaptor() {
												public Object invoke(Intention intention, Predicate predicate) {
													return ((modules.Lists) intention.getModule("manager","lists")).getRandomString(
														(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((modules.Lists) visitor.agent().getModule("manager","lists")).getRandomString(
														(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
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
											return ((astra.lang.Prelude) intention.getModule("manager","P")).add(
												(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
												(java.lang.String) intention.evaluate(predicate.getTerm(1))
											);
										}
									}
								),
								new While(
									"manager", new int[] {57,12,70,9},
									new Comparison("<",
										new Variable(Type.INTEGER, "i"),
										Primitive.newPrimitive(5)
									),
									new Block(
										"manager", new int[] {57,24,62,13},
										new Statement[] {
											new Declaration(
												new Variable(Type.STRING, "marine"),
												"manager", new int[] {58,16,62,13},
												new ModuleTerm("lists", Type.STRING,
													new Predicate("getRandomString", new Term[] {
														new Variable(Type.LIST, "marines")
													}),
													new ModuleTermAdaptor() {
														public Object invoke(Intention intention, Predicate predicate) {
															return ((modules.Lists) intention.getModule("manager","lists")).getRandomString(
																(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
															);
														}
														public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
															return ((modules.Lists) visitor.agent().getModule("manager","lists")).getRandomString(
																(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
															);
														}
													}
												)
											),
											new ModuleCall("P",
												"manager", new int[] {59,16,59,36},
												new Predicate("add", new Term[] {
													new Variable(Type.LIST, "party"),
													new Variable(Type.STRING, "marine")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.Prelude) intention.getModule("manager","P")).add(
															(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
															(java.lang.String) intention.evaluate(predicate.getTerm(1))
														);
													}
												}
											),
											new ModuleCall("lists",
												"manager", new int[] {60,16,60,45},
												new Predicate("remove", new Term[] {
													new Variable(Type.LIST, "marines"),
													new Variable(Type.STRING, "marine")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((modules.Lists) intention.getModule("manager","lists")).remove(
															(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
															(java.lang.String) intention.evaluate(predicate.getTerm(1))
														);
													}
												}
											),
											new PlusPlus(
												new Variable(Type.INTEGER, "i"),
												"manager", new int[] {61,16,61,19}
											)
										}
									)
								),
								new ModuleCall("C",
									"manager", new int[] {63,12,63,47},
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
											return ((astra.lang.Console) intention.getModule("manager","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new BeliefUpdate('-',
									"manager", new int[] {64,12,70,9},
									new Predicate("partyFormed", new Term[] {
										Primitive.newPrimitive(false)
									})
								),
								new BeliefUpdate('+',
									"manager", new int[] {65,12,70,9},
									new Predicate("partyFormed", new Term[] {
										Primitive.newPrimitive(true)
									})
								),
								new ForAll(
									"manager", new int[] {67,12,67,37},
									new Variable(Type.STRING, "ID",false),
									new Variable(Type.LIST, "party"),
									new Block(
										"manager", new int[] {67,38,70,9},
										new Statement[] {
											new Send("manager", new int[] {68,16,68,47},
												new Performative("inform"),
												new Variable(Type.STRING, "ID"),
												new Predicate("explore", new Term[] {
													new Variable(Type.INTEGER, "x"),
													new Variable(Type.INTEGER, "y")
												})
											)
										}
									)
								)
							}
						)
					),
					new If(
						"manager", new int[] {72,8,80,5},
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
										return ((astra.lang.Prelude) intention.getModule("manager","P")).size(
											(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.Prelude) visitor.agent().getModule("manager","P")).size(
											(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
										);
									}
								}
							),
							Primitive.newPrimitive(0)
						),
						new Block(
							"manager", new int[] {72,42,78,9},
							new Statement[] {
								new Declaration(
									new Variable(Type.LIST, "freeEntities"),
									"manager", new int[] {73,12,78,9},
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
									"manager", new int[] {75,12,75,44},
									new Variable(Type.STRING, "ID",false),
									new Variable(Type.LIST, "freeEntities"),
									new Block(
										"manager", new int[] {75,45,78,9},
										new Statement[] {
											new ModuleCall("S",
												"manager", new int[] {76,16,76,56},
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
									)
								)
							}
						)
					),
					new Subgoal(
						"manager", new int[] {79,8,80,5},
						new Goal(
							new Predicate("play", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"manager", new int[] {82,9,82,62},
			new GoalEvent('+',
				new Goal(
					new Predicate("build", new Term[] {
						new Variable(Type.STRING, "structure",false)
					})
				)
			),
			new Predicate("busySCVs", new Term[] {
				new Variable(Type.LIST, "busySCVs",false)
			}),
			new Block(
				"manager", new int[] {82,61,95,5},
				new Statement[] {
					new BeliefUpdate('-',
						"manager", new int[] {83,8,95,5},
						new Predicate("buildStarted", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new BeliefUpdate('+',
						"manager", new int[] {84,8,95,5},
						new Predicate("buildStarted", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new Declaration(
						new Variable(Type.LIST, "SCVs"),
						"manager", new int[] {85,8,95,5},
						new ModuleTerm("S", Type.LIST,
							new Predicate("getAgentsOfType", new Term[] {
								Primitive.newPrimitive("terranSCV")
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
					new Declaration(
						new Variable(Type.STRING, "SCV"),
						"manager", new int[] {86,8,95,5},
						new ModuleTerm("lists", Type.STRING,
							new Predicate("getRandomString", new Term[] {
								new Variable(Type.LIST, "SCVs")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((modules.Lists) intention.getModule("manager","lists")).getRandomString(
										(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((modules.Lists) visitor.agent().getModule("manager","lists")).getRandomString(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new While(
						"manager", new int[] {87,8,95,5},
						new ModuleFormula("P",
							new Predicate("contains", new Term[] {
								new Variable(Type.LIST, "busySCVs"),
								new Variable(Type.STRING, "SCV")
							}),
						new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.Prelude) visitor.agent().getModule("manager","P")).contains(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
										(java.lang.String) visitor.evaluate(predicate.getTerm(1))
									);
							}
						}
							),
						new Block(
							"manager", new int[] {87,41,89,9},
							new Statement[] {
								new Assignment(
									new Variable(Type.STRING, "SCV"),
									"manager", new int[] {88,12,89,9},
									new ModuleTerm("lists", Type.STRING,
										new Predicate("getRandomString", new Term[] {
											new Variable(Type.LIST, "SCVs")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((modules.Lists) intention.getModule("manager","lists")).getRandomString(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((modules.Lists) visitor.agent().getModule("manager","lists")).getRandomString(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
												);
											}
										}
									)
								)
							}
						)
					),
					new Send("manager", new int[] {90,8,90,45},
						new Performative("inform"),
						new Variable(Type.STRING, "SCV"),
						new Predicate("content", new Term[] {
							new Variable(Type.STRING, "structure")
						})
					),
					new ModuleCall("C",
						"manager", new int[] {91,8,91,56},
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
								return ((astra.lang.Console) intention.getModule("manager","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"manager", new int[] {92,8,95,5},
						new Predicate("busySCVs", new Term[] {
							new Variable(Type.LIST, "busySCVs")
						})
					),
					new ModuleCall("P",
						"manager", new int[] {93,8,93,28},
						new Predicate("add", new Term[] {
							new Variable(Type.LIST, "busySCVs"),
							new Variable(Type.STRING, "SCV")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Prelude) intention.getModule("manager","P")).add(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"manager", new int[] {94,8,95,5},
						new Predicate("busySCVs", new Term[] {
							new Variable(Type.LIST, "busySCVs")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"manager", new int[] {97,9,97,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("build", new Term[] {
						new Variable(Type.STRING, "structure",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"manager", new int[] {97,35,99,5},
				new Statement[] {
					new Subgoal(
						"manager", new int[] {98,8,99,5},
						new Goal(
							new Predicate("build", new Term[] {
								new Variable(Type.STRING, "structure")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"manager", new int[] {101,9,101,63},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("ready", new Term[] {
					new Variable(Type.STRING, "ready",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"manager", new int[] {101,62,112,5},
				new Statement[] {
					new Subgoal(
						"manager", new int[] {102,8,112,5},
						new Goal(
							new Predicate("build", new Term[] {
								Primitive.newPrimitive("Terran Supply Depot")
							})
						)
					),
					new ModuleCall("C",
						"manager", new int[] {103,8,103,31},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("waiting...")
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
					new Wait(
						"manager", new int[] {104,8,112,5},
						new Predicate("buildStarted", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new Subgoal(
						"manager", new int[] {105,8,112,5},
						new Goal(
							new Predicate("build", new Term[] {
								Primitive.newPrimitive("Terran Refinery")
							})
						)
					),
					new ModuleCall("C",
						"manager", new int[] {106,8,106,31},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("waiting...")
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
					new Wait(
						"manager", new int[] {107,8,112,5},
						new Predicate("buildStarted", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new Subgoal(
						"manager", new int[] {108,8,112,5},
						new Goal(
							new Predicate("build", new Term[] {
								Primitive.newPrimitive("Terran Barracks")
							})
						)
					),
					new ModuleCall("C",
						"manager", new int[] {109,8,109,31},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("waiting...")
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
					new Wait(
						"manager", new int[] {110,8,112,5},
						new Predicate("buildStarted", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new Subgoal(
						"manager", new int[] {111,8,112,5},
						new Goal(
							new Predicate("build", new Term[] {
								Primitive.newPrimitive("Terran Supply Depot")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"manager", new int[] {114,9,114,93},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("built", new Term[] {
					new Variable(Type.STRING, "structure",false)
				})
			),
			new Predicate("busySCVs", new Term[] {
				new Variable(Type.LIST, "busySCVs",false)
			}),
			new Block(
				"manager", new int[] {114,92,123,5},
				new Statement[] {
					new ModuleCall("C",
						"manager", new int[] {115,8,115,47},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								new Variable(Type.STRING, "sender"),
								Primitive.newPrimitive(" message received")
							)
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
						"manager", new int[] {116,8,123,5},
						new Predicate("buildStarted", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new BeliefUpdate('+',
						"manager", new int[] {117,8,123,5},
						new Predicate("buildStarted", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new BeliefUpdate('-',
						"manager", new int[] {118,8,123,5},
						new Predicate("busySCVs", new Term[] {
							new Variable(Type.LIST, "busySCVs")
						})
					),
					new If(
						"manager", new int[] {119,8,123,5},
						new ModuleFormula("P",
							new Predicate("contains", new Term[] {
								new Variable(Type.LIST, "busySCVs"),
								new Variable(Type.STRING, "sender")
							}),
						new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.Prelude) visitor.agent().getModule("manager","P")).contains(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
										(java.lang.String) visitor.evaluate(predicate.getTerm(1))
									);
							}
						}
							),
						new Block(
							"manager", new int[] {119,41,121,9},
							new Statement[] {
								new ModuleCall("lists",
									"manager", new int[] {120,12,120,42},
									new Predicate("remove", new Term[] {
										new Variable(Type.LIST, "busySCVs"),
										new Variable(Type.STRING, "sender")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((modules.Lists) intention.getModule("manager","lists")).remove(
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
						"manager", new int[] {122,8,123,5},
						new Predicate("busySCVs", new Term[] {
							new Variable(Type.LIST, "busySCVs")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"manager", new int[] {125,9,125,97},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("explore", new Term[] {
					new Variable(Type.INTEGER, "x",false),
					new Variable(Type.INTEGER, "y",false)
				})
			),
			new Predicate("newBase", new Term[] {
				new Variable(Type.INTEGER, "prevX",false),
				new Variable(Type.INTEGER, "prevY",false)
			}),
			new Block(
				"manager", new int[] {125,96,128,5},
				new Statement[] {
					new BeliefUpdate('-',
						"manager", new int[] {126,8,128,5},
						new Predicate("newBase", new Term[] {
							new Variable(Type.INTEGER, "prevX"),
							new Variable(Type.INTEGER, "prevY")
						})
					),
					new BeliefUpdate('+',
						"manager", new int[] {127,8,128,5},
						new Predicate("newBase", new Term[] {
							new Variable(Type.INTEGER, "x"),
							new Variable(Type.INTEGER, "y")
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
			new Predicate("busySCVs", new Term[] {
				new ListTerm(new Term[] {

				})
			})
		);
		agent.initialize(
			new Predicate("partyFormed", new Term[] {
				Primitive.newPrimitive(false)
			})
		);
		agent.initialize(
			new Predicate("newBase", new Term[] {
				Primitive.newPrimitive(0),
				Primitive.newPrimitive(0)
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("eis",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("S",astra.lang.System.class,agent);
		fragment.addModule("P",astra.lang.Prelude.class,agent);
		fragment.addModule("M",astra.lang.Math.class,agent);
		fragment.addModule("messaging",astra.lang.Messaging.class,agent);
		fragment.addModule("lists",modules.Lists.class,agent);
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
