package com.example.administrador.encal.Modelo;

/**
 * Created by mcarazas on 27/11/2017.
 */

public class SQLConstrantes {

    //DB
    public static final String DB = "bdenhatrape.db";

    //TABLAS
    public static final String tableUsuarios = "usuarios";
    public static final String tableMarco = "marco";
    public static final String tableUbigeo = "ubigeo";
    public static final String tableCaratulas = "caratulas";
    public static final String tableDatosEntrevista = "datosEntrevista";
    public static final String tableVisitas = "visitas";
    public static final String tableIdentificaciones = "identificaciones";
    public static final String tableFragments = "fragments";
    public static final String tableModulo1 = "modulos1";
    public static final String tableModulo2 = "modulos2";
    public static final String tableModulo3 = "modulos3";
    public static final String tableModulo4 = "modulos4";


    //COLUMNAS USUARIOS
    public static final String USUARIO_ID = "ID";
    public static final String USUARIO_PASSWORD = "PASSWORD";
    public static final String USUARIO_PERMISO = "PERMISO";

    //COLUMNAS UBIGEOS
    public static final String UBIGEO_ID = "ID";
    public static final String UBIGEO_ID_UBI = "ID_UBI";
    public static final String UBIGEO_DISTRITO = "DISTRITO";

    //COLUMNAS_MARCO
    public static final String MARCO_ID = "ID";
    public static final String MARCO_RUC = "RUC";
    public static final String MARCO_RAZON_SOCIAL = "RAZON_SOCIAL";
    public static final String MARCO_NOMBRE_COMERCIAL = "NOMBRE_COMERCIAL";
    public static final String MARCO_OPERADOR = "OPERADOR";
    public static final String MARCO_JEFE = "JEFE";
    public static final String MARCO_OBSERVADOR = "OBSERVADOR";
    public static final String MARCO_ANIO = "ANIO";
    public static final String MARCO_MES = "MES";
    public static final String MARCO_PERIODO = "PERIODO";
    public static final String MARCO_CCDD = "CCDD";
    public static final String MARCO_DEPARTAMENTO = "DEPARTAMENTO";
    public static final String MARCO_CCPP = "CCPP";
    public static final String MARCO_PROVINCIA = "PROVINCIA";
    public static final String MARCO_CCDI = "CCDI";
    public static final String MARCO_DISTRITO = "DISTRITO";
    public static final String MARCO_T_EMPRESA = "T_EMPRESA";
    public static final String MARCO_FRENTE = "FRENTE";
    public static final String MARCO_ZONA = "ZONA";
    public static final String MARCO_MANZANA = "MANZANA";
    public static final String MARCO_CAT_VIA = "CAT_VIA";
    public static final String MARCO_NOM_VIA = "NOM_VIA";
    public static final String MARCO_PUERTA = "PUERTA";
    public static final String MARCO_INTERIOR = "INTERIOR";
    public static final String MARCO_PISO = "PISO";
    public static final String MARCO_MZ = "MZ";
    public static final String MARCO_LOTE = "LOTE";

    //COLUMNAS_CARATULA------------------------------------------
    public static final String CARATULA_ID = "ID";
    public static final String CARATULA_DEPARTAMENTO = "NOMBREDD";
    public static final String CARATULA_DEPARTAMENTO_COD = "CCDD";
    public static final String CARATULA_PROVINCIA = "NOMBREPV";
    public static final String CARATULA_PROVINCIA_COD = "CCPP";
    public static final String CARATULA_DISTRITO = "NOMBREDI";
    public static final String CARATULA_DISTRITO_COD = "CCDI";
    public static final String CARATULA_GPSLATITUD = "GPSLATITUD";
    public static final String CARATULA_GPSLONGITUD = "GPSLONGITUD";
    public static final String CARATULA_SECTOR = "SECTOR_TR";
    public static final String CARATULA_AREA = "ARA_TR";
    public static final String CARATULA_ZONA = "ZONA";
    public static final String CARATULA_MANZANA_MUESTRA = "MANZANA_ID";
    public static final String CARATULA_FRENTE = "FRENTE";
    public static final String CARATULA_TIPVIA = "TIPVIA";
    public static final String CARATULA_TIPVIA_OTRO = "TIPVIA_ESPEC";
    public static final String CARATULA_NOMVIA = "TIPVIA_D";
    public static final String CARATULA_NPUERTA = "NROPTA";
    public static final String CARATULA_BLOCK = "BLOCK";
    public static final String CARATULA_INTERIOR = "INTERIOR";
    public static final String CARATULA_PISO = "PISO";
    public static final String CARATULA_MANZANA_VIA = "MZA";
    public static final String CARATULA_LOTE = "LOTE";
    public static final String CARATULA_KM = "KM";
    public static final String CARATULA_REFERENCIA = "REF_DIREC";

