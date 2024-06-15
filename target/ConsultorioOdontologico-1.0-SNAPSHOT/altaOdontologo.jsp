<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimeraparte.jsp"%>

<h1>Alta Odontólogos</h1>
<p>esto es una prueba</p>

<form class="user">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni"
            placeholder="DNI">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre"
            placeholder="Nombre">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apellido"
            placeholder="Apellido">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telefono"
            placeholder="Teléfono">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direccion"
            placeholder="Dirección">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="fechanac"
            placeholder="Fecha Nac">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="especialidad"
            placeholder="Especialidad">
        </div>
        
        <!--acá va todo lo que debe ir con horarios-->
        
    </div>
                                
    <a href="login.html" class="btn btn-primary btn-user btn-block">Crear Odontólogo</a>
                                
</form>

<%@include file="components/bodyfinal.jsp"%>
