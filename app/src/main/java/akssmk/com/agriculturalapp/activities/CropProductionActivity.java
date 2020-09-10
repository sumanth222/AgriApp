package akssmk.com.agriculturalapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import akssmk.com.agriculturalapp.R;
import akssmk.com.agriculturalapp.adapters.MainAdapter;
import akssmk.com.agriculturalapp.modals.MainListItem;


public class CropProductionActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    ArrayList<MainListItem> list;
    MainAdapter adapter;

    Integer[] imageUrls={R.raw.wheat,R.raw.paddy};

    Integer[] hindiTexts={R.string.crop1_hi,R.string.crop2_hi,
            R.string.crop3_hi};

    Integer[] englishTexts={R.string.crop1_en,R.string.crop2_en};

    String[] backgroundColors={"#FFFFFF","#FFFFFF"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_recycler);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        list=new ArrayList<>();



        Intent[] links={
                new Intent(CropProductionActivity.this, wheatprod.class),
                new Intent(CropProductionActivity.this, paddyprod.class)
        };


        for (int i=0;i<imageUrls.length;i++)
        {
            MainListItem item=new MainListItem();
            item.setEnglishText(englishTexts[i]);
            item.setBackgroundColor(backgroundColors[i]);
            item.setImageUrl(imageUrls[i]);
            item.setIntent(links[i]);
            list.add(item);
        }

        adapter=new MainAdapter(this,list,R.layout.item_horticulture);

        mRecyclerView=(RecyclerView)findViewById(R.id.recycler);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);

        findViewById(R.id.progress).setVisibility(View.GONE);
    }




}

