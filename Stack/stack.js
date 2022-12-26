class Stack{
    constructor(){
        this.st = [];
    }
    push(value){
        return this.st.push(value);
    }

    pop(){
        return this.st.pop();
    }

    length(){
        return this.st.length;
    }

    peek(){
        return this.st[this.st.length-1];
    }

    printStack(){
        console.log(this.st);
    }

    search(elementToFind){
        return this.st.includes(elementToFind);
    }
}

// Time complexity
st.push(5) //O(1)
st.pop() // O(1)
st.peek() //O(1)
st.search(5) // O(N) 