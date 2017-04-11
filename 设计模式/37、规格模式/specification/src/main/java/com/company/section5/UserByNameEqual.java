package com.company.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UserByNameEqual extends CompositeSpecification {
	//基准姓名
	private String name;
	//构造函数传递基准姓名
	public UserByNameEqual(String _name){
		this.name = _name;
	}
	
	//检验用户是否满足条件
	public boolean isSatisfiedBy(User user) {
		return user.getName().equals(name);
	}

}
