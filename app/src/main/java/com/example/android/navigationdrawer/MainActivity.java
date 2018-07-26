package com.example.android.navigationdrawer;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private TextView mTextViewMenuItem;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerLayout = findViewById(R.id.drawer_layout);
        mTextViewMenuItem = findViewById(R.id.text_menu_item);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        String itemName = (String) item.getTitle();
        mTextViewMenuItem.setText(itemName);
        hideDrawer();

        switch (item.getItemId()) {
            case R.id.item_home:
                //Your action
                break;
            case R.id.item_my_profile:
                //Your action
                break;
            case R.id.item_events:
                //Your action
                break;
            case R.id.item_favorites:
                //Your action
                break;
            case R.id.item_inbox:
                //Your action
                break;
            case R.id.item_contact_us:
                //Your action
                break;
            case R.id.item_feedback:
                //Your action
                break;
            case R.id.item_settings:
                //Your action
                break;
            case R.id.item_my_school:
                //Your action
                break;
            case R.id.item_add_school:
                //Your action
                break;
            case R.id.item_info:
                //Your action
                break;
            case R.id.item_logout:
                //Your action
                break;
        }
        return true;
    }

    //Open the Drawer
    private void openDrawer() {
        mDrawerLayout.openDrawer(GravityCompat.START);
    }

    //Close the Drawer
    private void hideDrawer() {
        mDrawerLayout.closeDrawer(GravityCompat.START);
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            hideDrawer();
        } else
            super.onBackPressed();
    }
}
