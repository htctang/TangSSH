package com.tang.test;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;

/**
 * Created by 唐川htc on 2016/5/23.
 */
@Controller
public class TestAction extends ActionSupport {
    public String  test(){

        return "test";
    }
}
