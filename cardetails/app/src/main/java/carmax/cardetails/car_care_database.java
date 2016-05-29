package carmax.cardetails;

import android.provider.BaseColumns;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by Root on 15/05/2016.
 */
public class car_care_database {
    public car_care_database(){
    }
    public static abstract class tableinfo implements BaseColumns{
        public static final String CAR_NAME = "car_name";
        public static final String CAR_DOORS = "car_doors";
        public static final String CAR_YEAR = "car_year";
        public static final String CAR_FUELTYPE = "car_fueltype";
        public static final String CAR_TYRES = "car_tyres";
        public static final String CAR_KILOMETRES = "car_kilometres";
        public static final String CAR_ENGINEOIL = "car_engineoil";
        public static final String CAR_AIRFILTER = "car_airfilter";
        public static final String DATABASE_NAME = "car_care_database";
        public static final String TABLE_NAME = "car_info";
    }
}
