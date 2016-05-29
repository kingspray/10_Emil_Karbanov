package carmax.cardetails;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText CAR_NAME,CAR_YEAR;
    RadioButton CAR_DOORS,CAR_FUELTYPE;
    String carname,caryear,doors,fueltype;

    Context context = this;
    SQLiteDatabase sqLiteDatabase;
    DataBase_Operations userdbhelper;
    public void RadioButtonClicked(View view) {

//This variable will store whether the user was male or female
        doors = "";
// Check that the button is  now checked?
        boolean checked = ((RadioButton) view).isChecked();

// Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_23_doors:
                if (checked)
                    doors = "23";
                break;
            case R.id.radio_45_doors:
                if (checked)
                    doors = "45";
                break;
        }

    }
    public void RadioButtonClicked2(View view) {

//This variable will store whether the user was male or female
        fueltype = "";
// Check that the button is  now checked?
        boolean checked = ((RadioButton) view).isChecked();

// Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_diesel:
                if (checked)
                    fueltype = "Diesel";
                break;
            case R.id.radio_gasoline:
                if (checked)
                    fueltype = "Gasoline";
                break;
            case R.id.radio_lpg:
                if (checked)
                    fueltype = "LPG";
                break;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_next_page = (Button) findViewById(R.id.button_next_page);
        button_next_page.setOnClickListener(new View.OnClickListener() {

                                                @Override
            public void onClick(View v) {

                carname = CAR_NAME.getText().toString();
                caryear = CAR_YEAR.getText().toString();
                doors = CAR_DOORS.getText().toString();
                fueltype = CAR_FUELTYPE.getText().toString();
                //DataBase_Operations DB = new DataBase_Operations(ctx);
                                                    //DB.putInfo(DB, carname, doors , caryear ,null , null, null, null,fueltype);
                                                    userdbhelper = new DataBase_Operations(context);
                                                    sqLiteDatabase = userdbhelper.getWritableDatabase();
                                                    userdbhelper.putInfo(sqLiteDatabase,carname, doors , caryear ,null , null, null, null,fueltype);
                                                    userdbhelper.close();
                                                    startActivity(new Intent(MainActivity.this, second_page.class));

                }
            }
        );
        CAR_NAME = (EditText) findViewById(R.id.text_car_name);
        CAR_YEAR = (EditText) findViewById(R.id.text_car_year);
        CAR_DOORS = (RadioButton)findViewById(R.id.radio_23_doors);
        CAR_DOORS = (RadioButton)findViewById(R.id.radio_45_doors);
        CAR_FUELTYPE = (RadioButton)findViewById(R.id.radio_gasoline);
        CAR_FUELTYPE = (RadioButton)findViewById(R.id.radio_diesel);
        CAR_FUELTYPE = (RadioButton)findViewById(R.id.radio_lpg);
    }






}
