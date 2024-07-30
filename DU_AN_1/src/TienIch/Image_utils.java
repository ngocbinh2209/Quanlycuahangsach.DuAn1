/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienIch;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author QUAN
 */
public class Image_utils {

    public static Image getImageApp() {
        URL url = Image_utils.class.getResource("/image/icon-app.png");
        return new ImageIcon(url).getImage();
    }

    public static Image getImage(String fileName) throws IOException {
        File newImage = new File("D:\\Netbean\\DU_AN_1\\src\\Image\\", fileName);
        System.out.println(newImage.getAbsoluteFile());

        Image img = ImageIO.read(newImage.getAbsoluteFile());
        return img;
    }
}
