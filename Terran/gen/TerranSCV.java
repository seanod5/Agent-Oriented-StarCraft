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
			"TerranSCV", new int[] {40,9,40,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"TerranSCV", new int[] {40,18,46,5},
				new Statement[] {
					new ModuleCall("eis",
						"TerranSCV", new int[] {41,8,41,29},
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
						"TerranSCV", new int[] {42,8,42,18},
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
						"TerranSCV", new int[] {43,8,43,32},
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
						"TerranSCV", new int[] {45,8,46,5},
						new Goal(
							new Predicate("gatherMinerals", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"TerranSCV", new int[] {48,9,48,57},
			new GoalEvent('+',
				new Goal(
					new Predicate("gatherMinerals", new Term[] {})
				)
			),
			new Predicate("availableMinerals", new Term[] {
				new Variable(Type.LIST, "L",false)
			}),
			new Block(
				"TerranSCV", new int[] {48,56,51,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.INTEGER, "ID"),
						"TerranSCV", new int[] {49,8,51,5},
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
						"TerranSCV", new int[] {50,8,50,22},
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
			"TerranSCV", new int[] {53,9,53,29},
			new GoalEvent('+',
				new Goal(
					new Predicate("gatherMinerals", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"TerranSCV", new int[] {53,28,55,5},
				new Statement[] {
					new Subgoal(
						"TerranSCV", new int[] {54,8,55,5},
						new Goal(
							new Predicate("gatherMinerals", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"TerranSCV", new int[] {57,9,57,55},
			new GoalEvent('+',
				new Goal(
					new Predicate("gatherVespene", new Term[] {})
				)
			),
			new Predicate("availableVespene", new Term[] {
				new Variable(Type.LIST, "L",false)
			}),
			new Block(
				"TerranSCV", new int[] {57,54,60,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.INTEGER, "ID"),
						"TerranSCV", new int[] {58,8,60,5},
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
						"TerranSCV", new int[] {59,8,59,22},
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
			"TerranSCV", new int[] {62,9,62,122},
			new GoalEvent('+',
				new Goal(
					new Predicate("buildStructure", new Term[] {
						new Variable(Type.STRING, "structure",false),
						new Variable(Type.STRING, "sender",false)
					})
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
				"TerranSCV", new int[] {62,121,73,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.INTEGER, "x"),
						"TerranSCV", new int[] {63,8,73,5},
						new ModuleTerm("P", Type.INTEGER,
							new Predicate("headAsInt", new Term[] {
								new Variable(Type.LIST, "sitesX")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.Prelude) intention.getModule("TerranSCV","P")).headAsInt(
										(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.Prelude) visitor.agent().getModule("TerranSCV","P")).headAsInt(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new Declaration(
						new Variable(Type.INTEGER, "y"),
						"TerranSCV", new int[] {64,8,73,5},
						new ModuleTerm("P", Type.INTEGER,
							new Predicate("headAsInt", new Term[] {
								new Variable(Type.LIST, "sitesY")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.Prelude) intention.getModule("TerranSCV","P")).headAsInt(
										(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.Prelude) visitor.agent().getModule("TerranSCV","P")).headAsInt(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new Declaration(
						new Variable(Type.LIST, "newX"),
						"TerranSCV", new int[] {65,8,73,5},
						new Variable(Type.LIST, "sitesX")
					),
					new Declaration(
						new Variable(Type.LIST, "newY"),
						"TerranSCV", new int[] {66,8,73,5},
						new Variable(Type.LIST, "sitesY")
					),
					new ModuleCall("eis",
						"TerranSCV", new int[] {67,8,67,34},
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
					),
					new ModuleCall("C",
						"TerranSCV", new int[] {68,8,68,32},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Before wait")
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
					new Wait(
						"TerranSCV", new int[] {69,8,73,5},
						new Predicate("constructing", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new ModuleCall("C",
						"TerranSCV", new int[] {70,8,70,31},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("After wait")
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
					new Send("TerranSCV", new int[] {71,8,71,59},
						new Performative("inform"),
						new Variable(Type.STRING, "sender"),
						new Predicate("content", new Term[] {
							Primitive.newPrimitive("Supply Depot Built")
						})
					),
					new Subgoal(
						"TerranSCV", new int[] {72,8,73,5},
						new Goal(
							new Predicate("gatherMinerals", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"TerranSCV", new int[] {75,9,75,115},
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
				"TerranSCV", new int[] {75,114,80,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "new"),
						"TerranSCV", new int[] {76,8,80,5},
						new Variable(Type.LIST, "prev")
					),
					new ModuleCall("P",
						"TerranSCV", new int[] {77,8,77,22},
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
						"TerranSCV", new int[] {78,8,80,5},
						new Predicate("availableMinerals", new Term[] {
							new Variable(Type.LIST, "prev")
						})
					),
					new BeliefUpdate('+',
						"TerranSCV", new int[] {79,8,80,5},
						new Predicate("availableMinerals", new Term[] {
							new Variable(Type.LIST, "new")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"TerranSCV", new int[] {82,9,82,115},
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
				"TerranSCV", new int[] {82,114,87,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "new"),
						"TerranSCV", new int[] {83,8,87,5},
						new Variable(Type.LIST, "prev")
					),
					new ModuleCall("P",
						"TerranSCV", new int[] {84,8,84,22},
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
						"TerranSCV", new int[] {85,8,87,5},
						new Predicate("availableVespene", new Term[] {
							new Variable(Type.LIST, "prev")
						})
					),
					new BeliefUpdate('+',
						"TerranSCV", new int[] {86,8,87,5},
						new Predicate("availableVespene", new Term[] {
							new Variable(Type.LIST, "new")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"TerranSCV", new int[] {89,9,89,114},
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
						return ((astra.lang.EIS) agent.getModule("TerranSCV","eis")).event(
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
				"TerranSCV", new int[] {89,113,98,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "newX"),
						"TerranSCV", new int[] {90,8,98,5},
						new Variable(Type.LIST, "prevX")
					),
					new Declaration(
						new Variable(Type.LIST, "newY"),
						"TerranSCV", new int[] {91,8,98,5},
						new Variable(Type.LIST, "prevY")
					),
					new ModuleCall("P",
						"TerranSCV", new int[] {92,8,92,22},
						new Predicate("add", new Term[] {
							new Variable(Type.LIST, "newX"),
							new Variable(Type.INTEGER, "x")
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
					new ModuleCall("P",
						"TerranSCV", new int[] {93,8,93,22},
						new Predicate("add", new Term[] {
							new Variable(Type.LIST, "newY"),
							new Variable(Type.INTEGER, "y")
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
						"TerranSCV", new int[] {94,8,98,5},
						new Predicate("constructSitesX", new Term[] {
							new Variable(Type.LIST, "prevX")
						})
					),
					new BeliefUpdate('+',
						"TerranSCV", new int[] {95,8,98,5},
						new Predicate("constructSitesX", new Term[] {
							new Variable(Type.LIST, "newX")
						})
					),
					new BeliefUpdate('-',
						"TerranSCV", new int[] {96,8,98,5},
						new Predicate("constructSitesY", new Term[] {
							new Variable(Type.LIST, "prevY")
						})
					),
					new BeliefUpdate('+',
						"TerranSCV", new int[] {97,8,98,5},
						new Predicate("constructSitesY", new Term[] {
							new Variable(Type.LIST, "newY")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"TerranSCV", new int[] {100,9,100,134},
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
						return ((astra.lang.EIS) agent.getModule("TerranSCV","eis")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new Predicate("constructing", new Term[] {
				new Variable(Type.BOOLEAN, "constructing",false)
			}),
			new Block(
				"TerranSCV", new int[] {100,133,118,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.BOOLEAN, "flag"),
						"TerranSCV", new int[] {101,8,118,5},
						Primitive.newPrimitive(false)
					),
					new ForAll(
						"TerranSCV", new int[] {102,8,102,45},
						new Variable(Type.STRING, "condition",false),
						new Variable(Type.LIST, "conditions"),
						new Block(
							"TerranSCV", new int[] {102,46,118,5},
							new Statement[] {
								new If(
									"TerranSCV", new int[] {103,12,106,9},
									new Comparison("==",
										new Variable(Type.STRING, "condition"),
										Primitive.newPrimitive("constructing")
									),
									new Block(
										"TerranSCV", new int[] {103,44,105,13},
										new Statement[] {
											new Assignment(
												new Variable(Type.BOOLEAN, "flag"),
												"TerranSCV", new int[] {104,16,105,13},
												Primitive.newPrimitive(true)
											)
										}
									)
								)
							}
						)
					),
					new If(
						"TerranSCV", new int[] {108,8,118,5},
						new AND(
							new BracketFormula(
								new Comparison("==",
									new Variable(Type.BOOLEAN, "flag"),
									Primitive.newPrimitive(true)
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
							"TerranSCV", new int[] {108,53,112,9},
							new Statement[] {
								new BeliefUpdate('-',
									"TerranSCV", new int[] {109,12,112,9},
									new Predicate("constructing", new Term[] {
										Primitive.newPrimitive(false)
									})
								),
								new BeliefUpdate('+',
									"TerranSCV", new int[] {110,12,112,9},
									new Predicate("constructing", new Term[] {
										Primitive.newPrimitive(true)
									})
								),
								new ModuleCall("C",
									"TerranSCV", new int[] {111,12,111,43},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("Construction begun")
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
								)
							}
						),
						new If(
							"TerranSCV", new int[] {113,13,118,5},
							new AND(
								new BracketFormula(
									new Comparison("==",
										new Variable(Type.BOOLEAN, "flag"),
										Primitive.newPrimitive(false)
									)
								),
								new BracketFormula(
									new Comparison("==",
										new Variable(Type.BOOLEAN, "constructing"),
										Primitive.newPrimitive(true)
									)
								)
							),
							new Block(
								"TerranSCV", new int[] {113,59,117,9},
								new Statement[] {
									new BeliefUpdate('-',
										"TerranSCV", new int[] {114,12,117,9},
										new Predicate("constructing", new Term[] {
											Primitive.newPrimitive(true)
										})
									),
									new BeliefUpdate('+',
										"TerranSCV", new int[] {115,12,117,9},
										new Predicate("constructing", new Term[] {
											Primitive.newPrimitive(false)
										})
									),
									new ModuleCall("C",
										"TerranSCV", new int[] {116,12,116,47},
										new Predicate("println", new Term[] {
											Primitive.newPrimitive("Construction completed")
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
									)
								}
							)
						)
					)
				}
			)
		));
		addRule(new Rule(
			"TerranSCV", new int[] {120,9,120,67},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("content", new Term[] {
					new Variable(Type.STRING, "content",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"TerranSCV", new int[] {120,66,123,5},
				new Statement[] {
					new ModuleCall("C",
						"TerranSCV", new int[] {121,8,121,78},
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
						"TerranSCV", new int[] {122,8,123,5},
						new Goal(
							new Predicate("buildStructure", new Term[] {
								new Variable(Type.STRING, "content"),
								new Variable(Type.STRING, "sender")
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
			new Predicate("condition", new Term[] {
				new ListTerm(new Term[] {

				})
			})
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
		agent.initialize(
			new Predicate("constructing", new Term[] {
				Primitive.newPrimitive(false)
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
