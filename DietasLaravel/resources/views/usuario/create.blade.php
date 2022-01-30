<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio Sesion</title>
    <script src="{{ asset('js/user_interface.js') }}"></script>
    <link href="{{ asset('css/user_interface.css') }}" rel="stylesheet">
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
                <form action="{{route('usuario.store')}}" method="POST">
                    @csrf
                    <input type="email" placeholder="Correo electronico" name="correo" id="correo" style="width: 90%; margin-bottom: 4px;"><br>
                    <input type="password" placeholder="Contrasena" id="contrasena" name="contrasena" style="width: 90%; margin-top: 4px;">
                    <hr style="width: 90%; background-color: black; color: black;">

                    <div class="en_linea">
                        <input type="text" placeholder="nombres" id="nombres" name="nombres">
                        <input type="text" placeholder="apellidos" id="apellidos" name="apellidos">
                    </div>
                    <div class="en_linea">
                        <label>Sexo</label>
                        <select id="sexo" name="sexo">
                            <option value="F">Femenino</option>
                            <option value="M">Masculino</option>
                        </select>
                        <input type="number" placeholder="Celular" id="celular" name="celular">
                    </div>

                    <div class="en_linea">
                        <input type="number" placeholder="Peso" id="peso" name="peso">
                        <input type="number" placeholder="altura" id="altura" name="altura">
                    </div>
                    <div class="button">
                        <button type="submit">Registrarse</button>
                    </div>
                </form>
            </div>

            <div class="button">
                <p>Tiene cuenta? <a href="{{asset('/')}}iniciar_sesion">Inicie Session</a></p>
            </div>


        </div>
    </div>


</body>
</html>