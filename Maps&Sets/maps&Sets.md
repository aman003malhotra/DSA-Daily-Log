## Maps

### Definition
- stores key-value (k,v) pairs
- cannot have duplicate keys
- Maps are useful in situations where a key can be viewed as a unique indentifier for the object 
- The key is used to decide where to store the object in the structure,In other words, the key associated with an object can be viewed as the address for the object

### Map Popular functions
- Create a map - new Map()
- map.set(key, value) - stores the value by the key
- map.get(key) - returns the value by the ke, undefined if the key does not exists in the map.
- map.has(key) - returns true if the key exists, false otherwise.
- map.delete(key) - removes the value by the key
- map.clear() - removes everything from the map
- map.size - returns the current element count




## Hashing 
- A hash tables uses a hash function to compute an index, also called a hash code, into an array of buckets or slots, from which desired value can be found. During lookup, the key is hashed and the resulting hash indicates where the corresponding value is stored.
- A `Hash Function` is any function that can be used to map data of arbitrary size to fized-size values. The values returned by a hash function are called hash values, hash codes digests or simply hashes. The values are usually used to index a fixed sized table called a hash table. Use of a hash table. Use of hash function to index a hash table is called a hashing or scatter storage addressing.

- `Hash Function Examples` - following are some industry wide hash function used to avoid collisions. These hash functions are unique for the most part, depending upon space availability,serve the purpose
- Base 64 encoding [trivial]
- MD5 hashing algorithm
- SHA- 1 hashing function
- SHA - 256 hashing function
- SHA - 512 hashing function


- `Hash Collisions` occur when two pieces of data in a hash table share the same hash value. The hash value in this case is derived from a hash function which takes a data input and returns s fixed length of bits.


## Set

### Definition
- A set of special type collection - "set of values" (without the keys) where each value may occur only once.

### Main Methods
- new Set(iterable) - creates the set, and if an iterable object is provided (usually an array), copies values from it into the set
- set.add(value) - adds a value, returns the set itself
- set.delete(value) - removes the value, return true if the value existed at the moment of the call, otherwise false
- set.has(value) - returns true if the value exists in the set, otherwise false.
- set.clear() - removes everything from the set.
- set.size - count of the set.