package carmax.cardetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class start_screen extends AppCompatActivity {
    int status = 0;
    Button button_add_car1x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Button button_add_car = (Button)(findViewById(R.id.button_add_car));


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        Button button_add_car1x = (Button) findViewById(R.id.button_add_car1x);
        button_add_car1x.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                status =1;
                startActivity(new Intent(start_screen.this, MainActivity.class));

            }
        });
        Button button_view_car = (Button) findViewById(R.id.button_view_car);
        button_view_car.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                status = 2;
                startActivity(new Intent(start_screen.this, finish_page.class));

            }
        });
        Button button_exit = (Button)this.findViewById(R.id.button_exit);
        button_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status = 3;
                finish();
            }
        });
    }
}
