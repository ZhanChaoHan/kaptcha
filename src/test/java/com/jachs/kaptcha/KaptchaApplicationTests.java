package com.jachs.kaptcha;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.code.kaptcha.impl.DefaultKaptcha;

@SpringBootTest
class KaptchaApplicationTests {
	@Autowired
	DefaultKaptcha defaultKaptcha;
	@Test
	void contextLoads() throws FileNotFoundException, IOException {
		String text=defaultKaptcha.createText();
		BufferedImage bi= defaultKaptcha.createImage(text);
		ImageIO.write(bi, "jpg", new FileOutputStream("e:\\a.jpg"));
		System.out.println(text);
	}

}