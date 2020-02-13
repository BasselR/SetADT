/* Student Information
* -------------------
* Student Name: Rezkalla, Bassel
* Student Number: 400137450
* Course Code: CS/SE 2XB3
* Lab Section: 03
*
* I attest that the following code being submitted is my own individual 
* work.
*/

package myPackage;
import java.io.*;
import java.util.ArrayList;

public class TestSet {
	
	static BufferedReader reader;
	static BufferedWriter writer;
	
	public static void main(String[] args) throws IOException {
		reader = new BufferedReader(new FileReader("input.txt"));
		writer = new BufferedWriter(new FileWriter("output.txt"));
		writer.write("* Starting test cases for Set *\n\n");
		testIsEqual();
		testUnion();
		testIntersection();
		testDifference();
		testProduct();
		testIsSubset();
		testGetCount();
		testToString();
		testAdd();
		testRemove();
		testGetStrArr();
		writer.write("* Finished test cases for Set *\n\n");
		writer.close();
	}
	
	public static void testGetStrArr() throws IOException {
		String[] a1 = reader.readLine().split(",");
		
		ArrayList<String> t1 = new ArrayList<String>();
		ArrayList<String> t2 = new ArrayList<String>();
		t1.add("a");
		t1.add("b");
		t1.add("c");
		
		Set s1 = new Set(a1);
		Set s2 = new Set();
		
		writer.write("Testing testGetStrArr...\n");
		
		if(s1.getStrArr().equals(t1)) {
			writer.write("Test Case 1: PASSED\n");
		}
		else {
			writer.write("Test Case 1: FAILED\n");
		}
		
		if(s2.getStrArr().equals(t2)) {
			writer.write("Test Case 2: PASSED\n");
		}
		else {
			writer.write("Test Case 2: FAILED\n");
		}
		
		writer.write("Finished testGetStrArr!\n\n");
	}
	
	public static void testAdd() throws IOException {
		
		String[] a1 = reader.readLine().split(",");
		String[] a2 = reader.readLine().split(",");
		String[] a3 = {"e"};
		String[] a4 = {"b","c","d","g"};
		
		Set s1 = new Set(a1);
		Set s2 = new Set(a2);
		Set s3 = new Set(a3);
		Set s4 = new Set(a4);
		Set s5 = new Set();
		
		writer.write("Testing testAdd...\n");
		
		if(s1.add("a").isEqual(s1)) {
			writer.write("Test Case 1: PASSED\n");
		}
		else {
			writer.write("Test Case 1: FAILED\n");
		}
		
		if(s5.add("e").isEqual(s3)) {
			writer.write("Test Case 2: PASSED\n");
		}
		else {
			writer.write("Test Case 2: FAILED\n");
		}
		
		if(s2.add("g").isEqual(s4)) {
			writer.write("Test Case 3: PASSED\n");
		}
		else {
			writer.write("Test Case 3: FAILED\n");
		}
		
		if(s5.add("").isEqual(s5)) {
			writer.write("Test Case 4: PASSED\n");
		}
		else {
			writer.write("Test Case 4: FAILED\n");
		}
		
		writer.write("Finished testAdd!\n\n");
		
	}	
	
	public static void testRemove() throws IOException {
		
		String[] a1 = reader.readLine().split(",");
		String[] a2 = {"a","c"};
		
		Set s1 = new Set(a1);
		Set s2 = new Set(a2);
		Set s3 = new Set();
		
		writer.write("Testing testRemove...\n");
		
		if(s1.remove("b").isEqual(s2)) {
			writer.write("Test Case 1: PASSED\n");
		}
		else {
			writer.write("Test Case 1: FAILED\n");
		}
		
		if(s1.remove("").isEqual(s1)) {
			writer.write("Test Case 2: PASSED\n");
		}
		else {
			writer.write("Test Case 2: FAILED\n");
		}
		
		if(s3.remove("a").isEqual(s3)) {
			writer.write("Test Case 3: PASSED\n");
		}
		else {
			writer.write("Test Case 3: FAILED\n");
		}
		
		if(s3.remove("").isEqual(s3)) {
			writer.write("Test Case 4: PASSED\n");
		}
		else {
			writer.write("Test Case 4: FAILED\n");
		}
		
		writer.write("Finished testRemove!\n\n");
		
	}	

