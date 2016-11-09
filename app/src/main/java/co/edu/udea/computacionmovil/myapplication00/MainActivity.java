package co.edu.udea.computacionmovil.myapplication00;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //solicitar anuncio y cargarlo en el AdView
        AdView mAdView=(AdView)findViewById(R.id.AdView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //Instanciar intersticial
        interstitialAd=new InterstitialAd(this);

        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");

        //Incluir AdListener
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
            }
        });
        requestNewInterstitial();

        Button b= (Button)findViewById(R.id.buttonS);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interstitialAd.isLoaded())
                interstitialAd.show();
                else
                    Toast.makeText(getApplicationContext(),"No se ha podido cargar el anuncio",Toast.LENGTH_LONG).show();
            }
        });

    }

    private void requestNewInterstitial() {
        AdRequest ad = new AdRequest.Builder().build();
        interstitialAd.loadAd(ad);
    }
}