    //COLUMNAS_VISITA
    public static final String VISITA_ID = "ID";
    public static final String VISITA_ID_EMPRESA = "ID_EMPRESA";
    public static final String VISITA_DNI_OPERADOR = "DNI_OPERADOR_E";
    public static final String VISITA_NOMBRE_OPERADOR = "V_OPERADOR_E";
    public static final String VISITA_DNI_JEFE = "DNI_JEFE_EQUIPO";
    public static final String VISITA_NOMBRE_JEFE = "V_JEFE_EQUIPO";
    public static final String VISITA_DNI_SUPERVISOR = "DNI_SUPERVISOR";
    public static final String VISITA_NOMBRE_SUPERVISOR = "V_SUPERVISOR";
    public static final String VISITA_N = "N_VISITA";
    public static final String VISITA_DIA = "V_DIA";
    public static final String VISITA_MES = "V_MES";
    public static final String VISITA_ANIO = "V_ANIO";
    public static final String VISITA_HORAI = "V_HORA_I";
    public static final String VISITA_MINUTOI = "V_MINUTO_I";
    public static final String VISITA_HORAF = "V_HORA_F";
    public static final String VISITA_MINUTOF = "V_MINUTO_F";
    public static final String VISITA_RESULTADO = "R_VISITA";
    public static final String VISITA_RESULTADO_ESP = "R_VISITA_ESP";
    public static final String VISITA_PROX_DIA = "V_PROX_FECHA_DIA";
    public static final String VISITA_PROX_MES = "V_PROX_FECHA_MES";
    public static final String VISITA_PROX_ANIO = "V_PROX_FECHA_ANIO";
    public static final String VISITA_PROX_HORA = "V_PROX_HORA";
    public static final String VISITA_PROX_MINUTO = "V_PROX_MIN";
    public static final String VISITA_USUCREACION = "USU_CREACION";
    public static final String VISITA_FECCREACION = "FEC_CREACION";
    public static final String VISITA_USUREGISTRO = "USU_REGISTRO";
    public static final String VISITA_FECREGISTRO = "FEC_REGISTRO";


    //COLUMNAS_IDENTIFICACION
    public static final String IDENTIFICACION_ID = "ID";
    public static final String IDENTIFICACION_RUC = "NUM_RUC";
    public static final String IDENTIFICACION_RAZON = "RAZON_SOCIAL";
    public static final String IDENTIFICACION_NOMBRE = "NOM_COMER_COOP";
    public static final String IDENTIFICACION_ANIO_FUNDACION = "ANIO_FUNDACION";
    public static final String IDENTIFICACION_WEB = "PAG_WEB";
    public static final String IDENTIFICACION_WEBNO = "PAG_WEB_NO";
    public static final String IDENTIFICACION_CORREO = "CORREO";
    public static final String IDENTIFICACION_CORREONO = "CORREO_NO";
    public static final String IDENTIFICACION_CODFIJO = "COD_FIJO";
    public static final String IDENTIFICACION_FIJO = "TEL_FIJO";
    public static final String IDENTIFICACION_FIJONO = "TEL_FIJO_NO";
    public static final String IDENTIFICACION_MOVIL = "TEL_MOVIL";
    public static final String IDENTIFICACION_MOVILNO = "TEL_MOVIL_NO";
    public static final String IDENTIFICACION_ANIO_FUNCIONAMIENTO = "ANIO_OPERACION";
    public static final String IDENTIFICACION_CONDUCTOR_NOMBRE = "NOM_INFORMANTE";
    public static final String IDENTIFICACION_CONDUCTOR_SEXO = "SEXO_INFORMANTE";
    public static final String IDENTIFICACION_CONDUCTOR_EDAD = "EDAD_INFORMANTE";
    public static final String IDENTIFICACION_CONDUCTOR_ESTUDIOS = "ACAD_INFORMANTE";
    public static final String IDENTIFICACION_CONDUCTOR_CARGO = "CARGO_INFORMANTE";
    public static final String IDENTIFICACION_CONDUCTOR_CARGO_ESP = "CARGO_INFORMANTE_ESP";
    public static final String IDENTIFICACION_USUCREACION = "USU_CREACION";
    public static final String IDENTIFICACION_FECCREACION = "FEC_CREACION";
    public static final String IDENTIFICACION_USUREGISTRO = "USU_REGISTRO";
    public static final String IDENTIFICACION_FECREGISTRO = "FEC_REGISTRO";

