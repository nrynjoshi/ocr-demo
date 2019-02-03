package com.joshi.ocr.ocrdemo.services;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class Ocr {

    Tesseract tesseract = new Tesseract();

    public void convertToOcr(String filename) {

        try {
            System.load("E:/workspace/ocrdemo/src/main/resources/dlls/x64/gsdll64.dll");
            String op="C:/Users/Narayan Joshi/Pictures/"+ UUID.randomUUID()+".pdf";
            tesseract.setDatapath("E:/tessdata-master/tessdata");
            List<ITesseract.RenderedFormat> list = new ArrayList<ITesseract.RenderedFormat>();
            list.add(ITesseract.RenderedFormat.PDF);


            tesseract.createDocuments(filename,op,list);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
