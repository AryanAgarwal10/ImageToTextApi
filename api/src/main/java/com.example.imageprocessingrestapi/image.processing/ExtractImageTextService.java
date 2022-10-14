package com.example.imageprocessingrestapi.image.processing;

import org.springframework.web.multipart.MultipartFile;

public interface ExtractImageTextService
{
    /**
     * interface to extract text from image
     * @param image
     * @return
     * @throws Exception
     */
    String extractTextFromImage (MultipartFile image) throws Exception;
}