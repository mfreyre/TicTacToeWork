import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'mfreyre' at '8/6/15 1:24 PM' with Gradle 2.5
 *
 * @author mfreyre, @date 8/6/15 1:24 PM
 */
public class BoardTest {
    @Test
    public void shouldDisplayBoard() {
        PrintStream printStream = mock(PrintStream.class);
        Board board = new Board(printStream);

        board.displayBoard();
        verify(printStream, times(5)).println(anyString());

    }
    @Test
    public void shouldMarkPositionWithSymbol() {
        PrintStream printStream = mock(PrintStream.class);
        Board board = new Board(printStream);
        String position = "1";
        String symbol = "X";
        board.setPositionToSymbol(position, symbol);


    }


}
