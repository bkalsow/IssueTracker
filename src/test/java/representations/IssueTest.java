package test.java.representations;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import main.java.representations.Comment;
import main.java.representations.Issue;
import main.java.representations.Priority;
import main.java.representations.Status;
import main.java.representations.StoryType;
import main.java.representations.User;

public class IssueTest 
{
    private User assignee = new User("john", "doe", "jdoe", "jdoe@foo.com", 0);
    private User reporter = new User("Mary", "Sue", "msue", "msue@foo.com", 1);
    private User watcher = new User("Steve", "Observer", "SObs", "obs@bar.com", 2);
    private String title = "Write Tests";
    private String id = "TST-001";
    private StoryType type = StoryType.STORY;
    private String description = "Write tests to verify issues work correctly.";
    private Status status = Status.TODO;
    private Priority priority = Priority.REGULAR;
    private ArrayList<Comment> comments;
    private Issue issue = new Issue(title, id, type, description, status, priority, reporter, new Date());

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
        assertTrue(issue.getDescription().equals(description));
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
    void testAddComment() 
    {
        issue.addNewComment(new Comment(assignee.getUserID(), "Tests Finished!"));
        assertTrue(issue.getComments().get(0).getCommentBody().equals("Tests Finished!"));
    }

    @Test
    void testSetDescription() 
    {
        issue.setDescription("New Description");
        assertTrue(issue.getDescription().equals("New Description"));
    }

    @Test
    void testSetPriority() 
    {
        issue.setPriority(Priority.HIGH);
        assertTrue(issue.getPriority() == Priority.HIGH);
    }

    @Test
    void testSetReporter() 
    {
        issue.setReporter(assignee);
        assertTrue(issue.getReporter().getUserID() == assignee.getUserID());
    }

    @Test
    void testSetStatus() 
    {
        issue.setStatus(Status.INPROGRESS);
        assertTrue(issue.getStatus().equals(Status.INPROGRESS));
    }

    @Test
    void testSetTitle() 
    {
        issue.setTitle("foo");
        assertTrue(issue.getTitle().equals("foo"));
    }

    @Test
    void testToggleWatchingAddsNewWatcher() 
    {
        issue.toggleWatching(watcher);
        assertTrue(issue.getWatchers().contains(watcher));
    }

    @Test
    void testToggleWatchingRemovesExistingWatcher() 
    {
        issue.toggleWatching(watcher);
        issue.toggleWatching(watcher);
        assertFalse(issue.getWatchers().contains(watcher));
    }
}
