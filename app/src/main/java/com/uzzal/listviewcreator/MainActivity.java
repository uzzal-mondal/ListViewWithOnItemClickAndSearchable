package com.uzzal.listviewcreator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lilstView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lilstView = findViewById(R.id.listView_id);

        setTitle("Programming");

        // String to convert java file.
        final String[] programming_name = getResources().getStringArray(R.array.programming_name);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(MainActivity.this,
                        R.layout.list_sample_view, R.id.textView, programming_name);
        lilstView.setAdapter(adapter);


        lilstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // data get to position from array.
                String value = programming_name[position];

                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("key",value);
                startActivity(intent);
                Toast.makeText(MainActivity.this, ""+value, Toast.LENGTH_SHORT).show();
            }
        });



    }
}
