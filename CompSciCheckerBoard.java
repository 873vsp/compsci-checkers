	/*
	 * A CompSciCheckerBoard represents a playing board for a 
	 * CompSciChecker game.  In this game a board is 8x8 and starts 
	 * with black and white CompSciChecker pieces.  The fields
	 * numWhitePieces and numBlackPieces track the appropriate 
	 * number of pieces for either side.  There are 12 white 
	 * pieces starting at the top left square and fill every other space
	 * on the board for the first three rows.  No two white pieces 
	 * should be directly adjacent to start.  The same is true of the
	 * 12 black pieces but they start at the bottom right and fill the
	 * bottom three rows.  the pieces may move one space forwards, left, 
	 * right or diagonal, but may not move backwards until they first reach
	 * the opposite end of the board.  The pieces may "jump" an opposing 
	 * player in any direction as well, with the same limitation when it
	 * comes to moving backwards.
	 * 
	 * You must write the no arguments constructor to create a board,
	 * the isValidMove method, as well as the makeMove method.
	 * 
	 */
public class CompSciCheckerBoard 
{
	
	private CompSciChecker[][] board;
	private int numWhitePieces;
	private int numBlackPieces;
	
	/*
	 * Create a Constructor for the CompSciCheckerBoard
	 * Use the String "W" to denote white pieces and
	 * "B" to denote black pieces when constructed.
	 * Once created the board should look like this:
	 * 
	 *  _ _ _ _ _ _ _ _
	 * |W   W   W   W  |
	 * |  W   W   W   W|
	 * |W   W   W   W  |
	 * |               |
	 * |               |
	 * |  B   B   B   B|
	 * |B   B   B   B  |
	 * |_ B _ B _ B _ B|
	 * 
	 * Empty Spaces must have a value of null
	 * 
	 * 
	 */
	
	public CompSciCheckerBoard()
	{
		//TODO PART A GitterDone!
		
	}
	
	
	
	/**
	 * This constructor is complete and can be used to 
	 * test specific moves
	 * @param board
	 */
	public CompSciCheckerBoard(CompSciChecker[][]board)
	{
		this.board = board;
		numWhitePieces = 0;
		numBlackPieces = 0;
		for(int i = 0; i < this.board.length; i++)
		{
			for(int j = 0; j < this.board[i].length; j++)
			{
				if(this.board[i][j]!=null)
				{
					if(this.board[i][j].getColor().equals("W"))
						numWhitePieces++;
					else
						numBlackPieces++;
				}
			}
		}
		
	}
	
	
	
	/*
	 * Next you will write the method isValidMove which will
	 * take a row and column of an existing piece as well as
	 * a new row and column value and determine if the move 
	 * from the original space to the new space is legal.
	 * 
	 * A CompSciChecker piece can move one space in any forward
	 * or horizontal direction including diagonally, so long as 
	 * the space is not occupied.
	 * 
	 * A CompSciChecker piece can move backwards only if it has 
	 * first reached the opposite end of the board.
	 * 
	 * A CompSciChecker piece can move two spaces in any valid direction
	 * ONLY IF there is an opposing piece being "jumped" and the new
	 * space is not occupied.
	 * 
	 * write the method isValidMove.  return true if the desired move
	 * is valid and false if it is not.
	 */
	
	public boolean isValidMove(int originalRow, int originalColumn , int newRow, int newColumn)
	{
		//TODO Part B Gitterdone!!
		return false; //delete this return statement and write your code!
		
	}
	
	
	/*
	 * Finally you will write the method makeMove.  This method will
	 * take a row and column where a piece lies and a new row and column
	 * as arguments.  move the desired piece ONLY IF the move is valid.  
	 * If an opposing piece is "jumped" remove it from the board and 
	 * update the appropriate field.  Be sure to call validMove from
	 * this method.  
	 * 
	 */
	
	public void makeMove(int originalRow, int originalColumn , int newRow, int newColumn)
	{
		//TODO  Part C Gitterdone!!!
	}
	
	
	


	
	/**
	 * 
	 * @param x x coordinate of board
	 * @param y y coordinate of board
	 * @return the piece at the given row and col or null if no piece
	 *         is located at that location
	 */
	public CompSciChecker getPiece(int row, int col)
	{
		return board[row][col];
	}
	
	/**
	 * 
	 * @return the field board
	 */
	public CompSciChecker[][] getBoard()
	{
		return board;
	}
	
	/**
	 * 
	 * @return number of white pieces on board
	 */
	public int getNumWhitePieces()
	{
		return numWhitePieces;
	}
	
	
	/**
	 * 
	 * @return number of black pieces on board
	 */
	public int getNumBlackPieces()
	{
		return numBlackPieces;
	}
	
	/**
	 * returns a string representation of the board
	 */
	public String toString()
	{
		String str = "  _ _ _ _ _ _ _ _\n";
		for(int i = 0; i<board.length; i++)
		{
			str+= i + "|";
			for(int j = 0; j<board[i].length; j++)
			{
				if(board[i][j] != null)
					str+=board[i][j].getColor();
				else
				{
					if(i<board.length-1) str+=" ";
					else str+= "_";
				}
				if(j<board[i].length-1) str+= " ";
			}
			str+="|\n";
		}
		str+= "  0 1 2 3 4 5 6 7\n";
		return str;
	}
	
	
	
	
	

}
