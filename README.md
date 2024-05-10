# Overview
This README provides guidance on performing file operations in Java using FileInputStream and FileOutputStream classes.
These classes are part of Java's input/output (I/O) package and are used for reading from and writing to files, respectively.

# Concepts Covered
# 1. Write to a File
* Description: Writing data to a file involves creating an output stream to the file and using methods provided by FileOutputStream to write data.
* Key Steps:
    
  -> Create an instance of FileOutputStream with the file name.
    
  -> Use the write() method to write data to the output stream.
  
  -> Close the stream to release system resources.
# 2. Read from a File
* Description: Reading data from a file involves creating an input stream from the file and using methods provided by FileInputStream to read data.
* Key Steps:
  
  -> Create an instance of FileInputStream with the file name.
  
  -> Use the read() method to read data from the input stream.
  
  -> Close the stream to release system resources.
# 3. Copy a File
* Description: Copying a file involves reading data from an input file and writing it to an output file.
* Key Steps:
  
  -> Create instances of FileInputStream and FileOutputStream with input and output file names.
  
  -> Read data from the input stream and write it to the output stream.
  
  -> Close both streams to release system resources.
# 4. File Encryption
* Description: The `FileEncryption` program demonstrates file encryption by reading data from an input file, applying a simple encryption algorithm (adding a fixed value to each byte), and writing the encrypted data to an output file. It then reads the encrypted data from the output file to demonstrate the encryption process.

* Key Steps:
  
   ->  Create instances of FileInputStream and FileOutputStream with input and output file names.
  
   ->  Read each byte from the input file, add a fixed value to it (in this case, 2), and write the encrypted byte to the output file.
  
   ->  Write encrypted data to the output file.
  
   ->  Read  Read data from the input file.
  
   ->  Close both streams to release system resources.
# Usage
Each section includes example Java programs demonstrating the respective file operation.
You can run these programs to understand how to perform file operations using FileInputStream and FileOutputStream.