    //COLUMNAS FRAGMENTS

    public static final String FRAGMENT_ID = "ID";
    public static final String FRAGMENT_HABILITADO = "F_HAB";
    public static final String FRAGMENT_AVANCE = "F_AVA";

    //SECCION 100----------------------------------------------
    public static final String SECCION100_ID = "ID";
    public static final String SECCION100_P_101 = "P_101";
    public static final String SECCION100_P_101_1 = "P_101_1";
    public static final String SECCION100_P_101_1_O = "P_101_1_O";
    public static final String SECCION100_P_102A = "P_102A";
    public static final String SECCION100_P_102_1 = "P_102_1";
    public static final String SECCION100_P_102B = "P_102B";
    public static final String SECCION100_P_102_2 = "P_102_2";
    public static final String SECCION100_P_102C = "P_102C";
    public static final String SECCION100_P_102_3 = "P_102_3";
    public static final String SECCION100_P_102D = "P_102D";
    public static final String SECCION100_P_102_4 = "P_102_4";
    public static final String SECCION100_P_103 = "P_103";
    public static final String SECCION100_ = "P_102_1";






    public static final String SECCION100_OBS_MOD_I = "OBS_MOD_I";

    //SECCION 400----------------------------------------------
    public static final String SECCION400_ID = "ID";
    public static final String SECCION400 = "ID";
    /*public static final String SECCION400_P_401_1 = "P_401_1";
    public static final String SECCION400_P_401_2
    public static final String SECCION400_P_401_3
    public static final String SECCION400_P_401_4
    public static final String SECCION400_P_401_5
    public static final String SECCION400_P_402
    public static final String SECCION400_P_403_1
    public static final String SECCION400_P_403_2
    public static final String SECCION400_P_403_3
    public static final String SECCION400_P_403_4
    public static final String SECCION400_P_404
    public static final String SECCION400_P_405
    public static final String SECCION400_P_406
    public static final String SECCION400_P_407_1
    public static final String SECCION400_P_407_2
    public static final String SECCION400_P_407_3
    public static final String SECCION400_P_407_4
    public static final String SECCION400_P_407_5
    public static final String SECCION400_P_407_6
    public static final String SECCION400_P_407_7
    public static final String SECCION400_P_407_7_O
    public static final String SECCION400_P_408_1
    public static final String SECCION400_P_408_2
    public static final String SECCION400_P_408_3
    public static final String SECCION400_P_408_4
    public static final String SECCION400_P_408_5
    public static final String SECCION400_P_408_6
    public static final String SECCION400_P_408_6_O
    public static final String SECCION400_P_409_1
    public static final String SECCION400_P_409_2
    public static final String SECCION400_P_409_3
    public static final String SECCION400_P_409_4
    public static final String SECCION400_P_409_5
    public static final String SECCION400_P_409_5_O
    public static final String SECCION400_P_410
    public static final String SECCION400_P_410_O*/



}
