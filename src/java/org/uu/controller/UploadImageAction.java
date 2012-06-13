package org.uu.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.swing.ImageIcon;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import java.text.SimpleDateFormat;


public class UploadImageAction extends ActionSupport {
	private static final int BUFFER_SIZE = 16 * 1024;

	private File image;
	private String imageFileName;
	private String imageContentType;
	private int imageHeigth;
	private int imageWidth;
        
	/**
	 * @param image
	 *            the image to set
	 */
	public void setImage(File image) {
		this.image = image;
	}

	/**
	 * @return the image
	 */
	public File getImage() {
		return image;
	}

	/**
	 * @param imageFileName
	 *            the imageFileName to set
	 */
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	/**
	 * @return the imageFileName
	 */
	public String getImageFileName() {
		return imageFileName;
	}

	/**
	 * @param imageContentType
	 *            the imageContentType to set
	 */
	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}

	/**
	 * @return the imageContentType
	 */
	public String getImageContentType() {
		return imageContentType;
	}

	private static String getExtention(String fileName) {
		int pos = fileName.lastIndexOf(".");
		return fileName.substring(pos);
	}

        
	public String execute() {
                System.out.println(imageFileName);
		imageFileName = new Date().getTime() + getExtention(imageFileName);
                System.out.println(imageFileName);
                System.out.println(new Date().getTime());
                Date date = new Date();
                SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
                System.out.println(sf.format(date));

                
		File imageFile = new File(ServletActionContext.getServletContext()
				.getRealPath("/images/avatar/")
				+ "/" + imageFileName);
                
		try {
			FileUtils.copyFile(image, imageFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageIcon bi=new ImageIcon(imageFile.getPath());
		System.out.println(bi.getIconHeight()+" "+bi.getIconWidth());
		setImageHeigth(bi.getIconHeight());
		setImageWidth(bi.getIconWidth());
		return SUCCESS;
	}

	/**
	 * @param imageHeigth the imageHeigth to set
	 */
	public void setImageHeigth(int imageHeigth) {
		this.imageHeigth = imageHeigth;
	}

	/**
	 * @return the imageHeigth
	 */
	public int getImageHeigth() {
		return imageHeigth;
	}

	/**
	 * @param imageWidth the imageWidth to set
	 */
	public void setImageWidth(int imageWidth) {
		this.imageWidth = imageWidth;
	}

	/**
	 * @return the imageWidth
	 */
	public int getImageWidth() {
		return imageWidth;
	}
}
