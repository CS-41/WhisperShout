/**
 * @author Elizabeth Allen - eallen12
 * CIS175 - Fall 2021
 * Sep 22, 2021
 */
package model;

public class WordChangeFun {
	
	private String wordCapture;

	public WordChangeFun() {
		super();
	}
	
	public WordChangeFun(String wordCapture) {
		super();
		this.wordCapture = wordCapture;
	}

	public void setWordCapture(String wordCapture) {
		this.wordCapture = wordCapture;
	}

	public String getWordCapture() {
		return wordCapture;
	}

	
	public String shoutCall() {
		return wordCapture.toUpperCase();
	}
	
	public String whisperCall() {
		return wordCapture.toLowerCase();
	}

	@Override
	public String toString() {
		return "WordChangeFun [wordCapture=" + wordCapture + "]";
	}

}
