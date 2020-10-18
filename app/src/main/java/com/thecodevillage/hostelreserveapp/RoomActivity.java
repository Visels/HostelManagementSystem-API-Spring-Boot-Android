package com.thecodevillage.hostelreserveapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.JsonObject;
import com.thecodevillage.hostelreserveapp.db.DaoSession;
import com.thecodevillage.hostelreserveapp.db.Hostel;
import com.thecodevillage.hostelreserveapp.db.Room;
import com.thecodevillage.hostelreserveapp.db.RoomDao;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;


public class RoomActivity extends AppCompatActivity {
    RoomDao roomDao;
    List<Room> rooms;
    RoomAdapter roomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

//        Bundle args = this.getArguments();
//        if (args != null) {
//            routeId= getArguments().getLong("routeId");
//        }


        DaoSession daoSession= ((MainApplication) getApplication()).getDaoSession();
        roomDao = daoSession.getRoomDao();

        final RecyclerView rvItems= findViewById(R.id.rvRooms);
        rooms = roomDao.queryBuilder().list();


        roomAdapter=new RoomAdapter(rooms);
        rvItems.setAdapter(roomAdapter);



        roomAdapter.setClickListener(new RoomAdapter.ClickListener() {

            @Override
            public void onBookingClick(int position) {
                doBooking(rooms.get(position));
            }

        });
        rvItems.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }



    private void doBooking(final Room product){
        final AlertDialog.Builder builder = new AlertDialog.Builder(RoomActivity.this);
        builder.setTitle("Enter Details ");
        View viewInflated = LayoutInflater.from(RoomActivity.this).inflate(R.layout.dialog_layout,null, false);
        final EditText amount = (EditText) viewInflated.findViewById(R.id.amount);
        amount.setText(product.getCost()+"");
        amount.setEnabled(false);
        final EditText regNo = (EditText) viewInflated.findViewById(R.id.admNo);
        final EditText phone = (EditText) viewInflated.findViewById(R.id.phone);
        builder.setView(viewInflated);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                String amt = amount.getText().toString();
                String adm = regNo.getText().toString();
                String mobile = phone.getText().toString();
                Toast.makeText(RoomActivity.this,product.getName(),Toast.LENGTH_SHORT).show();
                    Toast.makeText(RoomActivity.this,product.getName(),Toast.LENGTH_SHORT).show();
                    try {
                        book(product,mobile,adm);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();
    }


    void book(Room room,String phone,String adm) {

        /**
         *
         * {
         * 	"roomId":2,
         *   "studentNumber": "24242",
         *   "mobileNumber": "3453453",
         * 	"amount":1,
         * 	"callbackurl":"http://ngrok.com.53535/api/callback/c2b",
         * 	"timeouturl":"http://ngrok.com.53535/api/callback/c2b"
         * }
         */
        JsonObject postData = new JsonObject();
        postData.addProperty("roomId", room.getId());
        postData.addProperty("studentNumber", adm);
        postData.addProperty("mobileNumber", phone);
        postData.addProperty("amount", room.getCost());
        postData.addProperty("callbackurl", "http://yoururl/api/callback/c2b");
        postData.addProperty("timeouturl", "http://yoururl/api/callback/c2b");

        final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        RequestBody requestBody = RequestBody.create(JSON, postData.toString());
        OkHttpClient client = new OkHttpClient();
        String url="http://yoururl/api/v1/booking/create";
        Log.d("URL",url);
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
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

                    RoomActivity.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

                            try {
                                JSONObject jsonRes;
                                jsonRes = new JSONObject(myResponse);

                                if (jsonRes.getInt("status") == 200){
                                    Toast.makeText(RoomActivity.this,jsonRes.getString("status"),Toast.LENGTH_SHORT).show();
                                } else{
                                    Toast.makeText(RoomActivity.this,jsonRes.getString("status"),Toast.LENGTH_SHORT).show();
                                }
                            } catch (Exception e){
                                e.printStackTrace();
                            }

                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
