package unicap.com.br.baterpontomobile.util;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.io.File;
import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import unicap.com.br.baterpontomobile.model.Residente;

public class OkHttp {
    private String TAG = "OkHttpAync";


    public String getHttpResponse() {
        OkHttpClient httpClient = new OkHttpClient();

        String url = "localhost:8080";
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = null;
        try {
            response = httpClient.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            Log.e(TAG, "error in getting response get request okhttp");
        }
        return null;
    }

    public Object postHttpResponse(Residente residente) {
        OkHttpClient httpClient = new OkHttpClient();
        String url = "localhost:8080";

        RequestBody formBody = new FormBody.Builder()
                .add("Matricula", residente.getMatricula())
                .add("Senha", residente.getSenha())
                .build();
        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .build();
        Response response = null;
        try {
            response = httpClient.newCall(request).execute();
            if (response.isSuccessful()) {
                Log.e(TAG, "Got response from server using OkHttp ");
                return response.body().string();
            }

        } catch (IOException e) {
            Log.e(TAG, "error in getting response post request okhttp");
        }
        return null;

    }
}
