package javawork;

import java.util.HashMap;
import java.util.Scanner;

// User class
class User {

    String username;
    String password;

    User(String username, String password) {

        this.username = username;
        this.password = password;

    }
}

// Candidate class
class Candidate {

    String partyName;
    int votes;

    Candidate(String partyName) {

        this.partyName = partyName;
        this.votes = 0;

    }
}

// Main class
public class OVS {

    static Scanner sc = new Scanner(System.in);

    // Store users
    static HashMap<String, User> users = new HashMap<>();

    // Track voting status
    static HashMap<String, Boolean> userVoted = new HashMap<>();

    // Store candidates
    static HashMap<String, Candidate> candidates = new HashMap<>();

    // Total votes
    static int totalVotes = 0;

    // Registration
    static void register() {

        try {

            System.out.print("Enter username: ");
            String username = sc.nextLine();

            if (users.containsKey(username)) {

                throw new Exception("Username already exists!");

            }

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            User user = new User(username, password);

            users.put(username, user);

            userVoted.put(username, false);

            System.out.println("Registration successful!");

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

    // Login
    static User login() {

        try {

            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            User user = users.get(username);

            if (user == null || !user.password.equals(password)) {

                throw new Exception("Invalid username or password!");

            }

            System.out.println("Login successful!");

            return user;

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

            return null;

        }

    }

    // Display parties
    static void displayCandidates() {

        System.out.println("\n------ Political Parties ------");

        System.out.println("1. TDP");
        System.out.println("2. YSRCP");

    }

    // Voting
    static void castVote(User user) {

        try {

            if (user == null) {

                throw new Exception("Please login first!");

            }

            if (userVoted.get(user.username)) {

                throw new Exception("You have already voted!");

            }

            displayCandidates();

            System.out.print("Enter your party choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    candidates.get("TDP").votes++;

                    System.out.println("You voted for TDP!");

                    break;

                case 2:

                    candidates.get("YSRCP").votes++;

                    System.out.println("You voted for YSRCP!");

                    break;

                default:

                    throw new Exception("Invalid party choice!");

            }

            // Mark voting status
            userVoted.put(user.username, true);

            // Increase total votes
            totalVotes++;

            System.out.println("Vote cast successfully!");

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

    // Total votes
    static void viewTotalVotes() {

        System.out.println("\nTotal Votes Cast: " + totalVotes);

    }

    // Results
    static void displayResults() {

        System.out.println("\n------ Election Results ------");

        Candidate finalist = null;

        Candidate runnerUp = null;

        for (Candidate candidate : candidates.values()) {

            System.out.println(
                candidate.partyName + " : " + candidate.votes + " votes"
            );

            if (finalist == null ||
                candidate.votes > finalist.votes) {

                runnerUp = finalist;

                finalist = candidate;

            } else if (runnerUp == null ||
                       candidate.votes > runnerUp.votes) {

                runnerUp = candidate;

            }

        }

        System.out.println("\n------ Final Result ------");

        if (finalist != null) {

            System.out.println(
                "Winner: " + finalist.partyName +
                " (" + finalist.votes + " votes)"
            );

        }

        if (runnerUp != null) {

            System.out.println(
                "Runner-Up: " + runnerUp.partyName +
                " (" + runnerUp.votes + " votes)"
            );

        }

    }

    // Main method
    public static void main(String[] args) {

        // Add parties
        candidates.put("TDP", new Candidate("TDP"));

        candidates.put("YSRCP", new Candidate("YSRCP"));

        int choice = 0;

        do {

            try {

                System.out.println("\n===== ONLINE VOTING SYSTEM =====");

                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. View Political Parties");
                System.out.println("4. Cast Vote");
                System.out.println("5. View Total Votes");
                System.out.println("6. Display Results");
                System.out.println("7. Exit");

                System.out.print("Enter your choice: ");

                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:

                        register();

                        break;

                    case 2:

                        login();

                        break;

                    case 3:

                        displayCandidates();

                        break;

                    case 4:

                        User user = login();

                        if (user != null) {

                            castVote(user);

                        }

                        break;

                    case 5:

                        viewTotalVotes();

                        break;

                    case 6:

                        displayResults();

                        break;

                    case 7:

                        System.out.println("Thank you for using Online Voting System!");

                        break;

                    default:

                        System.out.println("Invalid choice!");

                }

            } catch (Exception e) {

                System.out.println("Please enter a valid number!");

            }

        } while (choice != 7);

        sc.close();

    }

}
