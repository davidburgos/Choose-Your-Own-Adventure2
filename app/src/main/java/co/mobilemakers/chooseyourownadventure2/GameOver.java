package co.mobilemakers.chooseyourownadventure2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Random;


public class GameOver extends Fragment {


    public GameOver() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View RootView = inflater.inflate(R.layout.activity_game_over,container,false);
        Random random = new Random();
        String parameter = (random.nextInt(30)<10?getString(R.string.title_win):getString(R.string.title_lose));

        TextView textViewBody = (TextView)RootView.findViewById(R.id.txtMessage);
        textViewBody.setText(parameter);

        return RootView;
    }


}
