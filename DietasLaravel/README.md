## Comnados
- sirve para arrancar el servidor
php artisan serve

- para crear un controlador
php artisan make:controller ClienteController

- para crear modelo contralor con y migracion
php artisan make:model Agenda -mcr

- para ejecutar las migraciones borrando todo lo anterior
php artisan migrate:fresh

- para crear seeder (poblador de datos)
php artisan make:seeder AgendaSeeder

- para crear la factoria (fabrica de datos)
 php artisan make:factory AgendaFactory

- para crear migraciones y llenar con datos
 php artisan migrate:fresh --seed

- rutas del resource
GET	/agendas	index	agendas.index
GET	/agendas/create	create	agendas.create
POST	/agendas	store	agendas.store
GET	/agendas/{photo}	show	agendas.show
GET	/agendas/{photo}/edit	edit	agendas.edit
PUT/PATCH	/agendas/{photo}	update	agendas.update
DELETE	/agendas/{photo}	destroy	agendas.destroy
**********************************************************