package com.company.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbstractStar {
	//一个明星参加哪些活动
	protected final AbstractAction action;
	
	//通过构造函数传递具体活动
	public AbstractStar(AbstractAction _action){
		this.action = _action;
	}
	
	//每个明星都有自己的主要工作
	public void doJob(){
		action.desc();
	}
}
