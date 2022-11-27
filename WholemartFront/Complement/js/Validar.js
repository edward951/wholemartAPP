//Funcion que me valida el formulario de login
const validarLogin = ()=>{   
    let $email = document.getElementById("correoElectronico").value;
    let $pass = document.getElementById("password").value; 
    if ($email === "" || $pass === ""  ) return Swal.fire({
            icon: 'Error',
            title: 'Oops...',
            text: 'Los campos no pueden estar vacios!',
        })

    if(!$email.includes("@") || !$email.includes(".com")) return Swal.fire({
        icon: 'error',
        title: 'Oops...',
        text: 'El dato ingresado no corresponde a un correo valido!',
    })   
        
    else{
        Swal.fire(`Bienvenido ${$email}`);  
    }
}

//Funcion que me limpia el formulario de registro y login

function validar(){

    console.log("Se enviaron los datos");
    
}