package helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

	public final String UPLOAD_DIR = "C:\\Users\\shivs\\OneDrive\\Desktop\\CDAC PROJECT\\Api\\src\\main\\resources\\static\\images";

  public boolean uploadFile(MultipartFile multi) {
	  
	  boolean a=false;
	  
	  try {
		  
//		  InputStream inputStream = multi.getInputStream();
//		  byte data[]=new byte[inputStream.available()];
//		  inputStream.read(data);
//		  
//		  //write
//		  FileOutputStream fos=new FileOutputStream(UPLOAD_DIR+"\\"+multi.getOriginalFilename());
//		  
//		  fos.write(data);
//		  fos.flush();
//		  fos.close();
		  
		  Files.copy(multi.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+multi.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
		  a=true;
		  
	  }catch (Exception e) {
		e.printStackTrace();
	}
	  return a;
  }

}
