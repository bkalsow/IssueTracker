package test.java.representations;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import main.java.representations.Comment;

/**
 * For JUnit testing Comments
 * 
 * @author Brandan Kalsow
 * @version 1.0
 */
public class CommentTest 
{
    private Comment comment;
    private int authorID = 1;
    private String text = "test";
    private Date now;

    @Before
    public void init()
    {
        comment = new Comment(authorID, text);
        now = new Date();
    }

    @Test
    public void testGetAuthorID() 
    {
        assertEquals(authorID, comment.getAuthorID());
    }

    @Test
    public void testGetCommentBody() 
    {
        assertEquals(text, comment.getCommentBody());
    }

    @Test
    public void testGetCreatedDate() 
    {
        assertEquals(now, comment.getCreatedDate());
    }

    @Test
    public void testGetEditedDate() 
    {
        comment.setCommentBody("This is different");
        assertTrue(now != comment.getEditedDate());
    }

    @Test
    public void testSetCommentBody() 
    {
        comment.setCommentBody("foo");
        assertTrue(comment.getCommentBody().equals("foo"));
    }

    @Test
    public void testUpdateEditedDate() 
    {
        comment.setCommentBody("foo");
        assertTrue(comment.isEdited());
    }
}
