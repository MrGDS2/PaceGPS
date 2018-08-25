package build.free.mrgds2.onpace.Nav_Overlay;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import build.free.mrgds2.onpace.R;

public class DeveloperNotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_notes);

        int width,height;

        TextView title= (TextView) findViewById(R.id.dn_title);
        TextView body= (TextView) findViewById(R.id.dn_body);


        Typeface tf= Typeface.createFromAsset(getAssets(),"Fonts/CevicheOne-Regular.ttf");
        title.setTypeface(tf);
        body.setTypeface(tf);




        DisplayMetrics dm =new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(dm);


        width=dm.widthPixels;
        height=dm.heightPixels;


        getWindow().setLayout( width,height);




    }
}
