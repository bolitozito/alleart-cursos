package br.com.alleartcursos.alleart;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class Midia extends AppCompatActivity {

    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midia);

        video = (VideoView) findViewById(R.id.video);

        String caminho = "android.resource://br.com.alleartcursos.alleart/" + R.raw.videocursos;
        Uri u = Uri.parse(caminho);
        video.setVideoURI(u);

        video.start();
    }

    public void clickVoltar(View view) {
        finish();
    }
}
