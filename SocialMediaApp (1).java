/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.socialmediafeed;

/**
 *
 * @author 123
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Post {
    int id;
    String text;
    String timestamp;
    Post next;
    
    public Post(int id, String text) {
        this.id = id; 
        this.text = text;
        this.timestamp = getCurrentTime(); 
        this.next = null;
    }
    String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
    public void updateTimestamp() {
        this.timestamp = getCurrentTime();
    }}
class Feed {
    private Post head;
    public Feed() {
        this.head = null;
    }
    public void addingPost(int id,String text) {
        Post newPost = new Post(id,text); 
        if (head == null) {
            head = newPost;
        } else {
            newPost.next = head;
            head = newPost;
        }
        System.out.println("New post added with ID: " + newPost.id);
    }
    public void editingPost(int id,String newText) {
        Post current = head;
        while (current != null) {
            if (current.id == id) {
                current.text = newText;
                current.updateTimestamp();
                System.out.println("Post edited: " + current.id);
                return;
            }
            current = current.next;
        }
        System.out.println("Post with ID " + id + " not found.");
    }
    public void searchingPostsByText(String searchText) {
        Post current = head;
        boolean found = false;
        while (current != null) {
        if (current.text.contains(searchText)) {
        System.out.println("Found Post ID: " + current.id + " Text: " + current.text + " Timestamp: " + current.timestamp);
        found = true;
        }
        current = current.next;}
        if (!found) {
            System.out.println("No posts found with text: " + searchText);
        }}
    public void deletePost(int id) {
        Post current = head;
        Post previous = null;
        if (current != null && current.id == id) {
            head = current.next;
            System.out.println("Post with ID " + id + " deleted.");
            return;}
        while (current != null && current.id != id) {
            previous = current;
            current = current.next;}

        if (current == null) {
            System.out.println("Post with ID " + id + " not found.");
            return;}
        previous.next = current.next;
        System.out.println("Post with ID " + id + " deleted.");
    }
    public void displayAllPosts() {
        if (head == null) {
            System.out.println("No posts available.");
            return;}
        Post current = head;
        while (current != null) {
            System.out.println("Post ID: " + current.id + " Text: " + current.text + " Timestamp: " + current.timestamp);
            current = current.next;
        }}}

public class SocialMediaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feed feed = new Feed();
while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Display all posts");
            System.out.println("2. Search posts by text");
            System.out.println("3. Add a new post");
            System.out.println("4. Edit a post");
            System.out.println("5. Delete a post");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

                switch (choice) {
                case 1:
                    feed.displayAllPosts();
                    break;

                case 2:
                    System.out.print("Enter text to search: ");
                    String searchText = scanner.nextLine();
                    feed.searchingPostsByText(searchText);
                    break;

                case 3:
                    System.out.print("Enter Post ID: ");
                    int postID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Post text: ");
                    String postText = scanner.nextLine();
                    feed.addingPost(postID, postText);
                    break;

                case 4:
                    System.out.print("Enter Post ID to edit: ");
                    int editID = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter new text: ");
                    String newText = scanner.nextLine();
                    feed.editingPost(editID, newText);
                    break;

                case 5:
                    System.out.print("Enter Post ID to delete: ");
                    int deleteID = scanner.nextInt();
                    feed.deletePost(deleteID);
                    break;

                case 6:
                    System.out.println("Exiting");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice");
                }}}}

