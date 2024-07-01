package com.helper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

    public String UPLOAD_DIR = "C:\\Users\\shivs\\OneDrive\\Desktop\\CDAC PROJECT\\Api\\src\\main\\resources\\static\\images";

    public boolean uploadFile(MultipartFile multi) {
        boolean a = false;
        try {
            Files.copy(multi.getInputStream(), Paths.get(UPLOAD_DIR + File.separator + multi.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            a = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
}
