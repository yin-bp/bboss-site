
 <%@ page contentType="text/html; charset=utf-8" language="java" %>
 <%@ taglib uri="/WEB-INF/pager-taglib.tld" prefix="pg"%>
 
 

<head><title>bboss-mvc - 全文检索</title></head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/classic/main.css" type="text/css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/classic/messages.css" type="text/css"/>
<link rel="stylesheet"
			href="${pageContext.request.contextPath}/css/classic/tables.css"
			type="text/css">
		<link rel="stylesheet"
			href="${pageContext.request.contextPath}/css/classic/main.css"
			type="text/css">
		<link rel="stylesheet"
			href="${pageContext.request.contextPath}/css/classic/mainnav.css"
			type="text/css">
		<link rel="stylesheet"
			href="${pageContext.request.contextPath}/css/classic/messages.css"
			type="text/css">
		<link rel="stylesheet"
			href="${pageContext.request.contextPath}/css/classic/tooltip.css"
			type="text/css">

<script type="text/javascript">
     
     function dosubmit(){
      document.getElementById("search").submit();
     
     }
   
</script>


<body>
<div id="errors">
    <h2>全文检索示例</h2>
</div>


<%
/*

        This jsp page is deliberatly written in the horrible java directly embedded 
        in the page style for an easy and concise demonstration of Lucene.
        Due note...if you write pages that look like this...sooner or later
        you'll have a maintenance nightmare.  If you use jsps...use taglibs
        and beans!  That being said, this should be acceptable for a small
        page demonstrating how one uses Lucene in a web app. 

        This is also deliberately overcommented. ;-)

*/
%>
<center> 
	<form id="search" action="${pageContext.request.contextPath}/rest/search/dosearch" method="get">
		<p>
			<input name="query" size="44" value="${queryString }"/>&nbsp;查询条件
		</p>
		<p>
			<input name="maxresults" size="4" value="${maxpage }"/>
		</p>
			<table>
			<tr><td>
			<div>
				<ul class="options">
					<li id="size">
						<a href="#" onClick="dosubmit()">search</a>
					</li>
				</ul>
		</div>
		</td></tr></table>
		
		<p>查询到${totalHits }条结果,耗时${times }</p>
        </form>
</center>

    <pg:true actual="${!empty parsingerrorcode}">

                   
                  <p>Error while parsing query: ${parsingerrorcode}</p>
	</pg:true>
  

    
                      
	<pg:true actual="${ !empty emptycode}" evalbody="true">
	    <pg:yes >
	                <p> ${emptycode } </p>
	 	</pg:yes>
	    <pg:no>
                <table class="genericTbl">
                <tr>
                        <th class="order1 sorted">Document</th>
                        <th class="order1 sorted">Summary</th>
                </tr>
				<pg:list requestKey="docs">
	                <tr class="even">
	                        <td><a href="<pg:cell colName="url"/>"><pg:cell colName="doctitle"/></a></td>
	                        <td><pg:cell colName="summary"/></td>
	                </tr>
				</pg:list>
				
				<pg:true actual="${ !empty moreurl}">
	                <tr>
	                        <td></td><td><a href="${moreurl }">More Results>></a></td>
	                </tr>
 				</pg:true>
 				
                </table>

	    </pg:no>
	</pg:true>