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


public class combatManager extends ASTRAClass {
	public combatManager() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"combatManager", new int[] {19,9,19,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"combatManager", new int[] {19,18,22,5},
				new Statement[] {
					new ModuleCall("eis",
						"combatManager", new int[] {20,8,20,29},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("starcraft")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("combatManager","eis")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("C",
						"combatManager", new int[] {21,8,21,42},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Combat Manager Online")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("combatManager","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"combatManager", new int[] {24,9,24,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("orderAttack", new Term[] {
						new Variable(Type.INTEGER, "ID",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"combatManager", new int[] {24,31,32,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "allEntities"),
						"combatManager", new int[] {25,8,32,5},
						new ModuleTerm("eis", Type.LIST,
							new Predicate("allEntities", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.EIS) intention.getModule("combatManager","eis")).allEntities(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("combatManager","eis")).allEntities(
									);
								}
							}
						)
					),
					new ModuleCall("C",
						"combatManager", new int[] {26,8,26,62},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("All Entities size: "),
								new ModuleTerm("P", Type.INTEGER,
									new Predicate("size", new Term[] {
										new Variable(Type.LIST, "allEntities")
									}),
									new ModuleTermAdaptor() {
										public Object invoke(Intention intention, Predicate predicate) {
											return ((modules.Prelude2) intention.getModule("combatManager","P")).size(
												(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
											);
										}
										public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
											return ((modules.Prelude2) visitor.agent().getModule("combatManager","P")).size(
												(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
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
								return ((astra.lang.Console) intention.getModule("combatManager","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ForAll(
						"combatManager", new int[] {27,8,27,43},
						new Variable(Type.STRING, "entity",false),
						new Variable(Type.LIST, "allEntities"),
						new Block(
							"combatManager", new int[] {27,44,32,5},
							new Statement[] {
								new If(
									"combatManager", new int[] {28,12,31,9},
									new Comparison("==",
										new ModuleTerm("ent", Type.BOOLEAN,
											new Predicate("canAttack", new Term[] {
												new ModuleTerm("eis", Type.STRING,
													new Predicate("getEntityType", new Term[] {
														new Variable(Type.STRING, "entity")
													}),
													new ModuleTermAdaptor() {
														public Object invoke(Intention intention, Predicate predicate) {
															return ((astra.lang.EIS) intention.getModule("combatManager","eis")).getEntityType(
																(java.lang.String) intention.evaluate(predicate.getTerm(0))
															);
														}
														public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
															return ((astra.lang.EIS) visitor.agent().getModule("combatManager","eis")).getEntityType(
																(java.lang.String) visitor.evaluate(predicate.getTerm(0))
															);
														}
													}
												)
											}),
											new ModuleTermAdaptor() {
												public Object invoke(Intention intention, Predicate predicate) {
													return ((modules.Entities) intention.getModule("combatManager","ent")).canAttack(
														(java.lang.String) intention.evaluate(predicate.getTerm(0))
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((modules.Entities) visitor.agent().getModule("combatManager","ent")).canAttack(
														(java.lang.String) visitor.evaluate(predicate.getTerm(0))
													);
												}
											}
										),
										Primitive.newPrimitive(true)
									),
									new Block(
										"combatManager", new int[] {28,65,30,13},
										new Statement[] {
											new Send("combatManager", new int[] {29,16,29,48},
												new Performative("inform"),
												new Variable(Type.STRING, "entity"),
												new Predicate("attack", new Term[] {
													new Variable(Type.INTEGER, "ID")
												})
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
			"combatManager", new int[] {34,9,34,83},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("content", new Term[] {
					new Variable(Type.INTEGER, "ID",false)
				})
			),
			new Predicate("ordersReceived", new Term[] {
				Primitive.newPrimitive(false)
			}),
			new Block(
				"combatManager", new int[] {34,82,39,5},
				new Statement[] {
					new BeliefUpdate('-',
						"combatManager", new int[] {35,8,39,5},
						new Predicate("ordersReceived", new Term[] {
							Primitive.newPrimitive(false)
						})
					),
					new BeliefUpdate('+',
						"combatManager", new int[] {36,8,39,5},
						new Predicate("ordersReceived", new Term[] {
							Primitive.newPrimitive(true)
						})
					),
					new Subgoal(
						"combatManager", new int[] {37,8,39,5},
						new Goal(
							new Predicate("orderAttack", new Term[] {
								new Variable(Type.INTEGER, "ID")
							})
						)
					),
					new ModuleCall("C",
						"combatManager", new int[] {38,8,38,42},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Attack order received")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("combatManager","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
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
				((astra.lang.EIS) agent.getModule("combatManager","eis")).sense();
			}
		});

		agent.initialize(
			new Goal(
				new Predicate("init", new Term[] {})
			)
		);
		agent.initialize(
			new Predicate("ordersReceived", new Term[] {
				Primitive.newPrimitive(false)
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("eis",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("P",modules.Prelude2.class,agent);
		fragment.addModule("ent",modules.Entities.class,agent);
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
			astra.core.Agent agent = new combatManager().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
