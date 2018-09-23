import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.*;
import java.io.*;

class BagOfWords {
	Map<String, Integer> dictionary1;
	Map<String, Integer> dictionary2;
	BagOfWords() {
		dictionary1 = new HashMap<String, Integer>();
		dictionary2 =  new HashMap<String, Integer>();
	}

	public void addDictn1(String[] list) {
		for (String i : list) {
			if (dictionary1.containsKey(i)) {
				int k = dictionary1.get(i);
				dictionary1.put(i, k + 1);
			} else {
				dictionary1.put(i, 1);
			}
		}
	}
	public void addDictn2(String[] list) {
		for (String i : list) {
			if (dictionary2.containsKey(i)) {
				int k = dictionary2.get(i);
				dictionary2.put(i, k + 1);
			} else {
				dictionary2.put(i, 1);
			}
		}
	}

	public void getDistance() {
		float num = 0;
		float a = 0;
		double den = 0;
		double res = 0;
		float c = 0;
		for (String i : dictionary1.keySet()) {
			if (dictionary2.containsKey(i)) {
				num += dictionary1.get(i) * dictionary2.get(i);
			}
		}
		for (String i : dictionary1.keySet()) {
			a += Math.pow(dictionary1.get(i), 2);
		}
		for (String i : dictionary2.keySet()) {
			c += Math.pow(dictionary2.get(i), 2);
		}
		den = Math.sqrt(a) * Math.sqrt(c);
		res = Math.round((num * 100) / den);
		System.out.format("%.0f", res);
		System.out.print("\t\t");
	}
}
class Solution {
	public static void main(String[] args) throws IOException {
		try {
			Scanner scan = new Scanner(System.in);
			File file = new File(scan.nextLine());
			File[] files = file.listFiles();
			System.out.print("\t\t");
            for(int k = 0; k < files.length - 1; k++) {
            	System.out.print(files[k].getName() + "\t");
            }
            System.out.print(files[files.length].getName());
            System.out.println();
			for (int i = 0; i < files.length; i++) {
				for (int j = 0; j < files.length; j++) {
					String line = null;
					String line1 = null;
					BagOfWords bags = new BagOfWords();
					Scanner s = new Scanner(files[i]);
					while (s.hasNext()) {
						line = s.useDelimiter("\\A").next();
					}
					if (line != null) {
						String[] tokens = line.toLowerCase().split(" ");
						bags.addDictn1(tokens);
					}
					Scanner s1 = new Scanner(files[j]);
					while (s1.hasNext()) {
						line1 = s1.useDelimiter("\\A").next();
					}
					if (line1 != null) {
						String[] tokens1 = line1.toLowerCase().split(" ");
						bags.addDictn2(tokens1);
					}
					bags.getDistance();
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("empty directory");

		}
	}
}
