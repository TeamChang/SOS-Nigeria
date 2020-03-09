package com.example.timchangwuyep.sosnigeria;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
        final ArrayList<String> policeCommandNum = new ArrayList<>();

        policeCommandNum.add("Police State Commands Emergency Numbers");//0
        policeCommandNum.add("ABIA STATE");//1
        policeCommandNum.add("ADAMAWA STATE");//2
        policeCommandNum.add("AKWA IBOM STATE");//3
        policeCommandNum.add("ANAMBRA STATE");//4
        policeCommandNum.add("BAUCHI STATE");//5
        policeCommandNum.add("BENUE STATE");//6
        policeCommandNum.add("BAYELSA STATE");//7
        policeCommandNum.add("BORNO STATE");//8
        policeCommandNum.add("CROSS RIVERS STATE");//9
        policeCommandNum.add("DELTA STATE");//10
        policeCommandNum.add("EBONYI STATE");//11
        policeCommandNum.add("EDO STATE");//12
        policeCommandNum.add("EKITI STATE");//13
        policeCommandNum.add("ENUGU STATE");//14
        policeCommandNum.add("GOMBE STATE");//15
        policeCommandNum.add("IMO STATE");//16
        policeCommandNum.add("JIGAWA STATE ");//17
        policeCommandNum.add("KADUNA STATE");//18
        policeCommandNum.add("KANO STATE");//19
        policeCommandNum.add("KATSINA STATE");//20
        policeCommandNum.add("KEBBI STATE");//21
        policeCommandNum.add("KOGI STATE");//22
        policeCommandNum.add("KWARA STATE");//23
        policeCommandNum.add("LAGOS STATE");//24
        policeCommandNum.add("NASARAWA STATE");//25
        policeCommandNum.add("NIGER STATE");//26
        policeCommandNum.add("OGUN STATE");//27
        policeCommandNum.add("ONDO STATE");//28
        policeCommandNum.add("OSUN STATE");//29
        policeCommandNum.add("OYO STATE");//30
        policeCommandNum.add("PLATEAU STATE");//31
        policeCommandNum.add("RIVERS STATE");//32
        policeCommandNum.add("SOKOTO STATE");//33
        policeCommandNum.add("TARABA STATE");//34
        policeCommandNum.add("YOBE STATE");//35
        policeCommandNum.add("ZAMFARA STATE");//36
        policeCommandNum.add("ABUJA (F.C.T)");//37

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, policeCommandNum);
        crimeListView.setAdapter(adapter);
        crimeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("number tapped", policeCommandNum.get(position));
                String[] phoneNumbers;
                switch (position) {
                    case 0 :
                         //Police State Commands Emergency Numbers
                        break;
                    case 1 :
                        phoneNumbers = new String[] {"0803541540", "08079210003", "08079210004", "08079210005"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 2 :
                        callSingleNumber("08089671313");
                        break;
                    case 3 :
                        phoneNumbers = new String[] {"08039213071", "08020913810"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 4 :
                        phoneNumbers = new String[] {"07039194332", "08024922772", "08075390511", "08182951257"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 5 :
                        phoneNumbers = new String[] {"08151849417", "08127162434", "08084763669", "08073794920"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 6 :
                        phoneNumbers = new String[] {"08066006475", "08053039936", "07075390977"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 7 :
                        callSingleNumber("07034578208");
                        break;
                    case 8 :
                        phoneNumbers = new String[] {"08068075581", "08036071667", "08123823322"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 9 :
                        phoneNumbers = new String[] {"08133568456", "07053355415"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 10 :
                        callSingleNumber("08036684974");
                        break;
                    case 11 :
                        phoneNumbers = new String[] {"07064515001", "08125273721", "08084704673"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 12 :
                        phoneNumbers = new String[] {"08037646272", "08077773721", "08067551618"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 13 :
                        phoneNumbers = new String[] {"08062335577", "07089310359"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 14 :
                        phoneNumbers = new String[] {"0832003702", "08075390883", "08086671202"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 15 :
                        phoneNumbers = new String[] {"08150567771", "08151855014"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 16 :
                        phoneNumbers = new String[] {"08034773600", "08037037283"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 17 :
                        phoneNumbers = new String[] {"08075391069", "07089846285", "08123821598"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 18 :
                        callSingleNumber("08123822284");
                        break;
                    case 19 :
                        phoneNumbers = new String[] {"08032419754", "08123821575", "064977004", "064977005"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 20 :
                        phoneNumbers = new String[] {"08075391255", "08075391250"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 21 :
                        phoneNumbers = new String[] {"08038797644", "08075391307"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 22 :
                        phoneNumbers = new String[] {"08075391335", "07038329084"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 23 :
                        phoneNumbers = new String[] {"07032069501", "08125275046"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 24 :
                        phoneNumbers = new String[] {"07055462708", "08035963919"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 25 :
                        phoneNumbers = new String[] {"08123821571", "07075391560"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 26 :
                        phoneNumbers = new String[] {"08081777498", "08127185198"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 27 :
                        phoneNumbers = new String[] {"08032136765", "08081770416"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 28 :
                        phoneNumbers = new String[] {"07034313903", "08075391808"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 29 :
                        phoneNumbers = new String[] {"08075872433", "08039537995", "08123823981"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 30 :
                        phoneNumbers = new String[] {"08081768614", "08150777888"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 31 :
                        phoneNumbers = new String[] {"08126375938", "08075391844", "08038907662"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 32 :
                        phoneNumbers = new String[] {"08032003514", "08073777717"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 33 :
                        phoneNumbers = new String[] {"07068848035", "08075391943"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 34 :
                        phoneNumbers = new String[] {"08140089863", "08073260267"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 35 :
                        phoneNumbers = new String[] {"07039301585", "08035067570"};
                        callMultipleNumbers(phoneNumbers);
                        break;
                    case 36 :
                        callSingleNumber("08106580123");
                        break;
                    case 37 :
                        phoneNumbers = new String[] {"07057337653", "08061581938", "08032003913"};
                        callMultipleNumbers(phoneNumbers);
                        break;

                }
            }
        });

    }

    public void callSingleNumber(String numberToCall) {

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

    public void callMultipleNumbers(final String[] numberToCall) {

        new AlertDialog.Builder(CrimeActivity.this)
                .setTitle("This state has multiple emergency numbers")
                .setSingleChoiceItems(numberToCall, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // user checked an item

                        callSingleNumber(numberToCall[which]);

                    }
                })
                .setNegativeButton("Cancel",null)
                .create()
                .show();
    }


}
