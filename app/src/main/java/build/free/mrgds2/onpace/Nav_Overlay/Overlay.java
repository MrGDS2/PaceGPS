package build.free.mrgds2.onpace.Nav_Overlay;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.widget.TextView;

import build.free.mrgds2.onpace.R;

public class Overlay extends Activity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thanks);
int width,height;

        TextView title= (TextView) findViewById(R.id.ty_title);
        TextView body= (TextView) findViewById(R.id.ty_body);
        TextView body2= (TextView) findViewById(R.id.ty_body2);

        Typeface tf= Typeface.createFromAsset(getAssets(),"Fonts/Lobster-Regular.ttf");
        title.setTypeface(tf);
        body.setTypeface(tf);
        body2.setTypeface(tf);



        DisplayMetrics dm =new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(dm);


        width=dm.widthPixels;
        height=dm.heightPixels;


        getWindow().setLayout( width,height);
    }
}
