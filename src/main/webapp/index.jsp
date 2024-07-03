<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Calculadora</title>
<link rel="stylesheet"
href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
</head>
<body>
	<main class="container">
		<h1>Calculadora</h1>
		<div class="grid">
			<form name="formulario" action="/DesafioMiCalculadora/Operaciones"
				method="post">
				<div class="field">
					<label for="valor1">Numero 1</label> <input type="text"
						name="valor1">
				</div>
				<div class="field">
					<label for="valor2">Numero 2</label> <input type="text"
						name="valor2">
				</div>
				<div class="field">
					<select name="operacion">
						<option selected>Seleccionar Operación</option>
						<option value="sumar">Sumar</option>
						<option value="restar">Restar</option>
						<option value="multiplicar">Multiplicar</option>
						<option value="dividir">Dividir</option>
						<option value="ordenar">Ordenar</option>
						<option value="paroimpar">Cuál es par e impar</option>
					</select>
				</div>
				<div class="actions">
					<input type="submit" value="Resolver">
				</div>
			</form>
		</div>
	</main>
</body>
</html>