const linearSearch = (elem, arr) => {
    for(let i = 0; i, arr.length; i++){
        if(arr[i] == elem){
            return elem
        }
    }

    return -1;
}

const arr = [1,2,3,4,5]
console.log(linearSearch(4, arr));

// SC - O(1);
// TC - O(N);