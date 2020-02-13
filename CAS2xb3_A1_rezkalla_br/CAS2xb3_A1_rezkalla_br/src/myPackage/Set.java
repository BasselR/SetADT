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
import java.util.*; //For Java's ArrayList

// Private and final class to ensure immutability
public final class Set {
	
	//Set's only state variable; a String ArrayList, private and final to ensure immutability
	private final ArrayList<String> StringArray;
	
	/*
	Set's constructor. Takes in a String array holding our desired String
	elements, and stores them in our state variable ArrayList, ignoring duplicates.
	 */
	public Set(String[] input) {	
		StringArray = new ArrayList<String>();
		for(String s : input) {
			if(!StringArray.contains(s)) {
				StringArray.add(s);	
			}
		}
	}
	
	//A second constructor for Set (overloading), for creating an empty set. Takes no arguments. 
	public Set() {
		StringArray = new ArrayList<String>();
	}
	
	//A simple getter for returning our state variable (String ArrayList).
	public ArrayList<String> getStrArr() {
		return this.StringArray;
	}
	
	/*
	A function for adding an element to this Set. No duplicates in the Set can be created
	by this function. Ensures immutability by returning a new Set.
	 */
	public Set add(String s) {
		ArrayList<String> sal = this.getStrArr(); // sal : string array list
		if(!this.getStrArr().contains(s)) {
			sal.add(s);
		}
		String[] arr = sal.toArray(new String[sal.size()]); // arrayList to array
		Set result = new Set(arr);
		return result;
	}
	
	/*
	A function for removing an element from this Set.
	Ensures immutability by returning a new Set.
	 */
	public Set remove(String s) {
		ArrayList<String> sal = this.getStrArr(); // sal : string array list
		sal.remove(s);
		String[] arr = sal.toArray(new String[sal.size()]); // arrayList to array
		Set result = new Set(arr);
		return result;
	}
	
	/*
	Returns the union of this Set, and a given Set S.
	Ensures immutability by returning a new Set.
	
	This function works by adding the elements of this Set and the Set S to a new Set,
	and returning that new Set. This function cannot create duplicate elements since 
	it uses add(), and add() ensures no duplicate elements.
	 */
	public Set Union(Set S) {
		Set result = new Set();
		for(String s : this.getStrArr()) {
			result = result.add(s);
		}
		for(String s : S.getStrArr()) {
			result = result.add(s);
		}
		return result;
	}
	
	/*
	Returns the intersection of this Set, and a given Set S.
	Ensures immutability by returning a new Set.
	
	This function works by creating a Set and adding all elements that belong 
	in this Set, as long as the elements also belong in the Set S. 
	 */
	public Set Intersection(Set S) {
		Set result = new Set();
		for(String s : this.getStrArr()) {
			if(S.getStrArr().contains(s)) {
				result = result.add(s);
			}
		}
		return result;
	}
	
	/*
	Returns the Set difference of this Set, and a given Set S.
	Ensures immutability by returning a new Set.
	
	This function works by creating a Set and adding all elements that belong 
	in this Set, as long as the elements do not belong in the Set S. 
	 */
	public Set Difference(Set S) {
		Set result = new Set();
		for(String s : this.getStrArr()) {
			if(!S.getStrArr().contains(s)) {
				result = result.add(s);
			}
		}
		return result;
	}
	
	/*
	Returns the Set product of this Set, and a given Set S.
	Ensures immutability by returning a new Set.
	
	This function works by creating a Set of all possible pairs of concatenated 
	elements of the form rs where r in Set R and s in Set S.
	 */
	public Set Product(Set S) {
		Set result = new Set();
		for(String r : this.getStrArr()) {
			for(String s : S.getStrArr()) {
				result.add(r + s);
			}
		}
		return result;
	}
	
	/*
	Determines whether or not this Set is equal to a given Set S.
	Returns a boolean value; true if both sets are equal, false otherwise.
	
	This function uses mutual inclusion to determine whether or not 2 sets are equal.
	If 2 Sets are subsets of each other, they must be equal.
	 */
	public boolean isEqual(Set S) {
		return this.isSubset(S) && S.isSubset(this);
	}
	
	/*
	Determines whether or not this Set is a subset of a given Set S.
	Returns a boolean value; true if this Set is a subset of S, false otherwise.
	
	This function works by checking that every element in this Set is also an 
	element of S.
	 */
	public boolean isSubset(Set S) {
		for(String r : this.getStrArr()) {
			if(!S.getStrArr().contains(r)) {
				return false;
			}
		}
		return true;
	}
	
	// A simple getter for retrieving the number of elements in this Set. Returns an integer.
	public int getCount() {
		return this.getStrArr().size();
	}
	
	/*
	A function for representing a Set as a String, composed of its elements. 
	This function works by concatenating all the elements of this Set together.
	The entire string is enclosed in curly braces, and each element is separated
	by a comma and a space.
	
	For example, this function would express the Set containing the 
	elements "a", "b" and "c" as a String in the form: {"a", "b", "c"}
	 */
	public String toString() {
		String result = "{";
		for(int i = 0; i < this.getStrArr().size() - 1; i++) {
			result += this.getStrArr().get(i) + ",";
		}
		if(this.getStrArr().size() != 0) {
			result += this.getStrArr().get(this.getStrArr().size() - 1);
		}
		result += "}";
		return result;
	}
	
}
