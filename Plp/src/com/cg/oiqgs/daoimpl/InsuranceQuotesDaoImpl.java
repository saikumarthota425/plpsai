package com.cg.oiqgs.daoimpl;

import java.lang.management.PlatformLoggingMXBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.oiqgs.dao.InsuranceQuotesDao;
import com.cg.oiqgs.dao.QueryMapper;
import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.Accounts;
import com.cg.oiqgs.model.BusinessSegment;
import com.cg.oiqgs.model.PolicyQuestions;
import com.cg.oiqgs.model.UserRole;
import com.cg.oiqgs.utility.JdbcUtility;

public class InsuranceQuotesDaoImpl implements InsuranceQuotesDao {

	Connection connection = null;
	PreparedStatement preparestatement = null;
	ResultSet resultset = null;

	@Override
	public Long insertingDetails(Accounts accounts, UserRole role) throws OiqgsException {

		Long accountNumber = 0l;
		connection = JdbcUtility.getConnection();
		try {
			preparestatement = connection.prepareStatement(QueryMapper.insertQuery);
			preparestatement.setString(1, accounts.getInsuredName());
			preparestatement.setString(2, accounts.getInsuredStreet());
			preparestatement.setString(3, accounts.getInsuredCity());
			preparestatement.setString(4, accounts.getInsuredState());
			preparestatement.setLong(5, accounts.getInsuredZip());
			preparestatement.setString(6, role.getUserName());
			@SuppressWarnings("unused")
			int result = preparestatement.executeUpdate();

			preparestatement = connection.prepareStatement(QueryMapper.accountSequence);
			resultset = preparestatement.executeQuery();

			resultset.next();
			accountNumber = resultset.getLong(1);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return accountNumber;
	}

	@Override
	public List<BusinessSegment> SelectBusinessSegment() throws OiqgsException {
		List<BusinessSegment> list = new ArrayList<>();

		connection = JdbcUtility.getConnection();
		try {
			preparestatement = connection.prepareStatement(QueryMapper.selectBusinessSegment);
			resultset = preparestatement.executeQuery();

			while (resultset.next()) {
				String busSeqId = resultset.getString(1);
				int busSegSeq = resultset.getInt(2);
				String busSegName = resultset.getString(3);

				BusinessSegment businessSegment = new BusinessSegment();
				businessSegment.setBusSegId(busSeqId);
				businessSegment.setBusSegSeq(busSegSeq);
				businessSegment.setBusSegName(busSegName);

				list.add(businessSegment);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<PolicyQuestions> getQuestions() throws OiqgsException {
		connection = JdbcUtility.getConnection();
		List<PolicyQuestions> list = new ArrayList<>();
		
		try {
			preparestatement =connection.prepareStatement(QueryMapper.getingQuestions);
		    resultset = preparestatement.executeQuery();
		    while(resultset.next()) {
		    	
		    	
		    	String question=resultset.getString("pol_ques_desc");
		    	String answer1 = resultset.getString("pol_ques_ans1");
		    	String answer2 =resultset.getString("pol_ques_ans2");
		    	String answer3= resultset.getString("pol_ques_ans3");
		    	Long answer1weightage=resultset.getLong("pol_ques_ans1_weightage");
		    	Long answer2weightage=resultset.getLong("pol_ques_ans2_weightage");
		    	Long answer3weightage=resultset.getLong("pol_ques_ans3_weightage");
		  
		    	
		    	PolicyQuestions policyQuestions=new  PolicyQuestions();
		    	
		    	policyQuestions.setPolQuesDesc(question);
		    	policyQuestions.setPolQuesAns1(answer1);
		    	policyQuestions.setPolQuesAns2(answer2);
		    	policyQuestions.setPolQuesAns3(answer3);
		    	policyQuestions.setPolQuesAns1Weightage(answer1weightage);
		    	policyQuestions.setPolQuesAns2Weightage(answer2weightage);
                policyQuestions.setPolQuesAns3Weightage(answer3weightage);
                list.add(policyQuestions);
                
		    	
		    }
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
