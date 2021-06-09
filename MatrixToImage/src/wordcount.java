// Java program to count the
// number of charaters in a file
import java.io.*;

public class wordcount
{
    public int characterCount = 0;
    public int countWord = 0;
    public  void count(String path) throws IOException {
        File file = new File(path);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;

        // Initializing counters

        int sentenceCount = 0;

        int paragraphCount = 1;
        int whitespaceCount = 0;

        // Reading line by line from the
        // file until a null is returned
        while((line = reader.readLine()) != null)
        {
            if(line.equals(""))
            {
                paragraphCount++;
            } else {
                characterCount += line.length();

                // \\s+ is the space delimiter in java
                String[] wordList = line.split("\\s+");

                countWord += wordList.length;
                whitespaceCount += countWord -1;

                // [!?.:]+ is the sentence delimiter in java
                String[] sentenceList = line.split("[!?.:]+");

                sentenceCount += sentenceList.length;
            }
        }

        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Number of paragraphs = " + paragraphCount);
        System.out.println("Total number of whitespaces = " + whitespaceCount);
    }

    public int getWidth(String pa) throws IOException {
        count(pa);
        int w = characterCount /8  /countWord;
        return  w;
    }
    public int getHeight(String pa) throws IOException {
        count(pa);
        return  countWord;
    }
}
