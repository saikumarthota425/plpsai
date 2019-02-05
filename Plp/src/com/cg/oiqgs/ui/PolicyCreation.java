package com.cg.oiqgs.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.BusinessSegment;
import com.cg.oiqgs.model.PolicyQuestions;
import com.cg.oiqgs.serviceimpl.InsuranceQuotesServiceImpl;
import com.cg.oiqgs.servise.InsuranceQuotesService;

public class PolicyCreation {

	public static void main(String[] args) {
		List<BusinessSegment> list = new ArrayList<>();
		InsuranceQuotesService insuranceservice = new InsuranceQuotesServiceImpl();
		BusinessSegment businessSegment = new BusinessSegment();
		Scanner scanner = null;

		

			try {
				list = insuranceservice.SelectBusinessSegment();
				System.out.println("BusName policy");
				System.out.println();

				int choice = 1;
				for (BusinessSegment lis : list) {

					System.out.println(choice++ + " " + lis.getBusSegName());

				}

				scanner = new Scanner(System.in);
				int choices = 0;
				boolean flag1 = false;
				do {
					System.out.println("selectchoice");
					try {
						choices = scanner.nextInt();
						flag1 = false;

						PolicyQuestions policyquestions = new PolicyQuestions();

						switch (choices) {
						case 1:
							Double preium=0.0;
							
							List<PolicyQuestions> lists = insuranceservice.getQuestions();
							
							for(PolicyQuestions list11:lists) {
							
								System.out.println(list11.getPolQuesDesc());
								System.out.println(list11.getPolQuesAns1());
								System.out.println(list11.getPolQuesAns2());
								System.out.println(list11.getPolQuesAns3());
								int pre = scanner.nextInt();
								/*switch (pre) {
								case 1:*/
									preium=preium+list11.getPolQuesAns1Weightage();
									System.out.println(preium);
									/*break;*/

								/*default:
									break;
								}*/
							}

							break;
						case 2:

							break;
						case 3:

							break;
						case 4:

							break;

						default:
							break;
						}

					} catch (InputMismatchException e) {

						System.out.println("enter only digits");
					}

				} while (flag1);
			} catch (OiqgsException e) {

				e.printStackTrace();
			}
		
	}

}
