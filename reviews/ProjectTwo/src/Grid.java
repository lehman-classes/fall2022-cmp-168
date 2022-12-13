public class Grid {

    private int rows = 10;
    private int cols = 10;
    private boolean[][] bombGrid;

    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.bombGrid = new boolean[rows][cols];
    }

    public Grid() {
        this.bombGrid = new boolean[rows][cols];
    }

    public int getNumRows() {
        return rows;
    }

    public int getNumColumns() {
        return cols;
    }

    public boolean[][] getBombGrid() {
        return bombGrid;
    }
    
}
