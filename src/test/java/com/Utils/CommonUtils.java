package com.Utils;

import com.Constants.Constants;

import java.io.IOException;
import java.util.Properties;

public class CommonUtils {
    private static CommonUtils commonUtilsInstance=null;

    private CommonUtils(){

    }
    public static CommonUtils getInstance(){
        if(commonUtilsInstance==null){
            commonUtilsInstance=new CommonUtils();

        }
        return commonUtilsInstance;
    }

    public void loadProperties() throws IOException {
        Properties pro = new Properties();
        pro.load(getClass().getResourceAsStream("/config.properties"));

        Constants.url =pro.getProperty("Url");
        Constants.browser= pro.getProperty("Browser");

    }











}
