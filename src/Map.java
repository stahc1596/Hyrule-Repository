
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class Map {
    
    private BufferedImage[][] map;
    
    public Map(int rows, int cols, String folder){
        // create an array to store the map in a grid
        map = new BufferedImage[rows][cols];
        // go through each row available
        for(int row = 0; row < rows; row++){
            // go through each column available
            for(int col = 0; col < cols; col++){
                // load the image into the correct spot
                map[row][col] = loadImage(folder +"map-"+row+"-"+col+".jpg");
            }
        }        
    }
    
    private BufferedImage loadImage(String name){
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File(name));
        }catch(Exception e){
            e.printStackTrace();
        }
        return img;
    }
    
    /**
     * Returns an image from the map at the (row,col)
     * @param row the row from the map
     * @param col the column from the map
     * @return the image if its a valid position, null otherwise
     */
    public BufferedImage getLocation(int row, int col){
        // check for valid spot
        if(row < map.length && col < map[0].length){
            // return a picture
            return map[row][col];
        }else{
            // return null if invalid
            return null;
        }
    }
    
    /**
     * Returns the number of rows in our map
     * @return the number of rows in our map
     */
    public int getNumRows(){
        return this.map.length;
    }
    
    /**
     * Returns the number of columns in our map
     * @return the number of columns in our map
     */
    public int getNumCols(){
        return this.map[0].length;
    }
    
}
