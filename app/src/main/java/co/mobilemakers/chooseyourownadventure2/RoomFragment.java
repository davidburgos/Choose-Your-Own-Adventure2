package co.mobilemakers.chooseyourownadventure2;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;


public class RoomFragment extends Fragment {


    public RoomFragment() {
        // Required empty public constructor
    }

    public View.OnClickListener ButtonListeners = new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            Random random = new Random();
            Fragment fragment = null;
            int rand = random.nextInt(100);

            switch (Level_selection.mDifficulty){
                case INSANE:
                    if(rand > 0 && rand <= 2){
                        fragment = new GameOver();
                    }else if(rand >2 && rand <=50){
                        fragment = new AlleyFragment();
                    }else if(rand >50 && rand <=100){
                        fragment = new RoomFragment();
                    }
                    break;
                case HARD:
                    if(rand > 0 && rand <= 10){
                        fragment = new GameOver();
                    }else if(rand >10 && rand <=50){
                        fragment = new RoomFragment();
                    }else if(rand >50 && rand <=100){
                        fragment = new AlleyFragment();
                    }
                    break;
                case NORMAL:
                    if(rand > 0 && rand <= 30){
                        fragment = new GameOver();
                    }else if(rand >30 && rand <=65){
                        fragment = new AlleyFragment();
                    }else if(rand >65 && rand <=100){
                        fragment = new RoomFragment();
                    }
                    break;
                case EASY:
                    if(rand > 0 && rand <= 50){
                        fragment = new GameOver();
                    }else if(rand >50 && rand <=75){
                        fragment = new AlleyFragment();
                    }else if(rand >75 && rand <=100){
                        fragment = new RoomFragment();
                    }
                    break;
                default:
                    fragment = new AlleyFragment();
                    break;
            }

            getFragmentManager().beginTransaction().
                    replace(R.id.container, fragment).
                    commit();
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
