const map = new Map();
map.set(1, "ABC");
map.set(2, "EFG");
map.set(2, "REG"); // the duplicate key overwrite the previous array
map.set("2", "FHB") // here the string and integer are going to be considered different so for REG, FHB will be saved.
console.log(map)