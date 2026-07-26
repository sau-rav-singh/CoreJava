package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountsMerge {
    // QUESTION: Given a list of accounts where each element accounts[i] is a list of strings, where the first
    // element accounts[i][0] is a name, and the rest of the elements are emails representing emails of the account.
    // Merge all accounts that have the same email. After merging, return the accounts in the following format:
    // the first element of each account is the name, and the rest of the elements are emails in sorted order.
    // Example: Input: accounts = [["John","johnsmith@mail.com","john_newyork@mail.com"],
    //                              ["John","johnsmith@mail.com","john00@mail.com"],
    //                              ["Mary","mary@mail.com"],
    //                              ["John","johnnybravo@mail.com"]]
    //          Output: [["John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"],
    //                   ["Mary","mary@mail.com"],
    //                   ["John","johnnybravo@mail.com"]]
    // Time Complexity: O(N * α(N)) where N is total emails and α is inverse Ackermann function
    // Space Complexity: O(N)

    private static Map<String, String> parent;
    private static Map<String, String> owner;
    private static Map<String, List<String>> unions;

    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        parent = new HashMap<>();
        owner = new HashMap<>();
        unions = new HashMap<>();

        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                parent.put(email, email);
                owner.put(email, name);
            }
        }

        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            for (int i = 2; i < account.size(); i++) {
                String email = account.get(i);
                union(firstEmail, email);
            }
        }

        for (String email : parent.keySet()) {
            String root = find(email);
            unions.computeIfAbsent(root, k -> new ArrayList<>()).add(email);
        }

        List<List<String>> result = new ArrayList<>();
        for (String root : unions.keySet()) {
            List<String> emails = unions.get(root);
            Collections.sort(emails);
            List<String> account = new ArrayList<>();
            account.add(owner.get(root));
            account.addAll(emails);
            result.add(account);
        }

        return result;
    }

    private static String find(String email) {
        if (!parent.get(email).equals(email)) {
            parent.put(email, find(parent.get(email)));
        }
        return parent.get(email);
    }

    private static void union(String email1, String email2) {
        String root1 = find(email1);
        String root2 = find(email2);
        if (!root1.equals(root2)) {
            parent.put(root1, root2);
        }
    }

    public static void main(String[] args) {
        List<List<String>> accounts = new ArrayList<>();
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"));
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"));
        accounts.add(Arrays.asList("Mary", "mary@mail.com"));
        accounts.add(Arrays.asList("John", "johnnybravo@mail.com"));

        List<List<String>> result = accountsMerge(accounts);
        System.out.println("Merged accounts:");
        for (List<String> account : result) {
            System.out.println(account);
        }
    }
}