	public static void testUnion() throws IOException {
		
		String[] a1 = reader.readLine().split(",");
		String[] a2 = reader.readLine().split(",");
		String[] a3 = {"a","b","c","d"};
		
		Set s1 = new Set(a1);
		Set s2 = new Set(a2);
		Set s3 = new Set(a3);
		Set s4 = new Set();
		
		writer.write("Testing testUnion...\n");
		
		if(s1.Union(s2).isEqual(s3)) {
			writer.write("Test Case 1: PASSED\n");
		}
		else {
			writer.write("Test Case 1: FAILED\n");
		}
		
		if(s1.Union(s4).isEqual(s1)) {
			writer.write("Test Case 2: PASSED\n");
		}
		else {
			writer.write("Test Case 2: FAILED\n");
		}
		
		if(s4.Union(s4).isEqual(s4)) {
			writer.write("Test Case 3: PASSED\n");
		}
		else {
			writer.write("Test Case 3: FAILED\n");
		}
		
		writer.write("Finished testUnion!\n\n");
		
	}
	
	public static void testIntersection() throws IOException {
		
		String[] a1 = reader.readLine().split(",");
		String[] a2 = reader.readLine().split(",");
		String[] a3 = reader.readLine().split(",");
		
		Set s1 = new Set(a1);
		Set s2 = new Set(a2);
		Set s3 = new Set(a3);
		Set s4 = new Set();
		
		writer.write("Testing testIntersection...\n");
		
		if(s1.Intersection(s2).isEqual(s1)) {
			writer.write("Test Case 1: PASSED\n");
		}
		else {
			writer.write("Test Case 1: FAILED\n");
		}
		
		if(s2.Intersection(s4).isEqual(s4)) {
			writer.write("Test Case 2: PASSED\n");
		}
		else {
			writer.write("Test Case 2: FAILED\n");
		}
		
		if(s2.Intersection(s3).isEqual(s1)) {
			writer.write("Test Case 3: PASSED\n");
		}
		else {
			writer.write("Test Case 3: FAILED\n");
		}
		
		if(s4.Intersection(s4).isEqual(s4)) {
			writer.write("Test Case 4: PASSED\n");
		}
		else {
			writer.write("Test Case 4: FAILED\n");
		}
		
		writer.write("Finished testIntersection!\n\n");
	}
	
	public static void testDifference() throws IOException {
		String[] a1 = reader.readLine().split(",");
		String[] a2 = reader.readLine().split(",");
		String[] a3 = reader.readLine().split(",");
		
		Set s1 = new Set(a1);
		Set s2 = new Set(a2);
		Set s3 = new Set(a3);
		Set s4 = new Set();
		
		writer.write("Testing testDifference...\n");
		
		if(s1.Difference(s2).isEqual(s3)) {
			writer.write("Test Case 1: PASSED\n");
		}
		else {
			writer.write("Test Case 1: FAILED\n");
		}
		
		if(s1.Difference(s1).isEqual(s4)) {
			writer.write("Test Case 2: PASSED\n");
		}
		else {
			writer.write("Test Case 2: FAILED\n");
		}
		
		if(s2.Difference(s3).isEqual(s2)) {
			writer.write("Test Case 3: PASSED\n");
		}
		else {
			writer.write("Test Case 3: FAILED\n");
		}
		
		if(s4.Difference(s4).isEqual(s4)) {
			writer.write("Test Case 4: PASSED\n");
		}
		else {
			writer.write("Test Case 4: FAILED\n");
		}
		
		writer.write("Finished testDifference!\n\n");
	}
	
	public static void testProduct() throws IOException {
		String[] a1 = reader.readLine().split(",");
		String[] a2 = reader.readLine().split(",");
		String[] a3 = {"ac","ad","bc","bd"};
		
		Set s1 = new Set(a1);
		Set s2 = new Set(a2);
		Set s3 = new Set(a3);
		Set s4 = new Set();
		
		writer.write("Testing testProduct...\n");
		
		if(s1.Product(s2).isEqual(s3)) {
			writer.write("Test Case 1: PASSED\n");
		}
		else {
			writer.write("Test Case 1: FAILED\n");
		}
		
		if(s1.Product(s4).isEqual(s4)) {
			writer.write("Test Case 2: PASSED\n");
		}
		else {
			writer.write("Test Case 2: FAILED\n");
		}
		
		if(s4.Product(s1).isEqual(s4)) {
			writer.write("Test Case 3: PASSED\n");
		}
		else {
			writer.write("Test Case 3: FAILED\n");
		}
		
		writer.write("Finished testProduct!\n\n");
	}
	
