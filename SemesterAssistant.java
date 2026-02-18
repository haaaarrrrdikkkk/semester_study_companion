import java.util.Scanner;

public class SemesterAssistant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==== Semester Study Assistant ====");
        System.out.println("Type a subject (e.g., java, os, toc).");
        System.out.println("Type 'questions' with subject to practice.");
        System.out.println("Type 'exit' to quit.");

        while (true) {
            System.out.print("\nAsk something: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Good luck with your studies!");
                break;
            }

            respond(input);
        }

        sc.close();
    }

    public static void respond(String input) {

        //JAVA 
        if (input.contains("java") || input.contains("oop") || input.contains("class")) {

            if (input.contains("question")) {
                javaQuestions();
            } else {
                javaHelp();
            }
        }

        //  OPERATING SYSTEM 
        else if (input.contains("os") || input.contains("process") || input.contains("memory")) {

            if (input.contains("question")) {
                osQuestions();
            } else {
                osHelp();
            }
        }

        //  TOC 
        else if (input.contains("toc") || input.contains("automata") || input.contains("dfa")) {

            if (input.contains("question")) {
                tocQuestions();
            } else {
                tocHelp();
            }
        }

        // PYTHON 
        else if (input.contains("python") || input.contains("script")) {

            if (input.contains("question")) {
                pythonQuestions();
            } else {
                pythonHelp();
            }
        }

        //MATH 
        else if (input.contains("math") || input.contains("numerical")) {

            if (input.contains("question")) {
                mathQuestions();
            } else {
                mathHelp();
            }
        }

        // ENGLISH 
        else if (input.contains("english") || input.contains("literature")) {

            if (input.contains("question")) {
                englishQuestions();
            } else {
                englishHelp();
            }
        }

        //  FRENCH
        else if (input.contains("french")) {

            if (input.contains("question")) {
                frenchQuestions();
            } else {
                frenchHelp();
            }
        }

        //DIGITAL MARKETING
        else if (input.contains("marketing") || input.contains("seo")) {

            if (input.contains("question")) {
                marketingQuestions();
            } else {
                marketingHelp();
            }
        }

        else {
            System.out.println("Try asking about a valid subject like Java, OS, TOC, Python, Math, English, French, or Marketing.");
        }
    }

    //  SUBJECT EXPLANATIONS 

    public static void javaHelp() {
        System.out.println("\nJava Programming:");
        System.out.println("Focus on understanding object-oriented programming as a way to model real-world problems.");
        System.out.println("Instead of memorizing syntax, practice creating classes, constructors, and methods so you understand how encapsulation and inheritance work together.");
        System.out.println("You should aim to write small programs daily, such as managing student data or implementing logic using loops and arrays.");
        System.out.println("Exception handling and file handling are important to understand how Java manages errors and persistent data.");
    }

    public static void osHelp() {
        System.out.println("\nOperating Systems:");
        System.out.println("Think of the OS as the manager of all computer resources.");
        System.out.println("Study how processes are created, scheduled, and synchronized because this explains how multitasking actually works.");
        System.out.println("Memory management concepts like paging and virtual memory help you understand how programs run efficiently even with limited RAM.");
        System.out.println("Focus on understanding the logic behind scheduling and deadlocks rather than memorizing definitions.");
    }

    public static void tocHelp() {
        System.out.println("\nTheory of Computation:");
        System.out.println("This subject builds the mathematical foundation of computer science.");
        System.out.println("Practice constructing DFA and NFA step by step, as these teach how machines recognize patterns and languages.");
        System.out.println("Context-free grammars explain how programming languages are structured, while Turing Machines introduce the concept of computation limits.");
        System.out.println("Solve small language problems regularly to develop intuition.");
    }

    public static void pythonHelp() {
        System.out.println("\nPython:");
        System.out.println("Python should be approached as a problem-solving language.");
        System.out.println("Work on writing scripts that manipulate lists, strings, and files because these are used heavily in real-world automation.");
        System.out.println("Understanding functions and modular coding will help you structure larger programs.");
        System.out.println("Try converting logic you learned in Java into Python to strengthen both languages.");
    }

    public static void mathHelp() {
        System.out.println("\nApplied Mathematics:");
        System.out.println("This subject connects mathematics to computational problem solving.");
        System.out.println("Numerical methods such as Newton-Raphson show how computers approximate solutions to complex equations.");
        System.out.println("Probability distributions are essential for understanding data analysis and machine learning foundations.");
        System.out.println("Focus on solving step-based problems rather than memorizing formulas.");
    }

    public static void englishHelp() {
        System.out.println("\nEnglish Studies:");
        System.out.println("Approach literature analytically by focusing on themes, cultural context, and interpretation.");
        System.out.println("Indian English writings reflect identity, post-independence thought, and linguistic adaptation.");
        System.out.println("Instead of memorizing summaries, try understanding what each text is trying to convey.");
    }

    public static void frenchHelp() {
        System.out.println("\nFrench:");
        System.out.println("Language learning requires repetition and usage.");
        System.out.println("Practice verb conjugations daily and build small sentences to develop fluency.");
        System.out.println("Understanding grammar structure helps you interpret meaning rather than translate word by word.");
    }

    public static void marketingHelp() {
        System.out.println("\nDigital Marketing:");
        System.out.println("This subject is application-driven and connects technology with business strategy.");
        System.out.println("Understand how SEO improves visibility, how campaigns target audiences, and how analytics measure success.");
        System.out.println("Relate concepts to real platforms like Instagram, Google, and online branding.");
    }

    // ================= QUESTIONS =================

    public static void javaQuestions() {
        System.out.println("\nPractice Questions (Java):");
        System.out.println("1. Create a class representing a Student with attributes and methods.");
        System.out.println("2. Write a program demonstrating inheritance.");
        System.out.println("3. Handle an exception using try-catch.");
    }

    public static void osQuestions() {
        System.out.println("\nPractice Questions (OS):");
        System.out.println("1. Explain process scheduling with an example.");
        System.out.println("2. What is a deadlock and how can it be prevented?");
        System.out.println("3. Compare paging vs segmentation.");
    }

    public static void tocQuestions() {
        System.out.println("\nPractice Questions (TOC):");
        System.out.println("1. Construct a DFA for strings ending with '01'.");
        System.out.println("2. Convert an NFA to DFA.");
        System.out.println("3. Write a CFG for balanced parentheses.");
    }

    public static void pythonQuestions() {
        System.out.println("\nPractice Questions (Python):");
        System.out.println("1. Write a script to read and write files.");
        System.out.println("2. Use a dictionary to store student marks.");
        System.out.println("3. Implement a function-based calculator.");
    }

    public static void mathQuestions() {
        System.out.println("\nPractice Questions (Math):");
        System.out.println("1. Apply Newton-Raphson to find a root.");
        System.out.println("2. Solve a probability distribution problem.");
        System.out.println("3. Perform interpolation for given data.");
    }

    public static void englishQuestions() {
        System.out.println("\nPractice Questions (English):");
        System.out.println("1. Analyze a poem’s central theme.");
        System.out.println("2. Discuss post-independence literary identity.");
        System.out.println("3. Compare two prose texts.");
    }

    public static void frenchQuestions() {
        System.out.println("\nPractice Questions (French):");
        System.out.println("1. Conjugate common IR verbs.");
        System.out.println("2. Write 5 sentences describing daily routine.");
        System.out.println("3. Translate simple English sentences.");
    }

    public static void marketingQuestions() {
        System.out.println("\nPractice Questions (Marketing):");
        System.out.println("1. Design a basic SEO strategy.");
        System.out.println("2. Plan a social media campaign.");
        System.out.println("3. Explain CRM usage.");
    }
}
