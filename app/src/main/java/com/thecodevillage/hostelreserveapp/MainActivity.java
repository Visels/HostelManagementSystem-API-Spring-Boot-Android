package com.thecodevillage.hostelreserveapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.thecodevillage.hostelreserveapp.db.DaoSession;
import com.thecodevillage.hostelreserveapp.db.Hostel;
import com.thecodevillage.hostelreserveapp.db.HostelDao;
import com.thecodevillage.hostelreserveapp.db.Room;
import com.thecodevillage.hostelreserveapp.db.RoomDao;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {

    HostelDao hostelDao;
    RoomDao roomDao;
    List<Hostel> hostels;
    HostelAdapter hostelAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DaoSession daoSession= ((MainApplication) getApplication()).getDaoSession();
        hostelDao = daoSession.getHostelDao();
        roomDao = daoSession.getRoomDao();

        try {
            Log.d("REQ","Get Hostels");
            run();
        } catch (Exception e) {
            e.printStackTrace();
        }


        final RecyclerView rvItems= findViewById(R.id.rvHostels);
        hostels = hostelDao.queryBuilder().list();


        hostelAdapter=new HostelAdapter(hostels);
        rvItems.setAdapter(hostelAdapter);

        hostelAdapter.setClickListener(new HostelAdapter.ClickListener() {
            @Override
            public void onHostelClick(int position) {
                getRooms(hostels.get(position));
            }

        });

        rvItems.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    void run() {
        OkHttpClient client = new OkHttpClient();
        String url="http://yoururl/api/v1/download";
        Log.d("URL",url);
        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                call.cancel();
            }

            @Override
            public void onResponse(Call call, Response response) {
                try {
                    ResponseBody responseBody = response.body();
                    if (!response.isSuccessful()) {
                        throw new IOException("Unexpected code " + response);
                    }
                    final String myResponse = responseBody.string();
                    Log.d("data", myResponse);

                    JSONObject jsonRes;
                    jsonRes = new JSONObject(myResponse);

                    if (jsonRes.getInt("status") == 200){
                        JSONArray hostelsArr=jsonRes.getJSONObject("payload").getJSONArray("hostels");
                        if (hostelsArr.length() > 0){
                            hostelDao.deleteAll();
                            roomDao.deleteAll();
                            for (int i = 0; i < hostelsArr.length(); i++) {
                                Hostel hostel=new Hostel();
                                hostel.setId(hostelsArr.getJSONObject(i).getLong("id"));
                                hostel.setName(hostelsArr.getJSONObject(i).getString("name"));
                                hostel.setCode(hostelsArr.getJSONObject(i).getString("code"));
                                hostel.setLocation(hostelsArr.getJSONObject(i).getString("location"));
                                hostelDao.save(hostel);

                                Log.d("Hostel SaveD",hostel.toString());
                            }


                            JSONArray roomsArr=jsonRes.getJSONObject("payload").getJSONArray("rooms");
                            if (roomsArr.length() > 0){
                                for (int i = 0; i < roomsArr.length(); i++) {
                                    Room room=new Room();
                                    room.setId(roomsArr.getJSONObject(i).getLong("id"));
                                    room.setName(roomsArr.getJSONObject(i).getString("name"));
                                    room.setCode(roomsArr.getJSONObject(i).getString("code"));
                                    room.setCost(roomsArr.getJSONObject(i).getDouble("cost"));
                                    room.setHostelId(roomsArr.getJSONObject(i).getJSONObject("hostel").getLong("id"));
                                    roomDao.save(room);

                                    Log.d("Room SaveD",room.toString());
                                }
                            }

                            hostels = hostelDao.queryBuilder().list();
                            Log.d("SIZE#",hostels.size()+"");
                        }


                    }

                    MainActivity.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            hostels = hostelDao.queryBuilder().list();
                            Log.d("SIZE#",hostels.size()+"");
                            hostelAdapter.notifyDataSetChanged();
                            Log.d("RES#",myResponse);
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    void getRooms(Hostel hostel){
        //pass the hostel id to filter
        Intent intent1 = new Intent(MainActivity.this, RoomActivity.class);
        startActivity(intent1);
    }

}
