package com.joshi.ocr.ocrdemo;

import com.joshi.ocr.ocrdemo.services.Ocr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OcrdemoApplicationTests {

    @Autowired private Ocr ocr;

    @Test
    public void contextLoads() {

        try {
            String path="C:/Users/Narayan Joshi/Pictures/image.pdf";
            ocr.convertToOcr(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





}


