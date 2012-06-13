/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.dao.components;

import java.util.List;
import org.uu.dao.model.PicComment;
import org.uu.dao.model.Picture;

/**
 *
 * @author 甲骨文
 */
public interface PicDao {
    /**
     * 添加新图片
     * @param pic 
     */
    void addPic(Picture pic);
    
    /**
     * 增加
     * @param pic_comment 
     */
    void addPicComment(PicComment pic_comment);
    
    
    /**
     * 通过picId获取照片
     * @param picId
     * @return 
     */
    Picture getPicById(long picId);
    
    /**
     * 获取分页照片信息
     * @param uid
     * @param start
     * @param length
     * @return 
     */
    List<Picture> getPagePic(final long uid, final int start, final int length);
    
    /**
     * 获取所有照片评论
     * @param pic_id
     * @return 
     */
    List<PicComment> getAllPicComment(long pic_id);
}
