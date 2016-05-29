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

public class second_page extends AppCompatActivity {
    EditText CAR_KILOMETRES,CAR_ENGINEOIL,CAR_AIRFILTER;
    RadioButton CAR_TYRES;
    String carkilometres,carengineoil,carairfilter,tyres;
    //Context ctx = this;
    public void RadioButtonClicked3(View view) {

//This variable will store whether the user was male or female
        String tyres = "";
// Check that the button is  now checked?
        boolean checked = ((RadioButton) view).isChecked();

// Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_summer:
                if (checked)
                    tyres = "Summer";
                break;
            case R.id.radio_winter:
                if (checked)
                    tyres = "Winter";
                break;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        Button button_finish = (Button) findViewById(R.id.button_finish);
        button_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //carkilometres = CAR_KILOMETRES.getText().toString();
                //carengineoil = CAR_ENGINEOIL.getText().toString();
                //carairfilter = CAR_AIRFILTER.getText().toString();
                //tyres = CAR_TYRES.getText().toString();

                //DB.putInfo(DB, carname, doors , caryear ,null , null, null, null,fueltype);
                startActivity(new Intent(second_page.this, finish_page.class));

            }
        });
    }

}
