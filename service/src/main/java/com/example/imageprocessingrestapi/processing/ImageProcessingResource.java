package com.example.imageprocessingrestapi.processing;
import com.example.imageprocessingrestapi.image.processing.ExtractImageTextService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,
    makeFinal = true)
public class ImageProcessingResource
{
    ExtractImageTextService extractImageTextService;

    @GetMapping(value = "/image/extract/text")
    public String updateCartItemsAsOfDate (
        @RequestParam("image")
        MultipartFile image)
    {
        String text;
        try {
            text = extractImageTextService.extractTextFromImage(image);
        }
        catch (Exception e) {
            return "Error extracting text from image:\n" + e.getMessage();
        }
        return text;
    }
}
