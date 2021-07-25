package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChesssBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    public void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY) {

        //throw new UnsupportedOperationException("Need to implement Pawn.Move()") ;
         if(movementType == movementType.MOVE)
        {
            if(this.getPieceColor() == pieceColor.BLACK)
            {
                if( this.getYCoordinate() - newY < 2 || (this.getYCoordinate() == 6 &&  this.getYCoordinate() - newY == 2))
                {
                    this.setXCoordinate(newX);
                    this.setYCoordinate(newY);
                }
            }

            if(this.getPieceColor() == pieceColor.WHITE)
            {
                if(newY - this.getYCoordinate() < 2 || (this.getYCoordinate() == 1 && newY - this.getYCoordinate() == 2))
                {
                    this.setXCoordinate(newX);
                    this.setYCoordinate(newY);
                }
            }
            
        }


    }


    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        java.lang.String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}
