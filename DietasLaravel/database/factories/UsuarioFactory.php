<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

class UsuarioFactory extends Factory{

    public function definition(){
        return [
            'nombre_completo' => $this->faker->name(),
            'nombres' => $this->faker->firstName(),
            'apellidos' => $this->faker->lastName,
            'celular' => $this->faker->numberBetween(11111111, 99999999),
            'correo' => $this->faker->email,
            'contrasena'=> $this->faker->password,
            'sexo' => $this->faker->randomElement(['F', 'M']),
            'peso' => $this->faker->numberBetween(10.0, 120.0),
            'altura' => $this->faker->numberBetween(0.5, 2.2),

        ];
    }
}
