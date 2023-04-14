# [Final Project - Part 2] Decompression : Huffman Encoding

For this assignment, you are to write a program that **decompresses** (decodes) a text file using Huffman encoding.

Use your files from **hw37-huffman**.

---

# Tasks

- Define a `decodeNext` method in `HuffmanCode.java` as described below.

- Implement a `decompress` method in the Huffman class that opens an input file containing only "0" and "1" characters in the format you developed for the compression assignment, decodes it, and writes the resulting "decompressed" data to an output file.

## Details/Hints

- Add a method to the `HuffmanCode` class that rebuilds a tree from a character input stream (`InputStreamReader` is a superclass of `FileReader`):

      private Node readTree(InputStreamReader in) throws IOException

    Read a character from the `in` stream; if it is '0', then recursively read in the left and right subtrees and create a new parent node with those subtrees. (Use any values for the character and frequency of the parent node - it doesn’t matter for the purposes of reconstructing the tree.) If the character read in is '1', then read in the next 8 "bits" into a string `s`, use `Integer.parseInt(s, 2)` to convert the string of bits to an integer and create a new leaf node with the character of that ASCII value.

    Then, provide a second constructor for the `HuffmanCode` class that takes an `InputStreamReader` object and uses the `readTree` method to reconstruct the tree for the HuffmanCode. For debugging purposes, you may also want to initialize the `code` array and `buildCode` from the reconstructed tree. 
 
- Add a method to the `HuffmanCode` class that incrementally reads "bits" from an input stream and decodes them:

      public char decodeNext(InputStreamReader in) throws IOException

    To complete this method, it may help to write a helper method that keeps track of the current node you are at in the tree. If you are at a leaf, then immediately return the character of the node. Otherwise, read a character from the in stream and recursively invoke `decodeNext` on the left or right subtree of the current node.

      private char decodeNode(InputStreamReader in, Node cur) throws IOException

- In the `main` method of your `Huffman` class, you should now be able to write:
  
      compress("short.txt", "short.comp.txt");
      decompress("short.comp.txt", "short.exp.txt");

which should produce a compressed "binary" file as "short.comp.txt" and then an uncompressed file, "short.exp.txt" that should have the same contents as the original "short.txt" file.

---

# Part 3 (challenge (optional)) - Make it "real"

(You may want to make a copy of your files in a separate package (called “real”, for example) of your project, so that you have both the string "bit" version and the actual binary version from this part.

1. Use the [BinaryOut](hw37-starter/BinaryOut.java) and [BinaryIn](hw37-starter/BinaryIn.java) classes provided in the starter code instead of a `PrintWriter` and `FileReader` to output/input the results of compressing/decompressing. This should enable you to produce real, compressed binary files!

    Note: in the process of converting to actual binary output, you will no longer need things like your `pad` function, `Integer.toBinaryString`, or `Integer.parseInt(..., 2)`. To print single bit values on a `BinaryOut` object, use `write(false)` and `write(true)` (where `false` = 0, `true` = 1). Otherwise, use `write((byte)...)` or `write((int)...)` to directly output binary encodings of 1-byte (8-bit) character codes or 32-bit integers. For reading in bits, use the `readBoolean`, `readInt`, `readByte` methods of `BinaryIn`.

2. Modify your main method to process [command-line arguments](https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html) so that your program can be run from a terminal (command-line) prompt in either compression or decompression mode:

       java Huffman compress short.txt short.comp
    or

       java Huffman decompress short.comp short.exp

    The "decompress"/"compress", and file names  will be provided to your main method as elements of the `args` array.

3. How well does your program do at compressing text files?
 

