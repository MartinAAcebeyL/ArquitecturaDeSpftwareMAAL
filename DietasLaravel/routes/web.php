<?php
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\UsuarioController;

Route::get('/', function () {
    return view('index');
});

Route::get('/iniciar_sesion', function(){
    return view('LoginsForms.inciar_sesion');
});

Route::get('/perfil_usuario', function(){
    return view('usuario.user_perfil');
});

Route::resource('/usuario', UsuarioController::class);