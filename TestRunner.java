
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.io.*;
public class TestRunner {
   public static void main(String[] args) {
      int score = 0;
      try{

      Result result = JUnitCore.runClasses(CitizenTest.class,NameTest.class,
                  AddressTest.class,NameTest.class);
      int failureCount=0;		
      for (Failure failure : result.getFailures()) {
         failureCount += 1;
       }
		
      score = result.getRunCount()-failureCount;
      System.out.println(score);
      PrintWriter writer = new PrintWriter(new FileWriter("gradesheet.txt",true));
      writer.append(args[0] + " " + score+"\n");
      writer.close();
      }catch(IOException io) {
        System.out.println(io.getMessage());
        
      }catch(Exception e) {
        System.out.println(e.getMessage());
  
      }

      
   }
} 
