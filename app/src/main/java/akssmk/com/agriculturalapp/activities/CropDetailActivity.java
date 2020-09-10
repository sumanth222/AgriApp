package akssmk.com.agriculturalapp.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;

import akssmk.com.agriculturalapp.R;
import akssmk.com.agriculturalapp.adapters.CropActivityAdapter;
import akssmk.com.agriculturalapp.modals.CropDetailItem;

public class CropDetailActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private CropActivityAdapter adapter;
    ProgressBar bar;

    ArrayList<CropDetailItem> items;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_recycler);

        Integer[] temp1=null;
        Integer[] temp2=null;

        int num=(int)getIntent().getIntExtra("number",1);



        mRecyclerView=(RecyclerView)findViewById(R.id.recycler);
        bar=(ProgressBar)findViewById(R.id.progress);
        bar.setVisibility(View.GONE);
        items=new ArrayList<>();

        int l;

        adapter=new CropActivityAdapter(this,items);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);

    }
}
