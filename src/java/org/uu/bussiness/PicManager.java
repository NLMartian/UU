/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uu.bussiness;

import java.util.List;
import org.uu.dao.model.PicComment;
import org.uu.dao.model.Picture;

/**
 *
 * @author 甲骨文
 */
public interface PicManager {
    
    /**
     * 添加新图片
     * @param uid
     * @param pic
     * @return
     * @throws Exception 
     */
    Picture addPic(long uid, String picPath, String description)
            throws Exception;
    
    PicComment addPicComment(long uid, long picId, String content)
            throws Exception;
    
    List<Picture> getpagedPic(long uid, int start, int length)
            throws Exception;
    
    List<PicComment> getAllPicComment(long picId)
            throws Exception;
    
}
