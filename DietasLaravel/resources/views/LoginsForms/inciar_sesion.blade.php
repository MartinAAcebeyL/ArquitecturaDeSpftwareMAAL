<!DOCTYPE html>
<html lang="en">
<head>
    <title>Inicio Sesion</title>
    <script src="{{ asset('js/user_interface.js') }}"></script>
    <link href="{{ asset('css/user_interface.css') }}" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
</head>
<body>
    <div class="container ">
        <h2>Inicio Sesion</h2>
        <div id="contenido">
            <div class="llenado">
                <input type="email" placeholder="Correo electronico" id="correo">
                <input type="password" placeholder="Contrasena" id="contrasena">
            </div>
            <div class="button">
                <button type="button" onclick="javascript:iniciarSesion()"><a>Iniciar sesion</a></button>
            </div>            
        </div>
    </div>
</body>
</html>