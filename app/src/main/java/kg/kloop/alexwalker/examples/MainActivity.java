package kg.kloop.alexwalker.examples;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button00;
    Button button10;
    Button button20;
    Button button01;
    Button button11;
    Button button21;
    Button button02;
    Button button12;
    Button button22;
    Button restartButton;
    TextView playerTextView;
    ConstraintLayout constraintLayout;
    int firstPlayer = 1;
    int secondPlayer = 2;
    XOController xoController;
    XOModel xoModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button00 = (Button)findViewById(R.id.button00);
        button10 = (Button)findViewById(R.id.button10);
        button20 = (Button)findViewById(R.id.button20);
        button01 = (Button)findViewById(R.id.button01);
        button11 = (Button)findViewById(R.id.button11);
        button21 = (Button)findViewById(R.id.button21);
        button02 = (Button)findViewById(R.id.button02);
        button12 = (Button)findViewById(R.id.button12);
        button22 = (Button)findViewById(R.id.button22);
        restartButton = (Button)findViewById(R.id.restart_button);
        playerTextView = (TextView)findViewById(R.id.player_text_view);
        constraintLayout = (ConstraintLayout)findViewById(R.id.constraint_layout);
        xoModel = new XOModel();
        xoController = new XOController(xoModel);

        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickButton((Button)v, 0, 0);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickButton((Button)v, 1, 0);
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickButton((Button)v, 2, 0);
            }
        });
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickButton((Button)v, 0, 1);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickButton((Button)v, 1, 1);
            }
        });

        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xoModel = new XOModel();
                for(int i = 0; i < constraintLayout.getChildCount(); i++){
                    constraintLayout.getChildAt(i).setClickable(true);
                    //TODO: reset text on buttons
                }

            }
        });

    }

    private void clickButton(Button clickedButton, int x, int y) {
        xoController.click(x, y);
        Log.v("player turn", "It was turn of: " + xoModel.getTurn());
        if(xoModel.getWinner() == 0) {
            if (xoModel.getTurn() == firstPlayer) {
                clickedButton.setText("x");
                xoController.setTurn(secondPlayer);
                Log.v("player turn", "Now it's turn of: " + xoModel.getTurn());
            } else if (xoModel.getTurn() == secondPlayer) {
                clickedButton.setText("o");
                xoController.setTurn(firstPlayer);
                Log.v("player turn", "Now it's turn of: " + xoModel.getTurn());
            }
        } else {
            if(xoModel.getWinner() == 1){
                clickedButton.setText("x");
            } else clickedButton.setText("o");
            playerTextView.setText("Winner is " + xoModel.getWinner());
        }
        clickedButton.setClickable(false);

    }
}
