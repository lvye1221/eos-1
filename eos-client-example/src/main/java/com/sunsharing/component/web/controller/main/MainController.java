package com.sunsharing.component.web.controller.main;



import com.sunsharing.component.resvalidate.config.ConfigContext;
import com.sunsharing.component.test.TestFirst;
import com.sunsharing.eos.client.ServiceContext;
import com.sunsharing.eos.client.sys.SysProp;
import com.sunsharing.eos.client.zookeeper.ServiceLocation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

import com.sunsharing.component.web.common.BaseController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController extends BaseController {
	/**
	 * 用户登陆页面
	 * @param model
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/test.do",method=RequestMethod.GET)
    public String relogin(Model model,HttpServletRequest request) throws Exception {
//            ConfigContext.instancesBean(SysProp.class);
//            ServiceContext serviceContext = new ServiceContext("com.sunsharing");
//            ServiceLocation.getInstance().synConnect();
            for(int i=0;i<1000;i++)
            {
                System.out.println("abc");
                TestFirst testFirst = ServiceContext.getBean(TestFirst.class);
                String out = testFirst.sayHello("hexin");
                System.out.println(out);
            }
        return "login";
    }


}
