<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common/taglib.jsp" %>     
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
    <!--<![endif]-->
    <!-- BEGIN HEAD -->

    <head>
   		 <title>FreeMarker template error (DEBUG mode; use RETHROW in production!):
The following has evaluated to null or missing:
==> pageTitle  [in template "templates/jsp.ftl" at line 13, column 27]

----
Tip: If the failing expression is known to be legally refer to something that's null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${pageTitle}  [in template "templates/jsp.ftl" at line 13, column 25]
----

Java stack trace (for programmers):
----
freemarker.core.InvalidReferenceException: [... Exception message was already printed; see it above ...]
	at freemarker.core.InvalidReferenceException.getInstance(InvalidReferenceException.java:116)
	at freemarker.core.EvalUtil.coerceModelToString(EvalUtil.java:346)
	at freemarker.core.Expression.evalAndCoerceToString(Expression.java:82)
	at freemarker.core.DollarVariable.accept(DollarVariable.java:40)
	at freemarker.core.Environment.visit(Environment.java:312)
	at freemarker.core.MixedContent.accept(MixedContent.java:62)
	at freemarker.core.Environment.visit(Environment.java:312)
	at freemarker.core.Environment.process(Environment.java:290)
	at freemarker.template.Template.process(Template.java:312)
	at org.mybatis.generator.CodeGeneratorUtil.buildFile(CodeGeneratorUtil.java:261)
	at org.mybatis.generator.CodeGeneratorUtil.jsp(CodeGeneratorUtil.java:109)
	at org.mybatis.generator.CodeGeneratorUtil.createJspTemplate(CodeGeneratorUtil.java:88)
	at org.mybatis.generator.CodeGeneratorUtil.jspGenerator(CodeGeneratorUtil.java:61)
	at test.web.admin.JSPGenertor.main(JSPGenertor.java:22)
