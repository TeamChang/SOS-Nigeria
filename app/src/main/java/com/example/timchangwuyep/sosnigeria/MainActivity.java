package com.example.timchangwuyep.sosnigeria;

import android.Manifest;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    SharedPreferences sharedPreferences;
    int finalNewCheckedItem = 0;
    int newCheckedItem = 0;
    String customTheme;
    Intent callIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //setting themes
        sharedPreferences = this.getSharedPreferences("com.example.timchangwuyep.sosnigeria", Context.MODE_PRIVATE);
        customTheme = sharedPreferences.getString("customThemes", "");

        switch (customTheme) {
            case "green":
                newCheckedItem = 0;
                setTheme(R.style.AppTheme);
                break;
            case "blue":
                newCheckedItem = 1;
                setTheme(R.style.AppTheme_Blue);
                break;
            case "dracula":
                newCheckedItem = 2;
                setTheme(R.style.AppTheme_Dark);
                break;
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.mainToolBar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

            finalNewCheckedItem = newCheckedItem;
            item.setChecked(true);
            String[] customThemes = {"Green", "Blue", "Dracula"};
            new AlertDialog.Builder(this)
                    .setTitle("Themes")
                    .setSingleChoiceItems(customThemes, finalNewCheckedItem, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // user checked an item
                            switch (which) {
                                case 0:
                                    sharedPreferences.edit().putString("customThemes", "green").apply();
                                    break;
                                case 1:
                                    sharedPreferences.edit().putString("customThemes", "blue").apply();
                                    break;
                                case 2:
                                    sharedPreferences.edit().putString("customThemes", "dracula").apply();
                                    break;
                            }
                        }
                    })
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // user clicked ok
                            recreate();
                        }
                    })
                    .setNegativeButton("Cancel", null)
                    .create()
                    .show();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

            item.setChecked(true);

            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_rate) {

            item.setChecked(true);

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=PackageName")));

        } else if (id == R.id.nav_share) {

            item.setChecked(true);

            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBody = "Emergency App for Nigerians";
            String shareSub = "SOS Nigeria";
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share using"));

        } else if (id == R.id.nav_about) {

            item.setChecked(true);

            Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
            aboutIntent.putExtra("customTheme", customTheme);
            startActivity(aboutIntent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void cardViewTapped(View view) {

        int id = view.getId();
        String cardViewId = "";
        cardViewId = view.getResources().getResourceEntryName(id);

        switch (cardViewId) {
            case "cardviewFireService":

                callFunction("+2348032003557");

                break;
            case "cardviewAmbulance" :

                callFunction("122");

                break;
            case "cardviewRoadSafety" :

                callFunction("070022553772");

                break;
            case "cardviewPolice" :

                callFunction("08057000001");

                break;
            case "cardviewCrime" :

                callIntent = new Intent(MainActivity.this, CrimeActivity.class);
                startActivity(callIntent);

                break;
        }
    }

    public void callFunction (String numberToCall){

        callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:" + numberToCall));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        startActivity(callIntent);
    }
}
