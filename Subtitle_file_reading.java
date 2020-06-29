package fir;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Subtitle_file_reading {
	static void counteachwords(String filename,Map<String,Integer> words) throws FileNotFoundException {
		Scanner file=new Scanner(new File(filename));
		while(file.hasNext()) {
			String word=file.next();
			Integer count= words.get(word);
			if(count!=null) 
				count++;
			else
				count=1;
			words.put(word, count);
		}
		file.close();
	}
	public static void main(String[] args) throws FileNotFoundException {
		Map<String,Integer> words=new HashMap<String,Integer>();
		counteachwords("C:\\Users\\nithi\\Desktop\\subs.txt",words);
//		System.out.println(words);
		
		LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        words.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
         
        System.out.println("Reverse Sorted Map   : " + reverseSortedMap);
	}
}

