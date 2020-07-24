package sg.edu.rp.webservices.p10knowyourfacts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {

    int count;
    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag2, container, false);
        ImageView iv1 = (ImageView)view.findViewById(R.id.myZoomageView);
        count = 0;


        iv1.setImageResource(R.mipmap.ic_launcher);
        String imageUrl = "https://www.wtffunfact.com/wp-content/uploads/2020/07/WTF-Fun-Fact-Vincent-Van-Goghs-Death.png";
        Picasso.with(this.getContext()).load(imageUrl).into(iv1);
        return view;
    }
}
