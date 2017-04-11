package com.company.action;

import com.company.helper.ValueStackHelper;
import com.company.valuestack.ValueStack;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 抽象拦截器
 */
public abstract class AbstractInterceptor {
	// 获得当前的值栈
	private ValueStack valueStack = ValueStackHelper.getValueStack();
	// 拦截器类型：前置、后置、环绕
	private int type = 0;

	// 当前的值栈
	protected ValueStack getValueStack() {
		return valueStack;
	}

	// 拦截处理
	public final void exec() {
		// 根据type不同，处理方式也不同
	}

	// 拦截器类型
	protected abstract void setType(int type);

	// 子类实现的拦截器
	protected abstract void intercept();

}
