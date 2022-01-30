<div class="firsti">
    <h2>Editar perfil</h2>
    <button><a href="">Ver perfil publico</a></button>
</div>

<label for="">Nombre de usuario</label><br>
<input type="text" id="username" style="width: 180px;" value="{{$usuario->nombre_completo}}">

<div class="full_name">
    <div>
        <label for="">Nombre</label><br>
        <input type="text" id="nombre" value="{{$usuario->nombres}}">
    </div>
    <div>
        <label for="">Apellido</label><br>
        <input type="text" id="apellido" value="{{$usuario->apellidos}}">
    </div>
</div>
<h4>Redes sociales</h4>
<div class="social_network">
    <ul>
        <li><i class="fab fa-facebook"></i><input type="text" placeholder="facebook.com/"></li>
        <li><i class="fab fa-twitter"></i><input type="text" placeholder="twitter.com/"></li>
        <li><i class="fab fa-instagram-square"></i><input type="text" placeholder="instagram.com/"></li>
    </ul>
</div>
<div>
    <button type="button" style="margin: auto;" onclick="javascript:actualizar_datos_personales()">Guardar Cambios</button>
    <button><a href="../static/php/cerrar_sesion.php">Cerrar sesion</a></button>
</div>