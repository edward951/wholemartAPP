  // Get the form element
  const form = document.getElementById("myForm");

window.addEventListener("load", () => {
    function sendData() {
      const XHR = new XMLHttpRequest();
  
      // Bind the FormData object and the form element
      const FD = new FormData(form);
    
      // Define what happens on successful data submission
      XHR.addEventListener("load", (event) => {
        alert(event.target.responseText);
      });
  
      // Define what happens in case of error
      XHR.addEventListener("error", (event) => {
        alert('Oops! Something went wrong.');
      });
  
      // Set up our request
      XHR.open("POST", "http://localhost:8080/registrar");
      XHR.setRequestHeader("Content-Type", "application/json");
      
      var object = {};
      console.log(FD);
    FD.forEach(function(value, key){
    object[key] = value;
    console.log(object);
    myForm.reset();
    });
    
    var json = JSON.stringify(object);
    console.log("JSON"+json);

    var password = document.getElementById("passwordone").value;
    var passwordConfirm = document.getElementById("passwordConfirm").value;
    console.log(password)
    console.log(passwordConfirm);
   if (passwordConfirm == password ) {

            
      XHR.send(json);
    }
    else{
        alert ("Contraseñas no coinciden")
    }
    
    }
    // Add 'submit' event handler
    form.addEventListener("submit", (event) => {
      event.preventDefault();
     
    //xhr.send(data);  
      sendData();
      
    });

  });