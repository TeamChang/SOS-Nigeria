package com.example.timchangwuyep.sosnigeria;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

import java.util.ArrayList;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class CrimeActivity extends AppCompatActivity {

    Intent callIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        ListView crimeListView = findViewById(R.id.crimeListView);
        final ArrayList<String> policeCommandPROS = new ArrayList<>();

        policeCommandPROS.add("FORCE PUBLIC RELATIONS OFFICER FHQ ABUJA");//0
        policeCommandPROS.add("ZONE 1, KANO");//1
        policeCommandPROS.add("ZONE 2 LAGOS");//2
        policeCommandPROS.add("ZONE 3, YOLA");//3
        policeCommandPROS.add("ZONE 4 - MAKURDI");//4
        policeCommandPROS.add("ZONE 5, BENIN");//5
        policeCommandPROS.add("ZONE 6, CALABAR");//6
        policeCommandPROS.add("ZONE 7, ABUJA");//7
        policeCommandPROS.add("ZONE 8, LOKOJA");//8
        policeCommandPROS.add("ZONE 9, UMUAHIA");//9
        policeCommandPROS.add("ZONE 10, SOKOTO");//10
        policeCommandPROS.add("ZONE 11, OSOGBO");//11
        policeCommandPROS.add("ZONE 12, BAUCHI");//12
        policeCommandPROS.add("ABIA STATE");//13
        policeCommandPROS.add("ADAMAWA STATE");//140
        policeCommandPROS.add("AKWA IBOM STATE");//15
        policeCommandPROS.add("ANAMBRA STATE");//16
        policeCommandPROS.add("BAUCHI STATE");//17
        policeCommandPROS.add("BAYELSA STATE");//18
        policeCommandPROS.add("BENUE STATE");//19
        policeCommandPROS.add("CROSS RIVERS STATE");//20
        policeCommandPROS.add("DELTA STATE");//21
        policeCommandPROS.add("ENUGU STATE");//22
        policeCommandPROS.add("EBONYI STATE");//23
        policeCommandPROS.add("EDO STATE");//24
        policeCommandPROS.add("EKITI STATE");//25
        policeCommandPROS.add("FCT - ABUJA");//26
        policeCommandPROS.add("IMO STATE");//27
        policeCommandPROS.add("JIGAWA STATE ");//28
        policeCommandPROS.add("KATSINA STATE");//29
        policeCommandPROS.add("KADUNA STATE");//30
        policeCommandPROS.add("KOGI STATE");//31
        policeCommandPROS.add("KANO STATE");//32
        policeCommandPROS.add("KEBBI STATE");//33
        policeCommandPROS.add("KWARA STATE");//34
        policeCommandPROS.add("LAGOS STATE");//35
        policeCommandPROS.add("NASARAWA STATE");//36
        policeCommandPROS.add("NIGER STATE");//37
        policeCommandPROS.add("OGUN STATE");//38
        policeCommandPROS.add("OYO STATE");//37
        policeCommandPROS.add("ONDO STATE");//40
        policeCommandPROS.add("GOMBE STATE");//41
        policeCommandPROS.add("OSUN STATE");//42
        policeCommandPROS.add("PLATEAU STATE");//43
        policeCommandPROS.add("RIVERS STATE");//44
        policeCommandPROS.add("SOKOTO STATE");//45
        policeCommandPROS.add("BORNO STATE");//46
        policeCommandPROS.add("TARABA STATE");//47
        policeCommandPROS.add("YOBE STATE");//48
        policeCommandPROS.add("ZAMFARA STATE");//49
        policeCommandPROS.add("POLICE STAFF COLLEGE JOS");//50
        policeCommandPROS.add("POLICE ACADEMY- KANO");//51
        policeCommandPROS.add("POLICE COLLEGE ORJI RIVER");//52
        policeCommandPROS.add("FPPRO ANNEX");//53
        policeCommandPROS.add("MARITIME");//54
        policeCommandPROS.add("EOD");//55
        policeCommandPROS.add("FHQ");//56
        policeCommandPROS.add("DEPUTY FORCE PUBLIC RELATIONS OFFICER FHQ ABUJA");//57
        policeCommandPROS.add("O/C PUBLIC COMPLAIN BUREAU FHQ ABUJA");//58

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, policeCommandPROS);
        crimeListView.setAdapter(adapter);
        crimeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("number tapped", policeCommandPROS.get(position));
                switch (position) {
                    case 0 :
                        callFunction("08032569029");
                        break;
                    case 1 :
                        callFunction("08065814814");
                        break;
                    case 2 :
                        callFunction("08036634061");
                        break;
                    case 3 :
                        callFunction("08123823206");
                        break;
                    case 4 :
                        callFunction("08036362559");
                        break;
                    case 5 :
                        callFunction("08056036741");
                        break;
                    case 6 :
                        callFunction("08028346193");
                        break;
                    case 7 :
                        callFunction("08151833324");
                        break;
                    case 8 :
                        callFunction("08030447451");
                        break;
                    case 9 :
                        callFunction("08033654965");
                        break;
                    case 10 :
                        callFunction("08062113178");
                        break;
                    case 11 :
                        callFunction("08068219310");
                        break;
                    case 12 :
                        callFunction("08067467122");
                        break;
                    case 13 :
                        callFunction("08039148294");
                        break;
                    case 14 :
                        callFunction("08089671314");
                        break;
                    case 15 :
                        callFunction("08038743428");
                        break;
                    case 16 :
                        callFunction("08131199111");
                        break;
                    case 17 :
                        callFunction("08034656568");
                        break;
                    case 18 :
                        callFunction("08032789712");
                        break;
                    case 19 :
                        callFunction("08036363531");
                        break;
                    case 20 :
                        callFunction("08133568456");
                        break;
                    case 21 :
                        callFunction("08033429839");
                        break;
                    case 22 :
                        callFunction("08038829086");
                        break;
                    case 23 :
                        callFunction("08036230968");
                        break;
                    case 24 :
                        callFunction("08034684673");
                        break;
                    case 25 :
                        callFunction("08081772868");
                        break;
                    case 26 :
                        callFunction("08133379980");
                        break;
                    case 27 :
                        callFunction("08063827970");
                        break;
                    case 28 :
                        callFunction("08065670314");
                        break;
                    case 29 :
                        callFunction("08065737489");
                        break;
                    case 30 :
                        callFunction("08065510954");
                        break;
                    case 31 :
                        callFunction("08107899269");
                        break;
                    case 32 :
                        callFunction("08066471341");
                        break;
                    case 33 :
                        callFunction("08035868719");
                        break;
                    case 34 :
                        callFunction("08032365122");
                        break;
                    case 35 :
                        callFunction("08030535308");
                        break;
                    case 36 :
                        callFunction("08034523161");
                        break;
                    case 37 :
                        callFunction("07019497200");
                        break;
                    case 38 :
                        callFunction("08123822910");
                        break;
                    case 39 :
                        callFunction("08036536581");
                        break;
                    case 40 :
                        callFunction("08060159998");
                        break;
                    case 41 :
                        callFunction("08036057828"); //gombe
                        break;
                    case 42 :
                        callFunction("08035384448");
                        break;
                    case 43 :
                        callFunction("08063503207");
                        break;
                    case 44 :
                        callFunction("08033396538");
                        break;
                    case 45 :
                        callFunction("08036230968");
                        break;
                    case 46 :
                        callFunction("08030925924");
                        break;
                    case 47 :
                        callFunction("08067426392");
                        break;
                    case 48 :
                        callFunction("08065662808");
                        break;
                    case 49 :
                        callFunction("08091914752");
                        break;
                    case 50 :
                        callFunction("07035838889");
                        break;
                    case 51 :
                        callFunction("07060807555");
                        break;
                    case 52 :
                        callFunction("08151458020");
                        break;
                    case 53 :
                        callFunction("08067025331");
                        break;
                    case 54 :
                        callFunction("08137123062");
                        break;
                    case 55 :
                        callFunction("08033296724");
                        break;
                    case 56 :
                        callFunction("07056792065");
                        break;
                    case 57 :
                        callFunction("08034727873");
                        break;
                    case 58 :
                        callFunction("08123823206");
                        break;

                }
            }
        });

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
