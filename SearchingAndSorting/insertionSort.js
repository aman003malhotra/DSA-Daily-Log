function insertionSort(array) {
    for (let i = 1; i < array.length; i++) {
      let currentValue = array[i];
      let j = i-1;
      while(j >= 0 && array[j] > currentValue) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = currentValue;
    }
    return array;
  }

// TC O(N^2)
// SC O(N)

insertionSort([5,6,7,2,8,9,1]);