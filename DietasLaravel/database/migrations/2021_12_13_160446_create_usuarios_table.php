<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateUsuariosTable extends Migration{
    public function up(){
        Schema::create('usuarios', function (Blueprint $table) {
            $table->id();
            $table->string('nombre_completo', 40);
            $table->string('nombres', 40);
            $table->string('apellidos', 50);
            $table->string('celular');
            $table->string('correo', 50)->unique();
            $table->string('contrasena', 50);
            
            $table->string('sexo', 70);
            $table->float('peso', 70);
            $table->float('altura', 70);

            $table->timestamps();
        });
    }

    public function down(){
        Schema::dropIfExists('usuarios');
    }
}
