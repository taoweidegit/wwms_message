package com.wmms.mutils.api;

import org.springframework.stereotype.Component;

@Component
public class Response
{
    private int code;
    private String msg;
    private Object object;

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public Object getObject()
    {
        return object;
    }

    public void setObject(Object object)
    {
        this.object = object;
    }
}
