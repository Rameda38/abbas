package com.example.ademar.abbas.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ademar.abbas.R;
import com.example.ademar.abbas.fragments.ConversasFragment;
import com.example.ademar.abbas.fragments.HistoriasFragment;
import com.example.ademar.abbas.fragments.HomeFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {
    private ViewPager vp_abas;
    private SmartTabLayout stl_principal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp_abas = findViewById(R.id.vp_abas);
        stl_principal = findViewById(R.id.vpt_principal);
        //config barra
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("xVIDEOSx");

        //configurar abas
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("Home",HomeFragment.class)
                .add("Conversas",ConversasFragment.class)
                .add("Historias",HistoriasFragment.class)
                .create());


        vp_abas.setAdapter(adapter);
        stl_principal.setViewPager(vp_abas);
    }
}
