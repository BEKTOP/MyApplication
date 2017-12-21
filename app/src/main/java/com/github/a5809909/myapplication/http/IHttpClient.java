package com.github.a5809909.myapplication.http;

public interface IHttpClient {

    void request(String url, HttpClient.ResponseListener listener);
}
