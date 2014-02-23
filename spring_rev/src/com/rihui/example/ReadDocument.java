package com.rihui.example;

public class ReadDocument {

	private Document document;

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	public void read(){
		this.document.read();
	}
	
}
