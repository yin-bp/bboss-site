<%@page import="com.frameworkset.common.poolman.DBUtil"%>
<%@page import="com.frameworkset.orm.transaction.TransactionManager"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
	session="true"%>
	<%
	TransactionManager tm = new TransactionManager();
	out.print(tm.getTransaction());
	
	tm.begin();
	//session.setAttribute("tm", tm);
	tm.getTransaction().getConnection();
	
	//for(int j = 0; j < 100; j ++)
	//	DBUtil.getConection();
	int i = DBUtil.getNumActive();
	DBUtil.debugStatus();
	out.print("DBUtil.getNumActive()="+DBUtil.getNumActive());
	%>