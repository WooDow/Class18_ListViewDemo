package com.developer.scott.class18_listviewdemo;

/**
 *                  Adapter
 *                     |
 *          ------------------------
 *          |                       |
 *      ListAdapter            SpinnerAdapter
 *          |                       |
 *          ________________________
 *                     |
 *                 BaseAdapter
 *                     |
 *          ------------------------
 *          |                       |
 *     ArrayAdapter             <SimpleAdapter>
 *
 * SimpleAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to)
 *
 *
 *
 * android.R.layout.simple_list_item_1
 *      在一列中會有一個TextView
 *
 * android.R.layout.simple_list_item_2
 *      在一列中會有兩個TextView
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class ListViewDemoActivity extends AppCompatActivity {

    String[] mStrings = new String[] {
            "大餅包小餅", "蚵仔煎", "東山鴨頭", "臭豆腐", "潤餅",
            "豆花", "青蛙下蛋","豬血糕", "大腸包小腸", "鹹水雞",
            "烤香腸","車輪餅","珍珠奶茶","鹹酥雞","大熱狗",
            "炸雞排","山豬肉","花生冰","剉冰","水果冰",
            "包心粉圓","排骨酥","沙茶魷魚","章魚燒","度小月"
    };
    String[] mPlaces = new String[] {
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣",
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣",
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣",
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣",
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣",
            "台北市", "新北市"};

    private ListView lv_showList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_demo);

        findviews();
        //setListView1();
        setListView2();
    }

    private void setListView2() {

        ArrayList<HashMap<String,Object>> data = new ArrayList<>();
        for(int i = 0;i < mStrings.length;i++){
            HashMap<String,Object> items = new HashMap<>();
            items.put("foods",mStrings[i]);
            items.put("place",mPlaces[i]);
            data.add(items);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(
                this,
                data,
                android.R.layout.simple_list_item_2,
                new String[]{"foods","place"},
                new int[]{android.R.id.text1,android.R.id.text2}
        );

        lv_showList.setAdapter(simpleAdapter);
    }

    private void setListView1() {
        ArrayAdapter<String> adt = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mStrings);
        lv_showList.setAdapter(adt);
    }

    private void findviews() {
        lv_showList = findViewById(R.id.lv_showList);
    }
}
