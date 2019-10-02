package com.example.asus.tasklistmanagement;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class AddTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        TextView title = (TextView) findViewById(R.id.adding);
        title.setText("Add Task Activity");

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.all_task:
                        Intent a = new Intent(AddTaskActivity.this, MainActivity.class);
                        startActivity(a);

                        break;
                    case R.id.yesterday:
                        Intent b = new Intent(AddTaskActivity.this, YesterdayActivity.class);
                        startActivity(b);

                        break;
                    case R.id.today:
                        Intent c = new Intent(AddTaskActivity.this,TodayActivity.class);
                        startActivity(c);

                        break;
                    case R.id.tomorrow:
                        Intent d = new Intent(AddTaskActivity.this,TomorrowTaskActivity.class);
                        startActivity(d);

                        break;
                    case R.id.add_task:
                        Intent e = new Intent(AddTaskActivity.this,AddTaskActivity.class);
                        startActivity(e);

                        break;
                }
                return false;
            }
        });

    }
}
