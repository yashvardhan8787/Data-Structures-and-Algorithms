package FileHandling;

import java.io.*;
public class FileHandingDemo {
    public static void main(String[] args) throws IOException {

        // File handling operations can include creating, reading, writing, and deleting files.
        // Here are some examples of file handling operations in Java:

        // 1. Creating a file
        // Example: Creating a new file
        try {
            File newFile = new File("newfile.txt");
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
        // 2. Writing to a file
        // Example: Writing to a file
        // You can use FileWriter or BufferedWriter to write to a file.
        // For example, to write to a file, you can use FileWriter:

         FileWriter writer = new FileWriter("newfile.txt");
         writer.write("Hello, World!");
         writer.close();
         System.out.println("Successfully wrote to the file.");

        // 3. Reading from a file
        // Example: Reading from a file
        // You can use FileReader or BufferedReader to read from a file.
        // For example, to read from a file, you can use BufferedReader:
         BufferedReader reader = new BufferedReader(new FileReader("newfile.txt"));
         String line;
         while ((line = reader.readLine()) != null) {
             System.out.println(line);
         }
         reader.close();


        // 4. Deleting a file
        // Example: Deleting a file
        // You can use the delete() method of the File class to delete a file.
        // For example, to delete a file, you can use:


         File fileToDelete = new File("newfile.txt");
         if (fileToDelete.delete()) {
             System.out.println("File deleted: " + fileToDelete.getName());
         } else {
             System.out.println("Failed to delete the file.");
         }



        // 5. Checking if a file exists
        // Example: Checking if a file exists
        // You can use the exists() method of the File class to check if a file exists.
        // For example, to check if a file exists, you can use:
         File fileToCheck = new File("newfile.txt");
         if (fileToCheck.exists()) {
             System.out.println("File exists: " + fileToCheck.getAbsolutePath());
         } else {
             System.out.println("File does not exist.");
         }



        // 6. Listing files in a directory
        // Example: Listing files in a directory
        // You can use the listFiles() method of the File class to list files in a directory.
        // For example, to list files in a directory, you can use:

         File directory = new File("path/to/directory");
         File[] files = directory.listFiles();
         if (files != null) {
             for (File file : files) {
                 System.out.println(file.getName());
             }
         } else {
             System.out.println("Directory does not exist or is not a directory.");
         }



    }
}
