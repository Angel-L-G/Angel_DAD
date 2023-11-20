<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
    <body>
        
        <xsl:for-each select="inventario/producto">
            <h1>Edificio <xsl:value-of select="lugar/@edificio"/></h1>
            <table border="1">
                <tr>
                    <td>
                        <xsl:value-of select="nombre"/>
                    </td>
                    <td>
                        <xsl:value-of select="peso"/>
                        <xsl:value-of select="peso/@unidad"/>
                    </td>
                    <td>
                        <xsl:value-of select="lugar/@edificio"/>
                        <xsl:value-of select="lugar/aula"/>
                    </td>
                </tr>
            </table>
        </xsl:for-each>
        
    </body>
</html>
</xsl:template>
</xsl:stylesheet>




























































<!--A) /datos/proveedores/proveedor[estado > 15]/ciudad -->
<!--B) count(/datos/proyectos/proyecto[ciudad = 'Londres']) -->
<!--C) /datos/proyectos/proyecto[ciudad = 'Paris' and ../suministros/suministra[cantidad > 350 and numproyecto = current()/@numproyecto]]/nombreproyecto -->