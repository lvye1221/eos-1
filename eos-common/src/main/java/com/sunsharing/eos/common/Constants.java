package com.sunsharing.eos.common;


public class Constants {

    public static final String DEFAULT_SERIALIZATION = "hessian";
    public static final String DEFAULT_PROXY = "jdk";
    public static final String DEFAULT_TRANSPORTER = "netty";

    //eos的部署模式
    public static final String EOS_MODE_PRO = "pro";
    //eos的开发模式
    public static final String EOS_MODE_DEV = "dev";

    //void的mock
    public static final String MOCK_VOID = "void";
    public static final String RETURN_TYPE_VOID = "void";

    //正常
    public static final byte STATUS_SUCCESS = 0;
    //失败
    public static final byte STATUS_ERROR = 1;

}
