/**   
* Copyright: Copyright (c) 2016 Asiainfo
* 
* @ClassName: DemoAction.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: Yang Bin
* @date: 3 Mar 2016 22:36:52 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 3 Mar 2016     Yang Bin           v1.0.0               修改原因
*/
package com.ben.demo.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.web.action.*;
import com.ben.demo.service.interfaces.IDemoSV;

/**
 * @author Yang Bin
 *
 */
public class DemoAction extends BaseAction {

	public void test(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Hello World!");
		String aa = request.getParameter("aa");
		System.out.println(aa);
		IDemoSV sv = (IDemoSV)ServiceFactory.getService(IDemoSV.class);
		sv.test(aa);
	}
	
}
