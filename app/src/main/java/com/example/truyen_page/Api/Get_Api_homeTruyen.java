package com.example.truyen_page.Api;

import android.os.AsyncTask;

import com.example.truyen_page.interface_homeTruyen.interface_homeTruyen;

import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class Get_Api_homeTruyen extends AsyncTask<Void, Void, Void> {

    String data;
    interface_homeTruyen layHomeTruyen;

    public Get_Api_homeTruyen(interface_homeTruyen layHomeTruyen) {
        this.layHomeTruyen = layHomeTruyen;
        this.layHomeTruyen.batdau();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://api.jsonserve.com/EgKOwb")
                .build();
        data = null;

        try {
            Response response = client.newCall(request).execute();
            ResponseBody body = response.body();
            data = body.string();
        }
        catch (Exception e) {
            data = null;
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void unused) {
        super.onPostExecute(unused);
        if (data == null) {
            this.layHomeTruyen.biLoi();
        }
        else {
            this.layHomeTruyen.ketthuc(data);
        }
    }
}
