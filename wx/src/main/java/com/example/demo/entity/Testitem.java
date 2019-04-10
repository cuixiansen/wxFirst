package com.example.demo.entity;

import java.util.List;
//测试的题目成员 保存的是题号的内容
public class Testitem {
int testProblemId;
String testProblemText;
String testParentProblemPrefix;;
String testParentProblemPreText;
List<Testdetail> optionList;
public int getTestProblemId() {
	return testProblemId;
}
public void setTestProblemId(int testProblemId) {
	this.testProblemId = testProblemId;
}
public String getTestProblemText() {
	return testProblemText;
}
public void setTestProblemText(String testProblemText) {
	this.testProblemText = testProblemText;
}
public String getTestParentProblemPrefix() {
	return testParentProblemPrefix;
}
public void setTestParentProblemPrefix(String testParentProblemPrefix) {
	this.testParentProblemPrefix = testParentProblemPrefix;
}
public String getTestParentProblemPreText() {
	return testParentProblemPreText;
}
public void setTestParentProblemPreText(String testParentProblemPreText) {
	this.testParentProblemPreText = testParentProblemPreText;
}
public List<Testdetail> getOptionList() {
	return optionList;
}
public void setOptionList(List<Testdetail> optionList) {
	this.optionList = optionList;
}


}
