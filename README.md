# Class18_ListViewDemo
ListViewDemo

                  Adapter
                     |
          ------------------------
          |                       |
      ListAdapter            SpinnerAdapter
          |                       |
          ________________________
                     |
                 BaseAdapter
                     |
          ------------------------
          |                       |
     ArrayAdapter             <SimpleAdapter>

 SimpleAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to)



 android.R.layout.simple_list_item_1
      在一列中會有一個TextView
      android.R.id.text1

 android.R.layout.simple_list_item_2
      在一列中會有兩個TextView
      android.R.id.text2
      
      
