package com.example.mypc.useofcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3,c4;
    Button btn;
    String op1,op2,op3,op4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        c4 = (CheckBox) findViewById(R.id.checkBox4);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(c1.isChecked())
                {
                    op1 = c1.getText().toString();
                }
                else
                {
                    op1 = "";
                }
                if (c2.isChecked())
                {
                    op2 = c2.getText().toString();
                }

                else
                {
                    op2 = "";
                }
                if (c3.isChecked())
                {
                    op3 = c3.getText().toString();
                }

                else
                {
                    op3 = "";
                }
                if (c4.isChecked())
                {
                    op4 = c4.getText().toString();
                }

                else
                {
                    op4 = "";
                }

                Toast.makeText(MainActivity.this,""+op1+""+op2+""+op3+""+op4,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
