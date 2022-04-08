package test.java.representations;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import main.java.representations.Comment;
import main.java.representations.Issue;
import main.java.representations.Priority;
import main.java.representations.StoryType;
import main.java.representations.User;

public class IssueTest 
{
    Issue issue;
    User assignee = new User("john", "doe", "jdoe", "jdoe@foo.com", 0);
    User reporter = new User("Mary", "Sue", "msue", "msue@foo.com", 1);
    String title = "Write Tests";
    String id = "TST-001";
    StoryType type = StoryType.STORY;
    String description = "Write tests to verify issues work correctly.";
    String status = "TODO";
    Priority priority = Priority.REGULAR;
    ArrayList<Comment> comments;

    @Before
    public void init()
    {
        comments = new ArrayList<>();
        comments.add(new Comment(reporter.getUserID(), "This looks great!"));
        issue = new Issue(title, id, type, description, status, priority, reporter, new Date());
        
    }

    @Test
    void testGetAssignee() 
    {
        issue.setAssignee(assignee);
        assertTrue(issue.getAssignee() == assignee);
    }

    @Test
    void testGetComments() 
    {
        assertTrue(issue.getComments() == comments);
    }

    @Test
    void testGetDescription() 
    {
        assertTrue(issue.getComments().equals(comments));
    }

    @Test
    void testGetPriority() 
    {
        assertTrue(issue.getPriority() == priority);
    }

    @Test
    void testGetReporter() 
    {
        assertTrue(issue.getReporter().equals(reporter));
    }

    @Test
    void testGetStatus() 
    {
        assertTrue(issue.getStatus() == status);
    }

    @Test
    void testGetTitle() 
    {
        assertTrue(issue.getTitle() == title);
    }

    @Test
    void testGetWatchers() 
    {
        assertTrue(issue.getWatchers().get(0).equals(reporter));
    }

    @Test
    void testSetAssignee() 
    {
        issue.setAssignee(assignee);
        assertTrue(issue.getAssignee().equals(assignee));
    }

    @Test
    void testSetComments() 
    {
        issue.addNewComment(new Comment(assignee.getUserID(), "Tests Finished!"));
        assertTrue(issue.getComments().get(1).getCommentBody().equals("Tests Finished!"));
    }

    @Test
    void testSetDescription() 
    {
        issue.setDescription("New Description");
    }

    @Test
    void testSetPriority() 
    {

    }

    @Test
    void testSetReporter() 
    {

    }

    @Test
    void testSetState() 
    {

    }

    @Test
    void testSetTitle() 
    {

    }

    @Test
    void testSetWatchers() 
    {

    }
}
