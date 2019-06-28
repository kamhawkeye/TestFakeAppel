package com.kamhawk.testmoshiretrofit.ui;

import androidx.appcompat.app.AppCompatActivity;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.kamhawk.testmoshiretrofit.R;
import com.kamhawk.testmoshiretrofit.viewmodel.TestAppelViewModel;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    TestAppelViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLancerRecherche(View view) {
        Log.d(TAG, "onLancerRecherche: lancement de la recherche");

        Observable.just("one", "two", "three", "four", "five")
                .flatMap( test -> )
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe();
        
        
    }
}
