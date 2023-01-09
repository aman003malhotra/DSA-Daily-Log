function recursiveBinarySearch(arr, start, end, elementToFind){
    if(end>=start){
        let mid = end + Math.floor((start-end)/2);

        if(arr[mid] == elementToFind){
            return mid;
        }else if(arr[mid] > elementToFind){
            recursiveBinarySearch(arr, start, mid-1, elementToFind);
        }else{
            recursiveBinarySearch(arr, mid+1, end, elementToFind);
        }
    }

    return -1;
}


function iterativeBinarySearch(arr, elemToFind){
    let lo = 0;
    let hi = arr.length - 1;

    while(lo <= hi){
        let mid = Math.floor((hi+lo) / 2);
        if(arr[mid] == elemToFind){
            console.log('Found At Index', mid);
            return;
        }else if(arr[mid] > elemToFind){
            hi = mid - 1;
        }else if(arr[mid] < elemToFind){
            lo = mid + 1;
        }
    }
}

iterativeBinarySearch([1,2,3,4,5,6], 5);