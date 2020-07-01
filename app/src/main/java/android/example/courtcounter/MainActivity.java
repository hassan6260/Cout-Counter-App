package android.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAPoints;
    int teamBPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(int text) {
        TextView teamA = (TextView) findViewById(R.id.text_team_a);
        teamA.setText(String.valueOf(text));
    }

    public void display1(int text) {
        TextView teamB = (TextView) findViewById(R.id.text_team_b);
        teamB.setText(String.valueOf(text));
    }

    public void aP3(View view) {
        teamAPoints += 3;
        display(teamAPoints);
    }

    public void ap2(View view) {
        teamAPoints += 2;
        display(teamAPoints);
    }

    public void bp3(View view) {
        teamBPoints += 3;
        display1(teamBPoints);
    }

    public void bp2(View view) {
        teamBPoints += 2;
        display1(teamBPoints);
    }

    public void reset(View view) {
        teamAPoints = 0;
        teamBPoints = 0;
        display(teamAPoints);
        display1(teamBPoints);

    }

    public void aFT(View view) {
        teamAPoints += 1;
        display(teamAPoints);
    }

    public void bFT(View view) {
        teamBPoints += 1;
        display1(teamBPoints);
    }
}
