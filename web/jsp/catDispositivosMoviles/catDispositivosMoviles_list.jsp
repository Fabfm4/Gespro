<%-- 
    Document   : catDispositivoMoviles_list
    Created on : 07/01/2013, 06:59:42 PM
    Author     : Leonardo Montes de Oca, leonarzeta@hotmail.com
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@page import="com.tsp.gespro.dto.DispositivoMovil"%>
<%@page import="com.tsp.gespro.bo.DispositivoMovilBO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" scope="session" class="com.tsp.gespro.bo.UsuarioBO"/>

<%
//Verifica si el usuario tiene acceso a este topico
if (user == null || !user.permissionToTopicByURL(request.getRequestURI().replace(request.getContextPath(), ""))) {
    response.sendRedirect("../../jsp/inicio/login.jsp?action=loginRequired&urlSource=" + request.getRequestURI() + "?" + request.getQueryString());
    response.flushBuffer();
} else {
    
    String buscar = request.getParameter("q")!=null? new String(request.getParameter("q").getBytes("ISO-8859-1"),"UTF-8") :"";
    String filtroBusqueda = "";
    if (!buscar.trim().equals(""))
        filtroBusqueda = " AND (IMEI LIKE '%" + buscar + "%' OR MARCA LIKE '%" +buscar+"%' OR MODELO LIKE '%" +buscar+"%' OR NUMERO_SERIE LIKE '%" +buscar+"%')";
    
    
    
    
    
    /*int disActualizado = 0;
    int disNoActualizado = 0;
    
    System.out.println("ANTES-----------ACTUALIZADO----: "+disActualizado);
    System.out.println("ANTES-----------NO ACTUALIZADO----: "+disNoActualizado);
    
    ObtieneViernesPasado viernesPas = new ObtieneViernesPasado();  
               
            java.sql.Date sqlDate = new java.sql.Date(viernesPas.viernes().getTime());            
    try{
        disActualizado = Integer.parseInt(request.getParameter("disActualizado"));
        if(disActualizado != 0)
        filtroBusqueda += " AND FECHA_ULTIMA_DESCARGA > '" + sqlDate+ " 23:00:00.00'";
    }catch(Exception e){
        System.out.println("----ERROR AL OBTENER DISPOSITIVO ACTUALIZADO---- error: "+e.getMessage());
    }
    try{
        disNoActualizado = Integer.parseInt(request.getParameter("disNoActualizado"));
        if(disNoActualizado != 0)
        filtroBusqueda += " AND ( FECHA_ULTIMA_DESCARGA < '" + sqlDate+ " 23:00:00.00' OR FECHA_ULTIMA_DESCARGA IS NULL) ";
    }catch(Exception e){
        System.out.println("----ERROR AL OBTENER DISPOSITIVO NOOOOOO ACTUALIZADO----error: "+e.getMessage());
    }
    
    System.out.println("DESPUES-----------ACTUALIZADO----: "+disActualizado);
    System.out.println("DESPUES-----------NO ACTUALIZADO----: "+disNoActualizado);
    
    */
    
    
    
    
    
    int idDispositivoMovil = -1;
    try{ idDispositivoMovil = Integer.parseInt(request.getParameter("idDispositivoMovil")); }catch(NumberFormatException e){}
    
    int idEmpresa = user.getUser().getIdEmpresa();
    
    /*
    * Paginación
    */
    int paginaActual = 1;
    double registrosPagina = 10;
    double limiteRegistros = 0;
    int paginasTotales = 0;
    int numeroPaginasAMostrar = 5;

    try{
        paginaActual = Integer.parseInt(request.getParameter("pagina"));
    }catch(Exception e){}

    try{
        registrosPagina = Integer.parseInt(request.getParameter("registros_pagina"));
    }catch(Exception e){}
    
     DispositivoMovilBO dispositivoMovilBO = new DispositivoMovilBO(user.getConn());
     DispositivoMovil[] dispositivosMovilesDto = new DispositivoMovil[0];
     try{
         limiteRegistros = dispositivoMovilBO.findDispositivosMoviles(idDispositivoMovil, idEmpresa , 0, 0, filtroBusqueda).length;
         
         if (!buscar.trim().equals(""))
             registrosPagina = limiteRegistros;
         
         paginasTotales = (int)Math.ceil(limiteRegistros / registrosPagina);

        if(paginaActual<0)
            paginaActual = 1;
        else if(paginaActual>paginasTotales)
            paginaActual = paginasTotales;

        dispositivosMovilesDto = dispositivoMovilBO.findDispositivosMoviles(idDispositivoMovil, idEmpresa,
                ((paginaActual - 1) * (int)registrosPagina), (int)registrosPagina,
                filtroBusqueda);

     }catch(Exception ex){
         ex.printStackTrace();
     }
     
     /*
    * Datos de catálogo
    */
    String urlTo = "../catDispositivosMoviles/catDispositivosMoviles_form.jsp";
    String paramName = "idDispositivoMovil";
    String parametrosPaginacion="";// "idEmpresa="+idEmpresa;
    String filtroBusquedaEncoded = java.net.URLEncoder.encode(filtroBusqueda, "UTF-8");
    
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="../include/keyWordSEO.jsp" />

        <title><jsp:include page="../include/titleApp.jsp" /></title>

        <jsp:include page="../include/skinCSS.jsp" />

        <jsp:include page="../include/jsFunctions.jsp"/>
        
       <script type="text/javascript">
            function eliminarDispositivoMovil(idDispositivo){
                if (idDispositivo>0){
                    $.ajax({
                        type: "POST",
                        url: "catDispositivosMoviles_ajax.jsp",
                        data: {mode: '2', idDispositivo : idDispositivo},
                        beforeSend: function(objeto){
                            $("#action_buttons").fadeOut("slow");
                            $("#ajax_loading").html('<div style=""><center>Procesando...<br/><img src="../../images/ajax_loader.gif" alt="Cargando.." /></center></div>');
                            $("#ajax_loading").fadeIn("slow");
                        },
                        success: function(datos){
                            if(datos.indexOf("--EXITO-->", 0)>0){
                               $("#ajax_message").html(datos);
                               $("#ajax_loading").fadeOut("slow");
                               $("#ajax_message").fadeIn("slow");
                               apprise('<center><img src=../../images/info.png> <br/>'+ datos +'</center>',{'animate':true},
                                        function(r){
                                            location.href = "catDispositivosMoviles_list.jsp";
                                        });
                           }else{
                               $("#ajax_loading").fadeOut("slow");
                               $("#ajax_message").html(datos);
                               $("#ajax_message").fadeIn("slow");
                               $("#action_buttons").fadeIn("slow");
                               $.scrollTo('#inner',800);
                           }
                        }
                    });
                 }
            }
            
            function activarDesactivarDispositivoMovil(idDispositivo,identificadorActivadoDesactivado){
                if (idDispositivo>0){
                    $.ajax({
                        type: "POST",
                        url: "catDispositivosMoviles_ajax.jsp",
                        data: {mode: '3', idDispositivo : idDispositivo, activadorDesactivador : identificadorActivadoDesactivado},
                        beforeSend: function(objeto){
                            $("#action_buttons").fadeOut("slow");
                            $("#ajax_loading").html('<div style=""><center>Procesando...<br/><img src="../../images/ajax_loader.gif" alt="Cargando.." /></center></div>');
                            $("#ajax_loading").fadeIn("slow");
                        },
                        success: function(datos){
                            if(datos.indexOf("--EXITO-->", 0)>0){
                               $("#ajax_message").html(datos);
                               $("#ajax_loading").fadeOut("slow");
                               $("#ajax_message").fadeIn("slow");
                               apprise('<center><img src=../../images/info.png> <br/>'+ datos +'</center>',{'animate':true},
                                        function(r){
                                            location.href = "catDispositivosMoviles_list.jsp";
                                        });
                           }else{
                               $("#ajax_loading").fadeOut("slow");
                               $("#ajax_message").html(datos);
                               $("#ajax_message").fadeIn("slow");
                               $("#action_buttons").fadeIn("slow");
                               $.scrollTo('#inner',800);
                           }
                        }
                    });
                 }
            }
            
            function eliminarDispositivoMovilConfirma(idDispositivo){
                apprise('¿Esta seguro que deseas eliminar el Dispositivo Movil?', {'verify':true, 'animate':true, 'textYes':'Si', 'textNo':'No'}, 
                    function(r){
                        if(r){
                            // Usuario dio click 'Yes'
                            eliminarDispositivoMovil(idDispositivo);
                        }
                });
                
            }
            function reportarRobado(idDispositivo){
                if(idDispositivo>=0){
                    $.ajax({
                        type: "POST",
                        url: "catDispositivosMoviles_ajax.jsp",
                        data: { mode: '4', idDispositivo : idDispositivo },
                        beforeSend: function(objeto){
                            //$("#action_buttons").fadeOut("slow");
                            $("#ajax_loading").html('<div style="">ESPERE, procesando...<br/><img src="../../images/ajax_loader.gif" alt="Cargando.." /></div>');
                            $("#ajax_loading").fadeIn("slow");
                        },
                        success: function(datos){
                            if(datos.indexOf("--EXITO-->", 0)>0){
                               $("#ajax_loading").fadeOut("slow");
                               $("#ajax_message").html(datos);
                               $("#ajax_message").fadeIn("slow");
                               apprise('<center><img src=../../images/info.png> <br/>'+ datos +'</center>',{'animate':true},
                                    function(r){
                                        location.href = "catDispositivosMoviles_list.jsp";
                                });
                           }else{
                               $("#ajax_loading").fadeOut("slow");
                               //$("#ajax_message").html(datos);
                               //$("#ajax_message").fadeIn("slow");
                               apprise('<center><img src=../../images/warning.png> <br/>'+ datos +'</center>',{'animate':true});
                           }
                        }
                    });
                }
            }
            
            
            
            
            function confirmarCancelarPedido(idPedido, folioPedido){
                apprise('¿Esta seguro que desea cancelar el pedido con Folio '+folioPedido+'?', {'verify':true, 'animate':true, 'textYes':'Si', 'textNo':'No'}, 
                    function(r){
                        if(r){
                            // Usuario dio click 'Yes'
                            cancelarPedido(idPedido);
                        }
                });
                
            }
            
            
            function confirmarReporteRobo(idDispositivo, imei){
                apprise('¿Esta seguro que desea Reportar el Móvil con IMEI: '+imei+'?', {'verify':true, 'animate':true, 'textYes':'Si', 'textNo':'No'}, 
                    function(r){
                        if(r){
                            // Usuario dio click 'Yes'
                            reportarRobado(idDispositivo);
                        }
                });
                
            }
            
        </script>

    </head>
    <body>
        <div class="content_wrapper">

            <jsp:include page="../include/header.jsp" flush="true"/>

            <jsp:include page="../include/leftContent.jsp"/>

            <!-- Inicio de Contenido -->
            <div id="content">

                <div class="inner">
                    <h1>Catálogos</h1>
                    
                    <div id="ajax_loading" class="alert_info" style="display: none;"></div>
                    <div id="ajax_message" class="alert_warning" style="display: none;"></div>

                    <div class="onecolumn">
                        <div class="header">
                            <span>
                                <img src="../../images/icon_phone.png" alt="icon"/>
                                Catálogo de Dispositivos Moviles
                            </span>
                            <div class="switch" style="width:500px">
                                <table width="500px" cellpadding="0" cellspacing="0">
						<tbody>
							<tr>
                                                            <td>
                                                                <div id="search">
                                                                <form action="catDispositivosMoviles_list.jsp" id="search_form" name="search_form" method="get">
                                                                        <input type="text" id="q" name="q" title="Buscar por IMEI / Marca / Modelo / # Serie" class="" style="width: 300px; float: left"
                                                                               value="<%=buscar%>"/>
                                                                        <input type="image" src="../../images/Search-32_2.png" id="buscar" name="buscar"  value="" style="cursor: pointer; width: 30px; height: 25px; float: left"/>
                                                                </form>
                                                                </div>
                                                            </td>
                                                            <td class="clear">&nbsp;&nbsp;&nbsp;</td>
                                                            
                                                            <td>
                                                                <input type="button" id="nuevo" name="nuevo" class="right_switch" value="Crear Nuevo" 
                                                                       style="float: left; width: 100px;" onclick="location.href='<%=urlTo%>'"/>
                                                            </td>
                                                            
                                                        </tr>
                                                </tbody>
                                </table>
                            </div>
                        </div>
                        <br class="clear"/>
                        <div class="content">
                            <form id="form_data" name="form_data" action="" method="post">
                                <table class="data" width="100%" cellpadding="0" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th> </th>
                                            <th>IMEI</th>
                                            <th>Marca</th>
                                            <th>Modelo</th>
                                            <th>Num. Serie</th>
                                            <th>Alias</th>
                                            <th>Bateria</th>
                                            <!--<th>Actualización de Movil a Servidor</th>
                                            <th>Actualización de Servidor a Movil</th>
                                            <th>Movil Actualizado</th>
                                            <th>Progreso de Ultima Actualización</th>-->
                                            <th>Acciones</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% 
                                        /*ObtieneViernesPasado viernesPasado = null;
                                        Date fechaViernesPasado = null;
                                        String actualizado = "";*/
                                            for (DispositivoMovil item:dispositivosMovilesDto){
                                                try{
                                                    String imgBateria = "../../images/icon_bateria_vacio.png";
                                                    if (item.getPctPila()>=70){
                                                        imgBateria = "../../images/icon_bateria_lleno.png";
                                                    }else if (item.getPctPila()>=30 && item.getPctPila()<=69){
                                                        imgBateria = "../../images/icon_bateria_medio.png";
                                                    }else if (item.getPctPila()>0 && item.getPctPila()<=29){
                                                        imgBateria = "../../images/icon_bateria_critico.png";
                                                    }
                                        /*        if(item.getFechaUltimaDescarga()!=null){
                                                    viernesPasado = new ObtieneViernesPasado();
                                                    fechaViernesPasado = viernesPasado.viernes();
                                                    if(item.getFechaUltimaDescarga().after(fechaViernesPasado))
                                                        actualizado = "Si";
                                                    else
                                                        actualizado = "No";
                                                }else   
                                                    actualizado = "No";
                                        */%>
                                        <tr <%=(item.getIdEstatus()!=1)?"class='inactive'":""%>>
                                            <!--<td><input type="checkbox"/></td>-->
                                            <td><%=item.getIdDispositivo() %></td>
                                            <%if(item.getReporteRobo()==1){%>
                                                <td><img src="../../images/icon_robado.png" alt="Reportado como Robado" class="help" title="Reportado como Robado"/></td>
                                            <%}else{%>
                                                <td></td>
                                            <%}%>
                                            <td><%=item.getImei()%></td>
                                            <td><%=item.getMarca() %></td>
                                            <td><%=item.getModelo()%></td>                                            
                                            <td><%=item.getNumeroSerie()%></td>
                                            <td><%=item.getAliasTelefono()%></td>
                                            <td>
                                                <img src="<%= imgBateria %>" class="help" title="<%= item.getPctPila() %> &#37;"/>
                                            </td>
                            <!--                <td></%=(item.getFechaUltimaCarga()==null)?"":item.getFechaUltimaCarga()%></td>
                                            <td></%=(item.getFechaUltimaDescarga()==null)?"":item.getFechaUltimaDescarga()%></td>
                                            <td></%=actualizado%></td>
                                            </% ActualizacionDispositivo ad = new ActualizacionDispositivo(); 
                                            ActualizacionDispositivoBO adbo = new ActualizacionDispositivoBO(user.getConn());
                                            ActualizacionDispositivo[] ads = adbo.findActualizacionDispositivo(item.getIdDispositivo(), idEmpresa, 0, 0, "");
                                            ad = ads[0];
                                            System.out.println("OBJETO SELECCIONADO ID ACTUALIZACION DISPOSITIVO: "+ad.getIdActualizacion());
                                            ActualizacionesBO actualizacionesBO = new ActualizacionesBO(ad.getIdActualizacion());
                                            Actualizaciones actualizaciones = actualizacionesBO.getActualizaciones();
                                            double avance = 0;
                                            avance = ((ad.getPartesDescargadas() * 100)/actualizaciones.getPartesDescargablesActualizacion());
                                            if(avance<1){
                                            %>
                                            <td><img src="../../images/actualizacion/0.png" alt="icon"/></td>
                                            </%}else if(avance > 0 && avance < 26){%>
                                            <td><img src="../../images/actualizacion/0.png" alt="icon2"/></td>
                                            </%}else if(avance > 25 && avance < 51){%>
                                            <td><img src="../../images/actualizacion/25.png" alt="icon3"/></td>
                                            </%}else if(avance > 50 && avance < 76){%>
                                            <td><img src="../../images/actualizacion/50.png" alt="icon4"/></td>
                                            </%}else if(avance > 75 && avance < 100){%>
                                            <td><img src="../../images/actualizacion/75.png" alt="icon5"/></td>
                                            </%}else if(avance > 99.9){%>
                                            <td><img src="../../images/actualizacion/100.png" alt="icon6"/></td>
                                            </%}else{%>
                                            <td><img src="" alt="icon"/></td>
                                            </%}%>
                            -->
                                            <td>
                                                
                                                <%if(item.getReporteRobo() == 0){%>
                                                <a href="<%=urlTo%>?<%=paramName%>=<%=item.getIdDispositivo()%>&acc=1&pagina=<%=paginaActual%>"><img src="../../images/icon_edit.png" alt="editar" class="help" title="Editar"/></a>
                                                &nbsp;&nbsp;
                                                <!--<a href=""><img src="images/icon_delete.png" alt="delete" class="help" title="Delete"/></a>-->
                                                <a href="#" onclick="eliminarDispositivoMovilConfirma(<%=item.getIdDispositivo()%>);"><img src="../../images/icon_delete.png" alt="delete" class="help" title="Borrar"/></a>                                                
                                                &nbsp;&nbsp;                                                
                                                <a href="#" onclick="confirmarReporteRobo(<%=item.getIdDispositivo()%>,'<%=item.getImei() %>');"><img src="../../images/icon_robado.png" alt="Reportar Robo" class="help" title="Reportar Robo" /></a>
                                                &nbsp;&nbsp;
                                                <!--</% 
                                                if (item.getActivado() == 0){
                                                %>
                                                <a href="#" onclick="activarDesactivarDispositivoMovil(<%=item.getIdDispositivo()%>,1);"><img src="../../images/icon_accept.png" alt="activar" class="help" title="Activar"/></a>
                                                </% 
                                                //}else{                                               
                                                %>                                                
                                                <a href="#" onclick="activarDesactivarDispositivoMovil(<%=item.getIdDispositivo()%>,0);"><img src="../../images/icon_cancel.png" alt="desactivar" class="help" title="Desactivar"/></a>
                                                </% 
                                                }
                                                %>-->
                                                <%}%>
                                                
                                            </td>
                                        </tr>
                                        <%      }catch(Exception ex){
                                                    ex.printStackTrace();
                                                }
                                            } 
                                        %>
                                    </tbody>
                                </table>
                            </form>
                                    
                            <!-- INCLUDE OPCIONES DE EXPORTACIÓN-->
                            <!--<//jsp:include page="../include/reportExportOptions.jsp" flush="true">
                                <//jsp:param name="idReport" value="</%= ReportBO.MOVILES_REPORT %>" />
                                <//jsp:param name="parametrosCustom" value="</%= filtroBusquedaEncoded %>" />
                            <///jsp:include>-->
                            <!-- FIN INCLUDE OPCIONES DE EXPORTACIÓN-->

                            <jsp:include page="../include/listPagination.jsp">
                                <jsp:param name="paginaActual" value="<%=paginaActual%>" />
                                <jsp:param name="numeroPaginasAMostrar" value="<%=numeroPaginasAMostrar%>" />
                                <jsp:param name="paginasTotales" value="<%=paginasTotales%>" />
                                <jsp:param name="url" value="<%=request.getRequestURI() %>" />
                                <jsp:param name="parametrosAdicionales" value="<%=parametrosPaginacion%>" />
                            </jsp:include>
                            
                        </div>
                    </div>

                </div>

                <jsp:include page="../include/footer.jsp"/>
            </div>
            <!-- Fin de Contenido-->
        </div>


    </body>
</html>
<%}%>