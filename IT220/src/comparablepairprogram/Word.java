package comparablepairprogram;

/*
 * 
 */

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
        // TODO: initialize word
		this.word=s;
        
	}

	public int compareTo( Word other )
	{
        // TO DO write compareTo
		if(this.word.length() > other.word.length() )
			return 1;
		else if(this.word.length() < other.word.length() )
			return -1;
		return this.word.compareTo(other.word);
	}

	@Override
	public String toString() {
		return word;
	}


}
