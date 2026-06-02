package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

/*
49. Group Anagrams
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Explanation:
There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]
 */
public class GroupAnagram {

    public static void main(String[] args) {
        String[] inp = {"eat", "bat", "nat", "tan", "ate", "ant"};
        Hashtable<String, ArrayList<String>> tab = new Hashtable<>();
        for (String each : inp) {
            char[] temp = each.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            tab.putIfAbsent(key, new ArrayList<>());
            tab.get(key).add(each);
        }
        System.out.println(tab.values());
    }
}
