package com.joshi.ocr.ocrdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OcrdemoApplicationTests {

	@Test
	public void contextLoads() {

		Tesseract tesseract = new Tesseract();
		try {
			tesseract.setDatapath("E:/tessdata-master/tessdata-master");
			String text = tesseract.doOCR(new File("C:/Users/Narayan Joshi/Pictures/image.png"));
			System.out.print(text);
		} catch (TesseractException e) {
			e.printStackTrace();
		}
	}

}

