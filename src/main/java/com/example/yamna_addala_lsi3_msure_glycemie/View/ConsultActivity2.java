package com.example.yamna_addala_lsi3_msure_glycemie.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.yamna_addala_lsi3_msure_glycemie.R;

public class ConsultActivity2 extends AppCompatActivity {
    private TextView tvReponse;
    private Button btnReturn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult2);
        init();

        Intent intent = getIntent();//
        String reponse =intent.getStringExtra("reponse");
        tvReponse.setText(reponse);
        btnReturn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent();
                if (reponse !=null)
                    setResult(RESULT_OK);
                else
                    setResult(RESULT_CANCELED);
            }
        });


    }
    private void init (){{
        tvReponse=( TextView)findViewById(R.id.tvReponse);
        btnReturn=(Button) findViewById(R.id.btnReturn);
    }
    }
}

