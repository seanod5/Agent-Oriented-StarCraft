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
			"Player", new int[] {23,9,23,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {23,27,58,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.BOOLEAN, "matchFlag"),
						"Player", new int[] {24,8,58,5},
						Primitive.newPrimitive(false)
					),
					new ModuleCall("eis",
						"Player", new int[] {25,8,25,53},
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
						"Player", new int[] {26,8,26,18},
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
						"Player", new int[] {27,8,27,141},
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
						"Player", new int[] {28,8,28,22},
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
						"Player", new int[] {29,8,29,27},
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
						"Player", new int[] {30,8,30,34},
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
					new ModuleCall("C",
						"Player", new int[] {31,8,31,57},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Free entities: "),
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
					new ModuleCall("C",
						"Player", new int[] {32,8,32,55},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("All entities: "),
								new ModuleTerm("eis", Type.LIST,
									new Predicate("allEntities", new Term[] {}),
									new ModuleTermAdaptor() {
										public Object invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.EIS) intention.getModule("Player","eis")).allEntities(
											);
										}
										public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
											return ((astra.lang.EIS) visitor.agent().getModule("Player","eis")).allEntities(
											);
										}
									}
								)
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
						new Variable(Type.LIST, "freeEntities"),
						"Player", new int[] {34,8,58,5},
						new ListTerm(new Term[] {

						})
					),
					new While(
						"Player", new int[] {35,8,58,5},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "matchFlag"),
							Primitive.newPrimitive(false)
						),
						new Block(
							"Player", new int[] {35,34,40,9},
							new Statement[] {
								new Assignment(
									new Variable(Type.LIST, "freeEntities"),
									"Player", new int[] {36,12,40,9},
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
									"Player", new int[] {37,12,40,9},
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
										"Player", new int[] {37,46,39,13},
										new Statement[] {
											new Assignment(
												new Variable(Type.BOOLEAN, "matchFlag"),
												"Player", new int[] {38,16,39,13},
												Primitive.newPrimitive(true)
											)
										}
									)
								)
							}
						)
					),
					new ModuleCall("P",
						"Player", new int[] {42,8,42,32},
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
						"Player", new int[] {43,8,43,20},
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
					new ModuleCall("C",
						"Player", new int[] {44,8,44,47},
						new Predicate("println", new Term[] {
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
					new ModuleCall("S",
						"Player", new int[] {45,8,45,74},
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
					new Declaration(
						new Variable(Type.LIST, "SCVs"),
						"Player", new int[] {47,8,58,5},
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
						"Player", new int[] {49,8,49,32},
						new Variable(Type.STRING, "ID",false),
						new Variable(Type.LIST, "SCVs"),
						new Block(
							"Player", new int[] {49,33,58,5},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {50,12,50,25},
									new Predicate("println", new Term[] {
										new Variable(Type.STRING, "ID")
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
								new ModuleCall("S",
									"Player", new int[] {51,12,51,42},
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
									"Player", new int[] {52,12,52,24},
									new Predicate("sleep", new Term[] {
										Primitive.newPrimitive(1000)
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
						"Player", new int[] {55,8,58,5},
						Predicate.TRUE,
						new Block(
							"Player", new int[] {55,20,57,9},
							new Statement[] {
								new Subgoal(
									"Player", new int[] {56,12,57,9},
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
			"Player", new int[] {60,9,60,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("play", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {60,18,70,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "freeEntities"),
						"Player", new int[] {61,8,70,5},
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
						"Player", new int[] {62,8,62,40},
						new Variable(Type.STRING, "ID",false),
						new Variable(Type.LIST, "freeEntities"),
						new Block(
							"Player", new int[] {62,41,70,5},
							new Statement[] {
								new If(
									"Player", new int[] {63,12,69,9},
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
										"Player", new int[] {63,53,65,13},
										new Statement[] {
											new ModuleCall("S",
												"Player", new int[] {64,16,64,46},
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
									"Player", new int[] {66,12,69,9},
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
										"Player", new int[] {66,63,68,13},
										new Statement[] {
											new ModuleCall("S",
												"Player", new int[] {67,16,67,56},
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
		));
		addRule(new Rule(
			"Player", new int[] {72,9,72,92},
			new GoalEvent('+',
				new Goal(
					new Predicate("buildSupplyDepot", new Term[] {})
				)
			),
			new AND(
				new Predicate("constructSitesX", new Term[] {
					new Variable(Type.LIST, "sitesX",false)
				}),
				new Predicate("constructSitesY", new Term[] {
					new Variable(Type.LIST, "sitesY",false)
				})
			),
			new Block(
				"Player", new int[] {72,91,91,5},
				new Statement[] {
					new ModuleCall("C",
						"Player", new int[] {73,8,73,32},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Building SD")
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
						new Variable(Type.LIST, "allEntities"),
						"Player", new int[] {74,8,91,5},
						new ModuleTerm("eis", Type.LIST,
							new Predicate("allEntities", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.EIS) intention.getModule("Player","eis")).allEntities(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Player","eis")).allEntities(
									);
								}
							}
						)
					),
					new Declaration(
						new Variable(Type.BOOLEAN, "flag"),
						"Player", new int[] {75,8,91,5},
						Primitive.newPrimitive(false)
					),
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"Player", new int[] {76,8,91,5},
						Primitive.newPrimitive(0)
					),
					new Declaration(
						new Variable(Type.STRING, "ID"),
						"Player", new int[] {77,8,91,5}
					),
					new While(
						"Player", new int[] {78,8,91,5},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "flag"),
							Primitive.newPrimitive(false)
						),
						new Block(
							"Player", new int[] {78,29,84,9},
							new Statement[] {
								new Assignment(
									new Variable(Type.STRING, "ID"),
									"Player", new int[] {79,12,84,9},
									new ModuleTerm("P", Type.STRING,
										new Predicate("valueAsString", new Term[] {
											new Variable(Type.LIST, "allEntities"),
											new Variable(Type.INTEGER, "i")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Prelude) intention.getModule("Player","P")).valueAsString(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
													(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Prelude) visitor.agent().getModule("Player","P")).valueAsString(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
													(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
												);
											}
										}
									)
								),
								new If(
									"Player", new int[] {80,12,84,9},
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
										"Player", new int[] {80,53,82,13},
										new Statement[] {
											new Assignment(
												new Variable(Type.BOOLEAN, "flag"),
												"Player", new int[] {81,16,82,13},
												Primitive.newPrimitive(true)
											)
										}
									)
								),
								new PlusPlus(
									new Variable(Type.INTEGER, "i"),
									"Player", new int[] {83,12,83,15}
								)
							}
						)
					),
					new Declaration(
						new Variable(Type.INTEGER, "x"),
						"Player", new int[] {86,8,91,5},
						new ModuleTerm("P", Type.INTEGER,
							new Predicate("headAsInt", new Term[] {
								new Variable(Type.LIST, "sitesX")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.Prelude) intention.getModule("Player","P")).headAsInt(
										(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.Prelude) visitor.agent().getModule("Player","P")).headAsInt(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new Declaration(
						new Variable(Type.INTEGER, "y"),
						"Player", new int[] {87,8,91,5},
						new ModuleTerm("P", Type.INTEGER,
							new Predicate("headAsInt", new Term[] {
								new Variable(Type.LIST, "sitesY")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.Prelude) intention.getModule("Player","P")).headAsInt(
										(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.Prelude) visitor.agent().getModule("Player","P")).headAsInt(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new Send("Player", new int[] {88,8,88,60},
						new Performative("inform"),
						new Variable(Type.STRING, "ID"),
						new Predicate("content", new Term[] {
							Primitive.newPrimitive("terranSupplyDepot"),
							new Variable(Type.INTEGER, "x"),
							new Variable(Type.INTEGER, "y")
						})
					),
					new ModuleCall("C",
						"Player", new int[] {89,8,89,34},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Message sent.")
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
					new Subgoal(
						"Player", new int[] {90,8,91,5},
						new Goal(
							new Predicate("play", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {93,9,93,147},
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
						return ((astra.lang.EIS) agent.getModule("Player","eis")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new AND(
				new Predicate("minerals", new Term[] {
					new Variable(Type.INTEGER, "mins",false)
				}),
				new AND(
					new Predicate("currentSupply", new Term[] {
						new Variable(Type.INTEGER, "prevCS",false)
					}),
					new Predicate("totalSupply", new Term[] {
						new Variable(Type.INTEGER, "prevTS",false)
					})
				)
			),
			new Block(
				"Player", new int[] {93,146,100,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Player", new int[] {94,8,100,5},
						new Predicate("currentSupply", new Term[] {
							new Variable(Type.INTEGER, "prevCS")
						})
					),
					new BeliefUpdate('-',
						"Player", new int[] {95,8,100,5},
						new Predicate("totalSupply", new Term[] {
							new Variable(Type.INTEGER, "prevTS")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {96,8,100,5},
						new Predicate("currentSupply", new Term[] {
							new Variable(Type.INTEGER, "CS")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {97,8,100,5},
						new Predicate("totalSupply", new Term[] {
							new Variable(Type.INTEGER, "TS")
						})
					),
					new BeliefUpdate('-',
						"Player", new int[] {98,8,100,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "mins")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {99,8,100,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "minerals")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {106,9,106,114},
			new ModuleEvent("eis",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("constructionSite", new Term[] {
						new Variable(Type.INTEGER, "x",false),
						new Variable(Type.INTEGER, "y",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("Player","eis")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new AND(
				new Predicate("constructSitesX", new Term[] {
					new Variable(Type.LIST, "prevX",false)
				}),
				new Predicate("constructSitesY", new Term[] {
					new Variable(Type.LIST, "prevY",false)
				})
			),
			new Block(
				"Player", new int[] {106,113,113,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "newX"),
						"Player", new int[] {107,8,113,5},
						new Variable(Type.LIST, "prevX")
					),
					new Declaration(
						new Variable(Type.LIST, "newY"),
						"Player", new int[] {108,8,113,5},
						new Variable(Type.LIST, "prevY")
					),
					new BeliefUpdate('-',
						"Player", new int[] {109,8,113,5},
						new Predicate("constructSitesX", new Term[] {
							new Variable(Type.LIST, "prevX")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {110,8,113,5},
						new Predicate("constructSitesX", new Term[] {
							new Variable(Type.LIST, "newX")
						})
					),
					new BeliefUpdate('-',
						"Player", new int[] {111,8,113,5},
						new Predicate("constructSitesY", new Term[] {
							new Variable(Type.LIST, "prevY")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {112,8,113,5},
						new Predicate("constructSitesY", new Term[] {
							new Variable(Type.LIST, "newY")
						})
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
		agent.initialize(
			new Predicate("constructSitesX", new Term[] {
				new ListTerm(new Term[] {

				})
			})
		);
		agent.initialize(
			new Predicate("constructSitesY", new Term[] {
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
