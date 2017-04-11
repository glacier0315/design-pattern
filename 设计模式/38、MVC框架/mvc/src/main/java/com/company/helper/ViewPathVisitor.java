package com.company.helper;

import org.dom4j.Attribute;
import org.dom4j.Element;
import org.dom4j.VisitorSupport;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ViewPathVisitor extends VisitorSupport {
	//获得指定的路径
	private String viewPath; 
	private String result;
	//传递返回结果
	public ViewPathVisitor(String _result){
		result = _result;
	}
	
	@Override
	public void visit(Element el){
		Attribute att = el.attribute("name");
		if(att != null){
			if(att.getName().equals("name") && att.getText().equals(result)){
				viewPath = el.getText();
			}
		}
	}
	
	public String getViewPath(){
		return viewPath;
	}
}
