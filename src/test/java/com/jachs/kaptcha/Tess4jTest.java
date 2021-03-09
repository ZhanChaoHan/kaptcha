package com.jachs.kaptcha;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

/**
 * @author zhanchaohan
 * @see http://tess4j.sourceforge.net/codesample.html
 */
@SpringBootTest
public class Tess4jTest {
    private ITesseract instance = new Tesseract();
    
    private static final String filePath = "e:\\ac.png";
    private static final String datapath="C:\\Users\\Jachs\\Downloads\\chi_sim.traineddata";
    @Test
    public void test1 () throws Exception {
        File file = new File(filePath);
        instance.setDatapath(datapath);
        instance.setLanguage("chi_sim");//指定需要识别的语种
        String result = instance.doOCR(file);
        System.out.println(result);
    }
}
