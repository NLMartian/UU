/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.bussiness;

import java.util.Date;
import java.util.List;
import org.uu.dao.components.PicDao;
import org.uu.dao.components.UserDao;
import org.uu.dao.model.PicComment;
import org.uu.dao.model.Picture;

/**
 *
 * @author 甲骨文
 */
public class PicManagerImpl implements PicManager{

    private UserDao userDao;
    
    private PicDao picDao;

    public void setPicDao(PicDao picDao) {
        this.picDao = picDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
    
    
    @Override
    public Picture addPic(long uid, String picPath, String description) throws Exception {
        try{
            Picture pic = new Picture();
            pic.setDescription(description);
            pic.setPicPath(picPath);
            pic.setUserinfo(userDao.getUser(uid));
            pic.setTime(new Date());
            
            picDao.addPic(pic);
            return pic;
            
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("新图片出现异常");
        }
    }

    @Override
    public PicComment addPicComment(long uid, long picId, String content) throws Exception {
        try{
            PicComment picComment = new PicComment();
            picComment.setContent(content);
            picComment.setPicture(picDao.getPicById(picId));
            picComment.setUserinfo(userDao.getUser(uid));
            picComment.setTime(new Date());
            
            picDao.addPicComment(picComment);
            return picComment;
            
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("新图片评论出现异常");
        }
    }

    @Override
    public List<Picture> getpagedPic(long uid, int start, int length) throws Exception {
        try{
            
            return picDao.getPagePic(uid, start, length);
            
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("获取分页图片出现异常");
        }
    }

    @Override
    public List<PicComment> getAllPicComment(long picId) throws Exception {
         try{
            
            return picDao.getAllPicComment(picId);
            
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("获取所有图片评论出现异常");
        }
    }
    
}
