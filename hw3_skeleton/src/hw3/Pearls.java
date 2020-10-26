package hw3;
import java.util.ArrayList;

import api.Cell;
import api.Direction;
import api.MoveRecord;
import api.State;
import api.StringUtil;

/**
 * Basic game state and operations for a the puzzle game "Pearls", which
 * is a simplified version of "Quell".
 * @author smkautz
 */
public class Pearls
{
  /**
   * Two-dimensional array of Cell objects representing the 
   * grid on which the game is played.
   */
  private Cell[][] grid;
  
  /**
   * Instance of PearlUtil to be used with this game.
   */
  private PearlUtil util;
  
  private int score = 0;
  private int moveCount = 0;// TODO - any other instance variables you need
  
  
  /**
   * Constructs a game from the given string description.  The conventions
   * for representing cell states as characters can be found in 
   * <code>StringUtil</code>.  
   * @param init
   *   string array describing initial cell states
   * @param givenUtil
   *   PearlUtil instance to use in the <code>move</code> method
   */
  public Pearls(String[] init, PearlUtil givenUtil)
  {
    grid = StringUtil.createFromStringArray(init);
    util = givenUtil;

    // TODO - any other initialization you need
  }
  
  /**
   * Returns the number of columns in the grid.
   * @return
   *   width of the grid
   */
  public int getColumns()
  {
    return grid[0].length;
  }
  
  /**
   * Returns the number of rows in the grid.
   * @return
   *   height of the grid
   */
  public int getRows()
  {
    return grid.length;
  }
  
  /**
   * Returns the cell at the given row and column.
   * @param row
   *   row index for the cell
   * @param col
   *   column index for the cell
   * @return
   *   cell at given row and column
   */
  public Cell getCell(int row, int col)
  {
    return grid[row][col];
  }
  
  /**
   * Returns true if the game is over, false otherwise.  The game ends when all pearls
   * are removed from the grid or when the player lands on a cell with spikes.
   * @return
   *   true if the game is over, false otherwise
   */
  public boolean isOver()
  {
	  if(countPearls() == 0) {
		  return true;
	  }
	  for(int i = 0; i<grid.length; i++) {
		  for(int j = 0; j<grid[0].length; i++) {
			  if(State.isSpikes(getCell(i,j).getState())) {
				  return true;
			  }
		  }
	  }
    return false;
  }
  
  /**
   * Performs a move along a state sequence in the given direction, updating the score, 
   * the move count, and all affected cells in the grid.  The method returns an 
   * array of MoveRecord objects representing the states in original state sequence before 
   * modification, with their <code>movedTo</code> and <code>disappeared</code>
   * status set to indicate the cell states' new locations after modification.  
   * @param dir
   *   direction of the move
   * @return
   *   array of MoveRecord objects describing modified cells
   */
  public MoveRecord[] move(Direction dir)
  {
    // TODO
    return null;
  }
  
  
  
  public int countPearls(){
	  
	int numOfPearls = 0;
	for(int i = 0; i< grid.length; i++) {
		for(int j = 0; j<= grid[i].length;j++) {
			if(getCell(i,j).getState() == State.PEARL) {
				numOfPearls++;
			}
		}
	}
	return numOfPearls;
	}
  public int getCurrentRow() {
	  
	int currentRow = 0;
	for(int i = 0; i<grid.length ; i++) {
		for(int j = 0; j<grid[i].length; j++) {
			if(grid[i][j].isPlayerPresent()) {
				currentRow = i;
			}
		}
	}
	  
	return currentRow;
	  
  }
  public int getCurrentColumn() {
	  
	  int currentColumn = 0;
		for(int i = 0; i<grid.length ; i++) {
			for(int j = 0; j<grid[i].length; j++) {
				if(grid[i][j].isPlayerPresent()) {
					currentColumn = j;
				}
			}
		}
	  return currentColumn;
  }
  public int getScore(){

	  return score;// TODO - everything else...
  }
  
  public boolean won() {
	  
	  if(isOver()) {
		  for(int i = 0; i<grid[i].length; i++) {
			  for(int j = 0; j<grid[0].length;j++) {
				  if(grid[i][j].isPlayerPresent()) {
					  Cell currentCell = getCell(i,j);
					  if(State.isSpikes(currentCell.getState())) {
						  return false;
					  }else {
						  return true;
					  }
				  }
			  }
		  }
	  }
	return false;
  }
  
  public State[] getStateSequence(Direction dir) {
	  ArrayList<Cell> newState = new ArrayList<>();
	  int col = getCurrentColumn();
	  int row = getCurrentColumn();
	  newState.add(grid[row][col]);
	  
	  while(!State.isBoundary(grid[row][col].getState(), false)) {
		  int tempRow = getNextRow(row,col,dir,false);
		  int tempCol = getNextColumn(row,col,dir,false);
		  row = tempRow;
		  col = tempCol;
		  newState.add(grid[row][col]);
	  }
	  
	return null;
	  
  }
  
  public int getNextRow(int row, int col, Direction dir, boolean doPortalJump) {
	  int nextRow = 0;
	  
	  if(dir == Direction.UP) {
		  if(doPortalJump == true) {
			  nextRow = grid[row - 1][col].getRowOffset() + row -1;
		  }else if(row == 0) {
			  nextRow = getRows()- 1;
		  }else {
			  nextRow = row -1;
		  }
	  }else if(dir == Direction.DOWN) {
		  if(doPortalJump == true) {
			  nextRow = grid[row+1][col].getRowOffset() + row + 1;
		  }else if(row == 0) {
			  nextRow = getRows()-1;
		  }else {
			  nextRow = row - 1;
		  }
	  }else if(dir == Direction.LEFT) {
		  if(doPortalJump == true) {
			  nextRow = grid[row][col-1].getRowOffset() + row;
		  }else{
			  nextRow = row; 
		  }
	  }else {
		  if(doPortalJump == true) {
			  nextRow = grid[row][col +1].getRowOffset() + row;
		  }else {
			  nextRow = row;
		  }
	  }
	  
	  return nextRow;
	  
  }
  
  public int getNextColumn(int row, int col, Direction dir, boolean doPortalJump) {
	  int nextColumn = 0;
	 
	  if(dir == Direction.DOWN) {
		  if(doPortalJump == true) {
			  nextColumn = grid[row + 1][col].getColumnOffset() + col;
		  }else {
			  nextColumn = col;
		  }
	  }else if(dir == Direction.UP) {
		  if(dir == Direction.UP) {
			  nextColumn = grid[row-1][col].getColumnOffset() + col;
		  }else {
			  nextColumn = col;
		  }
	  }else if(dir == Direction.RIGHT) {
		  if(doPortalJump == true) {
			  nextColumn = grid[row][col+1].getColumnOffset() + col + 1;
		  }else if(col == getColumns()-1) {
			  nextColumn = 0;
		  }else {
			  nextColumn = col + 1;
		  }
	  }else {
		  if(dir == Direction.LEFT) {
			  if(doPortalJump == true) {
				  nextColumn = grid[row][col-1].getColumnOffset() + col - 1;
			  }else if(col == 0) {
				  nextColumn = getColumns() - 1;
			  }else {
				  nextColumn = col -1;
			  }
		  }
	  }
	  return nextColumn;
  }

 public int getMoves() {
	 
	 return moveCount;
	 
 }

}
