package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class PostProgram {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner (System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment ("Have a nice trip!");
		Comment c2 = new Comment ("Wow that's awesome!");
		Post p1 = new Post (sdf.parse("27/12/2023 15:04:27"), "Traveling to New Zeland", 
				"I'm going to visit this wonderful country", 12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		Comment c3 = new Comment ("Good night!");
		Comment c4 = new Comment ("May the force be with you!");
		
		Post p2 = new Post (sdf.parse("28/01/2023 20:30:34"), "Good night guys!", "See you Tomorrow", 5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2);
		
		sc.close();
		

	}

}
