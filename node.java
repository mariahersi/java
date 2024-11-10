package weakone.datsstructures.linkedstack;

public class node<t> {
    private t element;
    private node<t> next;

    public node() {
        element = null;
        next = null;
    }

    public node(t element) {
        this.element = element;
        next = null;
    }

    //get& set
    //get
    public node<t> getnext() {
        return next;
    }

    //set
    public void setnext(node<t> next) {
        this.next = next;
    }

    public t getElement() {
        return element;
    }

    public void setelement(t element) {
        this.element = element;
    }
}
