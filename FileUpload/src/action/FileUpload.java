package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUpload {
	private File file;

	// 提交过来的file的名字
	private String fileFileName;

	// 提交过来的file的MIME类型
	private String fileContentType;

	public File getFile() {
		return file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String upload() throws Exception {
	        System.out.println(file);
	        InputStream is = new FileInputStream(file);
			String tomcat_path = System.getProperty("catalina.home");
			String pic_path = tomcat_path + "\\webapps\\ROOT\\upload\\";
			
	        OutputStream os = new FileOutputStream(new File(pic_path, fileFileName));
	        
	        System.out.println("fileFileName: " + fileFileName);
	        
	        byte[] buffer = new byte[500];
	        int length = 0;
	        
	        while(-1 != (length = is.read(buffer, 0, buffer.length)))
	        
	            os.write(buffer);
	        System.out.println("ssgggg");
	        
	        os.close();
	        is.close();
		return "success";
	}

}
