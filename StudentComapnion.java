import java.util.Scanner;

public class SemesterAssistant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===* Semester Study Assistant *===");
        System.out.println("*for sem-4*");
        while (true) {
            System.out.println("\nAsk query (or type 'exit'):");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Have a Good Day!");
                break;
            }

            respond(input);
        }

        sc.close();
    }

   public static void respond(String input) {

    // JAVA
    if (input.contains("java") || input.contains("Java") || input.conatins("IT201")) {
        System.out.println("Revise OOP concepts, inheritance, and polymorphism.");
        System.out.println("Practice exception handling and file I/O programs.");
        System.out.println("Try writing small class-based applications or string and number based problems for further clearance of the same concept.");
    }

    // OPERATING SYSTEM
    else if (input.contains("os") || input.contains("operating") || input.contains("Operating Systems") || input.contains("CSE202")) {
        System.out.println("Focus on process lifecycle and CPU scheduling.");
        System.out.println("Revise deadlocks, synchronization, and memory management.");
        System.out.println("Understand paging and file systems conceptually. For better understanding you can also refer to OPERATING SYSTEM CONCEPTS- a book by A. Silberschatz and P.B. Galvin");
    }

    // THEORY OF COMPUTATION
    else if (input.contains("toc") || input.contains("automata") || input.contains("Theory of computation") || input.contains("CSE204")) {
        System.out.println("Practice DFA/NFA problems and conversions.");
        System.out.println("Revise CFG, PDA, and Turing Machine basics.");
        System.out.println("Solve language-based questions regularly.");
    }

    // PYTHON
    else if (input.contains("python") || input.contains("Introduction to python") || input.contains("ECE319")) {
        System.out.println("Practice functions, loops, and file handling.");
        System.out.println("Work with lists, dictionaries, and OOP concepts.");
        System.out.println("Write small scripts daily.");
    }

    // APPLIED MATHEMATICS
    else if (input.contains("maths") || input.contains("Applied Mathematics") || input.contains("Mathematics") || input.contains("MATH242")){
        System.out.println("Revise Newton-Raphson, interpolation, and numerical methods.");
        System.out.println("Practice probability distributions and curve fitting.");
        System.out.println("Solve step-based problems regularly.");
    }

    // ENGLISH
    else if (input.contains("english") || input.contains("literature") || input.contains("Advanced Studies in Modern English Writings") || input.contains("ENGL225") {
        System.out.println("Read texts carefully and focus on interpretation.");
        System.out.println("Revise authors and themes from post-independence writings.");
        System.out.println("Make short analytical notes.");
    }

    // FRENCH
    else if (input.contains("French") || input.contains("FREN210")) {
        System.out.println("Practice verb conjugations and sentence formation.");
        System.out.println("Revise possessive and demonstrative adjectives.");
        System.out.println("Try writing daily-life sentences.");
    }

    // DIGITAL MARKETING
    else if (input.contains("marketing") || input.contains("seo") || input.contains("Digital Marketing") || input.contains("IPDE")) {
        System.out.println("Revise digital marketing channels and SEO concepts.");
        System.out.println("Understand campaign planning and analytics basics.");
        System.out.println("Focus on real-world applications.");
    }

    else {
        System.out.println("Try asking about a subject that is included in the 4th Semester syllabus.");
    }
}

    }
}
