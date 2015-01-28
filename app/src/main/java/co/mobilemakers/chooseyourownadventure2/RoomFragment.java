package co.mobilemakers.chooseyourownadventure2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;
import java.util.zip.Inflater;


/**
 * A simple {@link Fragment} subclass.
 */
public class RoomFragment extends Fragment {


    public RoomFragment() {
        // Required empty public constructor

    }


    public View.OnClickListener ButtonListeners = new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            Random random = new Random(2);

            if (!random.nextBoolean()) {
                getFragmentManager().beginTransaction().
                        replace(R.id.container, (random.nextBoolean() ? new RoomFragment() : new AlleyFragment())).
                        commit();
            }else{
                getFragmentManager().beginTransaction().
                        replace(R.id.container, new GameOver()).
                        commit();
            }
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View RootView = inflater.inflate(R.layout.fragment_room,container,false);
        Button button = (Button)RootView.findViewById(R.id.button);
        Button button2 = (Button)RootView.findViewById(R.id.button2);
        button.setOnClickListener(ButtonListeners);
        button2.setOnClickListener(ButtonListeners);

        return  RootView;

    }

}
