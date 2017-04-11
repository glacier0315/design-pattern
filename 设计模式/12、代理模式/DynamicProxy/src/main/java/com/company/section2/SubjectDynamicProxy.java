package com.company.section2;

import java.lang.reflect.InvocationHandler;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SubjectDynamicProxy extends DynamicProxy{

	public static <T> T newProxyInstance(Subject subject){
		//»ñµÃClassLoader
		ClassLoader loader = subject.getClass().getClassLoader();
		//»ñµÃ½Ó¿ÚÊý×é
		Class<?>[] classes = subject.getClass().getInterfaces();
		//»ñµÃhandler
		InvocationHandler handler = new MyInvocationHandler(subject);
		return newProxyInstance(loader, classes, handler);
	}
}
