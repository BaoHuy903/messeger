package com.endterm.messeger;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView usersRecyclerView = findViewById(R.id.users_recycler_view);
        usersRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<User> userList = new ArrayList<>();
        userList.add(new User("Name", "ex@gmail.com"));
        userList.add(new User("Name", "ex@gmail.com"));
        userList.add(new User("Name", "ex@gmail.com"));
        userList.add(new User("Name", "ex@gmail.com"));

        UsersAdapter adapter = new UsersAdapter(userList);
        usersRecyclerView.setAdapter(adapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemIconTintList(null);
    }
}
