
public class LinkedStack implements StackADT {

    private class StackNode {

        private Object object;
        private StackNode next;
    }
    private StackNode top;

    @Override
    public String toString() {
        /* algorithm
            set up a string to contain the stack details
            if stack is not empty then
                set current to the top node
                do
                    add the current object to the string
                    set current to the next node
                while node available
            else
                add empty stack message to the string
            end if
         */
        String stackDetails = new String();
        //add code here
        if (this.top != null) {
            StackNode current = this.top;
            while (current != null) {
                stackDetails = stackDetails + current.object.toString() + "\n";
                current = current.next;
            }
        } else {
            stackDetails = ("Empty stack");
        }
        return stackDetails;
    }

    public void push(Object object) {
        /* algorithm
            create new stack node
            copy object to new node's object
            set new node's next link to the current top of the stack
            set the top of the stack to the new node
         */
        // add code here
        StackNode temp = new StackNode();
        temp.object = object;
        temp.next = this.top;
        this.top = temp;
    }

    public Object pop() throws StackEmptyException {
        /* algorithm
            if stack is empty then
                throw stack empty exception
            end if
            save the top node as node
            save the object of the top node
            set the top node to the top node's next link
            delete the node object
            set node next to null
         */
        // add code here
        if (this.top == null) {
            throw new StackEmptyException();
        } else {
            StackNode temp = this.top;
            this.top = this.top.next;
            return temp.object;
        }
    }
}
