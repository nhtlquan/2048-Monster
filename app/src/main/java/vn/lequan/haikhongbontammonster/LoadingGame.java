package vn.lequan.haikhongbontammonster;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoadingGame extends AppCompatActivity implements View.OnClickListener {
    private Button easy, hard, veryhard;
    private boolean isFirstOpenApp, doubleBackToExitPressedOnce;
    public static SharedPreferences sharedpreferences, sharedpreferences1;
    private static final String MyPREFERENCES = "DANHGIA";
    int PRIVATE_MODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_game);
        easy = (Button) findViewById(R.id.easy);
        sharedpreferences = getApplicationContext().getSharedPreferences(MyPREFERENCES, PRIVATE_MODE);
        hard = (Button) findViewById(R.id.hard);
        veryhard = (Button) findViewById(R.id.veryhard);
        easy.setOnClickListener(this);
        hard.setOnClickListener(this);
        veryhard.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.easy:
                GlobalApp.numSquaresX = 6;
                GlobalApp.numSquaresY = 6;
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.hard:
                GlobalApp.numSquaresX = 5;
                GlobalApp.numSquaresY = 5;
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.veryhard:
                GlobalApp.numSquaresX = 4;
                GlobalApp.numSquaresY = 4;
                Intent intent2 = new Intent(this, MainActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
