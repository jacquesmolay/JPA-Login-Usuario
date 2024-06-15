

<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimeraparte.jsp"%>

<h1>Edición Usuarios</h1>
<p>Este es el apartador para modificar un Usuario del sistema</p>

<% Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar");%>
                           
<form class="user"  method="POST" action="SvEditUsuarios">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreusu"
            placeholder="Nombre Usuario" name="nombreusu" value="<%=usu.getNombreUsuario()%>">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="contrasenia"
            placeholder="Contraseña" name="contrasenia" value="<%=usu.getConstrasenia()%>">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol"
            placeholder="Rol" name="rol" value="<%=usu.getRol()%>">
        </div>      
       
        
        <!--acá va todo lo que debe ir con horarios-->
        
    </div>
                                
    <button type="submit" class="btn btn-primary btn-user btn-block">Guardar Modificación</button>
                                
</form>

<%@include file="components/bodyfinal.jsp"%>

