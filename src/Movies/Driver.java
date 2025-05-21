// -----------------------------------------------------
// Assignment #2
// Written by: Karam Midani 40277218
// -----------------------------------------------------
package Movies;

import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * This is the driver class, it contains some methods including the main where the program is run.
 * COMP249 Assignment #2
 * Due Date: 27th March
 * @author Karam Midani, Student ID: 40277218
 */
//the movie sorting program works in 3 parts, first part is reading through different csv files and sorting their information into other csv files.
//second part is reading through the new csv files and taking their contents and creating objects out of them, then an array of those objects is created and stored in a binary file.
//third part is extracting the stored arrays and navigating through them.
public class Driver {
    /**
     *Part 1 method that does 5 things:
     * 1) Creates part 2's manifest txt file.
     * 2) Reads part 1's manifest file, which contains the names of the year csv files.
     * 3) Validates movie records found in the csv files.
     * 4) Prints invalid movie records into a separate txt file.
     * 5) Prints valid movie records into their respective genre csv files.
     * @param manifest Manifest file's name passed as string to be read.
     */
    public static void do_part1(String manifest){
        File part2_manifestFile = new File("part2_manifest.txt");
        //perform the method only if part 2 manifest file doesn't exist
        if(!part2_manifestFile.exists()){
            try {
                //create manifest txt file, and print the genre csv names to it
                PrintWriter part2_manifestWriter = new PrintWriter(new FileOutputStream("part2_manifest.txt"));
                part2_manifestWriter.println("musical.csv");
                part2_manifestWriter.println("comedy.csv");
                part2_manifestWriter.println("animation.csv");
                part2_manifestWriter.println("adventure.csv");
                part2_manifestWriter.println("drama.csv");
                part2_manifestWriter.println("crime.csv");
                part2_manifestWriter.println("biography.csv");
                part2_manifestWriter.println("horror.csv");
                part2_manifestWriter.println("action.csv");
                part2_manifestWriter.println("documentary.csv");
                part2_manifestWriter.println("fantasy.csv");
                part2_manifestWriter.println("mystery.csv");
                part2_manifestWriter.println("sci-fi.csv");
                part2_manifestWriter.println("family.csv");
                part2_manifestWriter.println("western.csv");
                part2_manifestWriter.println("romance.csv");
                part2_manifestWriter.println("thriller.csv");
                part2_manifestWriter.close();
            }
            catch (FileNotFoundException fnfe) {
                System.out.println("Cannot open the file.");
            }
            //creating scanner that reads the manifest parameter
            Scanner scannerRead = null;
            try {
                scannerRead = new Scanner(new FileInputStream(manifest));
            }
            catch (FileNotFoundException fnfe) {
                System.out.println("File not found.");
            }
            //reading the manifest file
            String movieFile = null;
            while (scannerRead.hasNextLine()) {
                movieFile = scannerRead.nextLine();
                //creating scanner that reads the current movies199X.csv files
                Scanner movieFileScanner = null;
                try {
                    movieFileScanner = new Scanner(new FileInputStream("src/Movies/Movies/" + movieFile));
                } catch (FileNotFoundException fnfe) {
                    System.out.println(movieFile + " not found.");
                    continue;
                }
                String movieString = null;
                //count that keeps up with line number
                int count = 1;
                //while loop that goes through all the movies in a csv files and sorts them
                while (movieFileScanner.hasNextLine()) {
                    //create printwriter for the invalid movies' txt file
                    PrintWriter badMovieWriter;
                    try {
                        badMovieWriter = new PrintWriter(new FileOutputStream("bad_movie_records.txt", true));
                    } catch (FileNotFoundException fnfe) {
                        System.out.println("Cannot open the file.");
                        break;
                    }
                    //split the movie string and check it's validity
                    movieString = movieFileScanner.nextLine();
                    String[] movieStringSplit = movieString.split(",");
                    try {
                        //if invalid, throws an exception
                        Movie.checkMovieValidity(movieStringSplit, movieString);
                    } catch (Exception e) {//the exception gets caught, and print the movie to the invalid movies' txt file
                        badMovieWriter.println(movieString);
                        badMovieWriter.println(e);
                        badMovieWriter.println("Error found on file: " + movieFile);
                        badMovieWriter.println("Line: " + count + "\n");
                        badMovieWriter.flush();
                        count++;
                        continue;
                    }
                    int difference = movieStringSplit.length - 10;
                    //if the movie is valid, print it into it's respective genre csv file
                    PrintWriter genreFileWriter;
                    switch (movieStringSplit[3 + difference].replace("\"", "")) {
                        case "Musical":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("musical.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Comedy":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("comedy.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Animation":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("animation.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Adventure":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("adventure.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Drama":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("drama.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Crime":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("crime.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Biography":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("biography.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Horror":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("horror.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Action":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("action.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Documentary":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("documentary.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Fantasy":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("fantasy.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Mystery":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("mystery.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Sci-Fi":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("sci-fi.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Family":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("family.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Western":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("western.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Romance":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("romance.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                        case "Thriller":
                            try {
                                genreFileWriter = new PrintWriter(new FileOutputStream("thriller.csv", true));
                                genreFileWriter.println(movieString);
                                genreFileWriter.flush();
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("Cannot open the file.");
                            }
                            count++;
                            break;
                    }
                }
            }
        }
    }
    /**
     * Part 2 method that does x things:
     * 1) Creates part 3's manifest txt file.
     * 2) Reads part 2's manifest file, which contains the names of the genre csv files.
     * 3) Reads the genre csv files, this time it counts how many lines (movie records) exist in the current genre csv file.
     * 4) Creates an array with a size that equals the count found in step 3.
     * 5) Reads the genre csv file again, this time it splits each line in the csv file into an array and creates a movie object out of it, stored in the array made in step 4.
     * 6) Creates a binary file that is respective to the current genre csv file being read, and stores the array made in step 5.
     * @param manifest Manifest file's name passed as string to be read.
     */
    public static void do_part2(String manifest){
        //check if part 3 manifest exists, if it does, don't perform the method
        File part3_manifest = new File("part3_manifest.txt");
        if(part3_manifest.exists()) {
            return;
       }
        //creating scanner that reads the manifest parameter
        Scanner manifestReader = null;
        try{
            manifestReader = new Scanner(new FileInputStream(manifest));
        }
        catch(FileNotFoundException fnfe){
            System.out.println("File doesn't exist.");
            System.exit(0);
        }
        //while loop that goes through the lines of the manifest file
        while(manifestReader.hasNextLine()){
            String genreCsvFile = manifestReader.nextLine();
            //creating printwriter that creates the genre.ser files
            PrintWriter part3_manifestFileWriter;
            try {
                part3_manifestFileWriter = new PrintWriter(new FileOutputStream("part3_manifest.txt", true));
                part3_manifestFileWriter.println(genreCsvFile.substring(0,genreCsvFile.length()-4) + ".ser");
                part3_manifestFileWriter.flush();
            } catch (FileNotFoundException fnfe) {
                System.out.println("Cannot open the file.");
                System.exit(0);
            }
            //creating scanner that reads the genre csv files
            Scanner genreCsvFileReader;
            try{
                genreCsvFileReader = new Scanner(new FileInputStream(genreCsvFile));
            }
            catch(FileNotFoundException fnfe){
                PrintWriter genreFileWriter;
                try {
                    genreFileWriter = new PrintWriter(new FileOutputStream(genreCsvFile, true));
                } catch (FileNotFoundException fnfe2) {
                    System.out.println("Cannot open the file.");
                }
                continue;
            }
            //using the scanner to count the amount of movies the genre csv files have
            int movieCount = 0;
            while(genreCsvFileReader.hasNextLine()){
                movieCount++;
                genreCsvFileReader.nextLine();
            }
            //creating a movie array with the size of the count
            Movie[] genreArray = new Movie[movieCount];
            //creating another scanner to read through the genre csv files
            Scanner genreCsvFileReader2 = null;
            try{
                genreCsvFileReader2 = new Scanner(new FileInputStream(genreCsvFile));
            }
            catch(FileNotFoundException fnfe){
                System.out.println(genreCsvFile + " doesn't exist.");
                continue;
            }
            int index = 0;
            //reading through the genre csv file again, this time to create movie objects
            while(genreCsvFileReader2.hasNextLine()){
                String movie = genreCsvFileReader2.nextLine();
                //splits the movie string, then assigns the values from the string array
                String[] splitMovie = movie.split(",");
                int difference = splitMovie.length - 10;
                String title;
                if(difference != 0) {
                    title = splitMovie[1] + ",";
                    for (int i = 1; i <= difference; i++) {
                        if(i == difference)
                            title = title + splitMovie[1+i];
                        else
                            title = title + splitMovie[1+i] + ",";
                    }
                }
                else
                    title = splitMovie[1];
                int year;
                if(splitMovie[0].charAt(0) == '"')
                    year = Integer.parseInt(splitMovie[0].substring(1,splitMovie[0].length()-1));
                else
                    year = Integer.parseInt(splitMovie[0]);
                int duration;
                if(splitMovie[2+difference].charAt(0) == '"')
                    duration = Integer.parseInt(splitMovie[2+difference].substring(1,splitMovie[2+difference].length()-1));
                else
                    duration = Integer.parseInt(splitMovie[2+difference]);
                double score;
                if(splitMovie[5+difference].charAt(0) == '"')
                    score = Double.parseDouble(splitMovie[5+difference].substring(1,splitMovie[5+difference].length()-1));
                else
                    score = Double.parseDouble(splitMovie[5+difference]);
                //creates the new movie object in the movie array
                genreArray[index] = new Movie(year, title, duration, splitMovie[3+difference], splitMovie[4+difference], score, splitMovie[6+difference], splitMovie[7+difference], splitMovie[8+difference], splitMovie[9+difference]);
                index++;
            }
            //creating a binary file and printing the movie array onto it, and then naming it in respect to the genre
            try {
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(genreCsvFile.substring(0,genreCsvFile.length()-4) + ".ser"));
                outputStream.writeObject(genreArray);
                outputStream.flush();
            }
            catch(IOException e)
            {
                System.out.println("Error writing to file.");
            }
        }
    }
    /**
     * Part 3 method that does 4 things:
     * 1) Reads part 3's manifest, which contains the names of the serializable files.
     * 2) Counts how many lines in the manifest, and creates a 2D array with the size of the 2nd dimension equals to the count.
     * 3) Reads the serialized binary files, and extracts the arrays that are inside the serialized binary files.
     * 4) Stores the extracted arrays into the 2D array created in step 2.
     * @param manifest Manifest file's name passed as string to be read.
     * @return 2D Movie array, where the first index indicates the genre, and the second index indicates the movie object.
     */
    public static Movie[][] do_part3(String manifest){
        //creating scanner that reads manifest from parameter
        Scanner manifestReader = null;
        try{
            manifestReader = new Scanner(new FileInputStream(manifest));
        }
        catch(FileNotFoundException fnfe){
            System.out.println("File doesn't exist.");
            System.exit(0);
        }
        //scanner counts how many lines in manifest
        int genreCount = 0;
        while(manifestReader.hasNextLine()){
            genreCount++;
            manifestReader.nextLine();
        }
        //creating 2D array with the 2nd dimension size being the count
        Movie[][] allMovies = new Movie[genreCount][];
        //creating 2nd reader manifest reader scanner
        Scanner manifestReader2 = null;
        try{
            manifestReader2 = new Scanner(new FileInputStream(manifest));
        }
        catch(FileNotFoundException fnfe){
            System.out.println("File doesn't exist.");
            System.exit(0);
        }
        int movieArrayIndex = 0;
        while(manifestReader2.hasNextLine()){
            String genreSerFile = manifestReader2.nextLine();
            //creating an object reader that reads the binary files and extracts the arrays made in part 2, then assigns them to the 2D array
            try {
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(genreSerFile));
                allMovies[movieArrayIndex] = (Movie[]) inputStream.readObject();
                movieArrayIndex++;
                inputStream.close();
            }
            catch(FileNotFoundException e) {
                allMovies[movieArrayIndex] = new Movie[0];
                movieArrayIndex++;
            }
            catch(ClassNotFoundException e) {
                System.out.println("Problems with file input.");
                System.exit(0);
            }
            catch(IOException e) {
                System.out.println("Problems with file input 2.");
                System.exit(0);
            }
        }
        return allMovies;
    }

    /**
     * This method will read a manifest file and create and return a string array of the genres' names in the manifest file.
     * @param manifest Manifest file's name passed as string to be read.
     * @return String array that contains the names of genres, by order of the manifest parameter.
     */
    public static String[] getGenreArrayByOrder(String manifest){
        //creating scanner that reads the manifest parameter
        Scanner manifestReader = null;
        try{
            manifestReader = new Scanner(new FileInputStream(manifest));
        }
        catch(FileNotFoundException fnfe){
            System.out.println("File not found.");
            System.exit(0);
        }
        //scanner counts how many lines are in the manifest
        int arraySize = 0;
        while(manifestReader.hasNextLine()){
            arraySize++;
            manifestReader.nextLine();
        }
        //creating an array with the size of the count
        String[] genresArray = new String[arraySize];
        //creating a scanner to read the manifest again
        Scanner manifestReader2 = null;
        try{
            manifestReader2 = new Scanner(new FileInputStream(manifest));
        }
        catch(FileNotFoundException fnfe){
            System.out.println("File not found.");
            System.exit(0);
        }
        int index = 0;
        //assigning the genres to the array by taking the name from the manifest file without the file extensions
        while(manifestReader2.hasNextLine()){
            String genre = manifestReader2.nextLine();
            genresArray[index] = genre.substring(0, genre.length()-4);
            index++;
        }
        return genresArray;
    }

    /**
     * Main method that uses all previous methods (parts 1, 2, 3), and runs a menu to navigate through the movies found in the files.
     * Also gives the choice to reset the library, in case any new updates were to occur to the original csv files.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the movie sorting program.");
        System.out.println("Created by Karam Midani.");
        //give the user the option to reset the library in case any changes happen to the original movies199X.csv files
        System.out.println("\nWould you like to reset the current library and update it?");
        System.out.print("Enter your choice (Y/N): ");
        String choice0 = scanner.next();
        while(!choice0.equalsIgnoreCase("y") && !choice0.equalsIgnoreCase("n")){
            System.out.print("Invalid input, try again: ");
            choice0 = scanner.next();
        }
        //if user wants to reset, we delete the all the files made before
        if(choice0.equalsIgnoreCase("y")){
            File dirFolder = new File(System.getProperty("user.dir"));
            File[] dirFolderFiles = dirFolder.listFiles();
            for (int i = 0; i < dirFolderFiles.length; i++) {
                if(dirFolderFiles[i].getName().contains(".ser") || dirFolderFiles[i].getName().contains(".csv") || dirFolderFiles[i].getName().contains(".txt")){
                    File file = new File(dirFolderFiles[i].getName());
                    file.delete();
                }
            }
        }
        // part 1’s manifest file
        File part1_manifestFile = new File("part1_manifest.txt");
        //if the manifest doesn't exist already, create it
        if(!part1_manifestFile.exists()){
            File movieFolder = new File("src/Movies/Movies");
            File[] movieFolderFiles = movieFolder.listFiles();
            PrintWriter manifest1Writer = null;
            try {
                manifest1Writer = new PrintWriter(new FileOutputStream("part1_manifest.txt", true));
            } catch (FileNotFoundException fnfe) {
                System.out.println("Cannot open the file.");
            }
            try{
                for (int i = 0; i < movieFolderFiles.length; i++) {
                    manifest1Writer.println(movieFolderFiles[i].getName());
                    manifest1Writer.flush();
                }
            }
            catch(NullPointerException npe){
                System.out.println("Null Pointer Exception");
                System.exit(0);
            }
        }
        final String part1_manifest = "part1_manifest.txt";
        // part 2’s manifest file
        do_part1(part1_manifest); //do part 1
        final String part2_manifest = "part2_manifest.txt";
        do_part2(part2_manifest); //do part 2
        final String part3_manifest = "part3_manifest.txt";
        Movie[][] allMovies = do_part3(part3_manifest); //do part 3
        String choice;
        String[] genresByOrder = getGenreArrayByOrder(part3_manifest); //get the genres sorted by order
        //declare and assign variables that are going to be used in the menu
        int caseSChoice = 1;
        int oldPosition = 0;
        int newPosition = 0;
        String choiceS = genresByOrder[caseSChoice-1] + " movies (" + allMovies[caseSChoice-1].length + " records)";
        //beginning of menu do while loop
        do{
            System.out.println("\n-----------------------------");
            System.out.println("\t\t  Main Menu");
            System.out.println("-----------------------------");
            System.out.println("s Select a movie array to navigate");
            System.out.println("n Navigate " + choiceS);
            System.out.println("x Exit");
            System.out.println("------------------------------");
            System.out.print("\nEnter Your Choice: ");
            choice = scanner.next().toLowerCase();
            while(!choice.equalsIgnoreCase("s") && !choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("x")){
                System.out.print("Invalid input, try again: ");
                choice = scanner.next().toLowerCase();
            }
            //switch that goes through all the choices
            switch(choice){
                //choice s allows the user to view all the genres in a different menu, displaying the genre name and how many movies of it exist in the system
                //the choice the user makes updates the menu choice n
                case "s":
                    System.out.println("-----------------------------");
                    System.out.println("\t   Genre  Sub-Menu");
                    System.out.println("-----------------------------");
                    for (int i = 0; i < genresByOrder.length; i++) {
                        System.out.println((i+1) + "  " + genresByOrder[i] + "\t\t(" + allMovies[i].length + " movies)");
                    }
                    System.out.println("18  Exit");
                    System.out.println("-----------------------------");
                    System.out.print("Enter your choice: ");
                    while(true){
                        try{
                            caseSChoice = scanner.nextInt();
                            if(caseSChoice <= 0 || caseSChoice > genresByOrder.length+1)
                                throw new Exception();
                            break;
                        }
                        catch(InputMismatchException ime){
                            System.out.print("Invalid input, try again: ");
                            scanner.next();
                        }
                        catch(Exception e){
                            System.out.print("Input can't be zero, negative, or bigger than the amount of available choices, try again: ");
                        }
                    }
                    if(caseSChoice == 18)
                        break;
                    choiceS = genresByOrder[caseSChoice-1] + " movies (" + allMovies[caseSChoice-1].length + " records)";
                    oldPosition = 0;
                    break;
                //choice n allows the user to navigate through the selected genre from choice s
                //the navigation system asks for a number of movies to display, and displays from the current position of movies to the new position of movies after the number selected
                case "n":
                    if(allMovies[caseSChoice-1].length == 0){
                        System.out.println("There aren't any " + genresByOrder[caseSChoice-1] + " movies.");
                        break;
                    }
                    System.out.println("\nNavigating " + genresByOrder[caseSChoice-1] + " movies (" + allMovies[caseSChoice-1].length + ")");
                    System.out.print("Enter your choice: ");
                    int caseNChoice;
                    while(true){
                        try{
                            caseNChoice = scanner.nextInt();
                            break;
                        }
                        catch(InputMismatchException ime){
                            System.out.print("Invalid input, try again: ");
                            scanner.next();
                        }
                    }
                    //if the number input is 0, go to the main menu again
                    if(caseNChoice == 0)
                        break;
                    //if the number is positive, change the new position to the current position plus the number minus 1
                    else if(caseNChoice > 0){
                        newPosition = oldPosition + (caseNChoice-1);
                        if(newPosition > allMovies[caseSChoice-1].length-1) {
                            newPosition = allMovies[caseSChoice - 1].length - 1;
                        }
                        for (int i = oldPosition; i <= newPosition; i++) {
                            System.out.println("\n" + allMovies[caseSChoice-1][i] + "\n");
                        }
                        if(newPosition == allMovies[caseSChoice - 1].length - 1)
                            System.out.println("\nEnd of file reached.");
                        oldPosition = newPosition;
                    }
                    //if the number is negative, change the new position to the current position plus the number plus 1
                    else{
                        newPosition = oldPosition + (caseNChoice+1);
                        if(newPosition < 0) {
                            newPosition = 0;
                        }
                        for (int i = oldPosition; i >= newPosition; i--) {
                            System.out.println("\n" + allMovies[caseSChoice-1][i] + "\n");
                        }
                        if(newPosition == 0)
                            System.out.println("\nBeginning of file reached.");
                        oldPosition = newPosition;
                    }
                    break;
                //choice x terminates the program
                case "x":
                    System.out.println("Program will now terminate.");
                    break;
            }
        }while(!choice.equalsIgnoreCase("x"));
        scanner.close();
    }
}
