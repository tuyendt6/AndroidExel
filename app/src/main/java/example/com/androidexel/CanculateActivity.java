package example.com.androidexel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sev_user on 4/17/2015.
 */
public class CanculateActivity extends ActionBarActivity {


    private EditText editText00;
    private EditText editText01;
    private EditText editText02;
    private EditText editText03;
    private EditText editText04;
    private EditText editText05;

    private EditText editText10;
    private EditText editText11;
    private EditText editText12;
    private EditText editText13;
    private EditText editText14;
    private EditText editText15;

    private EditText editText20;
    private EditText editText21;
    private EditText editText22;
    private EditText editText23;
    private EditText editText24;
    private EditText editText25;

    private EditText editText30;
    private EditText editText31;
    private EditText editText32;
    private EditText editText33;
    private EditText editText34;
    private EditText editText35;

    private Button btnSubmit ;
    private String result ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.canculation_layout);

        // colum 1
        editText00 =(EditText)findViewById(R.id.editText00);
        editText01 =(EditText)findViewById(R.id.editText01);
        editText02 =(EditText)findViewById(R.id.editText02);
        editText03 =(EditText)findViewById(R.id.editText03);
        editText04 =(EditText)findViewById(R.id.editText04);
        editText05 =(EditText)findViewById(R.id.editText05);

        editText10 =(EditText)findViewById(R.id.editText10);
        editText11 =(EditText)findViewById(R.id.editText11);
        editText12 =(EditText)findViewById(R.id.editText12);
        editText13 =(EditText)findViewById(R.id.editText13);
        editText14 =(EditText)findViewById(R.id.editText14);
        editText15 =(EditText)findViewById(R.id.editText15);

        editText20 =(EditText)findViewById(R.id.editText20);
        editText21 =(EditText)findViewById(R.id.editText21);
        editText22 =(EditText)findViewById(R.id.editText22);
        editText23 =(EditText)findViewById(R.id.editText23);
        editText24 =(EditText)findViewById(R.id.editText24);
        editText25 =(EditText)findViewById(R.id.editText25);

        editText30 =(EditText)findViewById(R.id.editText30);
        editText31 =(EditText)findViewById(R.id.editText31);
        editText32 =(EditText)findViewById(R.id.editText32);
        editText33 =(EditText)findViewById(R.id.editText33);
        editText34 =(EditText)findViewById(R.id.editText34);
        editText35 =(EditText)findViewById(R.id.editText35);

        btnSubmit=(Button) findViewById(R.id.btnsubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder=new StringBuilder();
                stringBuilder.append(editText00.getText().toString());
                stringBuilder.append(editText01.getText().toString());
                stringBuilder.append(editText02.getText().toString());
                stringBuilder.append(editText03.getText().toString());
                stringBuilder.append(editText04.getText().toString());
                stringBuilder.append(editText05.getText().toString());


                stringBuilder.append(editText10.getText().toString());
                stringBuilder.append(editText11.getText().toString());
                stringBuilder.append(editText12.getText().toString());
                stringBuilder.append(editText13.getText().toString());
                stringBuilder.append(editText14.getText().toString());
                stringBuilder.append(editText15.getText().toString());

                stringBuilder.append(editText20.getText().toString());
                stringBuilder.append(editText21.getText().toString());
                stringBuilder.append(editText22.getText().toString());
                stringBuilder.append(editText23.getText().toString());
                stringBuilder.append(editText24.getText().toString());
                stringBuilder.append(editText25.getText().toString());

                stringBuilder.append(editText30.getText().toString());
                stringBuilder.append(editText31.getText().toString());
                stringBuilder.append(editText32.getText().toString());
                stringBuilder.append(editText33.getText().toString());
                stringBuilder.append(editText34.getText().toString());
                stringBuilder.append(editText35.getText().toString());

                result=stringBuilder.toString();
                Intent i=new Intent(getBaseContext(),ReviewActivity.class);
                i.putExtra("result",result);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(i);
                }
        });
    }
}
