package oddeven;
import java.io.*;
import java.io.File;  // importing the File class
import java.io.FileNotFoundException;  // importing this class for errors
import java.util.Scanner; // importing the Scanner class to read text files
public class OddEvenSorting {
public static void main(String[] args) {
	  FileWriter outputStreamEven = null;
	  FileWriter outputStreamOdd = null;
   
	try {
		outputStreamEven = new FileWriter("even.txt");
		outputStreamOdd = new FileWriter("odd.txt");
            File myObj = new File("in_2.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              int number = Integer.parseInt(data);
              if (number % 2 == 0) {
                  outputStreamEven.write(number + "\n");
              } else {
                  outputStreamOdd.write(number + "\n");
              }
            }
            myReader.close();
            if (outputStreamEven != null) {
                outputStreamEven.close();
            }
            if (outputStreamOdd != null) {
                outputStreamOdd.close();
            }
          } catch (FileNotFoundException e) {
            System.out.println("A FileNotFound error occurred.");
            e.printStackTrace();
          } catch (IOException e) {
        	  System.out.println("An IOException error occured.");
        	  e.printStackTrace();
        	  
          } 

}


}
