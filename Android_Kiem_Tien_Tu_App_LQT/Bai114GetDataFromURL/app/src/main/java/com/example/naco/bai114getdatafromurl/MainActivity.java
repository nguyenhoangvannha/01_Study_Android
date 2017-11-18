package com.example.naco.bai114getdatafromurl;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnGetData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        addEvents();
    }

    private void addEvents() {
        btnGetData.setOnClickListener(this);
    }

    private void initComponents() {
        btnGetData = findViewById(R.id.btn_get_data);
    }

    @Override
    public void onClick(View view) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                //String result = getDataFromURL("\"https://www.w3schools.com/js/cd_catalog.xml\"");
                String result = getDataFromURL("https://www.w3schools.com/js/cd_catalog.xml");
                Message message = new Message();
                message.obj = result;
                handlerNetWork.sendMessage(message);
            }
        };
        thread.start();
    }
    Handler handlerNetWork = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String result = msg.obj.toString();
            Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG ).show();
        }
    };
    private String getDataFromURL(String url) {
        String result = null;
        int CONNECT_TIMEOUT = 3000;
        int SOCKET_TIMEOUT = 5000;

        HttpParams httpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(httpParams, CONNECT_TIMEOUT);
        HttpConnectionParams.setSoTimeout(httpParams, SOCKET_TIMEOUT);

        //HttpClient httpClient = new DefaultHttpClient();
        HttpClient httpClient = new DefaultHttpClient(httpParams);
        HttpGet httpGet = new HttpGet(url);
        try{
            HttpResponse httpResponse = httpClient.execute(httpGet);
            if(httpResponse != null){
                InputStream inputStream = httpResponse.getEntity().getContent();
                result = convertStreamToString(inputStream);
            }
        } catch (ConnectTimeoutException ex){
            result = "Connect time out";

        } catch (SocketTimeoutException ex){
            result = "Socket time out";
        } catch (Exception ex){

        }
        return result;
    }



    private String convertStreamToString(InputStream inputStream) {
        StringBuilder stringBuilder = new StringBuilder();
        String line = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            while((line = bufferedReader.readLine()) != null){
                stringBuilder.append(line);
            }
        } catch (Exception ex){

        }
        return stringBuilder.toString();
    }

//    @Override
//    public void onClick(View view) {
//        int id = view.getId();
//        if(id == R.id.btn_get_data){
//            Thread thread = new Thread(){
//                @Override
//                public void run() {
//                    String result = getDataFromURL("https://www.w3schools.com/js/cd_catalog.xml");
//                    Message message = new Message();
//                    message.obj = result;
//                    handler.sendMessage(message);
//                }
//            };
//            thread.start();
//            //Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
//        }
//    }
//    Handler handler = new Handler(){
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            String result = msg.obj.toString();
//            Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
//        }
//    };
//    private String getDataFromURL(String url) {
//        String result = "";
//
//        try {
//            URL url1 = new URL(url);
//            HttpsURLConnection httpURLConnection = (HttpsURLConnection) url1.openConnection();
//            httpURLConnection.setSSLSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault());
//            httpURLConnection.setDoOutput(true);
//            httpURLConnection.setChunkedStreamingMode(0);
//            httpURLConnection.setConnectTimeout(3000);
//            InputStream in = new BufferedInputStream(httpURLConnection.getInputStream());
//            result = convertStreamToString(in);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//    private String convertStreamToString(InputStream in) throws IOException {
//        String line = "";
//        StringBuilder stringBuilder = new StringBuilder();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
//        while((line = bufferedReader.readLine()) != null){
//            stringBuilder.append(line);
//        }
//        return stringBuilder.toString();
//    }
}
