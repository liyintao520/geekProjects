package com.nio01;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * @author liyintao
 * @version 1.0.0
 * @ClassName OkHttpUtils.java
 * @Description TODO
 * @createTime 2021年08月16日 21:51:00
 */
public class OkHttpUtils {
    // 缓存客户端实例
    public static OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) throws Exception {

        String url = "https://square.github.io/okhttp/";
        String text = OkHttpUtils.getAsString(url);
        System.out.println("url: " + url + " ; response: \n" + text);

        // 清理资源
        OkHttpUtils.client = null;
    }

    // GET 调用
    public static String getAsString(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }


}
