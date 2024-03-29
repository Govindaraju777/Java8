package com.examaple.hashset;

import java.util.HashMap;
import java.util.Hashtable;

/*
 
  Difference between HashMap and Hashtable / HashMap vs Hashtable  

1. Synchronization or Thread Safe :  This is the most important difference between two . HashMap is non synchronized and not thread safe.On the other hand, Hashtable is thread safe and synchronized.

When to use HashMap ?  answer is if your application do not require any multi-threading task, in other words HashMap is better for non-threading applications. Hashtable should be used in multithreading applications. 

2. Null keys and null values :  HashMap allows one null key and any number of null values, while Hashtable do not allow null keys and null values in the Hashtable object.



3. Iterating the values:  HashMap object values are iterated by using iterator .Hashtable is the only class other than vector which uses enumerator to iterate the values of Hashtable object.
4.  Fail-fast iterator  : The iterator in HashMap is fail-fast iterator while the enumerator for Hashtable is not.
According to Oracle Docs,  if the Hashtable is structurally modified at any time after the iterator is created in any way except the iterator's own remove method , then the iterator will throw ConcurrentModification Exception.
Structural modification means adding or removing elements from the Collection object (here HashMap or Hashtable) . Thus the enumerations returned by the Hashtable keys and elements methods are not fail fast.We have already explained the difference between iterator and enumeration.
  
5. Performance :  HashMap is much faster and uses less memory than Hashtable as former is unsynchronized . Unsynchronized objects are often much better in performance in compare to synchronized  object like Hashtable in single threaded environment.

6. Superclass and Legacy :  Hashtable is a subclass of Dictionary class which is now obsolete in Jdk 1.7 ,so ,it is not used anymore. It is better off externally synchronizing a HashMap or using a ConcurrentMap implementation (e.g ConcurrentHashMap).HashMap is the subclass of the AbstractMap class. Although Hashtable and HashMap has different superclasses but they both are implementations of the "Map"  abstract data type.  
  
  
  Similarities Between HashMap and Hashtable

1. Insertion Order :   Both HashMap and Hashtable  does not guarantee that  the order of the map will remain constant over time. Instead use LinkedHashMap, as the order remains constant over time.
2. Map interface :   Both HashMap and Hashtable implements Map interface .
3. Put and get method :  Both HashMap and Hashtable provides constant time performance for put and get methods assuming that the objects are distributed uniformly across the bucket.
4. Internal working :  Both HashMap and Hashtable works on the Principle of Hashing . We have already discussed how hashmap works in java .
  
 
When to use HashMap and Hashtable?

1. Single Threaded Application

HashMap should be preferred over Hashtable for the non-threaded applications. In simple words , use HashMap in unsynchronized or single threaded applications .

2. Multi Threaded Application

We should avoid using Hashtable, as the class is now obsolete in latest Jdk 1.8 . 
Oracle has provided a better replacement of Hashtable named ConcurrentHashMap. 
	For multithreaded  application prefer ConcurrentHashMap instead of Hashtable.
  
 */
public class HashTableExample {
	public static void main(String[] args) {
		Hashtable<String, String> hashtableobj = new Hashtable<String, String>();
		hashtableobj.put("Alive is ", "awesome");
		hashtableobj.put("Love", "yourself");
		System.out.println("Hashtable object output :" + hashtableobj);

		HashMap hashmapobj = new HashMap();
		hashmapobj.put("Alive is ", "awesome");
		hashmapobj.put("Love", "yourself");
		System.out.println("HashMap object output :" + hashmapobj);
	}
}
