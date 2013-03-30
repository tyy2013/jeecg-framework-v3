<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
<div region="center" style="padding:1px;">
<t:dategrid name="functionList" title="菜单管理" actionUrl="functionController.do?functionGrid" idField="id" treegrid="true" pagination="false">
 <t:dgCol title="编号" field="id" treefield="id" hidden="false"></t:dgCol>
 <t:dgCol title="菜单名称" field="functionName" width="100" treefield="text"></t:dgCol>
 <t:dgCol title="图标" field="TSIcon_iconPath" treefield="code" image="true"></t:dgCol>
 <t:dgCol title="菜单地址" field="functionUrl" treefield="src"></t:dgCol>
 <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
 <t:dgDelOpt url="functionController.do?del&id={id}" title="删除"></t:dgDelOpt>
 <t:dgToolBar title="菜单录入" icon="icon-add" url="functionController.do?addorupdate" funname="add"></t:dgToolBar>
 <t:dgToolBar title="菜单编辑" icon="icon-edit" url="functionController.do?addorupdate" funname="update"></t:dgToolBar>
</t:dategrid>
</div>
</div>
