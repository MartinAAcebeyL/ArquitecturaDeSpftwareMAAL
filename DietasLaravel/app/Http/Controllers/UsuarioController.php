<?php

namespace App\Http\Controllers;

use App\Models\Usuario;
use Illuminate\Http\Request;

class UsuarioController extends Controller
{

    public function index(){
        return "hola";
        // $usuario = Usuario::get();

        // return view(
        //     'usuario.index',
        //     [
        //         'usuario' => $usuario
        //     ]
        // );
    }

    public function create()
    {
        return view('usuario.create');
    }

    public function store(Request $request)
    {
        $usuario = new Usuario();

        $usuario->nombres = $request->nombres;
        $usuario->apellidos = $request->apellidos;
        $usuario->nombre_completo = $usuario->nombres . " " . $usuario->apellidos;
        $usuario->sexo = $request->sexo;
        $usuario->celular = $request->celular;
        $usuario->peso = $request->peso;
        $usuario->altura = $request->altura;

        $usuario->correo = $request->correo;
        $usuario->contrasena = $request->contrasena;
        $usuario->save();

        return view('usuario.index', [
            'usuario' => $usuario
        ]);
    }

    public function show(Usuario $usuario, $n)
    {
        // switch ($n) {
        //     case 1:
        //         return view(
        //             'usuario.edit',
        //             [
        //                 'usuario' => $usuario
        //             ]
        //         );
        //     case 2:
        //         return view(
        //             'usuario.edit1',
        //             [
        //                 'usuario' => $usuario
        //             ]
        //         );
        //     case 3:
        //         return view(
        //             'agenda.edit',
        //             [
        //                 'usuario' => $usuario
        //             ]
        //         );
        //     case 4:
        //         return view(
        //             'agenda.edit',
        //             [
        //                 'usuario' => $usuario
        //             ]
        //         );
        //     case 5:
        //         return view(
        //             'agenda.edit',
        //             [
        //                 'usuario' => $usuario
        //             ]
        //         );
        // }
    }
    public function hola()
    {
        echo "hola";
    }

    public function edit(Usuario $usuario)
    {
        return view(
            'usuario.edit',
            [
                'usuario' => $usuario
            ]
        );
    }


    public function update(Request $request, Usuario $usuario)
    {
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Models\Usuario  $usuario
     * @return \Illuminate\Http\Response
     */
    public function destroy(Usuario $usuario)
    {
        //
    }
}
