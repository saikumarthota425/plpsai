package com.cg.oiqgs.dao;

public interface QueryMapper {
	
	String insertQuery = "insert into accounts values(account_number_seq.Nextval,?,?,?,?,?,?)";
	
	String accountSequence ="Select account_number_seq.CURRVAL from dual";

	String selectBusinessSegment = "Select * from businessSegment";
  
	String getingQuestions = "select* from policyQuestions where bus_seg_id=100";
}
