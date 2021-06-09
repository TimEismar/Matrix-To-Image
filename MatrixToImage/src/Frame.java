import javax.swing.*;

public class Frame {

        public static void main(String[] args) throws Exception{
            JFrame frame = new JFrame();
            frame.setSize(1000,1000);
            JLabel bild = new JLabel(new ImageIcon(ImageColor.image()));
            frame.add(bild);
            frame.setVisible(true);
        }
}
