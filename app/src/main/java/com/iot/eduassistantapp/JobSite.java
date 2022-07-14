package com.iot.eduassistantapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class JobSite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jop_site);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        TextView backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ImageView worknetIg = findViewById(R.id.worknetIg);
        ImageView jobkoreaIg = findViewById(R.id.jobkoreaIg);
        ImageView saraminIg = findViewById(R.id.saraminIg);
        ImageView careerIg = findViewById(R.id.careerIg);
        ImageView scoutIg = findViewById(R.id.scoutIg);
        ImageView indeedIg = findViewById(R.id.indeedIg);
        ImageView fleamarketIg = findViewById(R.id.fleamarketIg);
        ImageView jobplanetIg = findViewById(R.id.jobplanetIg);
        ImageView alioIg = findViewById(R.id.alioIg);
        ImageView peoplenjobIg = findViewById(R.id.peoplenjobIg);
        ImageView worldjobIg = findViewById(R.id.worldjobIg);
        ImageView narailteoIg = findViewById(R.id.narailteoIg);

        worknetIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.work.go.kr/seekWantedMain.do"));
                startActivity(intent);
            }
        });

        jobkoreaIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jobkorea.co.kr/"));
                startActivity(intent);
            }
        });

        saraminIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.saramin.co.kr/zf_user/"));
                startActivity(intent);
            }
        });

        careerIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.career.co.kr/Default.asp"));
                startActivity(intent);
            }
        });

        scoutIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.scout.co.kr/"));
                startActivity(intent);
            }
        });

        indeedIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kr.indeed.com/"));
                startActivity(intent);
            }
        });

        fleamarketIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.findjob.co.kr/"));
                startActivity(intent);
            }
        });

        jobplanetIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jobplanet.co.kr/job"));
                startActivity(intent);
            }
        });

        alioIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alio.go.kr/"));
                startActivity(intent);
            }
        });

        peoplenjobIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.peoplenjob.com/"));
                startActivity(intent);
            }
        });

        worldjobIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.worldjob.or.kr/"));
                startActivity(intent);
            }
        });

        narailteoIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gojobs.go.kr/mainIndex.do"));
                startActivity(intent);
            }
        });
    }
}