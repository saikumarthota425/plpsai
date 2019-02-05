package com.cg.oiqgs.servise;

import java.util.List;

import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.Accounts;
import com.cg.oiqgs.model.BusinessSegment;
import com.cg.oiqgs.model.PolicyQuestions;
import com.cg.oiqgs.model.UserRole;

public interface InsuranceQuotesService {

	boolean validateFields(Accounts accounts);

	Long insertingDetails(Accounts accounts, UserRole role) throws OiqgsException;

	List<BusinessSegment> SelectBusinessSegment() throws OiqgsException;

	List<PolicyQuestions> getQuestions() throws OiqgsException;

}
