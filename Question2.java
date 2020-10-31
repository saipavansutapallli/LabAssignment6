package lab6;

import java.io.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Question2 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("story.txt"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		String line = null;
		try {
			while((line = br.readLine()) != null) {
				String[] tokens = line.split(" ");
				for(String token: tokens) {
					if(hMap.containsKey(token)) {
						int value = hMap.get(token);
						hMap.put(token, ++value);
						
					} else {
						hMap.put(token, 1);
					}
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Set<Entry<String, Integer>> entrySet = hMap.entrySet();
		for(Entry<String, Integer> setItem : entrySet) {
			System.out.println(setItem.getKey() + " appear " + setItem.getValue() + " times ");
		}
	}

}