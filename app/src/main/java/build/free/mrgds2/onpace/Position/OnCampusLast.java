package build.free.mrgds2.onpace.Position;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;

import com.google.android.gms.maps.model.LatLng;

import java.util.Hashtable;

import build.free.mrgds2.onpace.Maps.PaceMaps;
import build.free.mrgds2.onpace.R;




public class OnCampusLast {

    private PaceMaps buildings= new PaceMaps();
    private Hashtable<Integer, LatLng> iconTable;
  //  public  Integer mrkicon;

    String TAG="return X";

    public OnCampusLast(Context context) {

        iconTable=new Hashtable<Integer, LatLng>();


        iconTable.put(R.drawable.art_mker,buildings.PaceUniPLV_Art);
      // iconTable.put(R.drawable.bus_stop,buildings.PaceUniPLV_BUS_MILLER);

    }


    public Integer IconSetBasedOnLastPosition(LatLng position)
    {



    System.out.println("position:" +position);

        for(Integer x:  iconTable.keySet())
        {
            if(iconTable.containsValue(position))
            {
                System.out.println("positionX:" + iconTable.get(x) + String.valueOf(R.drawable.art_mker));

                return x;
            }
        }

        //return something
        return -1 ;
    }





}
