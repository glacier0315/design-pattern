package com.company.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class NotSpecification extends CompositeSpecification {
	//传递一个规格书
	private IUserSpecification spec;
	
	public NotSpecification(IUserSpecification _spec){
		this.spec = _spec;
	}
	
	//not操作
	@Override
	public boolean isSatisfiedBy(User user) {
		return !spec.isSatisfiedBy(user);
	}

}
