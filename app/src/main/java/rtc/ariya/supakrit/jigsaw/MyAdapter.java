package rtc.ariya.supakrit.jigsaw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by supanita on 25/11/2559.
 */

public class MyAdapter extends BaseAdapter{


    private Context context;
    private int[] ints;

    public MyAdapter(Context context, int[] ints) {
        this.context = context;
        this.ints = ints;
    }

    @Override
    public int getCount() {
        return ints.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, parent, false);

        ImageView imageView = (ImageView) view1.findViewById(R.id.imageView6);

        imageView.setImageResource(ints[position]);


        return view1;
    }
}   // Main Class