	public static void testIsEqual() throws IOException {
		String[] a1 = reader.readLine().split(",");
		
		Set s1 = new Set(a1);
		Set s2 = new Set();
		
		writer.write("Testing testIsEqual...\n");
		
		if(s1.isEqual(s1)) {
			writer.write("Test Case 1: PASSED\n");
		}
		else {
			writer.write("Test Case 1: FAILED\n");
		}
		
		if(s2.isEqual(s2)) {
			writer.write("Test Case 2: PASSED\n");
		}
		else {
			writer.write("Test Case 2: FAILED\n");
		}
		
		writer.write("Finished testIsEqual!\n\n");
	}
	
	public static void testIsSubset() throws IOException {
		String[] a1 = reader.readLine().split(",");
		String[] a2 = reader.readLine().split(",");
		String[] a3 = reader.readLine().split(",");
		
		Set s1 = new Set(a1);
		Set s2 = new Set(a2);
		Set s3 = new Set(a3);
		Set s4 = new Set();
		
		writer.write("Testing testIsSubset...\n");
		
		if(s1.isSubset(s1)) {
			writer.write("Test Case 1: PASSED\n");
		}
		else {
			writer.write("Test Case 1: FAILED\n");
		}
		
		if(s1.isSubset(s2)) {
			writer.write("Test Case 2: PASSED\n");
		}
		else {
			writer.write("Test Case 2: FAILED\n");
		}
		
		if(!s3.isSubset(s2)) {
			writer.write("Test Case 3: PASSED\n");
		}
		else {
			writer.write("Test Case 3: FAILED\n");
		}
		
		if(s4.isSubset(s1)) {
			writer.write("Test Case 4: PASSED\n");
		}
		else {
			writer.write("Test Case 4: FAILED\n");
		}
		
		if(!s2.isSubset(s4)) {
			writer.write("Test Case 5: PASSED\n");
		}
		else {
			writer.write("Test Case 5: FAILED\n");
		}
		
		if(s4.isSubset(s4)) {
			writer.write("Test Case 6: PASSED\n");
		}
		else {
			writer.write("Test Case 6: FAILED\n");
		}
		
		writer.write("Finished testIsSubset!\n\n");
	}
	
	public static void testGetCount() throws IOException {
		String[] a1 = reader.readLine().split(",");
		String[] a2 = reader.readLine().split(",");
		
		Set s1 = new Set(a1);
		Set s2 = new Set(a2);
		Set s3 = new Set();
		
		writer.write("Testing testGetCount...\n");
		
		if(s1.getCount() == 3) {
			writer.write("Test Case 1: PASSED\n");
		}
		else {
			writer.write("Test Case 1: FAILED\n");
		}
		
		if(s2.getCount() == 1) {
			writer.write("Test Case 2: PASSED\n");
		}
		else {
			writer.write("Test Case 2: FAILED\n");
		}
		
		if(s3.getCount() == 0) {
			writer.write("Test Case 3: PASSED\n");
		}
		else {
			writer.write("Test Case 3: FAILED\n");
		}
		
		writer.write("Finished testGetCount!\n\n");
	}
	
	public static void testToString() throws IOException {
		String[] a1 = reader.readLine().split(",");
		String[] a2 = reader.readLine().split(",");
		
		Set s1 = new Set(a1);
		Set s2 = new Set(a2);
		Set s3 = new Set();
		
		writer.write("Testing testToString...\n");
		
		if(s1.toString().equals("{a,b,c}")) {
			writer.write("Test Case 1: PASSED\n");
		}
		else {
			writer.write("Test Case 1: FAILED\n");
		}
		
		if(s2.toString().equals("{z}")) {
			writer.write("Test Case 2: PASSED\n");
		}
		else {
			writer.write("Test Case 2: FAILED\n");
		}
		
		if(s3.toString().equals("{}")) {
			writer.write("Test Case 3: PASSED\n");
		}
		else {
			writer.write("Test Case 3: FAILED\n");
		}
		
		writer.write("Finished testToString!\n\n");
	}
	
}
