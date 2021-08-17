package com.nio01;

import org.apache.http.HttpEntity;
import org.apache.http.client.entity.GzipCompressingEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;

/**
 * @author liyintao
 * @version 1.0.0
 * @ClassName HttpClientHelper.java
 * @Description TODO
 * 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
 * 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
 * https://github.com/liyintao520/geekProjects.git
 * git@github.com:liyintao520/geekProjects.git
 * @createTime 2021年08月16日 21:50:00
 */
public class HttpClientHelper {
    public static CloseableHttpClient httpclient = HttpClients.createDefault();

    public static void main(String[] args) throws Exception {

        String url = "http://hc.apache.org/httpcomponents-client-4.5.x/quickstart.html";
        String text = HttpClientHelper.getAsString(url);
        System.out.println("url: " + url + " ; response: \n" + text);

    }
    // GET 调用
    public static String getAsString(String url) throws IOException {
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response1 = null;
        try {
            response1 = httpclient.execute(httpGet);
            System.out.println(response1.getStatusLine());
            HttpEntity entity1 = response1.getEntity();
            return EntityUtils.toString(entity1, "UTF-8");
        } finally {
            if (null != response1) {
                response1.close();
            }
        }
    }


    // GET 调用
    public static String postAsJSON(String url, String json, Map<String, String> headers) throws IOException {
        //
        // json = URLEncoder.encode(json, "UTF-8");
        //
        HttpPost httpPost = new HttpPost(url);
        Set<String> keySet = headers.keySet();
        for (String name : keySet) {
            httpPost.setHeader(name, headers.get(name));
        }
        final String JSON_TYPE = "application/json;charset=UTF-8";
        httpPost.setHeader(HTTP.CONTENT_TYPE, JSON_TYPE);
        StringEntity entity = new StringEntity(json, "UTF-8");

//        httpPost.setHeader("ICK-Content-Encoding", "gzip");
//        httpPost.setEntity(new GzipCompressingEntity(entity));

//        entity.setContentType(JSON_TYPE);
//        entity.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, JSON_TYPE));
        httpPost.setEntity(entity);

        CloseableHttpResponse response1 = null;
        try {
            response1 = httpclient.execute(httpPost);
            System.out.println(response1.getStatusLine());
            HttpEntity entity1 = response1.getEntity();
            return EntityUtils.toString(entity1, "UTF-8");
        } finally {
            if (null != response1) {
                response1.close();
            }
        }
    }


}
