import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GridTest {


    @Test
    public void defaultGridRowsShouldBeTen() {
        Grid grid = new Grid();
        int result = grid.getNumRows();
        assertEquals(10, result);
    }
    
    @Test
    public void gridRowsSetFromConstructor() {
        Grid grid = new Grid(5, 5);
        int result = grid.getNumRows();
        assertEquals(5, result);
    }

    @Test
    public void gridColsSetFromConstructor() {
        Grid grid = new Grid(5, 5);
        int result = grid.getNumColumns();
        assertEquals(5, result);
    }
    
    @Test
    public void defaultGridColsShouldBeTen() {
        Grid grid = new Grid();
        int result = grid.getNumColumns();
        assertEquals(10, result);
    }
    
    @Test
    public void defaultCreateBombGridShouldBeATenByTenGrid() {
        Grid grid = new Grid();
        boolean[][] result = grid.getBombGrid();
        assertEquals(10, result.length);
    }

    @Test
    public void createBombGridShouldBeSetInTheConstructor() {
        Grid grid = new Grid(5, 5);
        boolean[][] result = grid.getBombGrid();
        assertEquals(5, result.length);
    }
}
