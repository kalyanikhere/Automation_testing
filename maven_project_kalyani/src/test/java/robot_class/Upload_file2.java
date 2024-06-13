package robot_class;

import dynamic_code.Robot_class;

public class Upload_file2 extends Robot_class {

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		hiturl("https://smallpdf.com/word-to-pdf");
		
		robot_class("//span[text()=\"Choose Files\"]", "\"C:\\Users\\kalya\\OneDrive\\Documents\\father RESUME.docx\"");

	}

}
