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
           
            
            <table >    <tr>
                            <th colspan="2"><h3>DAR DE ALTA</h3></th> 

                        </tr>
                        <tr>
                            <th colspan="2"><p>DATOS PERSONA</p></th> 

                        </tr>
                        <tr>
                            <td><label>Nombre</label></td>
                            <td><input type="text" name="name" required><br/></td> 


                        </tr>
                         <tr>
                            <td><label>Apellido</label></td>
                            <td><input type="text" name="lastname" required><br/></td> 


                        </tr>
                        <tr>
                            <td><label>Teléfono</label></td>
                            <td><input type="text" name="phone" required><br/></td> 
                            
                        </tr>
                        <tr>
                            <td><label>DNI</label></td>
                            <td><input type="text" name="nif" required><br/></td> 
                            
                        </tr>
                        <tr>
                            <td><label>F.Nacimiento</label></td>
                            <td><input type="date" name="birthdate" required><br/></td> 
                            
                        </tr>
                        
                        <tr>
                            <th colspan="2"><p>DATOS DIRECCIÓN</p></th> 

                        </tr>
                        <tr>
                            <td> <label>Calle</label></td>
                            <td><input type="text" name="street" required><br/></td> 
                            
                        </tr>
                        <tr>
                            <td><label>Portal</label></td>
                            <td><input type="text" name="portal" required><br/></td> 
                            
                        </tr>
                        <tr>
                            <td><label>Piso</label></td>
                            <td><input type="text" name="floor" required><br/><br/></td> 
                            
                        </tr>
            
            </table>
             <input type="hidden" name="a" value="Altapersona">
            <input type="submit" value="Dar de Alta"> 
        </form>
        <form method="POST" action="Dispatcher" id="formbaja">
            
            
            
            <table>
                        <tr>
                            <th colspan="2"><h3>DAR DE BAJA</h3></th> 

                        </tr>
                        <tr>
                            <td><label>DNI</label></td>
                            <td><input type="text" name="nif" required><br/></td> 


                        </tr>
           </table> 
            <input type="hidden" name="a" value="Bajapersona">
            <input type="submit" value="Dar de Baja"> 
            
        </form>
        
        
        <p><%
            HttpSession ses=request.getSession();
            if(ses.getAttribute("error")!=null){
            out.print(ses.getAttribute("error"));
            ses.setAttribute("error",null);
            }
            %></p>
    </body>
    <p>-----------------------------------------------------------------------------------------</p>
    <p>-----------------------------------------------------------------------------------------</p>
    <form>
        
            <input type="hidden" name="a" value="Listarpersona">
            <input type="submit" value="Listar todas las personas"> 
        
    </form>
</html>
