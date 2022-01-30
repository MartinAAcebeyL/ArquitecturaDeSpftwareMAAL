<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <script src="{{ asset('js/user_perfil.js') }}"></script>
    <link href="{{ asset('css/user_perfil.css') }}" rel="stylesheet">
    <link href="{{ asset('css/general_index.css') }}" rel="stylesheet">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
    <title>Only healty</title>
</head>
<body>
<nav>
    <div class="nav">
        <div class="nav-left">
            <a href="{{ asset('/') }}"><img src="{{ asset('imgs/logo.png') }}" alt="sana manzaca"></a>                               
        </div>
        <div class="nav-right">
            <p><a href="">Profesionales</a></p>
            <p><a href="blogs.php">Blogs</a></p>
            <p><a href="user_perfil.php">Tu cuenta</a></p>
            <p><a href="">Calculadora</a></p>
        </div>
    </div>
</nav>

    <div class="container">
        <div class="left">
            <div>
                <img src="{{ asset('imgs/123.jpg') }}" alt="imagen">
                <p>{{$usuario->nombres}}</p>
            </div>
           
            <div class="tareas">
                <ul>
                    <li><i class="fas fa-user-edit"></i><a href="javascript:cargarContenido( '{{ route('usuario.edit', $usuario->id) }}' )">Editar perfil</a></li>
                    <li><i class="fas fa-cog"></i><a href="javascript:cargarContenido('user_perfil2.php')"> Mi cuenta </a></li>
                    <li><i class="fas fa-hands-helping"></i><a href="javascript:cargarContenido('user_perfil3.html')"> Suscripcion</a></li>
                    <li><i class="fas fa-utensils"></i><a href="javascript:cargarContenido('user_perfil4.php')"> Consumido</a></li>
                    <li><i class="far fa-edit"></i><a href="javascript:cargarContenido('user_perfil5.php')"> Registrar</a></li>
                </ul>
            </div>
        </div>

        <div class="center" id="center">
            <div class="firsti">
                <h2>Menu cliente</h2>
            </div>
            
            <h1>
            <p>BIENVENIDO....</p>
            </h1>
        </div>
    </div>
</body>
</html>