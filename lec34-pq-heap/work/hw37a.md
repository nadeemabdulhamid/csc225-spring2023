# [Final Project - Part 1] Compression : Huffman Encoding

For this assignment, you are to write a program that compresses (encodes) a text file using Huffman encoding.

Create a new project named **hw37-huffman**. A set of initial code files are provided here:
 - [hw37-starter-code](./hw37-starter/)

You will also need your completed `FrequencyTable` from an [earlier homework](../../lec30-hash/work/hw30.md#dictionariesmaps-hashing-introduction).

Here are some slides that cover what we went over in lecture
 - [Compression and encodings, including Huffman](https://algs4.cs.princeton.edu/lectures/keynote/55DataCompression-2x2.pdf)
  - [Huffman coding demo (movie file)](https://algs4.cs.princeton.edu/lectures/demo/55DemoHuffman.mov)

---

# Tasks

1. Complete the `buildTree` method definition in `HuffmanCode`.

    Once you have it completed, you can examine the output of the `main` method in `Huffman.java` when run on the `short.txt` input file.

2. Develop a `compress` method in the `Huffman` class:

       public static void compress(String inFile, String outFile)

that opens the input file with given name, reads it in character by character (use `FileReader`, as in the `FrequencyTable` constructor), builds a Huffman encoding, and writes out a "binary" file containing "0" and "1" characters with the encoded data. The output file should also contain a representation of the Huffman tree itself, so that the encoding can be reconstructed and the file can later be decompressed.

## Details/Hints:

- Use a `PrintWriter` object to write character data to an output file:

    PrintWriter out = new PrintWriter(outFile);

You can use `print`/`printf`/`println` statements on the `out` object.

- Here is an approach to storing a binary tree as a binary sequence: Starting at the root, recursively perform a *preorder* traversal of all the nodes of the tree. As you visit each node, if it is an internal (non-leaf) node, then print a "0". Otherwise, for a leaf node, print a "1" and then an 8-bit representation (see next point) of the ASCII code for the character at that leaf. 

    Here is a screencast explaining this: https://mediaspace.berry.edu/media/huffman+binary+tree+encoding/1_0ucvoou8
  
- The following statement converts a character to "binary” representation as a String, uses a helper function, `pad` (that you would have to write), to fill in any extra `"0"`s to the left to make it 8-bits long, and prints it to an output PrintWriter object.

       out.print(pad(Integer.toBinaryString(ch), 8));
 

# Example

As an example, consider the following input file:

    aacabbaaaabbaaa

The Huffman encoding for this should produce the following frequencies and binary codes:

```
a (10): 1
b (4): 01
c (1): 00
```

The resulting ‘compressed’ output file should contain the following. (I broke this into 3 lines here to help distinguish the pieces, but all the 0’s and 1’s should really be in a single line in the output file.)

```
00101100011101100010101100001        // an encoding of the tree
00000000000000000000000000001111     // total number of characters = 15
11001010111110101111                 // the actual encoded bits
```

The underlined portions of the tree encoding are the binary representations of the standard ASCII codes for:

 - c = 99<sub>(base_10)</sub> = 0110 0011
 - b = 98<sub>(base_10)</sub> = 0110 0010
 - a = 97<sub>(base_10)</sub> = 0110 0001


***Note:*** In all the above description, I refer to the output as "binary" but it is really not. That is, when you store a "0" character in a text file, what really gets stored is the 8-bit ASCII representation of the "0" character, which is 00110000. So actually, the "compression" at this point will actually result in a greatly expanded file, because every "bit" of output is actually being stored (inefficiently) as 8 bits. For part 3 of this assignment, you may work on using a true binary output stream to really write out individual bits to a file. That will result in a true compression program.



---

<center>
<img src="../../3d-small-people-all-is-well-a-little-man-lies-on-a-big-positive-symbol-drawing_csp25435404.jpg" width="150px"></center>

