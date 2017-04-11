package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 经理级人物
 */
public class Manager extends Employee {

	//这类人物的职责非常明确：业绩
	private String performance;

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}   
	
	//部门经理允许访问者访问
	@Override
	public void accept(IVisitor visitor){
		visitor.visit(this);
	}
}
