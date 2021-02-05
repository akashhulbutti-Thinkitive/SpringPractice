package com.akash.Day16_SpringMVCHIbernateDictionaryAssignment4.model;

public class DictionaryClass {
	private int did;
	private String word;
	private String meaning;

	public DictionaryClass() {
		// TODO Auto-generated constructor stub
	}

	public DictionaryClass(int did, String word, String meaning) {
		super();
		this.did = did;
		this.word = word;
		this.meaning = meaning;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + did;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DictionaryClass other = (DictionaryClass) obj;
		if (did != other.did)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DictionaryClass [did=" + did + ", word=" + word + ", meaning=" + meaning + "]";
	}

}
