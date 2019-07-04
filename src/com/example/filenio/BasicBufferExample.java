package com.example.filenio;

/*
 
 Java has provided a second I/O system called NIO (New I/O). 
 Java NIO provides the different way of working with I/O than the standard I/O API's. 
 It is an alternate I/O API for Java (from Java 1.4).
  
  
 Channels and Buffers: 
 	In standard I/O API the character streams and byte streams are used. 
 	In NIO we work with channels and buffers. 
 		Data is always written from a buffer to a channel and read from a channel to a buffer.

  Selectors: 
  	Java NIO provides the concept of "selectors".
	It is an object that can be used for monitoring the multiple channels for events like data arrived,
	 connection opened etc. Therefore single thread can monitor the multiple channels for data.
	 
 */
public class BasicBufferExample {

}
