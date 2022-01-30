<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class GeneralController extends Controller{
    public function index() {
        return "{{ asset('templates/servicio1.html') }}";
    }
}

?>