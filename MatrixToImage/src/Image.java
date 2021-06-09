import java.awt.*;
import java.awt.image.BufferedImage;

public class Image {
    public static BufferedImage image(){
        int black = 0;
        int width = 100, height = 100;
        Color myWhite = new Color(255, 255, 255);
        int rgbW = myWhite.getRGB();
        Color myBlack = new Color(0, 0, 0);
        int rgbB = myBlack.getRGB();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                    d t = new d();
                    int ra = t.getArray(col, row);
                    if(ra == 0){
                        image.setRGB(row, col, rgbB);
                    }
                    else{
                        image.setRGB(row, col, rgbW);
                    }
            }

        }
        return image;
    }
}
