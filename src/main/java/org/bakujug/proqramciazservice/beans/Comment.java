/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.beans;

import java.io.Serializable;
import java.util.Date;
import org.bakujug.proqramciazservice.enums.CommentType;

/**
 *
 * @author Ilkin Abdullayev
 */
public class Comment implements Serializable {
    private int id;
    private Post post;
    private User author;
    private Date creationDate;
    private String content;
    private CommentType commentType;
    private Comment parent;

}
