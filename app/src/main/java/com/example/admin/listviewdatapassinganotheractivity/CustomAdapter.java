package com.example.admin.listviewdatapassinganotheractivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Admin on 4/18/2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context c;
    String[] names={"SamsungGalaxyJ5","SamsungGalaxyJ7","Motorolanexus6","MiRedMi","Appleiphone6S","AppleiPhone7"};
    String[]price={"10000","15000","20000","15000","35000","45000"};
    int[]images={R.drawable.samsunggalaxyj5,
            R.drawable.samsunggalaxyj7,
            R.drawable.motorolanexus6,
            R.drawable.miredmi,
            R.drawable.appleiphone6s,
            R.drawable.appleiphone7};

    public  CustomAdapter (Context ctx)
    {
        this.c=ctx;
    }
    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int pos) {
        return names[pos];
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View convertview, ViewGroup viewGroup) {


        if(convertview==null)
        {
            LayoutInflater inflater= (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertview=inflater.inflate(R.layout.mobiles,null);



        }

        //get view
        TextView nametxt= (TextView) convertview.findViewById(R.id.name);
        TextView pricetxt= (TextView) convertview.findViewById(R.id.price);
        ImageView img=(ImageView) convertview.findViewById(R.id.imgid);

        //set data
        nametxt.setText(names[pos]);
        pricetxt.setText(price[pos]);
        img.setImageResource(images[pos]);

        return convertview;
    }
}
