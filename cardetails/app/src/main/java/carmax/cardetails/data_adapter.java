package carmax.cardetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Root on 16/05/2016.
 */
public class data_adapter extends ArrayAdapter {
    List list= new ArrayList();
    public data_adapter(Context context, int resource) {
        super(context, resource);
    }

    static class LayoutHandler{
        TextView CARNAME,CARYEAR,CARDOORS,CARFUELTYPE,CARENGINEOIL,CARKILOMETRES,CARAIRFILTER;

    }

    @Override
    public void add(Object object){
        super.add(object);
        list.add(object);
    }
    @Override
    public int getCount(){
        return list.size();
    }
    @Override
    public Object getItem(int position){
        return super.getItem(position);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        LayoutHandler layouthandler;
        if(row == null){
            LayoutInflater layoutinflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutinflater.inflate(R.layout.row_layout,parent,false);
            layouthandler = new LayoutHandler();
            layouthandler.CARNAME = (TextView) row.findViewById(R.id.carlist_name);
            layouthandler.CARDOORS = (TextView) row.findViewById(R.id.carlist_doors);
            layouthandler.CARYEAR = (TextView) row.findViewById(R.id.carlist_year);
            layouthandler.CARFUELTYPE = (TextView) row.findViewById(R.id.carlist_fueltype);
            row.setTag(layouthandler);


        }else{
            layouthandler = (LayoutHandler) row.getTag();


        }
        data_provider dataProvider = (data_provider) this.getItem(position);
        layouthandler.CARNAME.setText(dataProvider.getCarname());
        layouthandler.CARDOORS.setText(dataProvider.getCardoors());
        layouthandler.CARYEAR.setText(dataProvider.getCaryear());
        layouthandler.CARFUELTYPE.setText(dataProvider.getCarfueltype());

        return row;
    }



}
