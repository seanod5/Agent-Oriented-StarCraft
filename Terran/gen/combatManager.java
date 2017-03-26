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
			"combatManager", new int[] {14,9,14,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"combatManager", new int[] {14,18,17,5},
				new Statement[] {
					new ModuleCall("eis",
						"combatManager", new int[] {15,8,15,29},
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
						"combatManager", new int[] {16,8,16,42},
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
			"combatManager", new int[] {19,9,19,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("orderAttack", new Term[] {
						new Variable(Type.INTEGER, "ID",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"combatManager", new int[] {19,31,30,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "army"),
						"combatManager", new int[] {20,8,30,5},
						new ListTerm(new Term[] {

						})
					),
					new Declaration(
						new Variable(Type.LIST, "allEntities"),
						"combatManager", new int[] {21,8,30,5},
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
					new ForAll(
						"combatManager", new int[] {22,8,22,43},
						new Variable(Type.STRING, "entity",false),
						new Variable(Type.LIST, "allEntities"),
						new Block(
							"combatManager", new int[] {22,44,30,5},
							new Statement[] {
								new If(
									"combatManager", new int[] {23,12,26,9},
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
										"combatManager", new int[] {23,65,25,13},
										new Statement[] {
											new ModuleCall("P",
												"combatManager", new int[] {24,16,24,35},
												new Predicate("add", new Term[] {
													new Variable(Type.LIST, "army"),
													new Variable(Type.STRING, "entity")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((modules.Prelude2) intention.getModule("combatManager","P")).add(
															(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
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
					new ForAll(
						"combatManager", new int[] {27,8,27,36},
						new Variable(Type.STRING, "entity",false),
						new Variable(Type.LIST, "army"),
						new Block(
							"combatManager", new int[] {27,37,30,5},
							new Statement[] {
								new Send("combatManager", new int[] {28,12,28,44},
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
		));
		addRule(new Rule(
			"combatManager", new int[] {32,9,32,59},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("content", new Term[] {
					new Variable(Type.INTEGER, "ID",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"combatManager", new int[] {32,58,35,5},
				new Statement[] {
					new Subgoal(
						"combatManager", new int[] {33,8,35,5},
						new Goal(
							new Predicate("orderAttack", new Term[] {
								new Variable(Type.INTEGER, "ID")
							})
						)
					),
					new ModuleCall("C",
						"combatManager", new int[] {34,8,34,42},
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
