package main.java.representations;

import java.util.Date;

/**
 * This class respresents a user comment
 * 
 * @author Brandan Kalsow
 * @version 1.0
 */
public class Comment 
{
    private int authorID;
    private String commentBody;
    private Date createdDate;
    private Date editedDate;

    /**
     * Constructor
     * 
     * @param id The User ID of the author of this comment
     * @param comment The comment the user made.
     */
    public Comment(int id, String comment)
    {
        this.authorID = id;
        this.commentBody = comment;
        this.createdDate = new Date();
    }

    /**
     * @return the authorID
     */
    public int getAuthorID() 
    {
        return authorID;
    }

    /**
     * @return the commentBody
     */
    public String getCommentBody() 
    {
        return commentBody;
    }

    /**
     * @param commentBody the commentBody to set
     */
    public void setCommentBody(String commentBody) 
    {
        this.commentBody = commentBody;
        updateEditedDate();
    }

    /**
     * @return the createdDate
     */
    public Date getCreatedDate() 
    {
        return createdDate;
    }

    /**
     * @return the editedDate
     */
    public Date getEditedDate() 
    {
        return editedDate;
    }

    /**
     * @return true if this comment has been edited, false if it has not been edited
     */
    public boolean isEdited()
    {
        return this.editedDate != null;
    }

    /**
     * Updates the edited date to now
     */
    private void updateEditedDate()
    {
        this.editedDate = new Date();
    }
}
