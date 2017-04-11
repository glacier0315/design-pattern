package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class PrototypeClass  implements Cloneable{
	
	//림畇만잚Object렘랬
	@Override
	public PrototypeClass clone(){
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass)super.clone();
		} catch (CloneNotSupportedException e) {
			//嫩끽뇹잿
		}
		return prototypeClass;
	}
}
