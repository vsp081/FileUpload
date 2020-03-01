package com.ritsa;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class UploadFile
 */
public class UploadFile extends HttpServlet {private static final long serialVersionUID = 1L;


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	// write something
	
	ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
	
try {
List<FileItem> multifiles= sf.parseRequest(request)	;
for(FileItem item : multifiles) {
	item.write(new File("E:\\"+item.getName()));
}

System.out.println("file uploaded");
getServletContext().getRequestDispatcher("/message.jsp").forward(request, response);

} catch (FileUploadException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}	

}
}
