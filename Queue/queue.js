class Queue{
    constructor(){
        this.qu = [];
    }

    enqueue(value){
        this.qu.push(value);
    }

    dequeue(){
        return this.qu.shift();
    }

    front(){
        if(!this.qu.length) return null;
        return this.qu[0];
    }

    printQueue(){
        console.log(this.qu);
    }

    search(elementToFind){
        return this.qu.includes(elementToFind);
    }

    length(){
        return this.qu.length
    }

}

queue.enqueue(1); // O(1)
queue.enqueue(3);
queue.enqueue(4); 
queue.printQueue();
queue.dequeue(); // O(N)


// Array
// Stack
// LinkedList