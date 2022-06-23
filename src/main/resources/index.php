<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>TOMAS</title>
	<link href="/css/styles.css" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;700&amp;family=Open+Sans:wght@400;600;700&amp;family=Poppins:wght@400;600;700&amp;display=swap" rel="stylesheet">
	<script src="https://kit.fontawesome.com/70c39b7415.js" crossorigin="anonymous"></script>
	<style media="all" id="fa-v4-font-face"></style>

	<script src="/js/acept.js"></script>
	
</head>


<body>
<div id="root">

	<header role="heading" class="titulo" id="titulo" >
		<div class="titulo2">
			<div class="images"><a href="https://www.grupor5.com/">
					<img src="/imagenes/r5logo.50cf75ee.svg" alt="R5 Logo" width="95px"></a><a href="#">
					<img src="/imagenes/axa-colpatria.14e43578.png" alt="Axa colpatria logo" width="70px"></a>
			</div>
		</div>
	</header>
			<section class="secciontoda" id="secciontoda">
				<div class="seccion1">
						<div class="proceso" id="proceso">
						<div class="proceso1">
							<span></span>
						</div>
						<div class="proceso2">
							<p class="parrafodatos">Tus datos</p>
							<p class="parrafodatospagos">Pago</p>
							<p class="parraforecibe">¡Recibe tu SOAT!</p>
						</div>
						</div>

						<div class="cuadricula" id="cuadricula">
							<div class="soatvehiculo">
						<div class="soatvehiculo1">
							<h6 id="lb_titulo_no_placa" class="soatvehiculo2">SOAT para vehículo placa </h6>
							<div class="soatvehiculo3">
								<p class="titulopreciosoat">Precio SOAT por ley</p>
								<p id="lb_precio_soat" class="lb_precio_soat"></p>
							</div>
						</div>
						<div class="divformdatoscliente">
							<h4 class="tituloform">Ingresa estos datos para calcular tu descuento</h4>

						<form class="tituloform1">
							<div class="div_form1">
									<label  class="lb_form1">
										<span class="s1_form1">
											<span class="s2_form1">Placa</span>
											<span class="s3_form1">*</span>
										</span>
									</label>

								<input id="txt_placa" type="text" label="Placa" name="placa" maxlength="6" class="input" value="" required="" >

							</div>

							<div class="div_form1">
								<label  class="lb_form1">
									<span class="s1_form1">
										<span class="s2_form1">Identificación</span>
										<span class="s3_form1">*</span>
									</span>
								</label>

								<input id="txt_identificacion" type="text" label="number" name="number" maxlength="10"  required=""  class="input" value="">
						
							</div>

				

							<div class="div_form1">
								<label  class="lb_form1">
									<span class="s1_form1">
										<span class="s2_form1">Número de teléfono</span>
										<span class="s3_form1">*</span>
									</span>
								</label>

								<input id="txt_telefono" type="text" label="telefono" name="telefono" maxlength="10" class="input" required=""  value="">
						
							</div>

							<div class="div1_check">
								<label class="l_check" >
									<input onclick="miFunc()" class="i1_check" id="checkDataProcessing" type="checkbox" name="checkDataProcessing" >		
									<div class="div2_check"></div>
								</label>

								<ul class="ul_check">
									<li class="li_check">
																		
										<div class="div3_check">*Tratamiento de datos
											<i class="i3_check">
												<svg class="svg_check" xmlns="http://www.w3.org/2000/svg" width="10.781" height="5.675" viewBox="0 0 10.781 5.675">
													<path id="prefix__Trazado_457" d="M-1232.632 1133.75l3.708 4.451v-1.471q-1.854 2.1-3.708 4.193c-.871.983.539 2.457 1.41 1.471q1.852-2.1 3.71-4.194a1.1 1.1 0 0 0 0-1.471q-1.857-2.226-3.71-4.452c-.845-1.012-2.251.464-1.41 1.471" data-name="Trazado 457" transform="rotate(-90 -1179.585 -47.646)" style="fill: rgb(57, 26, 125);"></path>
												</svg>
											</i>
										</div>

										<div class="div4_check">
											<p class="parrafo_check">Manifiesto bajo la gravedad de juramento que los datos aquí indicados son ciertos y autorizo TUSOAT LIMITADA a su verificación. Autorizó a TUSOAT LIMITADA al tratamiento de mis datos personales con las finalidades descritas en www.TUSOAT.com/politica-de-privacidad</p>
										</div>

									</li>
								</ul>
							</div>
							
							<div id="btn_cotizar" onclick="enviarDatosUsuario()" class="btn_cotizar" href="static\consulta.html" >
								<a id="s_cotizar" class="s_cotizar">Descubre tu descuento</a>
								
							</div>
						</form>
					</div>
							</div>

							<div class="div1_segundo_seg">
					<div class="div2_segundo_seg">
						<p class="p_inicio_soat">
							<before class="clock1"></before>
							<b id="lb_fecha_inicio_soat" class="lb_fecha_inicio_soat">DD/MM/AAAA</b>
							<span class="ll_titulo_inicio">Inicio nuevo SOAT</span>
						</p>
						
						<p class="p_fin_soat">
							<before class="clock2"></before>
							<b id="lb_fecha_vencimiento_soat" class="lb_fecha_inicio_soat">DD/MM/AAAA</b>
							<span class="ll_titulo_inicio">Vencimiento SOAT</span>
						</p>
					</div>

					<p class="p_ley_soat">Por ley el SOAT inicia vigencia al día siguiente de su compra. Puedes comprar tu SOAT hasta con 6 meses antes de la fecha de su vencimiento.</p>
					<div class="div_separador"></div>

					<section class="seccion_tuvehiculo">
						<p id="lb_nombre_comprador" class="lb_nombre_comprador"></p>
						<h4 class="h_tuvehiculo">Tu vehículo</h4>
						<div class="div_tabla_informacion">
							<div class="div_tabla_placa">
								<p>Placa</p>
							</div>
							<div class="div_tabla_noplaca">
								<p id="lb_no_placa"></p>
							</div>
							<div class="div_tabla_placa">
								<p>Marca</p>
							</div>
							<div class="div_tabla_noplaca">
								<p id="lb_marca"></p>
							</div>
							<div class="div_tabla_placa">
								<p>Modelo</p>
							</div>
							<div class="div_tabla_noplaca">
								<p id="lb_modelo"></p>
							</div>
							<div class="div_tabla_placa">
								<p>Línea</p>
							</div>
							<div class="div_tabla_noplaca">
								<p id="lb_linea"></p>
							</div>
							<div class="div_tabla_placa">
								<p>Cilindraje</p>
							</div>
							<div class="div_tabla_noplaca">
								<p id="lb_cIlindraje"></p>
							</div>

							<div class="div_tabla_placa">
								<p>No Chasis</p>
							</div>
							<div class="div_tabla_noplaca">
								<p id="lb_numeroChasis"></p>
							</div>

							<div class="div_tabla_placa">
								<p>No Motor</p>
							</div>
							<div class="div_tabla_noplaca">
								<p id="lb_no_motor"></p>
							</div>


								<a id="s_pagar" class="s_pagar">Paga seguro PayU</a>


							
						</div>
					</section>
							</div>
						
							<div class="div1_tercer_seg">
								<div class="div_metodos_pago">
									<img class="imagen_pay" src="/imagenes/payment_methods.b948547e.png" alt="Logos de métodos de pago, visa, mastercard, pse, nequi, baloto y efecty">
								</div>

								<section class="seccion_pagos">
									<ul class="ul_pagos">
										<li class="li_info_pago">
											<div class="div_imagen">
												<img src="/imagenes/check_maverick2.2e0d0632.svg" width="66px">
											</div>
												<span class="s_pagos"> Pagos en línea procesados por PayU</span>
										</li>

										<li class="li_info_pago">
											<div class="div_imagen">
												<img class="imagen_chulo" src="/imagenes/check_maverick2.2e0d0632.svg" width="66px">
											</div>
												<span class="s_pagos"> Tus datos están completamente seguros</span>
										</li>

										<li class="li_info_pago">
											<div class="div_imagen">
												<img src="/imagenes/check_maverick2.2e0d0632.svg" width="66px">
											</div>
												<span class="s_pagos"> Llegará un link de descarga de tu poliza via SMS y/o WhatsApp</span>
										</li>
						
									</ul>
								</section>
							</div>
						</div>
				</div>
			</section>
	<footer class="floter">
		<div class="div_opciones">
			<div class="div_opcion">Grupo TU SOAT Limitada</div>
			<div class="div_opcion">soporte@gruporTUSOAT.com</div>
			<div class="div_opcion">Carrera 11 # 14-05 Piso 3 Bogotá, Colombia</div>
		</div>
	</footer>
</div>



</body>


</html>