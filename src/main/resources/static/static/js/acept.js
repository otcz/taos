var btn_cotizar=document.getElementById("btn_cotizar");


async function enviarDatosUsuario(){
    var btn_pagar=document.getElementById("btn_pagar");
    var btn_pagar_payu=document.getElementById("btn_pagar_payu");
    var lb_fecha_inicio_soat=document.getElementById("lb_fecha_inicio_soat");
    var lb_fecha_vencimiento_soat=document.getElementById("lb_fecha_vencimiento_soat");
    var lbpreciosoat=document.getElementById("lb_precio_soat");
    var lb_titulo_no_placa=document.getElementById("lb_titulo_no_placa");
    var lb_nombre_comprador=document.getElementById("lb_nombre_comprador");
    var lb_no_placa=document.getElementById("lb_no_placa");
    var lb_marca=document.getElementById("lb_marca");
    var lb_modelo=document.getElementById("lb_modelo");
    var lb_linea=document.getElementById("lb_linea");
    var lb_cIlindraje=document.getElementById("lb_cIlindraje");
    var lb_numeroChasis=document.getElementById("lb_numeroChasis");
    var lb_clase=document.getElementById("lb_clase");
    var lb_no_motor=document.getElementById("lb_no_motor");
    let dato={};
    dato.identificacion=document.getElementById("txt_identificacion").value;
    dato.placa=document.getElementById("txt_placa").value;
    dato.telefono=document.getElementById("txt_telefono").value;
    const request = await fetch('api/usuarios', {
      method: 'POST',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(dato)
    
    });
    vehiculo = await request.json();
    lbpreciosoat.textContent=vehiculo.valnewsoat;
    lb_titulo_no_placa.textContent="Precio SOAT por ley "+vehiculo.placa;
    lb_nombre_comprador.textContent=vehiculo.nombres;
    lb_no_placa.textContent=vehiculo.placa;
    lb_marca.textContent=vehiculo.marca;
    lb_modelo.textContent=vehiculo.modelo;
    lb_linea.textContent=vehiculo.linea;
    lb_cIlindraje.textContent=vehiculo.cilindraje;
    lb_numeroChasis.textContent=vehiculo.nochasis;
    lb_no_motor.textContent=vehiculo.nomotor;

    lb_fecha_inicio_soat.textContent=vehiculo.yyycomsoat+"-"+vehiculo.mmcomsoat+"-"+vehiculo.ddcomsoat;
    lb_fecha_vencimiento_soat.textContent=vehiculo.yyyvennusoat+"-"+vehiculo.mmvennusoat+"-"+vehiculo.ddvennusoat;

    

  
   }







