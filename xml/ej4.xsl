<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <xsl:for-each select="ciclos/ciclo">
            <xsl:value-of select="nombre"/>
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>

<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <xsl:for-each select="ciclos/ciclo">
                <p><xsl:value-of select="nombre"/><p/>
            </xsl:for-each>
        <html>
    </xsl:template>
</xsl:stylesheet>

<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <ul>
                <xsl:for-each select="ciclos/ciclo">
                    <li><xsl:value-of select="nombre"/><li/>
                </xsl:for-each>
            <ul/>
        <html>
    </xsl:template>
</xsl:stylesheet>

<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <table border="1">
                <xsl:for-each select="ciclos/ciclo">
                    <tr><td><xsl:value-of select="nombre"/><td/><tr/>
                </xsl:for-each>
            <table/>
        <html>
    </xsl:template>
</xsl:stylesheet>