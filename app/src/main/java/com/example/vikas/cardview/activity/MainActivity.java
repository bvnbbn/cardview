package com.example.vikas.cardview.activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.vikas.cardview.R;
import com.example.vikas.cardview.adapter.BankAccountAdapter;
import com.example.vikas.cardview.model.Bank_details;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {

    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;
    private RecyclerView recList;
    private BankAccountAdapter adapter;
    private LinearLayoutManager llm;
    List<Bank_details> details = new ArrayList<Bank_details>();
    private String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

       // mToolbar.setTitleTextColor(0xFFFFF);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("DashBoard");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        details = new ArrayList<>();
        recList = (RecyclerView) findViewById(R.id.cardList);



        llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);



        adapter = new BankAccountAdapter(getApplicationContext(),details);
        recList.setAdapter(adapter);
        bank_details();




        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);
    }




    private void bank_details() {

        Bank_details di = new Bank_details("UCO BANK","**1032","Rs 2000","12/10/1996");
        details.add(di);
        adapter.notifyDataSetChanged();

        di = new Bank_details("UCO BANK","**1032","Rs 3000","12/10/1996");
        details.add(di);
        adapter.notifyDataSetChanged();
        di = new Bank_details("UCO BANK","**1032","Rs 3000","12/10/1996");
        details.add(di);

        adapter.notifyDataSetChanged();

        Log.e(TAG,"size "+ details.size());

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

    @Override
    public void onDrawerItemSelected(View view, int position) {

    }
}