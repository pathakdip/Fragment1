package pathak.com.pathakproject;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    private LinearLayout l1;
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(LinearLayout)findViewById(R.id.l1 );
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                One one=new One();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.l1,one);
                ft.addToBackStack("");
                ft.commit();
            }
        } );

        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Two two=new Two();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.l1,two);
                ft.addToBackStack("");
                ft.commit();
            }
        } );

        btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               Three three=new Three();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.l1,three);
                ft.addToBackStack("");
                ft.commit();
            }
        } );
    }



}
