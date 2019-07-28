package com.exam.zgl.Test;

public class Main {

    // 在平台申请的APP_ID 详见 http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
    private static final String APP_ID = "20190705000315062";
    private static final String SECURITY_KEY = "Uw7GVPjHFFXOSA9KkkTU";

    public static void main(String[] args) throws Exception {
        TransApi api = new TransApi(APP_ID, SECURITY_KEY);

        String query = "孙文强是一个帅哥";
        /*String query1 = new String (query.getBytes("utf-8"),"utf-8");
        System.out.println(query1);*/
        System.out.println(api.getTransResult(query, "auto", "en"));
    }

}
