package com.example.lab3_3;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mediaPlayer;
    private int elainLuokka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.first_image_id).setOnClickListener(this);
        findViewById(R.id.second_image_id).setOnClickListener(this);
        findViewById(R.id.third_image_id).setOnClickListener(this);
        findViewById(R.id.fourth_image_id).setOnClickListener(this);

        elainLuokka = 0;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == R.id.birds_item) {
            ((ImageView)findViewById(R.id.first_image_id)).setImageResource(R.drawable.huuhkaja);
            ((ImageView)findViewById(R.id.second_image_id)).setImageResource(R.drawable.peippo);
            ((ImageView)findViewById(R.id.third_image_id)).setImageResource(R.drawable.peukaloinen);
            ((ImageView)findViewById(R.id.fourth_image_id)).setImageResource(R.drawable.punatulkku);
            elainLuokka = 1;

        }
        else if (item.getItemId() == R.id.mammals_item) {
            ((ImageView)findViewById(R.id.first_image_id)).setImageResource(R.drawable.bear);
            ((ImageView)findViewById(R.id.second_image_id)).setImageResource(R.drawable.wolf);
            ((ImageView)findViewById(R.id.third_image_id)).setImageResource(R.drawable.elephant);
            ((ImageView)findViewById(R.id.fourth_image_id)).setImageResource(R.drawable.lamb);
            elainLuokka = 0;

        }

        return true;
    }

    @Override
    public void onClick(View v) {

        if (elainLuokka == 0) {

            if (v.getId() == R.id.first_image_id) {
                mediaPlayer = MediaPlayer.create(this, R.raw.bear);
                mediaPlayer.start();
            } else if (v.getId() == R.id.second_image_id) {
                mediaPlayer = MediaPlayer.create(this, R.raw.wolf);
                mediaPlayer.start();
            } else if (v.getId() == R.id.third_image_id) {
                mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
                mediaPlayer.start();
            } else if (v.getId() == R.id.fourth_image_id) {
                mediaPlayer = MediaPlayer.create(this, R.raw.lamb);
                mediaPlayer.start();
            }
        }
        else if (elainLuokka == 1) {
            if (v.getId() == R.id.first_image_id) {
                mediaPlayer = MediaPlayer.create(this, R.raw.huuhkaja_norther_eagle_owl);
                mediaPlayer.start();
            } else if (v.getId() == R.id.second_image_id) {
                mediaPlayer = MediaPlayer.create(this, R.raw.peippo_chaffinch);
                mediaPlayer.start();
            } else if (v.getId() == R.id.third_image_id) {
                mediaPlayer = MediaPlayer.create(this, R.raw.peukaloinen_wren);
                mediaPlayer.start();
            } else if (v.getId() == R.id.fourth_image_id) {
                mediaPlayer = MediaPlayer.create(this, R.raw.punatulkku_northern_bullfinch);
                mediaPlayer.start();
            }
        }
    }
}
