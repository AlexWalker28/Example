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
                xoController.click(0, 0);
                Log.v("player turn", "It was turn of: " + xoModel.getTurn());
                if(xoModel.getWinner() == 0) {
                    if (xoModel.getTurn() == firstPlayer) {
                        button00.setText("x");
                        xoController.setTurn(secondPlayer);
                        Log.v("player turn", "Now it's turn of: " + xoModel.getTurn());
                    } else if (xoModel.getTurn() == secondPlayer) {
                        button00.setText("o");
                        xoController.setTurn(firstPlayer);
                        Log.v("player turn", "Now it's turn of: " + xoModel.getTurn());
                    }
                } else {
                    if(xoModel.getWinner() == 1){
                        button00.setText("x");
                    } else button00.setText("o");
                    playerTextView.setText("Winner is " + xoModel.getWinner());
                }
                button00.setClickable(false);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xoController.click(1, 0);
                Log.v("player turn", "It was turn of: " + xoModel.getTurn());
                if(xoModel.getWinner() == 0) {
                    if (xoModel.getTurn() == firstPlayer) {
                        button10.setText("x");
                        xoController.setTurn(secondPlayer);
                        Log.v("player turn", "Now it's turn of: " + xoModel.getTurn());
                    } else if (xoModel.getTurn() == secondPlayer) {
                        button10.setText("o");
                        xoController.setTurn(firstPlayer);
                        Log.v("player turn", "Now it's turn of: " + xoModel.getTurn());
                    }
                } else {
                    if(xoModel.getWinner() == 1){
                        button10.setText("x");
                    } else button10.setText("o");
                    playerTextView.setText("Winner is " + xoModel.getWinner());
                }
                button10.setClickable(false);
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xoController.click(2, 0);
                Log.v("player turn", "It was turn of: " + xoModel.getTurn());
                if(xoModel.getWinner() == 0) {
                    if (xoModel.getTurn() == firstPlayer) {
                        button20.setText("x");
                        xoController.setTurn(secondPlayer);
                        Log.v("player turn", "Now it's turn of: " + xoModel.getTurn());
                    } else if (xoModel.getTurn() == secondPlayer) {
                        button20.setText("o");
                        xoController.setTurn(firstPlayer);
                        Log.v("player turn", "Now it's turn of: " + xoModel.getTurn());
                    }
                } else {
                    if(xoModel.getWinner() == 1){
                        button20.setText("x");
                    } else button20.setText("o");
                    playerTextView.setText("Winner is " + xoModel.getWinner());
                }
                button20.setClickable(false);
            }
        });
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xoController.click(0, 1);
                Log.v("player turn", "It was turn of: " + xoModel.getTurn());
                if(xoModel.getWinner() == 0) {
                    if (xoModel.getTurn() == firstPlayer) {
                        button01.setText("x");
                        xoController.setTurn(secondPlayer);
                        Log.v("player turn", "Now it's turn of: " + xoModel.getTurn());
                    } else if (xoModel.getTurn() == secondPlayer) {
                        button01.setText("o");
                        xoController.setTurn(firstPlayer);
                        Log.v("player turn", "Now it's turn of: " + xoModel.getTurn());
                    }
                } else {
                    if(xoModel.getWinner() == 1){
                        button01.setText("x");
                    } else button01.setText("o");
                    playerTextView.setText("Winner is " + xoModel.getWinner());
                }
                button01.setClickable(false);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xoController.click(1, 1);
                Log.v("player turn", "It was turn of: " + xoModel.getTurn());
                if(xoModel.getWinner() == 0) {
                    if (xoModel.getTurn() == firstPlayer) {
                        button11.setText("x");
                        xoController.setTurn(secondPlayer);
                        Log.v("player turn", "Now it's turn of: " + xoModel.getTurn());
                    } else if (xoModel.getTurn() == secondPlayer) {
                        button11.setText("o");
                        xoController.setTurn(firstPlayer);
                        Log.v("player turn", "Now it's turn of: " + xoModel.getTurn());
                    }
                } else {
                    if(xoModel.getWinner() == 1){
                        button11.setText("x");
                    } else button11.setText("o");
                    playerTextView.setText("Winner is " + xoModel.getWinner());
                }
                button11.setClickable(false);
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
}
