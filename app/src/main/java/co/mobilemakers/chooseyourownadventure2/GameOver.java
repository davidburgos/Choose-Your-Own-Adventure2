package co.mobilemakers.chooseyourownadventure2;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
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

        View RootView = inflater.inflate(R.layout.fragment_room,container,false);
        Random random = new Random(2);
        String parameter = (random.nextBoolean()?getString(R.string.title_win):getString(R.string.title_loose));

        TextView textViewBody = (TextView)RootView.findViewById(R.id.txtMessage);
        textViewBody.setText(parameter);

        return RootView;
    }


}
