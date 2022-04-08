package test.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.java.representations.CommentTest;
import test.java.representations.IssueTest;

@RunWith(Suite.class)
@SuiteClasses({CommentTest.class, IssueTest.class})
public class AllTests 
{

}
