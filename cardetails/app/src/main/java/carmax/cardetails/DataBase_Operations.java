package carmax.cardetails;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Root on 15/05/2016.
 */
public class DataBase_Operations extends SQLiteOpenHelper{
    public static final int database_version = 1;
    public String CREATE_QUERRY = "CREATE TABLE "+car_care_database.tableinfo.TABLE_NAME+"("
            +car_care_database.tableinfo.CAR_NAME+" TEXT,"+car_care_database.tableinfo.CAR_DOORS+" TEXT,"
            +car_care_database.tableinfo.CAR_YEAR+" TEXT,"+car_care_database.tableinfo.CAR_KILOMETRES+" TEXT,"
            +car_care_database.tableinfo.CAR_ENGINEOIL+" TEXT,"
            +car_care_database.tableinfo.CAR_AIRFILTER+" TEXT,"
            +car_care_database.tableinfo.CAR_TYRES+" TEXT,"
            +car_care_database.tableinfo.CAR_FUELTYPE+" TEXT);";
    public DataBase_Operations(Context context) {
        super(context, car_care_database.tableinfo.DATABASE_NAME , null, database_version);
        Log.d("Database operations", "Database created");

    }

    @Override
    public void onCreate(SQLiteDatabase sdb){
        sdb.execSQL(CREATE_QUERRY);
        Log.d("Database operations", "Table created");
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }
    //(DataBase_Operations dop, String name, String doors, String year, String kilometres, String engineoil, String airfilter, String tyres, String fueltype)
    public void putInfo(SQLiteDatabase dop, String name, String doors, String year, String kilometres, String engineoil, String airfilter, String tyres, String fueltype){
        //SQLiteDatabase SQ = dop.getWritableDatabase();
        ContentValues CV = new ContentValues();
        CV.put(car_care_database.tableinfo.CAR_NAME, name);
        CV.put(car_care_database.tableinfo.CAR_DOORS, doors);
        CV.put(car_care_database.tableinfo.CAR_YEAR, year);
        CV.put(car_care_database.tableinfo.CAR_KILOMETRES, kilometres);
        CV.put(car_care_database.tableinfo.CAR_ENGINEOIL, engineoil);
        CV.put(car_care_database.tableinfo.CAR_AIRFILTER, airfilter);
        CV.put(car_care_database.tableinfo.CAR_TYRES, tyres);
        CV.put(car_care_database.tableinfo.CAR_FUELTYPE, fueltype);
        //long k = SQ.insert(car_care_database.tableinfo.TABLE_NAME, null, CV);
        dop.insert(car_care_database.tableinfo.TABLE_NAME, null, CV);
        Log.d("Database operations", "One raw inserted");
    }

    //public Cursor getInfo(DataBase_Operations dop){
    //    SQLiteDatabase SQ = dop.getReadableDatabase();
     //   String[] projections = {car_care_database.tableinfo.CAR_NAME,car_care_database.tableinfo.CAR_DOORS,
      //          car_care_database.tableinfo.CAR_YEAR,car_care_database.tableinfo.CAR_KILOMETRES,
      //          car_care_database.tableinfo.CAR_ENGINEOIL,car_care_database.tableinfo.CAR_AIRFILTER,
      //          car_care_database.tableinfo.CAR_TYRES,car_care_database.tableinfo.CAR_FUELTYPE};
      //  Cursor CR = SQ.query(car_care_database.tableinfo.TABLE_NAME,projections,null,null,null,null,null);
      //  return CR;
   // }
    public Cursor getInformations(SQLiteDatabase dop){
        Cursor cursor;
        String[] projections = {car_care_database.tableinfo.CAR_NAME,car_care_database.tableinfo.CAR_DOORS,
                          car_care_database.tableinfo.CAR_YEAR,car_care_database.tableinfo.CAR_KILOMETRES,
                          car_care_database.tableinfo.CAR_ENGINEOIL,car_care_database.tableinfo.CAR_AIRFILTER,
                          car_care_database.tableinfo.CAR_TYRES,car_care_database.tableinfo.CAR_FUELTYPE};
        cursor = dop.query(car_care_database.tableinfo.TABLE_NAME,projections,null,null,null,null,null);
        return cursor;
    }

}
