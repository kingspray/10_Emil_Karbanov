package carmax.cardetails;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class finish_page extends AppCompatActivity {
    TextView CAR_NAME,CAR_DOORS,CAR_FUELTYPE,CAR_YEAR,CAR_KILOMETRES,CAR_ENGINEOIL,CAR_AIRFILTER;

   // Context CTX = this;
    SQLiteDatabase sqLiteDatabase;
    DataBase_Operations userdbhelper;
    Cursor cursor;
    data_adapter dataadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_page);
       // CAR_NAME = (TextView) findViewById(R.id.carname);
        dataadapter = new data_adapter(getApplicationContext(),R.layout.row_layout);
        //DataBase_Operations DB = new DataBase_Operations(getApplicationContext());
        userdbhelper = new DataBase_Operations(getApplicationContext());
        sqLiteDatabase = userdbhelper.getReadableDatabase();
        cursor = userdbhelper.getInformations(sqLiteDatabase);
        if(cursor.moveToFirst()){
            do{
                String carname,cardoors,carfueltype,caryear,carkilometres,carengineoil,carairfilter;
                carname = cursor.getString(0);
                cardoors = cursor.getString(1);
                carfueltype = cursor.getString(2);
                caryear = cursor.getString(3);
                //carkilometres = cursor.getString(4);
                //carengineoil = cursor.getString(5);
                //carairfilter = cursor.getString(6);
            data_provider dataProvider = new data_provider(carname,cardoors,caryear,carfueltype,null,null,null,null);
                dataadapter.add(dataProvider);
            }while(cursor.moveToNext());

        }







       // CAR_DOORS = (TextView) findViewById(R.id.cardoors);
       // CAR_FUELTYPE = (TextView) findViewById(R.id.carfueltype);
       // CAR_YEAR = (TextView) findViewById(R.id.caryear);
      //  CAR_KILOMETRES = (TextView) findViewById(R.id.carkilometres);
      ////  CAR_ENGINEOIL = (TextView) findViewById(R.id.carengineoil);
       // CAR_AIRFILTER = (TextView) findViewById(R.id.carairfilter);

       // carname = CAR_NAME.getText().toString();
       // cardoors = CAR_DOORS.getText().toString();
        //carfueltype = CAR_FUELTYPE.getText().toString();
        //caryear = CAR_YEAR.getText().toString();
        //carkilometres = CAR_KILOMETRES.getText().toString();
       // carengineoil = CAR_ENGINEOIL.getText().toString();
       // carairfilter = CAR_AIRFILTER.getText().toString();
       // DataBase_Operations DOP = new DataBase_Operations(CTX);
       // Cursor CR = DOP.getInfo2(DOP);
       // CR.moveToFirst();
       // boolean status = false;
       // String NAME = "";
       // do {
       //     status = true;
       //    NAME = CR.getString(0);
       // }while(CR.moveToNext());

    }
}
