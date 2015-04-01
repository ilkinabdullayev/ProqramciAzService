/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bakujug.proqramciazservice.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.bakujug.proqramciazservice.enums.PostStatus;
import org.bakujug.proqramciazservice.enums.PostType;
import org.codehaus.jackson.annotate.JsonBackReference;

/**
 *
 * @author Ilkin Abdullayev
 */
@Table(name = "paz.PAZ_POST")
@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "NICKNAME", nullable = false)
    private User author;

    @Lob
    @Column(name = "CONTENT")
    private String content;

    @Column(name = "TITLE", nullable = false)
    private String title;

    
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "PARENT_POST_ID", referencedColumnName = "ID")
    private Post parent;

    @Enumerated(EnumType.STRING)
    @Column(name = "POST_TYPE", nullable = false, length = 20)
    private PostType postType;

    @Enumerated(EnumType.STRING)
    @Column(name = "POST_STATUS", nullable = false, length = 20)
    private PostStatus postStatus;

    @Column(name = "URL", nullable = false)
    private String url;

    @Column(name = "MIME_TYPE", length = 100, nullable = false)
    private String mimeType;

    @Column(name = "OPEN", nullable = false)
    private boolean open;

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "MODIFICATION_DATE")
    private Date modificationDate;  
 
    public Post() {
    }

    public Post(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Post getParent() {
        return parent;
    }

    public void setParent(Post parent) {
        this.parent = parent;
    }

    public PostStatus getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(PostStatus postStatus) {
        this.postStatus = postStatus;
    }

    public PostType getPostType() {
        return postType;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Post other = (Post) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Post{" + "id=" + id + ", title=" + title + '}';
    }
}
