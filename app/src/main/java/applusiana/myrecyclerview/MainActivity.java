package applusiana.myrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvIsland;
    private ArrayList<Islands> islands = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvIsland = findViewById(R.id.rv_category);
        islands.addAll(IslandsData.getListData());

        rvIsland.setLayoutManager(new LinearLayoutManager(this));
        ListIslandsAdapter listIslandsAdapter = new ListIslandsAdapter(this);
        listIslandsAdapter.setIslands(islands);
        rvIsland.setAdapter(listIslandsAdapter);


    }


}
