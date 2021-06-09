import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class ImageColor {
    private Object FileUtils;
    public static String location = "D:\\OneDrive - Wirteltor Gymnasium\\Projektkurs-PH-IF\\Simon\\Horst3.txt";

    public static BufferedImage image() throws IOException {
        siim g = new siim();



        wordcount wo = new wordcount();
        wordcount woo = new wordcount();
        int width = wo.getWidth(location);
        int height =  woo.getHeight(location);
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        System.out.println(height);

        String[] linesarr = new String[height];
    try {
        BufferedReader reader = new BufferedReader(new FileReader(location));
        String line = reader.readLine();
        int za = 0;
        while (line != null) {
            linesarr[za] = line;
            line = reader.readLine();
            za++;
        }
        reader.close();
    } catch (IOException e){e.printStackTrace();}


        for (int row = 0; row < height-1; row++) {

                    for (int col = 0; col < (width * 8) - 8; col = col + 8) {
                        //String actLine = Files.readAllLines(Paths.get(location)).get(row);
                        //String ra = Files.readAllLines(Paths.get(location)).get(row).substring(0 + col,col+8);
                        String ra = linesarr[row].substring(0 + col, col + 8);
                        Color myColor = Color.decode(ra);
                        int rgbB = myColor.getRGB();
                        image.setRGB(col / 8, row, rgbB);
                    }

            }
        return image;
        }
    }

