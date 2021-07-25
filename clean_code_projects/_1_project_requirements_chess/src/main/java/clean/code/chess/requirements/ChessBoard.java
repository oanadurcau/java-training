package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        //throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
        if (IsLegalBoardPosition(xCoordinate, yCoordinate) && pieces[xCoordinate][yCoordinate] == null) {
            pawn.setPieceColor(pieceColor);
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pawn.setChessBoard(this);
            pieces[xCoordinate][yCoordinate] = pawn;
        }
        else
        {
            pawn.setYCoordinate(-1);
            pawn.setXCoordinate(-1);
            pieces[xCoordinate][yCoordinate] = pawn;
        }

    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        //     throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
        if (xCoordinate >= 0 && xCoordinate <= 7 && yCoordinate >= 0 && yCoordinate <= 7 && pieces[xCoordinate][yCoordinate] == null)
            return true;
        return false;
    }
}
