import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Iterator;

// Lab 2 - Lists, Stacks, and Queues
// Your Name: Abdulrahman Mohamoud
// Notes: The instructions are found in comments through the code starting with "Step n"
//        Please leave the comments and add your code just after the comment.
//        Use the examples in the book to complete the lab.

class Main {
    public static void main(String[] args) {
        Lab2 lab = new Lab2();
        // Comment/Uncomment the following 3 method calls as you work on each method.
        // No code should be added to the main method. All of your code will go into the methods in Lab2.
        lab.linkedList();
        lab.queue();
        lab.stack();
    }
}

class Lab2 {
    public void linkedList() {
        // 1. Create a LinkedList<String> object called progLanguages
        LinkedList<String> progLanguages = new LinkedList<>();

        // 2. Add elements to progLanguages: "Java", "Python", "JavaScript", "C++"
        progLanguages.add("Java");
        progLanguages.add("Python");
        progLanguages.add("JavaScript");
        progLanguages.add("C++");

        // 3. Remove the element "C++" from the list using .remove()
        progLanguages.remove("C++");

        // 4. Add an element "HTML" at index 2.
        progLanguages.add(2, "HTML");

        // 5. Iterate over progLanguages and use println() to output each element. 
        //    You must create an Iterator<String> and use hasNext(), and next() similar to the example in our book.
        Iterator<String> iterator = progLanguages.iterator();
        System.out.println("Programming Languages List:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void queue() {
        // 6. Create a Queue<String> called q
        Queue<String> q = new LinkedList<>();

        // 7. Add 5 first names to q.
        q.add("Ali");
        q.add("Samira");
        q.add("Noah");
        q.add("Fatima");
        q.add("Liam");

        // 8. Uncomment the following line
        System.out.println("Elements of queue: " + q);

        // 9. Remove the head of the queue and assign it to a String variable removedElement.
        //    Display the value of "Removed element: " + removedElement
        String removedElement = q.remove();
        System.out.println("Removed element: " + removedElement);

        // 10. View the head of the queue using peek(). Output its value.
        System.out.println("Head of the queue: " + q.peek());

        // 11. Using for(String element : q), output all of the values in the queue
        System.out.println("Remaining elements in the queue:");
        for (String element : q) {
            System.out.println(element);
        }
    }

    public void stack() {
        // 12. Create a Stack<String> called bookStack
        Stack<String> bookStack = new Stack<>();

        // 13. Push the following book titles onto bookStack: "Clean Code", "Design Patterns", "Pragmatic Programmer"
        bookStack.push("Clean Code");
        bookStack.push("Design Patterns");
        bookStack.push("Pragmatic Programmer");

        // 14. pop() 1 book off the stack. Display its value
        System.out.println("Popped book: " + bookStack.pop());

        // 15. Use the peek() method to view the top book on the stack
        System.out.println("Top book: " + bookStack.peek());

        // 16. push() "Web DB Technologies" onto the stack
        bookStack.push("Web DB Technologies");

        // 17. Use the peek() method to view the top book on the stack
        System.out.println("New top book: " + bookStack.peek());

        // 18. Search for "Design Patterns" in the stack. Display the results of the search.
        int position = bookStack.search("Design Patterns");
        if (position != -1) {
            System.out.println("'Design Patterns' found at position: " + position);
        } else {
            System.out.println("'Design Patterns' not found in the stack.");
        }

        // 19. Call empty(). Output the results
        System.out.println("Is the stack empty? " + bookStack.empty());

        // 20. Print the titles of all of the books on the stack
        System.out.println("Books in the stack:");
        for (String book : bookStack) {
            System.out.println(book);
        }
    }
}
