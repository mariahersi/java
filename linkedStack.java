package weakone.datsstructures.linkedstack;

import java.util.Scanner;

public class linkedStack <t>{
    private  int count;
    public  node<t> top;//front,//head


    public  linkedStack(){
        count=0;
        top =null;

    }

    //push
    public void  push(t element){
        node<t>tempAddress= new node<t>(element);
        System.out.println(tempAddress );
        tempAddress.setnext(top);
        top=tempAddress;
        count++;
    }


    // pop
    public  t pop(){
        if(isEmpty()){
            System.out.println("Empty stack");
            return  null;

        }

        t removed_element=top.getElement();
        top=top.getnext();
        count--;
        return removed_element;
    }

    //peek
    public  t peek(){
        if (isEmpty()){
            System.out.println("empty stack");
            return  null;
        }
            return  top.getElement();

    }

    //display or print

    public void display(){
        if (isEmpty())
            System.out.println("empty stack");
        else {
            node<t>currentAddress=top;
            while (currentAddress!=null){
                System.out.println(currentAddress.getElement());
                currentAddress=currentAddress.getnext();
            }
        }

    }
    // searches elements
    public void searchElements(t data){
        boolean found=false;
        int counter=0;
        if (isEmpty())
            System.out.println("empty stack");
        else {
            node<t>currentAddress=top;
            while (currentAddress !=null)
                if (data.equals(currentAddress.getElement())){
                    found=true;
                    counter++;
                }
            currentAddress=currentAddress.getnext();
        }
        //display results
        if ((found==false))
            System.out.println("not found");
        else
            System.out.println("found"+counter+"times");
    }
    //size
    public  int  size(){
        return count;
    }
    //Isemty
    public  boolean isEmpty(){
        return count==0;
    }

    public void removeMiddleElements() {
        if (isEmpty())
            System.out.println("Stack is empty:");
        else if (count <= 2) {
            System.out.println("Stack has only top and bottom elements does not remave:");
            return;
        }
        // Find the bottom element
        node<t> current = top;
        node<t> bottom = top;

        while (bottom.getnext() != null) {
            bottom = bottom.getnext();
        }
        top.setnext(bottom);

        count = 2;}
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        linkedStack<String> names = new linkedStack<>();
        names.push ("Ali");
        names.push ("anzal");
        names.push ("Gedi");
        names.push ("Hawa");
        names.push ("Hawa");
        names.push ("Hawa");
        names.push ("saba");

        System.out.println("before remove elements");
        names.display();
        System.out.println("after remove elements");
        names.removeMiddleElements();
        names.display();
//        System.out.println("removed element : " + names.pop());
//        System.out.println("top: " + names.peek() );
//        System.out.println("size: " + names.size () );
//        System.out.println("empty: " + names.isEmpty() );
//        names.display();
//        System.out.println("Enter name to search: ");
//        String data =scanner.next();
//       names.searchElements(data);
    }



}
