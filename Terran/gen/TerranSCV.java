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


public class terranSCV extends ASTRAClass {
	public terranSCV() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"terranSCV", new int[] {33,9,33,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranSCV", new int[] {33,18,37,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranSCV", new int[] {34,8,34,29},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("starcraft")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranSCV","eis")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("eis",
						"terranSCV", new int[] {35,8,35,18},
						new Predicate("link", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranSCV","eis")).link(
								);
							}
						}
					),
					new ModuleCall("C",
						"terranSCV", new int[] {36,8,36,32},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("SCV online.")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("terranSCV","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"terranSCV", new int[] {39,9,39,68},
			new GoalEvent('+',
				new Goal(
					new Predicate("gatherMinerals", new Term[] {})
				)
			),
			new AND(
				new Predicate("busy", new Term[] {
					new Variable(Type.BOOLEAN, "busy",false)
				}),
				new BracketFormula(
					new Comparison("==",
						new Variable(Type.BOOLEAN, "busy"),
						Primitive.newPrimitive(false)
					)
				)
			),
			new Block(
				"terranSCV", new int[] {39,67,42,5},
				new Statement[] {
					new Query(
						"terranSCV", new int[] {40,8,40,79},
						new ModuleFormula("eis",
							new Predicate("mineralField", new Term[] {
								new Variable(Type.INTEGER, "ID",false),
								new Variable(Type.INTEGER, "resources",false),
								new Variable(Type.INTEGER, "group",false),
								new Variable(Type.INTEGER, "x",false),
								new Variable(Type.INTEGER, "y",false)
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("terranSCV","eis")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new ModuleCall("eis",
						"terranSCV", new int[] {41,8,41,22},
						new Predicate("gather", new Term[] {
							new Variable(Type.INTEGER, "ID")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranSCV","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"terranSCV", new int[] {44,9,44,31},
			new GoalEvent('+',
				new Goal(
					new Predicate("gatherVespeneGas", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranSCV", new int[] {44,30,47,5},
				new Statement[] {
					new Query(
						"terranSCV", new int[] {45,8,45,80},
						new ModuleFormula("eis",
							new Predicate("vespeneGeyser", new Term[] {
								new Variable(Type.INTEGER, "ID",false),
								new Variable(Type.INTEGER, "resources",false),
								new Variable(Type.INTEGER, "group",false),
								new Variable(Type.INTEGER, "x",false),
								new Variable(Type.INTEGER, "y",false)
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("terranSCV","eis")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new ModuleCall("eis",
						"terranSCV", new int[] {46,8,46,22},
						new Predicate("gather", new Term[] {
							new Variable(Type.INTEGER, "ID")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranSCV","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"terranSCV", new int[] {49,9,49,35},
			new GoalEvent('+',
				new Goal(
					new Predicate("buildVespeneRefinery", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranSCV", new int[] {49,34,59,5},
				new Statement[] {
					new Wait(
						"terranSCV", new int[] {50,8,59,5},
						new AND(
							new BracketFormula(
								new Predicate("minerals", new Term[] {
									new Variable(Type.INTEGER, "m",false)
								})
							),
							new BracketFormula(
								new Comparison(">=",
									new Variable(Type.INTEGER, "m"),
									Primitive.newPrimitive(100)
								)
							)
						)
					),
					new Query(
						"terranSCV", new int[] {51,8,51,80},
						new ModuleFormula("eis",
							new Predicate("vespeneGeyser", new Term[] {
								new Variable(Type.INTEGER, "ID",false),
								new Variable(Type.INTEGER, "resources",false),
								new Variable(Type.INTEGER, "group",false),
								new Variable(Type.INTEGER, "x",false),
								new Variable(Type.INTEGER, "y",false)
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("terranSCV","eis")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new ModuleCall("C",
						"terranSCV", new int[] {52,8,52,65},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Building Vespene Refinery at "),
								Operator.newOperator('+',
									new Variable(Type.INTEGER, "x"),
									Operator.newOperator('+',
										Primitive.newPrimitive(", "),
										new Variable(Type.INTEGER, "y")
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("terranSCV","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("eis",
						"terranSCV", new int[] {53,8,53,18},
						new Predicate("stop", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranSCV","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new ModuleCall("eis",
						"terranSCV", new int[] {54,8,54,42},
						new Predicate("build", new Term[] {
							Primitive.newPrimitive("Terran Refinery"),
							new Variable(Type.INTEGER, "x"),
							new Variable(Type.INTEGER, "y")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranSCV","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"terranSCV", new int[] {55,8,59,5},
						new AND(
							new BracketFormula(
								new Predicate("conditions", new Term[] {
									new Variable(Type.LIST, "conds",false)
								})
							),
							new BracketFormula(
								new NOT(
									new ModuleFormula("P",
										new Predicate("contains", new Term[] {
											new Variable(Type.LIST, "conds"),
											Primitive.newPrimitive("constructing")
										}),
									new ModuleFormulaAdaptor() {
											public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Prelude) visitor.agent().getModule("terranSCV","P")).contains(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
													(java.lang.String) visitor.evaluate(predicate.getTerm(1))
												);
										}
									}
										)
								)
							)
						)
					),
					new BeliefUpdate('-',
						"terranSCV", new int[] {56,8,59,5},
						new Predicate("busy", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new BeliefUpdate('+',
						"terranSCV", new int[] {57,8,59,5},
						new Predicate("busy", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new Send("terranSCV", new int[] {58,8,58,60},
						new Performative("inform"),
						new ModuleTerm("S", Type.STRING,
							new Predicate("getOwner", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.System) intention.getModule("terranSCV","S")).getOwner(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.System) visitor.agent().getModule("terranSCV","S")).getOwner(
									);
								}
							}
						),
						new Predicate("built", new Term[] {
							Primitive.newPrimitive("Terran Refinery")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranSCV", new int[] {61,9,61,67},
			new GoalEvent('+',
				new Goal(
					new Predicate("buildStructure", new Term[] {
						new Variable(Type.STRING, "structure",false),
						new Variable(Type.INTEGER, "mCost",false),
						new Variable(Type.INTEGER, "gCost",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranSCV", new int[] {61,66,75,5},
				new Statement[] {
					new Wait(
						"terranSCV", new int[] {62,8,75,5},
						new AND(
							new BracketFormula(
								new Predicate("minerals", new Term[] {
									new Variable(Type.INTEGER, "m",false)
								})
							),
							new AND(
								new BracketFormula(
									new Comparison(">=",
										new Variable(Type.INTEGER, "m"),
										new Variable(Type.INTEGER, "mCost")
									)
								),
								new AND(
									new BracketFormula(
										new Predicate("vespeneGas", new Term[] {
											new Variable(Type.INTEGER, "g",false)
										})
									),
									new BracketFormula(
										new Comparison(">=",
											new Variable(Type.INTEGER, "g"),
											new Variable(Type.INTEGER, "gCost")
										)
									)
								)
							)
						)
					),
					new Query(
						"terranSCV", new int[] {63,8,63,49},
						new ModuleFormula("eis",
							new Predicate("constructionSite", new Term[] {
								new Variable(Type.INTEGER, "x",false),
								new Variable(Type.INTEGER, "y",false)
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("terranSCV","eis")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new ModuleCall("C",
						"terranSCV", new int[] {64,8,64,66},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Building "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "structure"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" at "),
										Operator.newOperator('+',
											new Variable(Type.INTEGER, "x"),
											Operator.newOperator('+',
												Primitive.newPrimitive(", "),
												new Variable(Type.INTEGER, "y")
											)
										)
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("terranSCV","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("eis",
						"terranSCV", new int[] {65,8,65,18},
						new Predicate("stop", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranSCV","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new ModuleCall("eis",
						"terranSCV", new int[] {66,8,66,34},
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
								return ((astra.lang.EIS) intention.getModule("terranSCV","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"terranSCV", new int[] {67,8,75,5},
						new AND(
							new BracketFormula(
								new Predicate("conditions", new Term[] {
									new Variable(Type.LIST, "conds1",false)
								})
							),
							new BracketFormula(
								new ModuleFormula("P",
									new Predicate("contains", new Term[] {
										new Variable(Type.LIST, "conds1"),
										Primitive.newPrimitive("constructing")
									}),
								new ModuleFormulaAdaptor() {
										public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
											return ((astra.lang.Prelude) visitor.agent().getModule("terranSCV","P")).contains(
												(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
												(java.lang.String) visitor.evaluate(predicate.getTerm(1))
											);
									}
								}
									)
							)
						)
					),
					new ModuleCall("C",
						"terranSCV", new int[] {68,8,68,32},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("building...")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("terranSCV","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Send("terranSCV", new int[] {69,8,69,55},
						new Performative("inform"),
						new ModuleTerm("S", Type.STRING,
							new Predicate("getOwner", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.System) intention.getModule("terranSCV","S")).getOwner(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.System) visitor.agent().getModule("terranSCV","S")).getOwner(
									);
								}
							}
						),
						new Predicate("building", new Term[] {
							new Variable(Type.STRING, "structure")
						})
					),
					new Wait(
						"terranSCV", new int[] {70,8,75,5},
						new AND(
							new BracketFormula(
								new Predicate("conditions", new Term[] {
									new Variable(Type.LIST, "conds2",false)
								})
							),
							new BracketFormula(
								new NOT(
									new ModuleFormula("P",
										new Predicate("contains", new Term[] {
											new Variable(Type.LIST, "conds2"),
											Primitive.newPrimitive("constructing")
										}),
									new ModuleFormulaAdaptor() {
											public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Prelude) visitor.agent().getModule("terranSCV","P")).contains(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
													(java.lang.String) visitor.evaluate(predicate.getTerm(1))
												);
										}
									}
										)
								)
							)
						)
					),
					new ModuleCall("C",
						"terranSCV", new int[] {71,8,71,27},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("built!")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("terranSCV","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"terranSCV", new int[] {72,8,75,5},
						new Predicate("busy", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new BeliefUpdate('+',
						"terranSCV", new int[] {73,8,75,5},
						new Predicate("busy", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new Send("terranSCV", new int[] {74,8,74,54},
						new Performative("inform"),
						new ModuleTerm("S", Type.STRING,
							new Predicate("getOwner", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.System) intention.getModule("terranSCV","S")).getOwner(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.System) visitor.agent().getModule("terranSCV","S")).getOwner(
									);
								}
							}
						),
						new Predicate("built", new Term[] {
							new Brackets(
								new Variable(Type.STRING, "structure")
							)
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranSCV", new int[] {77,9,77,147},
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
						return ((astra.lang.EIS) agent.getModule("terranSCV","eis")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new AND(
				new Predicate("conditions", new Term[] {
					new Variable(Type.LIST, "prevConds",false)
				}),
				new Predicate("busy", new Term[] {
					new Variable(Type.BOOLEAN, "busy",false)
				})
			),
			new Block(
				"terranSCV", new int[] {77,146,84,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranSCV", new int[] {78,8,84,5},
						new Predicate("conditions", new Term[] {
							new Variable(Type.LIST, "prevConds")
						})
					),
					new BeliefUpdate('+',
						"terranSCV", new int[] {79,8,84,5},
						new Predicate("conditions", new Term[] {
							new Variable(Type.LIST, "conditions")
						})
					),
					new If(
						"terranSCV", new int[] {81,8,84,5},
						new AND(
							new ModuleFormula("P",
								new Predicate("contains", new Term[] {
									new Variable(Type.LIST, "conditions"),
									Primitive.newPrimitive("idle")
								}),
							new ModuleFormulaAdaptor() {
									public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.Prelude) visitor.agent().getModule("terranSCV","P")).contains(
											(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
											(java.lang.String) visitor.evaluate(predicate.getTerm(1))
										);
								}
							}
								),
							new BracketFormula(
								new Comparison("==",
									new Variable(Type.BOOLEAN, "busy"),
									Primitive.newPrimitive(false)
								)
							)
						),
						new Block(
							"terranSCV", new int[] {81,61,83,9},
							new Statement[] {
								new Subgoal(
									"terranSCV", new int[] {82,12,83,9},
									new Goal(
										new Predicate("gatherMinerals", new Term[] {})
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"terranSCV", new int[] {86,9,86,118},
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
						return ((astra.lang.EIS) agent.getModule("terranSCV","eis")).event(
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
				"terranSCV", new int[] {86,117,91,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranSCV", new int[] {87,8,91,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "prevM")
						})
					),
					new BeliefUpdate('-',
						"terranSCV", new int[] {88,8,91,5},
						new Predicate("vespeneGas", new Term[] {
							new Variable(Type.INTEGER, "prevG")
						})
					),
					new BeliefUpdate('+',
						"terranSCV", new int[] {89,8,91,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "minerals")
						})
					),
					new BeliefUpdate('+',
						"terranSCV", new int[] {90,8,91,5},
						new Predicate("vespeneGas", new Term[] {
							new Variable(Type.INTEGER, "gas")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranSCV", new int[] {93,9,93,69},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("content", new Term[] {
					new Variable(Type.STRING, "structure",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"terranSCV", new int[] {93,68,104,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranSCV", new int[] {94,8,104,5},
						new Predicate("busy", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new BeliefUpdate('+',
						"terranSCV", new int[] {95,8,104,5},
						new Predicate("busy", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new ModuleCall("eis",
						"terranSCV", new int[] {96,8,96,18},
						new Predicate("stop", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranSCV","eis")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new If(
						"terranSCV", new int[] {97,8,104,5},
						new Comparison("==",
							new Variable(Type.STRING, "structure"),
							Primitive.newPrimitive("Terran Refinery")
						),
						new Block(
							"terranSCV", new int[] {97,43,99,9},
							new Statement[] {
								new Subgoal(
									"terranSCV", new int[] {98,12,99,9},
									new Goal(
										new Predicate("buildVespeneRefinery", new Term[] {})
									)
								)
							}
						),
						new Block(
							"terranSCV", new int[] {100,13,104,5},
							new Statement[] {
								new Declaration(
									new Variable(Type.LIST, "costs"),
									"terranSCV", new int[] {101,12,103,9},
									new ModuleTerm("buildings", Type.LIST,
										new Predicate("cost", new Term[] {
											new Variable(Type.STRING, "structure")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((modules.Buildings) intention.getModule("terranSCV","buildings")).cost(
													(java.lang.String) intention.evaluate(predicate.getTerm(0))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((modules.Buildings) visitor.agent().getModule("terranSCV","buildings")).cost(
													(java.lang.String) visitor.evaluate(predicate.getTerm(0))
												);
											}
										}
									)
								),
								new Subgoal(
									"terranSCV", new int[] {102,12,103,9},
									new Goal(
										new Predicate("buildStructure", new Term[] {
											new Variable(Type.STRING, "structure"),
											new ModuleTerm("P", Type.INTEGER,
												new Predicate("valueAsInt", new Term[] {
													new Variable(Type.LIST, "costs"),
													Primitive.newPrimitive(0)
												}),
												new ModuleTermAdaptor() {
													public Object invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.Prelude) intention.getModule("terranSCV","P")).valueAsInt(
															(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
															(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
														);
													}
													public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
														return ((astra.lang.Prelude) visitor.agent().getModule("terranSCV","P")).valueAsInt(
															(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
															(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
														);
													}
												}
											),
											new ModuleTerm("P", Type.INTEGER,
												new Predicate("valueAsInt", new Term[] {
													new Variable(Type.LIST, "costs"),
													Primitive.newPrimitive(1)
												}),
												new ModuleTermAdaptor() {
													public Object invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.Prelude) intention.getModule("terranSCV","P")).valueAsInt(
															(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
															(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
														);
													}
													public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
														return ((astra.lang.Prelude) visitor.agent().getModule("terranSCV","P")).valueAsInt(
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
					)
				}
			)
		));
		addRule(new Rule(
			"terranSCV", new int[] {106,9,106,65},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("explore", new Term[] {
					new Variable(Type.INTEGER, "x",false),
					new Variable(Type.INTEGER, "y",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"terranSCV", new int[] {106,64,108,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranSCV", new int[] {107,8,107,22},
						new Predicate("move", new Term[] {
							new Variable(Type.INTEGER, "x"),
							new Variable(Type.INTEGER, "y")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("terranSCV","eis")).auto_action(intention,evaluate(intention,predicate));
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
				((astra.lang.EIS) agent.getModule("terranSCV","eis")).sense();
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
			new Predicate("busy", new Term[] {
				Primitive.newPrimitive(false)
			})
		);
		agent.initialize(
			new Predicate("conditions", new Term[] {
				new ListTerm(new Term[] {
					Primitive.newPrimitive("idle")
				})
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("eis",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("P",astra.lang.Prelude.class,agent);
		fragment.addModule("S",astra.lang.System.class,agent);
		fragment.addModule("lists",modules.Lists.class,agent);
		fragment.addModule("buildings",modules.Buildings.class,agent);
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
			astra.core.Agent agent = new terranSCV().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
