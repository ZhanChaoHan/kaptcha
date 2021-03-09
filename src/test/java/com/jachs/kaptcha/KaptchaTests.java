package com.jachs.kaptcha;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.code.kaptcha.impl.DefaultKaptcha;

@SpringBootTest
public class KaptchaTests {
    @Autowired
    private DefaultKaptcha defaultKaptcha;

    @Test
    public void test1 () throws FileNotFoundException, IOException {
        String text = defaultKaptcha.createText ();
        BufferedImage bi = defaultKaptcha.createImage ( text );
        ImageIO.write ( bi, "jpg", new FileOutputStream ( KaptchaTests.class.getResource ( "" ).getPath ()+File.separator+"a.jpg" ) );
        System.out.println ( text );
    }
}
