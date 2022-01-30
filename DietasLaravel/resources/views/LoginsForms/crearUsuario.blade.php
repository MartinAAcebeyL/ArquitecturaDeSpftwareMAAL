<!DOCTYPE html>
<html lang="en">

<head>
    <title>Crear cuenta cliente</title>
    <script src="{{ asset('js/user_interface.js') }}"></script>
    <link href="{{ asset('css/user_interface.css') }}" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
</head>

<body>
    <div class="container">
        <h2>Registro Cliente</h2>
        <div class="icons">
            <i class="fab fa-facebook"></i>
            <i class="fab fa-google"></i>
        </div>
        <div id="contenido">
            <!-- <p>Paso 1 <i class="fas fa-arrow-right"></i></p> -->
            <div class="llenado">
                <form action="" method="post">
                    @csrf

                    <input type="email" placeholder="Correo electronico" id="correo" style="width: 90%; margin-bottom: 4px;"><br>
                    <input type="password" placeholder="Contrasena" id="contrasena" style="width: 90%; margin-top: 4px;">
                    <hr style="width: 90%; background-color: black; color: black;">

                    <div class="en_linea">
                        <input type="text" placeholder="nombres" id="nombres">
                        <input type="text" placeholder="apellidos" id="apellidos">
                    </div>
                    <div class="en_linea">
                        <label>Sexo</label>
                        <select id="sexo">
                            <option value="F">Femenino</option>
                            <option value="M">Masculino</option>
                        </select>
                        <input type="number" placeholder="Celular" id="celular">
                    </div>

                    <div class="en_linea">
                        <input type="number" placeholder="Peso" id="peso">
                        <input type="number" placeholder="altura" id="altura">
                    </div>
                </form>
            </div>

            <div class="button">
                <button type="button" onclick="javascript:get_datos()"><a href="user_perfil.php">Registrarse</a></button>
                <p>Tiene cuenta? <a href="{{asset('/')}}iniciar_sesion">Inicie Session</a></p>
            </div>


        </div>
    </div>
</body>

</html>