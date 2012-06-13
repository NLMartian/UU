/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.controller;

import com.opensymphony.xwork2.ActionContext;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.uu.bussiness.PicManager;
import org.uu.dao.model.Userinfo;

/**
 *
 * @author 甲骨文
 */
public class AddNewPic extends BaseAction{
    private static final int BUFFER_SIZE = 16 * 1024;

	private File image;
        
        private String description;
        
	private String imageFileName;
	private String imageContentType;
	
        private PicManager picMgr;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setPicMgr(PicManager picMgr) {
            this.picMgr = picMgr;
        }
        
        
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
				.getRealPath("/images/user_upload/")
				+ "/" + imageFileName);
                
                Userinfo user = (Userinfo)ActionContext.getContext().getSession().get("CurrUser");
                
		try {
			FileUtils.copyFile(image, imageFile);
                        
                        picMgr.addPic(user.getUid(), "images/user_upload/"+ imageFileName, description);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e){
                    e.printStackTrace();
                }
                
		ImageIcon bi=new ImageIcon(imageFile.getPath());
		System.out.println(bi.getIconHeight()+" "+bi.getIconWidth());

		return SUCCESS;
	}

}
