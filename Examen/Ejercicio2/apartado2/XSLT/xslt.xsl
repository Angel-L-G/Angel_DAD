<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">

        <xsl:apply-templates select="//producto" />

    </xsl:template>

    <xsl:template match="producto">
        <html>
            <body>
                <ul>
                    <li>
                        <strong>Elemento <xsl:value-of select="@codigo" /></strong>
                    </li>

                    <ul>
                        <li>Nombre: <xsl:value-of select="nombre" /></li>
                        <li>Peso: <xsl:value-of select="peso" />    
                            <xsl:value-of
                                select="concat(' ', peso/@unidad)" />
                        </li>
                    </ul>

                </ul>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>