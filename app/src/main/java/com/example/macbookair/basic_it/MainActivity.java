package com.example.macbookair.basic_it;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PersonAdapter(MainActivity.this, getPersonList()));

    }


    private List<Person> getPersonList() {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Martin", "Knyazyan", true));
        personList.add(new Person("Erik", "Knyazyan", true));
        personList.add(new Person("Arman", "Knyazyan", true));
        personList.add(new Person("Saten", "Knyazyan", false));
        personList.add(new Person("Armine", "Hayrapetyan", false));
        personList.add(new Person("Ashot", "Karapetyan", true));
        personList.add(new Person("Heghine", "Barseghyan", false));
        personList.add(new Person("Arpine", "Israelyan", false));
        personList.add(new Person("Vaxo", "Simonyan", true));
        personList.add(new Person("Kim", "Kardashyan", false));
        return personList;
    }
}
