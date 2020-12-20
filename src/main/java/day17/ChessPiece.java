package day17;

public enum ChessPiece {
    KING_WHITE(100, "♔"), QUEEN_WHITE(9, "♕"), ROOK_WHITE(5, "♖"),
    BISHOP_WHITE(3.5, "♗"), KNINGH_WHITE(3, "♘"), PAWN_WHITE(1, "♙"),
    KING_BLACK(100, "♚"), QUEEN_BLACK(9, "♛"), ROOK_BLACK(5, "♜"),
    BISHOP_BLACK(3.5, "♝"), KNINGH_BLACK(3, "♞"), PAWN_BLACK(1, "♟"),
    EMPTY(-1, "_");
    private double value;
    private String figure;

    @Override
    public String toString() {
        return figure;
    }

    public String getFigure() {
        return figure;
    }

    ChessPiece(double value, String figure) {
        this.value = value;
        this.figure = figure;
    }

}

