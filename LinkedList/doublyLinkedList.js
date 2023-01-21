class DoubleLinkedListNode{
    constructor(val){
        this.val = val;
        this.next = (next === undefined ? null: next);
        this.prev = (prev === undefined ? null: prev);
    }
}


class DoublyLinkedList{
    constructor(value){
        this.head = new DoubleLinkedListNode(value);
        this.size = 1;
        this.tail = this.head;
    }

    append(value){
        let newNode = new DoubleLinkedListNode(value);
        newNode.prev = this.tail;
        this.tail.next = newNode;
        this.tail = newNode;
        this.size++;
    }

    prepend(value){
        let newNode = new DoubleLinkedListNode(value);
        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;
    }

}


