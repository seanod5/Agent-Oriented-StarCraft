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
			"terranSCV", new int[] {35,9,35,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranSCV", new int[] {35,18,41,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranSCV", new int[] {36,8,36,29},
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
						"terranSCV", new int[] {37,8,37,18},
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
						"terranSCV", new int[] {38,8,38,32},
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
					),
					new Query(
						"terranSCV", new int[] {39,8,39,104},
						new ModuleFormula("eis",
							new Predicate("unit", new Term[] {
								new Variable(Type.BOOLEAN, "isFriendly",false),
								new Variable(Type.STRING, "type",false),
								new Variable(Type.INTEGER, "ID",false),
								new Variable(Type.INTEGER, "health",false),
								new Variable(Type.INTEGER, "shield",false),
								new Variable(Type.LIST, "condition",false)
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("terranSCV","eis")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"terranSCV", new int[] {43,9,43,68},
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
				"terranSCV", new int[] {43,67,46,5},
				new Statement[] {
					new Query(
						"terranSCV", new int[] {44,8,44,79},
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
						"terranSCV", new int[] {45,8,45,22},
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
			"terranSCV", new int[] {48,9,48,31},
			new GoalEvent('+',
				new Goal(
					new Predicate("gatherVespeneGas", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranSCV", new int[] {48,30,51,5},
				new Statement[] {
					new Query(
						"terranSCV", new int[] {49,8,49,80},
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
						"terranSCV", new int[] {50,8,50,22},
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
			"terranSCV", new int[] {53,9,53,35},
			new GoalEvent('+',
				new Goal(
					new Predicate("buildVespeneRefinery", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"terranSCV", new int[] {53,34,67,5},
				new Statement[] {
					new Wait(
						"terranSCV", new int[] {54,8,67,5},
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
						"terranSCV", new int[] {55,8,55,80},
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
						"terranSCV", new int[] {56,8,56,65},
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
						"terranSCV", new int[] {57,8,57,18},
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
						"terranSCV", new int[] {58,8,58,42},
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
						"terranSCV", new int[] {59,8,67,5},
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
											return ((modules.Prelude2) visitor.agent().getModule("terranSCV","P")).contains(
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
						"terranSCV", new int[] {60,8,60,32},
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
					new Send("terranSCV", new int[] {61,8,61,61},
						new Performative("inform"),
						Primitive.newPrimitive("Building Manager"),
						new Predicate("content", new Term[] {
							Primitive.newPrimitive("Building")
						})
					),
					new Wait(
						"terranSCV", new int[] {62,8,67,5},
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
												return ((modules.Prelude2) visitor.agent().getModule("terranSCV","P")).contains(
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
						"terranSCV", new int[] {63,8,67,5},
						new Predicate("busy", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new BeliefUpdate('+',
						"terranSCV", new int[] {64,8,67,5},
						new Predicate("busy", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new ModuleCall("C",
						"terranSCV", new int[] {65,8,65,42},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("terranRefinery built!")
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
					new Send("terranSCV", new int[] {66,8,66,57},
						new Performative("inform"),
						Primitive.newPrimitive("Building Manager"),
						new Predicate("content", new Term[] {
							Primitive.newPrimitive("Done")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranSCV", new int[] {69,9,69,67},
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
				"terranSCV", new int[] {69,66,84,5},
				new Statement[] {
					new Wait(
						"terranSCV", new int[] {70,8,84,5},
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
						"terranSCV", new int[] {71,8,71,49},
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
						"terranSCV", new int[] {72,8,72,66},
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
						"terranSCV", new int[] {73,8,73,18},
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
						"terranSCV", new int[] {74,8,74,34},
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
						"terranSCV", new int[] {75,8,84,5},
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
											return ((modules.Prelude2) visitor.agent().getModule("terranSCV","P")).contains(
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
						"terranSCV", new int[] {76,8,76,32},
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
					new Send("terranSCV", new int[] {77,8,77,61},
						new Performative("inform"),
						Primitive.newPrimitive("Building Manager"),
						new Predicate("content", new Term[] {
							Primitive.newPrimitive("Building")
						})
					),
					new Wait(
						"terranSCV", new int[] {78,8,84,5},
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
												return ((modules.Prelude2) visitor.agent().getModule("terranSCV","P")).contains(
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
						"terranSCV", new int[] {79,8,84,5},
						new Predicate("busy", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new BeliefUpdate('+',
						"terranSCV", new int[] {80,8,84,5},
						new Predicate("busy", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new ModuleCall("C",
						"terranSCV", new int[] {81,8,81,40},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								new Variable(Type.STRING, "structure"),
								Primitive.newPrimitive(" built!")
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
					new Send("terranSCV", new int[] {82,8,82,57},
						new Performative("inform"),
						Primitive.newPrimitive("Building Manager"),
						new Predicate("content", new Term[] {
							Primitive.newPrimitive("Done")
						})
					),
					new Subgoal(
						"terranSCV", new int[] {83,8,84,5},
						new Goal(
							new Predicate("gatherMinerals", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"terranSCV", new int[] {86,9,86,147},
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
				"terranSCV", new int[] {86,146,93,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranSCV", new int[] {87,8,93,5},
						new Predicate("conditions", new Term[] {
							new Variable(Type.LIST, "prevConds")
						})
					),
					new BeliefUpdate('+',
						"terranSCV", new int[] {88,8,93,5},
						new Predicate("conditions", new Term[] {
							new Variable(Type.LIST, "conditions")
						})
					),
					new If(
						"terranSCV", new int[] {90,8,93,5},
						new AND(
							new ModuleFormula("P",
								new Predicate("contains", new Term[] {
									new Variable(Type.LIST, "conditions"),
									Primitive.newPrimitive("idle")
								}),
							new ModuleFormulaAdaptor() {
									public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((modules.Prelude2) visitor.agent().getModule("terranSCV","P")).contains(
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
							"terranSCV", new int[] {90,61,92,9},
							new Statement[] {
								new Subgoal(
									"terranSCV", new int[] {91,12,92,9},
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
			"terranSCV", new int[] {95,9,95,110},
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
			new Comparison("==",
				new Variable(Type.INTEGER, "health"),
				Primitive.newPrimitive(0)
			),
			new Block(
				"terranSCV", new int[] {95,109,97,5},
				new Statement[] {
					new ModuleCall("S",
						"terranSCV", new int[] {96,8,96,21},
						new Predicate("terminate", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("terranSCV","S")).terminate(
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"terranSCV", new int[] {99,9,99,118},
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
				"terranSCV", new int[] {99,117,104,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranSCV", new int[] {100,8,104,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "prevM")
						})
					),
					new BeliefUpdate('-',
						"terranSCV", new int[] {101,8,104,5},
						new Predicate("vespeneGas", new Term[] {
							new Variable(Type.INTEGER, "prevG")
						})
					),
					new BeliefUpdate('+',
						"terranSCV", new int[] {102,8,104,5},
						new Predicate("minerals", new Term[] {
							new Variable(Type.INTEGER, "minerals")
						})
					),
					new BeliefUpdate('+',
						"terranSCV", new int[] {103,8,104,5},
						new Predicate("vespeneGas", new Term[] {
							new Variable(Type.INTEGER, "gas")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"terranSCV", new int[] {106,9,106,69},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("content", new Term[] {
					new Variable(Type.STRING, "structure",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"terranSCV", new int[] {106,68,117,5},
				new Statement[] {
					new BeliefUpdate('-',
						"terranSCV", new int[] {107,8,117,5},
						new Predicate("busy", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new BeliefUpdate('+',
						"terranSCV", new int[] {108,8,117,5},
						new Predicate("busy", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new ModuleCall("eis",
						"terranSCV", new int[] {109,8,109,18},
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
						"terranSCV", new int[] {110,8,117,5},
						new Comparison("==",
							new Variable(Type.STRING, "structure"),
							Primitive.newPrimitive("Terran Refinery")
						),
						new Block(
							"terranSCV", new int[] {110,43,112,9},
							new Statement[] {
								new Subgoal(
									"terranSCV", new int[] {111,12,112,9},
									new Goal(
										new Predicate("buildVespeneRefinery", new Term[] {})
									)
								)
							}
						),
						new Block(
							"terranSCV", new int[] {113,13,117,5},
							new Statement[] {
								new Declaration(
									new Variable(Type.LIST, "costs"),
									"terranSCV", new int[] {114,12,116,9},
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
									"terranSCV", new int[] {115,12,116,9},
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
														return ((modules.Prelude2) intention.getModule("terranSCV","P")).valueAsInt(
															(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
															(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
														);
													}
													public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
														return ((modules.Prelude2) visitor.agent().getModule("terranSCV","P")).valueAsInt(
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
														return ((modules.Prelude2) intention.getModule("terranSCV","P")).valueAsInt(
															(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
															(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
														);
													}
													public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
														return ((modules.Prelude2) visitor.agent().getModule("terranSCV","P")).valueAsInt(
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
			"terranSCV", new int[] {119,9,119,73},
			new MessageEvent(
				new Performative("inform"),
				Primitive.newPrimitive("Exploration Manager"),
				new Predicate("explore", new Term[] {
					new Variable(Type.INTEGER, "x",false),
					new Variable(Type.INTEGER, "y",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"terranSCV", new int[] {119,72,121,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranSCV", new int[] {120,8,120,22},
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
		addRule(new Rule(
			"terranSCV", new int[] {123,9,123,80},
			new MessageEvent(
				new Performative("inform"),
				Primitive.newPrimitive("Combat Manager"),
				new Predicate("attack", new Term[] {
					new Variable(Type.INTEGER, "ID",false)
				})
			),
			new Predicate("exploring", new Term[] {
				Primitive.newPrimitive(false)
			}),
			new Block(
				"terranSCV", new int[] {123,79,125,5},
				new Statement[] {
					new ModuleCall("eis",
						"terranSCV", new int[] {124,8,124,22},
						new Predicate("attack", new Term[] {
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
		agent.initialize(
			new Predicate("exploring", new Term[] {
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
