package org.library.windows;

import javax.swing.*;
import java.awt.*;

public class BeginTitle extends JLabel{
    public BeginTitle(){
        ImageIcon originalIcon = new ImageIcon("D:\\java项目实训\\已完成项目实例\\library\\cdutLibrary.png");
        Image image = originalIcon.getImage();

        // 调整图片大小
        Image resizedImage = image.getScaledInstance(500, 200, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        setAlignmentX(Component.CENTER_ALIGNMENT);
        setIcon(resizedIcon);

        setVisible(true);
    }


}
