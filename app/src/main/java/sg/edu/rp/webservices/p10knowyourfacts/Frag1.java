package sg.edu.rp.webservices.p10knowyourfacts;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {

    int count;
    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_frag1, container, false);
        Button btnChange = (Button)view.findViewById(R.id.btnChangeColour);
        final FrameLayout fl = (FrameLayout)view.findViewById(R.id.idFrame1);
        count = 0;
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 0){
                    fl.setBackgroundColor(Color.RED);
                    count += 1;
                } else if (count == 1) {
                    fl.setBackgroundColor(Color.YELLOW);
                    count += 1;
                } else if (count == 2) {
                    fl.setBackgroundColor(Color.GREEN);
                    count += 1;
                } else if (count == 3) {
                    fl.setBackgroundColor(Color.BLUE);
                    count = -1;
                } else {
                    fl.setBackgroundColor(Color.WHITE);
                    count += 1;
                }
            }
        });
        return view;
    }
}
