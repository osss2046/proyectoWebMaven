function validarForm()
{
	var varificar=true;
	// var expRegNombre= /^([a-z ñáéíóú]{2,60})$/i; para prohibir numeros
	var expRegNombre= /^([a-z ñáéíóú]{2,60})$/i;
	var expRegEmail= /^\w+([\.-]?\w+)@\w+([\.-]?\w+)(\.\w{2,4})+$/;

	var formulario=document.getElementById("contacto-frm");
	var nombre=document.getElementById("nombre");
	var email=document.getElementById("email");
	var comentarios=document.getElementById("comentarios");

// !negacion(campo si el campo esta vacio)
	if(!nombre.value)
	{
			alert("El campo Nombre es requerido");
			nombre.focus();
			verificar = false;
		}else if(!expRegNombre.exec(nombre.value)){
			alert("El campo nombre solo acepta letras y espacios en blanco");
			nombre.focus();
			verificar = false;
	
		}else if(!email.value){
			alert("El campo correo es requerido");
			email.focus();
			verificar=false;
		}else if(!expRegEmail.exec(email.value)){
			alert("El campo de correo esta mal escrito");
			email.focus();
			verificar=false;
		
		}else if(!comentarios.value){
			alert("El campo comentarios es requerido");
			comentarios.focus();
			verificar=false
		}
	if(verificar){
		alert("Se ha enviado el formulario");

		}
}function limpiarForm(){
	document.getElementById("contacto-frm").reset();
}
window.onload=function(){
	var botonEnviar, botonlimpiar;

	botonlimpiar=document.getElementById("limpiar");
	botonlimpiar.onclick=limpiarForm;

	botonEnviar=document.getElementById("enviar");
	botonEnviar.onclick=validarForm;
}






