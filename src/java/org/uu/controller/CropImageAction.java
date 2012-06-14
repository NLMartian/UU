package org.uu.controller;

import com.opensymphony.xwork2.ActionContext;
import java.io.IOException;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.uu.bussiness.UserManager;
import org.uu.dao.model.Userinfo;

public class CropImageAction extends ActionSupport{
	private String imageFile;
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int width;
	private int height;
        
        
        private UserManager mgr;

    

    public void setMgr(UserManager mgr) {
        this.mgr = mgr;
    }
	/**
	 * @param imageFile the imageFile to set
	 */
        
        
	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
	/**
	 * @return the imageFile
	 */
	public String getImageFile() {
		return imageFile;
	}
	/**
	 * @param x1 the x1 to set
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}
	/**
	 * @return the x1
	 */
	public int getX1() {
		return x1;
	}
	/**
	 * @param y1 the y1 to set
	 */
	public void setY1(int y1) {
		this.y1 = y1;
	}
	/**
	 * @return the y1
	 */
	public int getY1() {
		return y1;
	}
	/**
	 * @param x2 the x2 to set
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}
	/**
	 * @return the x2
	 */
	public int getX2() {
		return x2;
	}
	/**
	 * @param y2 the y2 to set
	 */
	public void setY2(int y2) {
		this.y2 = y2;
	}
	/**
	 * @return the y2
	 */
	public int getY2() {
		return y2;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	
	public String execute(){
		
		String path=ServletActionContext.getServletContext().getRealPath("/images/avatar/");
		String oldpath=path + File.separator + imageFile;
		setImageFile("s"+getImageFile());
		String newpath=path + File.separator +imageFile;
                
               Userinfo user = (Userinfo)
                       ActionContext.getContext().getSession().get("CurrUser");
                
		try {
			ImageUtils.cut(oldpath,newpath,this.x1,this.y1,this.width,this.height);
                        mgr.updateUserAvatar(user.getUid(), "images/avatar/" + imageFile);

                  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception ex) {
                    Logger.getLogger(CropImageAction.class.getName()).log(Level.SEVERE, null, ex);
                }
		return SUCCESS;
	}
	
	

}
