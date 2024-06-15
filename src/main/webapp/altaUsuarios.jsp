

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimeraparte.jsp"%>

<h1>Alta Usuarios</h1>
<p>Este es el apartador para dar de alta, a los usuarios del sistema</p>
                           
<form class="user"  method="POST" action="SvUsuarios">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreusu"
            placeholder="Nombre Usuario" name="nombreusu">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="contrasenia"
            placeholder="Contraseña" name="contrasenia">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol"
            placeholder="Rol" name="rol">
        </div>      
       
        
        <!--acá va todo lo que debe ir con horarios-->
        
    </div>
                                
    <button type="submit" class="btn btn-primary btn-user btn-block">Crear Usuario</button>
                                
</form>

<%@include file="components/bodyfinal.jsp"%>

