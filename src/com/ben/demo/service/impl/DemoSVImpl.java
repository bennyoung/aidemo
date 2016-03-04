/**   
* Copyright: Copyright (c) 2016 Asiainfo
* 
* @ClassName: DemoSVImpl.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: Yang Bin
* @date: 4 Mar 2016 22:44:00 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 4 Mar 2016     Yang Bin           v1.0.0               修改原因
*/
package com.ben.demo.service.impl;

import com.ben.demo.service.interfaces.IDemoSV;

/**
 * @author Yang Bin
 *
 */
public class DemoSVImpl implements IDemoSV {

	/* (non-Javadoc)
	 * @see com.ben.demo.service.interfaces.IDemoSV#test()
	 */
	@Override
	public void test(String s) throws Exception {
		// TODO add by yangbin for invoke dao to do some db operation
		System.out.println("------from sv----" + s);
	}

}
