package co.mobilemakers.chooseyourownadventure2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Level_selection extends ActionBarActivity {

    public enum Difficulty {
        INSANE, HARD, NORMAL, EASY
    }

    public static Difficulty mDifficulty=Difficulty.NORMAL;

    Button mBtnHard, mBtnInsane, mBtnEasy, mBtnNormal;

    View.OnClickListener onClickButtons = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int mButtonId = v.getId();

            switch (mButtonId){
                case R.id.btnInsane:
                     mDifficulty = Difficulty.INSANE;
                     break;
                case R.id.btnHard:
                     mDifficulty = Difficulty.HARD;
                     break;
                case R.id.btnNormal:
                     mDifficulty = Difficulty.NORMAL;
                     break;
                case R.id.btnEasy:
                     mDifficulty = Difficulty.EASY;
                     break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection);

        BindObjects();
        setOnClickButtons();
    }

    private void setOnClickButtons() {
        mBtnInsane.setOnClickListener(onClickButtons);
        mBtnHard.setOnClickListener(onClickButtons);
        mBtnNormal.setOnClickListener(onClickButtons);
        mBtnEasy.setOnClickListener(onClickButtons);
    }

    private void BindObjects() {
        mBtnInsane = (Button)findViewById(R.id.btnInsane);
        mBtnHard = (Button)findViewById(R.id.btnHard);
        mBtnNormal = (Button)findViewById(R.id.btnNormal);
        mBtnEasy = (Button)findViewById(R.id.btnEasy);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_level_selection, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
