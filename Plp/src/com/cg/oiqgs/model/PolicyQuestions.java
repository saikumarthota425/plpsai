package com.cg.oiqgs.model;

public class PolicyQuestions {
	
	private String polQuesId;
	private int polQuesSeq;
	private String BusSegId;
	private String polQuesDesc;
	private String polQuesAns1;
	private String polQuesAns2;
	private String polQuesAns3;
    private Long	polQuesAns1Weightage;
    private Long	polQuesAns2Weightage;
    private Long	polQuesAns3Weightage;
    
    public PolicyQuestions() {
		// TODO Auto-generated constructor stub
	}

	public PolicyQuestions(String polQuesId, int polQuesSeq, String busSegId, String polQuesDesc, String polQuesAns1,
			String polQuesAns2, String polQuesAns3, Long polQuesAns1Weightage, Long polQuesAns2Weightage,
			Long polQuesAns3Weightage) {
		super();
		this.polQuesId = polQuesId;
		this.polQuesSeq = polQuesSeq;
		BusSegId = busSegId;
		this.polQuesDesc = polQuesDesc;
		this.polQuesAns1 = polQuesAns1;
		this.polQuesAns2 = polQuesAns2;
		this.polQuesAns3 = polQuesAns3;
		this.polQuesAns1Weightage = polQuesAns1Weightage;
		this.polQuesAns2Weightage = polQuesAns2Weightage;
		this.polQuesAns3Weightage = polQuesAns3Weightage;
	}

	public String getPolQuesId() {
		return polQuesId;
	}

	public void setPolQuesId(String polQuesId) {
		this.polQuesId = polQuesId;
	}

	public int getPolQuesSeq() {
		return polQuesSeq;
	}

	public void setPolQuesSeq(int polQuesSeq) {
		this.polQuesSeq = polQuesSeq;
	}

	public String getBusSegId() {
		return BusSegId;
	}

	public void setBusSegId(String busSegId) {
		BusSegId = busSegId;
	}

	public String getPolQuesDesc() {
		return polQuesDesc;
	}

	public void setPolQuesDesc(String polQuesDesc) {
		this.polQuesDesc = polQuesDesc;
	}

	public String getPolQuesAns1() {
		return polQuesAns1;
	}

	public void setPolQuesAns1(String polQuesAns1) {
		this.polQuesAns1 = polQuesAns1;
	}

	public String getPolQuesAns2() {
		return polQuesAns2;
	}

	public void setPolQuesAns2(String polQuesAns2) {
		this.polQuesAns2 = polQuesAns2;
	}

	public String getPolQuesAns3() {
		return polQuesAns3;
	}

	public void setPolQuesAns3(String polQuesAns3) {
		this.polQuesAns3 = polQuesAns3;
	}

	public Long getPolQuesAns1Weightage() {
		return polQuesAns1Weightage;
	}

	public void setPolQuesAns1Weightage(Long polQuesAns1Weightage) {
		this.polQuesAns1Weightage = polQuesAns1Weightage;
	}

	public Long getPolQuesAns2Weightage() {
		return polQuesAns2Weightage;
	}

	public void setPolQuesAns2Weightage(Long polQuesAns2Weightage) {
		this.polQuesAns2Weightage = polQuesAns2Weightage;
	}

	public Long getPolQuesAns3Weightage() {
		return polQuesAns3Weightage;
	}

	public void setPolQuesAns3Weightage(Long polQuesAns3Weightage) {
		this.polQuesAns3Weightage = polQuesAns3Weightage;
	}
    
    

}
