package com.example.solid.Liskov;

import java.beans.PropertyEditorSupport;

public class IsbnEditor extends PropertyEditorSupport {
	public IsbnEditor() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		super.setAsText(text);
	}
	
	@Override
	public String getAsText() {
		// TODO Auto-generated method stub
		Isbn isbn = (Isbn) getValue();
		if(isbn != null) {
			return isbn.getValue();
		}else {
			return  "";
		}
		
		return super.getAsText();
	}
}
