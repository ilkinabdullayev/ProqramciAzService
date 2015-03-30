/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.beans;

import java.io.Serializable;
import java.util.Date;
import org.bakujug.proqramciazservice.enums.PostStatus;
import org.bakujug.proqramciazservice.enums.PostType;

/**
 *
 * @author Ilkin Abdullayev
 */
public class Post implements Serializable {

    private int id;
    private User author;
    private String content;
    private String title;
    private Post parent;
    private PostStatus postStatus;
    private PostType postType;
    private String url;
    private String mimeType;
    private boolean open;
    private Date creationDate;
    private Date modificationDate;

}
