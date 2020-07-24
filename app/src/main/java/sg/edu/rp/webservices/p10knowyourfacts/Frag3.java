package sg.edu.rp.webservices.p10knowyourfacts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crazyhitty.chdev.ks.rssmanager.RssReader;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag3 extends Fragment {

    public Frag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag3, container, false);

        return view;
    }
}
