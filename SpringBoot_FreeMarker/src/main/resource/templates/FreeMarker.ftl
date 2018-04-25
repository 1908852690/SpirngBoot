<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SpringBoot整合FreeMarker</title>
</head>
<body>
	<div align="center">
		<table>
			<tr>
			<td>学生编号</td>
			<td>学生姓名</td>
			</tr>
			<#list Students as stu>
				<tr>
					<td>${stu.stu_id}</td>
					<td>${stu.stu_name}</td>
				</tr>
			</#list>
		</table>
	</div>
</body>
</html>