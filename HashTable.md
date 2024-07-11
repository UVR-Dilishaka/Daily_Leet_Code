---
titile: HashTable
date: 2024-07-09
tags:
  - hashtable
  - DataStructures
project: LeetCode
noteType: theory
---


A hash table (or hash map) is a data structure that efficiently <mark style="background: #ABF7F7A6;">maps keys to values</mark>. It is widely used for tasks like database indexing, caching, and in many applications where quick look-up, insert, and delete operations are needed. Here’s a breakdown of how hash tables work:

### Key Concepts

1. **Hash Function:**
    
    - A hash function takes an input (or key) and returns a fixed-size string of bytes. The output, typically a number, is called the hash code.
    - A good hash function distributes keys uniformly across the hash table, minimizing collisions (instances where different keys hash to the same index).
2. **Buckets:**
    
    - The hash table consists of an array of buckets. Each bucket can hold multiple key-value pairs in case of collisions.
    - The hash code is used to index into the array, determining where to place or find the corresponding value.
3. **Collisions:**
    
    - Even with a good hash function, collisions are inevitable due to the finite size of the array.
    - There are various methods to handle collisions, the most common being chaining and open addressing.

### Methods to Handle Collisions

1. **Chaining:**
    
    - Each bucket points to a linked list of entries that hash to the same index.
    - When a collision occurs, the new entry is added to the linked list of the corresponding bucket.
2. **Open Addressing:**
    
    - Instead of storing multiple entries in a single bucket, open addressing searches for the next empty bucket.
    - Techniques include linear probing, quadratic probing, and double hashing.

### Basic Operations

1. **Insertion:**
    
    - Compute the hash code for the key using the hash function.
    - Use the hash code to determine the index of the array (bucket).
    - Handle collisions if necessary and insert the key-value pair.
2. **Search:**
    
    - Compute the hash code for the key.
    - Use the hash code to find the bucket.
    - Search through the bucket (or follow the probing sequence) to find the key and return the associated value.
3. **Deletion:**
    
    - Compute the hash code for the key.
    - Use the hash code to find the bucket.
    - Search through the bucket (or follow the probing sequence) to find the key and remove the key-value pair.

### Example

Consider a hash table with an array size of 10:

1. **Insertion:**
    
    - Insert ("apple", 1)
        - Hash function generates hash code 5 for "apple".
        - Place ("apple", 1) in bucket index 5.
2. **Search:**
    
    - Search for "apple".
        - Hash function generates hash code 5 for "apple".
        - Look in bucket index 5 and find ("apple", 1).
3. **Collision Handling with Chaining:**
    
    - Insert ("orange", 2)
        - Hash function generates hash code 5 for "orange".
        - Since bucket index 5 already contains ("apple", 1), add ("orange", 2) to the linked list at bucket 5.

### Advantages and Disadvantages

**Advantages:**

- Fast look-up, insert, and delete operations (average-case O(1) time complexity).
- Efficient memory usage if the hash function is well-designed.

**Disadvantages:**

- Poor performance in the worst case (O(n) time complexity) if there are many collisions.
- Requires a good hash function to minimize collisions.
- May require resizing, which involves rehashing all keys, if the load factor (number of entries/number of buckets) becomes too high.

### Practical Considerations

- **Load Factor:** The load factor affects the performance of a hash table. A higher load factor increases the likelihood of collisions, while a lower load factor means more space is unused. Resizing the hash table (typically doubling its size) can help maintain an efficient load factor.
- **Hash Function Quality:** A good hash function minimizes collisions and evenly distributes keys across the hash table.
