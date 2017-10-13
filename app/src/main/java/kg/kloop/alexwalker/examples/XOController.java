package kg.kloop.alexwalker.examples;

import android.util.Log;


/**
 * Created by alexwalker on 13.10.2017.
 */

class XOController {
    private XOModel model;
    private int turn;
    private int[][] field;

    public XOController(XOModel xoModel) {
        this.model = xoModel;
        turn = model.getTurn();
    }

    public void click(int x, int y) {
        model.setData(x, y, turn);
        checkWinner();
    }

    private void checkWinner() {
        field = model.getField();
        if(field[0][0] == 1 &&
                field[1][0] == 1 &&
                field[2][0] == 1){
            model.setWinner(1);
        } else if (field[0][0] == 2 &&
                field[1][0] == 2 &&
                field[2][0] == 2){
            model.setWinner(2);
        }
        Log.v("XOField", "" + field[0][0] + field[1][0] + field[2][0] + "\n"
                + field[0][1] + field[1][1] + field[2][1] + "\n"
                + field[0][2] + field[1][2] + field[2][2] + "\n");
    }

    public void setTurn(int turn) {
        this.turn = turn;
        model.setTurn(turn);
    }
}
