This project is a simple Java program that finds anagrams from a list of words.
It reads the words from an input file, groups them into sets of anagrams, and then writes the results to an output file.

How to Build the Program

Create a function that sorts each word in alphabetical order.
This sorted version of the word will serve as a unique key for identifying anagrams.
Read all words from the input file named `simple.txt`.
Store the data in a `HashMap`, where:
the key = the alphabetically sorted version of the word
the value = a list containing all words that match that sorted key
Iterate through the `HashMap` using a for-each loop and write each group of anagrams into the output file anagrams.txt.

How to Run the Program

Make sure a file named `simple.txt` exists in the same directory as your program.
It should contain several words — one per line.
Run the program from your IDE or from the command line.
After running, the program will automatically create a file named `anagrams.txt`, which will contain all detected anagram groups.
Note:
If `simple.txt` is missing or empty, the output file `anagrams.txt` will also be empty.
