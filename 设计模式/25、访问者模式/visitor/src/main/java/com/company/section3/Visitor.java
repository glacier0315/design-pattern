package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Visitor implements IVisitor {

	//溼恀el1啋匼
	public void visit(ConcreteElement1 el1) {
		el1.doSomething();
	}

	//溼恀el2啋匼
	public void visit(ConcreteElement2 el2) {
		el2.doSomething();
	}
}
