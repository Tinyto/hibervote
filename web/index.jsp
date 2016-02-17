<%-- 
    Document   : index
    Created on : 15-feb-2016, 11:54:05
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Proyecto Persona-Dirección</h1>
        <form method="POST" action="Dispatcher" id="formalta">
            <h3>DAR DE ALTA</h3>
            <p>DATOS PERSONA</p>
            <table > 
                        <tr>
                            <td><label>Nombre</label></td>
                            <td><input type="text" name="name" required><br/></td> 


                        </tr>
                        <tr>
                            <td><label>Tefélono</label></td>
                            <td><input type="text" name="phone" required><br/></td> 
                            
                        </tr>
                        <tr>
                            <td><label>DNI</label></td>
                            <td><input type="text" name="nif" required><br/></td> 
                            
                        </tr>
                        <tr>
                            <td><label>F.Nacimiento</label></td>
                            <td><input type="text" name="birthdate" required><br/></td> 
                            
                        </tr>
                                    
            
            
            
            <p>DATOS DIRECCIÓN</p>
            <label>Calle</label><input type="text" name="street" required><br/>
            <label>Portal</label><input type="text" name="portal" required><br/>
            <label>Piso</label><input type="text" name="floor" required><br/><br/>
            
            <input type="hidden" name="a" value="alta">
            <input type="submit" value="Dar de Alta"> 
            </table>
        </form>
        <form method="POST" action="Dispatcher" id="formbaja">
            
            <h3>DAR DE BAJA</h3>
            <label>DNI</label><input type="text" name="nif" required><br/>
            
            
            <input type="hidden" name="a" value="baja">
            <input type="submit" value="Dar de Baja"> 
            
        </form>
    </body>
</html>
