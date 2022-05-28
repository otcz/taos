var valorSOAT=document.getElementById("valorSOAT");
var txtNombres=document.getElementById("txtNombres");
var txtNoPlaca=document.getElementById("txtNoPlaca");
var txtClaseVehiculo=document.getElementById("txtClaseVehiculo");
var txtLinea=document.getElementById("txtLinea");
var txtMarca=document.getElementById("txtMarca");
var txtModelo=document.getElementById("txtModelo");
var txtTipoServicio=document.getElementById("txtTipoServicio");
var txtColor=document.getElementById("txtColor");
var txtMotor=document.getElementById("txtMotor");
var txtNumeroChasis=document.getElementById("txtNumeroChasis");
var txtNumeroCilindraje=document.getElementById("txtNumeroCilindraje");
var vehiculo;
var pdfSOAT;


async function enviarDatosUsuario(){
    let dato={};
    dato.identificacion=document.getElementById("txtIdentificacion").value;
    dato.placa=document.getElementById("txtPlaca").value;
    dato.email=document.getElementById("txtEmail").value;
    const request = await fetch('api/usuarios', {
      method: 'POST',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(dato)
    
    });
    vehiculo = await request.json();
    console.log(vehiculo);
    txtNombres.textContent=vehiculo.nombres;
    txtNoPlaca.textContent=vehiculo.placa;
    txtClaseVehiculo.textContent=vehiculo.clase;
    txtLinea.textContent=vehiculo.marca;
    txtMarca.textContent=vehiculo.linea;
    txtModelo.textContent=vehiculo.modelo;
    txtTipoServicio.textContent=vehiculo.tipo;
    txtColor.textContent=vehiculo.color;
    txtMotor.textContent=vehiculo.nomotor;
    txtNumeroChasis.textContent=vehiculo.nochasis;
    txtNumeroCilindraje.textContent=vehiculo.cilindraje;
    valorSOAT.textContent=vehiculo.valnewsoat;

  
   }



   