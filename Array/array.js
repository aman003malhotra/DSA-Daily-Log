let empty = [];
let primeNumbers = [2,3,5,7];

let misc = [1,1,true, "a"]; 
let b = [[1,{x:1,y:2}], [2,{x:3, y:4}]] //2-d array
let count = [1,,3];
let undef = [,,];

let  = [1,2,3];
let b1 = [0, ...a];

let digits = [..."012ABC"] //["0","1","2","A","B","C"]

const cars = new Array("Volvo", "BMW");

let original = [1,2,3];

let copy = [...original];

copy[0] = 0; // modifying the copy isn't going to change the original

console.log(original[0]);

// Iterating
for (let i = 0; i < array.length; i++) {
    const element = array[i];
    
}

// iterating reverse
for (let i = array.length();  i > 0 ; i--) {
    element = array[i];
}

hello = "Hello worlds"
let letters = [...hello];

for (const letter of letters) {
    console.log(letter);
}

function checkPalindrome(arr){
    let start = 0, end = arr.length-1;
    while(start<end){
        if(arr[start] !== arr[end]){
            return false
        }
        start++;
        end--;
    }
    return true;
}
