package com.test;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Date;

public class tagCustomDateTime extends SimpleTagSupport {
    private Date now;

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        out.print("test");
    }

    public void setNow(Date now){
        this.now = now;
    }

    public Date getNow() {
        return now;
    }
}
