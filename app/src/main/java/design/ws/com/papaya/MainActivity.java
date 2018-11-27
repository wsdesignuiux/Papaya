package design.ws.com.papaya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private String title[] = {"Is Paw Paw and Papaya the same thing?","Why papaya is goog for you?",
            "Why do some papayas not bear fruit?"};

    private ArrayList<BeanClassForPeople> beanClassForPeoples;

    private RecyclerView recyclerView;
    private RecycleAdapter_People mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         /*Recyclerview code is here*/


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        beanClassForPeoples = new ArrayList<>();



        for (int i = 0; i < title.length; i++) {
            BeanClassForPeople beanClassForRecyclerView_contacts = new BeanClassForPeople(title[i]);

            beanClassForPeoples.add(beanClassForRecyclerView_contacts);
        }


        mAdapter = new RecycleAdapter_People(MainActivity.this,beanClassForPeoples);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }
}
