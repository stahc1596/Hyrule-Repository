/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class ZeldaMain {

    private MapGUI gui;
    private Map map;
    private int row, col;
    
    public ZeldaMain(int startRow, int startCol){
        gui = new MapGUI(this);
        map = new Map(8,16,"src/HyrulePics/");
        row = startRow;
        col = startCol;
        gui.setImage(map.getLocation(row, col));
        gui.setVisible(true);
    }
    
    public void moveNorth(){
        // can we move north?
        if(row - 1 >= 0){
            row--;
            gui.setImage(map.getLocation(row, col));
        }
        
    }
    
    public void moveEast(){
        if(col + 1 < this.map.getNumCols()){
            col++;
            gui.setImage(map.getLocation(row, col));
        }
    }
    
    public void moveSouth(){
        if(row + 1 < map.getNumRows()){
            row++;
            gui.setImage(map.getLocation(row, col));
        }
    }
    
    public void moveWest(){
        if(col - 1 >= 0){
            col--;
            gui.setImage(map.getLocation(row, col));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZeldaMain game = new ZeldaMain(7,7);
    }
    
}
