package com.firman.demomaterialdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import com.firman.demomaterialdesign.adapter.MahasiswaAdapter;
import com.firman.demomaterialdesign.model.Mahasiswa;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    public void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));
        mahasiswaArrayList.add(new Mahasiswa("Firman", "11144015", "11440155"));


    }

}