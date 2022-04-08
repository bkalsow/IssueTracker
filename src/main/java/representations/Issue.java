package main.java.representations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Issue 
{
    private String title;
    private String id;
    private StoryType type;
    private String status;
    private String description;
    private Priority priority;
    private List<Comment> comments;
    private User assignee;
    private User reporter;
    private List<User> watchers;
    private Date createdDate;
    private Date updatedDate;
    
    /**
     * @param title
     * @param id
     * @param type
     * @param description
     * @param status
     * @param priority
     * @param creator
     * @param createDate
     */
    public Issue(String title, String id, StoryType type, String description,
        String status, Priority priority, User creator, Date createDate) 
    {
        this.title = title;
        this.id = id;
        this.type = type;
        this.status = status;
        this.description = description;
        this.priority = priority;
        this.reporter = creator;
        this.createdDate = createDate;
        this.watchers = new ArrayList<>();
        watchers.add(creator);
    }

    /**
     * @return the title
     */
    public String getTitle() 
    {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) 
    {
        this.title = title;
        this.updatedDate = new Date();
    }

    /**
     * @return the description
     */
    public String getDescription() 
    {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) 
    {
        this.description = description;
        this.updatedDate = new Date();
    }

    /**
     * @return the comments
     */
    public List<Comment> getComments() 
    {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(List<Comment> comments) 
    {
        this.comments = comments;
        this.updatedDate = new Date();
    }

    /**
     * @return the priority
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * @param newPriority the priority to set
     */
    public void setPriority(Priority newPriority) {
        this.priority = newPriority;
        this.updatedDate = new Date();
    }

    /**
     * @return the assignee
     */
    public User getAssignee() {
        return assignee;
    }

    /**
     * @param assignee the assignee to set
     */
    public void setAssignee(User assignee) {
        this.assignee = assignee;
        this.watchers.add(assignee);
        this.updatedDate = new Date();
    }

    /**
     * @return the reporter
     */
    public User getReporter() {
        return reporter;
    }

    /**
     * @param reporter the reporter to set
     */
    public void setReporter(User reporter) {
        this.reporter = reporter;
        this.updatedDate = new Date();
    }

    /**
     * @return the watchers
     */
    public List<User> getWatchers() {
        return watchers;
    }

    /**
     * @param watchers the watchers to set
     */
    public void setWatchers(List<User> watchers) {
        this.watchers = watchers;
        this.updatedDate = new Date();
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
        this.updatedDate = new Date();
    }

    /**
     * @return the type
     */
    public StoryType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(StoryType type) {
        this.type = type;
        this.updatedDate = new Date();
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
        this.updatedDate = new Date();
    }

    /**
     * @return the createdDate
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        this.updatedDate = new Date();
    }

    /**
     * @return the updatedDate
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * @param updatedDate the updatedDate to set
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
        this.updatedDate = new Date();
    }
}
