package com.saurabh.Ex2;

import java.util.Objects;

public class Document {

	protected int docid;
	protected String docname;
	protected float filesize;
	
	public Document(){}
	
	public Document(int docid, String docname, float filesize) {
		super();
		this.docid = docid;
		this.docname = docname;
		this.filesize = filesize;
	}
	
	@Override
	public String toString() {
		return String.format("\nDocument_ID = %d Document_Name = %s Document_Size = %.2f" , this.docid,this.docname,this.filesize);
	}
	 
}
