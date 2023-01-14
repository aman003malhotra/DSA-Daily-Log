function bubbleSort(arr){
    for(let i = 0; i<arr.length; i++){
        for(let j = i+1; j<arr.length;j++){
            if(arr[j] > arr[j+1]){
                let temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    console.log(arr);
}

// TC -  O(N^2)
// SC - O(N)
bubbleSort([5,4,6,3,2,1]);