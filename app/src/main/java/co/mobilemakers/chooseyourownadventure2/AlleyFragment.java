package co.mobilemakers.chooseyourownadventure2;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlleyFragment extends Fragment {


    public AlleyFragment() {
        // Required empty public constructor
    }

    public View.OnClickListener ButtonListeners = new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            Random random = new Random();
            int rand = random.nextInt(100);

            if(rand <= 10){
                getFragmentManager().beginTransaction().
                        replace(R.id.container, new GameOver()).
                        commit();
            }else if(rand >10 && rand <=20){
                getFragmentManager().beginTransaction().
                        replace(R.id.container,  new AlleyFragment()).
                        commit();
            }else if(rand >20 && rand <=80){
                getFragmentManager().beginTransaction().
                        replace(R.id.container, new RoomFragment()).
                        commit();
            }else {
                getFragmentManager().beginTransaction().
                        replace(R.id.container, (random.nextBoolean() ? new RoomFragment() : new AlleyFragment())).
                        commit();
            }
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View RootView = inflater.inflate(R.layout.fragment_alley, container, false);

        Button button2 = (Button)RootView.findViewById(R.id.button2);
        Button button3 = (Button)RootView.findViewById(R.id.button3);
        Button button4 = (Button)RootView.findViewById(R.id.button4);

        button2.setOnClickListener(ButtonListeners);
        button3.setOnClickListener(ButtonListeners);
        button4.setOnClickListener(ButtonListeners);

        return RootView;
    }


}
