package com.example.imageprocessingrestapi.image.processing;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE,
    makeFinal = true)
public class ExtractImageTextServiceImpl implements ExtractImageTextService
{
    ITesseract tesseract = new Tesseract();

    @Override
    public String extractTextFromImage (MultipartFile image) throws Exception
    {
        String text;
        try {
            File convFile = new File(System.getProperty("java.io.tmpdir") + "/"
                + image.getOriginalFilename());
            image.transferTo(convFile);
            text = tesseract.doOCR(convFile);
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return text;
    }
}
