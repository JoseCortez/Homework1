/*Filename: QuestionsAnswersTest.java
 *Name: Jose Cortez
 *Date: September 6, 2016
 *Class: CST 438
 *Description: Uses test cases to test the method "testAnswers()" in the file QuestionsAnswers.java 
 */

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;


public class QuestionsAnswersTest extends TestCase{

	@Test
	public void test() {
		QuestionsAnswers.put("What is my name", "Jozy");		//inserts some questions and answers into our hashmap
		QuestionsAnswers.put("What is a dog?", "animal");		
		QuestionsAnswers.put("Who is the best GOT character?", "Arya");
		assertEquals(true, QuestionsAnswers.testAnswers("What is my name", "Jozy"));	//tests to see if the true is returned
		assertEquals(false, QuestionsAnswers.testAnswers("What is a dog?", "Jozy"));	//tests to see if false is returned
		assertEquals(true, QuestionsAnswers.testAnswers("Who is the best GOT character?", "Arya"));	
		
	}

}
