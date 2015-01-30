package co.mobilemakers.chooseyourownadventure2;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Random;


public class GameOver extends Fragment {

    private final static String USERNAME_PREFERENCE = "username_preference";
    private final static String WIN_MESSAGE_PREFERENCE = "message_win_preference";
    private final static String LOSE_MESSAGE_PREFERENCE = "message_lose_preference";

    String mUsername, mWin_message, mLose_message;

    public GameOver() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View RootView = inflater.inflate(R.layout.activity_game_over,container,false);
        Random random = new Random();

        displayUserInfo();

        String parameter = (random.nextInt(30)<10? mWin_message : mLose_message);
        parameter = mUsername +" "+parameter;

        TextView textViewBody = (TextView)RootView.findViewById(R.id.txtMessage);
        textViewBody.setText(parameter);

        return RootView;
    }


    private void displayUserInfo(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        mUsername = sharedPreferences.getString(USERNAME_PREFERENCE,getString(R.string.default_username));
        mWin_message = sharedPreferences.getString(WIN_MESSAGE_PREFERENCE,getString(R.string.title_win));
        mLose_message = sharedPreferences.getString(LOSE_MESSAGE_PREFERENCE,getString(R.string.title_lose));
    }
}
