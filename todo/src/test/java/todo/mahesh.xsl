<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<body>
				<h1>mahesh</h1>
			
				<xsl:for-each select="student">
					<span style="color:red;"><xsl:value-of select="name"/></span>
					<xsl:value-of select="id"/><br/>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>