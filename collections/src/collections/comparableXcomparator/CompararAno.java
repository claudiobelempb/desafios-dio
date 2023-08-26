package collections.comparableXcomparator;

import java.util.Comparator;

public class CompararAno implements Comparator<Livro> {
	public int compare(Livro l1, Livro l2) {
		if (l1.getAno() < l2.getAno())
			return -1;
		if (l1.getAno() > l2.getAno())
			return 1;
		else
			return 0;
	}
}

