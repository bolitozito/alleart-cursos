package br.com.alleartcursos.alleart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Midia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midia);
    }

    public void clickVoltar(View view) {
        finish();
    }
}
