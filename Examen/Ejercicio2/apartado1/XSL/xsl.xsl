<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <body>
                <table border="1">
                    <xsl:for-each select="inventario/producto">
                        <tr>
                            <td>
                                <xsl:value-of select="nombre" />
                            </td>
                            <td>
                                <xsl:value-of select="peso" />
                                <xsl:value-of select="peso/@unidad" />
                            </td>
                            <td>
                                <xsl:value-of select="concat(lugar/@edificio, lugar/aula)" />
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>