package kg.kloop.alexwalker.examples;

/**
 * Created by alexwalker on 13.10.2017.
 */

class XOModel {
    private int winner;
    private int turn;
    private int[][] field;

    public XOModel() {
        field = new int[3][3];
        turn = 1;
    }

    public int getWinner() {
        return winner;
    }

    public int getTurn() {
        return turn;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public int[][] getField() {
        return field;
    }

    public void setData(int x, int y, int turn) {
        field[x][y] = turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public void setField(int[][] field) {
        this.field = field;
    }
}
