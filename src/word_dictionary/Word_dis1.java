package word_dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Word_dis1 {
	static Map<String, String> mapObj = new HashMap<String, String>();

	protected static final void storeWord(String key, String value) {

		mapObj.put(key, value);
	}

	protected static final Set<String> retrun_word() {
		return mapObj.keySet();

	}

	protected static final String retrun_word_dif(String key) {
		return mapObj.get(key);

	}

}
