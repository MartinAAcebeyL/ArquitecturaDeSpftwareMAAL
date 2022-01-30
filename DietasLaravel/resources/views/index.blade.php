<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="{{ asset('css/index.css') }}" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css">

    <title>Only Healty</title>
</head>

<body>
    <nav>
        <div class="nav">
            <div class="nav1">
                <div class="nav-left">
                    <p><a href="">Profesionales</a></p>
                    <p><a href="templates/blogs.php">Blogs</a></p>
                    <p><a href="templates/user_perfil.php">Tu cuenta</a></p>
                    <p><a href="">Calculadora</a></p>
                </div>

                <div class="nav-center">
                    <img src="{{ asset('imgs/logo.png') }}" alt="sana manzaca">
                    <p style="margin: 0;">Only Healty</p>
                </div>
                <div class="nav-right">
                    <ul class="menu">
                        <li><a href="#"><i class="fas fa-users"></i></a>
                            <ul class="submenu">
                                <li><a href="templates/CV1.html">Registrarse profesional</a></li>
                                <li><a href="{{asset('/')}}usuario/create">Inicio cliente</a></li>
                                <li><a href="templates/admin.html">Inicio Admin</a></li>
                            </ul>
                        </li>
                        <li><i class="fas fa-cart-plus"></i></li>
                    </ul>
                </div>
            </div>
            <div class="nav2">
                <section>
                    <p>Es tiempo de dedicarte tiempo</p>
                </section>
                <div class="more-information">

                    <pre>Te invitamos a comer con 
consiencia, frente a tu salud.
#AComerJuntos</pre>

                    <button>Averigua mas aqui</button>
                </div>
            </div>
        </div>
    </nav>

    <section class="information">
        <div>
            <h3>100</h3>
            <h4>Clientes satisfechos</h4>
        </div>
        <div>
            <h3>100</h3>
            <h4>Profesores certificados</h4>
        </div>
        <div>
            <h3>45</h3>
            <h4>Publicaciones</h4>
        </div>
    </section>

    <section>
        <div class="vision-page">
            <div class="left-content">
                <img src="{{ asset('imgs/yogurt-1786329_1280.png') }}" alt="yogurt-1786329_1280">
            </div>
            <div class="right-content">
                <h2>Sobre el proyecto</h2>
                <p>La condición del cuerpo de un ser humano depende solo del 40% de la actividad física,
                    mientras que el 60% es una nutrición adecuada. Sin embargo, la mayoría de las personas
                    están insatisfechas con su cuerpo. Además, a menudo no sabemos cómo calcular la cantidad
                    correcta de calorías y encontrar el tiempo para cocinar.
                </p>
                <p>
                    Los alimentos saludables listos para usar son la manera correcta de resolver los desafíos
                    de las condiciones corporales para la mayoría de las personas.
                </p><br>
                <h2>La tarea del proyecto</h2>
                <p>
                    La tarea principal del proyecto es crear un sitio web de entrega de nutrientes de alimentos
                    saludable, claro y fácil de usar, donde los visitantes puedan elegir sus objetivos,
                    calcular la cantidad correcta de calorías con nutricionistas profesionales y preparar
                    comidas listas para comer para mejorar sus cuerpos.
                </p>

            </div>
        </div>
    </section>

    <section class="information1">
        <div class="information-pictures">
            <div class="make-a-plan">
                <i class="fas fa-tint"></i>
                <p>Crea un plan</p>
            </div>
            <div class="register-your-meal">
                <i class="fas fa-utensils"></i>
                <p>Registra tus comidas</p>
            </div>
            <div class="feel-the-result">
                <i class="far fa-heart"></i>
                <p><a>Siente los resultados</a></p>
            </div>
        </div>
    </section>

    <section class="services">
        <div class="select-services">
            <div id="left" style="background-color: #f34e3a; color: white;" onclick="javascript:servicios1(this)">
                <h3>Servicios</h3>
            </div>
            <div id="right" onclick="javascript:servicios2(this)">
                <h3>Proyectos</h3>
            </div>
        </div>
        <div id="content">
            <p>contamos con 3 tipos de servicios:</p>
            <ol>
                <li>
                    <p>Registro de lo consumido:</p>
                    <ul>
                        <li>llevar un historial</li>
                        <li>saber del valor nutricional</li>
                    </ul>
                </li>
                <li>
                    <p>Sucribete con un profesional</p>
                    <ul>
                        <li>Resuelve todas tus dudas</li>
                        <li>crea un plan guiado</li>
                        <li>recibe trato preferencial</li>
                    </ul>
                </li>
            </ol>
        </div>
    </section>
    
    <script>
        function servicios1(x) {
            var contenedor;
            var url = 'templates/servicios1.html'
            contenedor = document.getElementById('content');
            var ajax = new XMLHttpRequest()
            ajax.open("get", url, true);
            ajax.onreadystatechange = function() {
                if (ajax.readyState == 4) {
                    contenedor.innerHTML = ajax.responseText
                    document.getElementById('left').style.backgroundColor = '#f34e3a';
                    document.getElementById('left').style.color = 'white'
                    document.getElementById('right').style.backgroundColor = 'white';
                    document.getElementById('right').style.color = 'black';
                }
            }
            ajax.setRequestHeader("Content-Type", "text/html; charset=utf-8");
            ajax.send(null);
        }

        function servicios2(x) {
            var contenedor;
            var url = 'templates/servicios2.html'
            contenedor = document.getElementById('content');
            var ajax = new XMLHttpRequest()
            ajax.open("get", url, true);
            ajax.onreadystatechange = function() {
                if (ajax.readyState == 4) {
                    contenedor.innerHTML = ajax.responseText
                    document.getElementById('left').style.backgroundColor = 'white';
                    document.getElementById('right').style.backgroundColor = '#f34e3a';
                    document.getElementById('right').style.color = 'white'
                    document.getElementById('left').style.color = 'black';
                }
            }
            ajax.setRequestHeader("Content-Type", "text/html; charset=utf-8");
            ajax.send(null);
        }
    </script>
</body>

</html>