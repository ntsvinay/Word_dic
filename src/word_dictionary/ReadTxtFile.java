package word_dictionary;

import java.io.*;
import java.util.Scanner;

public class ReadTxtFile {
	public static void main(String[] args) {

		String fileName = "word_dic.txt";

		String line = null;

		try {
			FileReader fileReader = new FileReader(fileName);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				String[] key_value = line.split("-");
				for (int a = 0; a < key_value.length - 1; a++) {
					Word_dis1.storeWord(key_value[a], key_value[a + 1]);
				}

			}

			System.out.println("available word in dicitinory-" + Word_dis1.retrun_word());
			System.out.println("Enter word you which want to search");

			Scanner sc = new Scanner(System.in);
			String word = sc.next();
			String value = Word_dis1.retrun_word_dif(word);
			if (value != null)
				System.out.println(value);
			else
				System.err.println("word is not in dicitionary");

			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
	}
}