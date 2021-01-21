<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/students">
		<html>
			<body>
				<h1 align="center">Student Table</h1>
				<table border="1" align="center">
					<tr>
						<th bgcolor="red">no</th>
						<th bgcolor="red">name</th>
						<th bgcolor="red">email</th>
						<th bgcolor="red">marks</th>
						<th bgcolor="red">class</th>
					</tr>
					<xsl:for-each select="students/student">
						<tr>
							<td>
								<xsl:value-of select="number"/>
							</td>
							<td>
								<xsl:value-of select="name"/>
							</td>
							<td>
								<xsl:value-of select="e-mail"/>
							</td>
							<td>
								<xsl:value-of select="marks"/>
							</td>
							<td>
								<xsl:value-of select="class"/>
							</td>
						</tr>
					</xsl:for-each>
					</table>
				</body>
			</html>
	</xsl:template>
</xsl:stylesheet>