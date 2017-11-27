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


    public static final String SECCION100_OBS = "OBS";


    //SECCION 200----------------------------------------------
    public static final String SECCION200_ID = "ID";
    public static final String SECCION200_P_201_1 = "P_201_1";
    public static final String SECCION200_P_201_2 = "P_201_2";
    public static final String SECCION200_P_201_3 = "P_201_3";
    public static final String SECCION200_P_201_4 = "P_201_4";
    public static final String SECCION200_P_202 = "P_202";
    public static final String SECCION200_P_203 = "P_203";
    public static final String SECCION200_P_203_O = "P_203_O";
    public static final String SECCION200_P_204 = "P_204";
    public static final String SECCION200_P_205_1 = "P_205_1";
    public static final String SECCION200_P_205_2 = "P_205_2";
    public static final String SECCION200_P_205_3 = "P_205_3";
    public static final String SECCION200_P_205_4 = "P_205_4";
    public static final String SECCION200_P_205_5 = "P_205_5";
    public static final String SECCION200_P_205_6 = "P_205_6";
    public static final String SECCION200_P_205_6_O = "P_205_6_O";

    public static final String SECCION200_OBS = "OBS";


    //SECCION 300----------------------------------------------
    public static final String SECCION300_ID = "ID";
    public static final String SECCION300_P_301 = "P_301";
    public static final String SECCION300_P_302 = "P_302";
    public static final String SECCION300_P_302A_M_1 = "P_302A_M_1";
    public static final String SECCION300_P_302A_M_2 = "P_302A_M_2";
    public static final String SECCION300_P_302A_M_3 = "P_302A_M_3";
    public static final String SECCION300_P_302A_M_4 = "P_302A_M_4";
    public static final String SECCION300_P_302A_M_4_O = "P_302A_M_4_O";
    public static final String SECCION300_P_302A_L_1 = "P_302A_L_1";
    public static final String SECCION300_P_302A_L_2 = "P_302A_L_2";
    public static final String SECCION300_P_302A_L_3 = "P_302A_L_3";
    public static final String SECCION300_P_302A_L_4 = "P_302A_L_4";
    public static final String SECCION300_P_302A_L_4_O = "P_302A_L_4_O";
    public static final String SECCION300_P_302A_P_1 = "P_302A_P_1";
    public static final String SECCION300_P_302A_P_2 = "P_302A_P_2";
    public static final String SECCION300_P_302A_P_3 = "P_302A_P_3";
    public static final String SECCION300_P_302A_P_4 = "P_302A_P_4";
    public static final String SECCION300_P_302A_P_5 = "P_302A_P_5";
    public static final String SECCION300_P_302A_P_5_O = "P_302A_P_5_O";
    public static final String SECCION300_P_302A_T_1 = "P_302A_T_1";
    public static final String SECCION300_P_302A_T_2 = "P_302A_T_2";
    public static final String SECCION300_P_302A_T_3 = "P_302A_T_3";
    public static final String SECCION300_P_302A_T_4 = "P_302A_T_4";
    public static final String SECCION300_P_302A_T_4_O = "P_302A_T_4_O";
    public static final String SECCION300_P_302A_V_1 = "P_302A_V_1";
    public static final String SECCION300_P_302A_V_2 = "P_302A_V_2";
    public static final String SECCION300_P_302A_V_3 = "P_302A_V_3";
    public static final String SECCION300_P_302A_V_3_O = "P_302A_V_3_O";
    public static final String SECCION300_P_302A_O_1 = "P_302A_O_1";
    public static final String SECCION300_P_302A_O_1_O = "P_302A_O_1_O";
    public static final String SECCION300_P_302B_M_1 = "P_302B_M_1";
    public static final String SECCION300_P_302B_M_2 = "P_302B_M_2";
    public static final String SECCION300_P_302B_M_3 = "P_302B_M_3";
    public static final String SECCION300_P_302B_M_4 = "P_302B_M_4";
    public static final String SECCION300_P_302B_L_1 = "P_302B_L_1";
    public static final String SECCION300_P_302B_L_2 = "P_302B_L_2";
    public static final String SECCION300_P_302B_L_3 = "P_302B_L_3";
    public static final String SECCION300_P_302B_L_4 = "P_302B_L_4";
    public static final String SECCION300_P_302B_P_1 = "P_302B_P_1";
    public static final String SECCION300_P_302B_P_2 = "P_302B_P_2";
    public static final String SECCION300_P_302B_P_3 = "P_302B_P_3";
    public static final String SECCION300_P_302B_P_4 = "P_302B_P_4";
    public static final String SECCION300_P_302B_P_5 = "P_302B_P_5";
    public static final String SECCION300_P_302B_T_1 = "P_302B_T_1";
    public static final String SECCION300_P_302B_T_2 = "P_302B_T_2";
    public static final String SECCION300_P_302B_T_3 = "P_302B_T_3";
    public static final String SECCION300_P_302B_T_4 = "P_302B_T_4";
    public static final String SECCION300_P_302B_V_1 = "P_302B_V_1";
    public static final String SECCION300_P_302B_V_2 = "P_302B_V_2";
    public static final String SECCION300_P_302B_V_3 = "P_302B_V_3";
    public static final String SECCION300_P_302B_O_1 = "P_302B_O_1";
    public static final String SECCION300_P_302C_M_1 = "P_302C_M_1";
    public static final String SECCION300_P_302C_M_2 = "P_302C_M_2";
    public static final String SECCION300_P_302C_M_3 = "P_302C_M_3";
    public static final String SECCION300_P_302C_M_4 = "P_302C_M_4";
    public static final String SECCION300_P_302C_L_1 = "P_302C_L_1";
    public static final String SECCION300_P_302C_L_2 = "P_302C_L_2";
    public static final String SECCION300_P_302C_L_3 = "P_302C_L_3";
    public static final String SECCION300_P_302C_L_4 = "P_302C_L_4";
    public static final String SECCION300_P_302C_P_1 = "P_302C_P_1";
    public static final String SECCION300_P_302C_P_2 = "P_302C_P_2";
    public static final String SECCION300_P_302C_P_3 = "P_302C_P_3";
    public static final String SECCION300_P_302C_P_4 = "P_302C_P_4";
    public static final String SECCION300_P_302C_P_5 = "P_302C_P_5";
    public static final String SECCION300_P_302C_T_1 = "P_302C_T_1";
    public static final String SECCION300_P_302C_T_2 = "P_302C_T_2";
    public static final String SECCION300_P_302C_T_3 = "P_302C_T_3";
    public static final String SECCION300_P_302C_T_4 = "P_302C_T_4";
    public static final String SECCION300_P_302C_V_1 = "P_302C_V_1";
    public static final String SECCION300_P_302C_V_2 = "P_302C_V_2";
    public static final String SECCION300_P_302C_V_3 = "P_302C_V_3";
    public static final String SECCION300_P_302C_O_1 = "P_302C_O_1";
    public static final String SECCION300_P_303_1 = "P_303_1";
    public static final String SECCION300_P_303_2 = "P_303_2";
    public static final String SECCION300_P_303_3 = "P_303_3";
    public static final String SECCION300_P_303_4 = "P_303_4";
    public static final String SECCION300_P_303_5 = "P_303_5";
    public static final String SECCION300_P_304 = "P_304";
    public static final String SECCION300_P_305 = "P_305";

    public static final String SECCION300_OBS = "OBS";

    //SECCION 400----------------------------------------------
    public static final String SECCION400_ID = "ID";
    public static final String SECCION400_P_401_1 = "P_401_1";
    public static final String SECCION400_P_401_2 = "P_401_2";
    public static final String SECCION400_P_401_3 = "P_401_3";
    public static final String SECCION400_P_401_4 = "P_401_4";
    public static final String SECCION400_P_401_5 = "P_401_5";
    public static final String SECCION400_P_402 = "P_402";
    public static final String SECCION400_P_403_1 = "P_403_1";
    public static final String SECCION400_P_403_2 = "P_403_2";
    public static final String SECCION400_P_403_3 = "P_403_3";
    public static final String SECCION400_P_403_4 = "P_403_4";
    public static final String SECCION400_P_404 = "P_404";
    public static final String SECCION400_P_405 = "P_405";
    public static final String SECCION400_P_406 = "P_406";
    public static final String SECCION400_P_407_1 = "P_407_1";
    public static final String SECCION400_P_407_2 = "P_407_2";
    public static final String SECCION400_P_407_3 = "P_407_3";
    public static final String SECCION400_P_407_4 = "P_407_4";
    public static final String SECCION400_P_407_5 = "P_407_5";
    public static final String SECCION400_P_407_6 = "P_407_6";
    public static final String SECCION400_P_407_7 = "P_407_7";
    public static final String SECCION400_P_407_7_O = "P_407_7_O";
    public static final String SECCION400_P_408_1 = "P_408_1";
    public static final String SECCION400_P_408_2 = "P_408_2";
    public static final String SECCION400_P_408_3 = "P_408_3";
    public static final String SECCION400_P_408_4 = "P_408_4";
    public static final String SECCION400_P_408_5 = "P_408_5";
    public static final String SECCION400_P_408_6 = "P_408_6";
    public static final String SECCION400_P_408_6_O = "P_408_6_O";
    public static final String SECCION400_P_409_1 = "P_409_1";
    public static final String SECCION400_P_409_2 = "P_409_2";
    public static final String SECCION400_P_409_3 = "P_409_3";
    public static final String SECCION400_P_409_4 = "P_409_4";
    public static final String SECCION400_P_409_5 = "P_409_5";
    public static final String SECCION400_P_409_5_O = "P_409_5_O";
    public static final String SECCION400_P_410 = "P_410";
    public static final String SECCION400_P_410_O = "P_410_O";

    public static final String SECCION400_OBS = "OBS";


    //QUERY
    //CREATE
    public static final String SQL_CREATE_TABLA_USUARIOS =
            "CREATE TABLE " + tableUsuarios + "(" +
                    USUARIO_ID + " TEXT PRIMARY KEY," +
                    USUARIO_PASSWORD + " TEXT," +
                    USUARIO_PERMISO + " TEXT" + ");"
            ;



    public static final String SQL_CREATE_TABLA_MARCO =
            "CREATE TABLE " + tableMarco + "(" +
                    MARCO_ID + " TEXT PRIMARY KEY," +
                    MARCO_RUC + " TEXT," +
                    MARCO_RAZON_SOCIAL + " TEXT," +
                    MARCO_NOMBRE_COMERCIAL + " TEXT," +
                    MARCO_OPERADOR + " TEXT," +
                    MARCO_JEFE + " TEXT," +
                    MARCO_OBSERVADOR + " TEXT," +
                    MARCO_ANIO + " TEXT," +
                    MARCO_MES + " TEXT," +
                    MARCO_PERIODO + " TEXT," +
                    MARCO_CCDD + " TEXT," +
                    MARCO_DEPARTAMENTO + " TEXT," +
                    MARCO_CCPP + " TEXT," +
                    MARCO_PROVINCIA + " TEXT," +
                    MARCO_CCDI + " TEXT," +
                    MARCO_DISTRITO + " TEXT," +
                    MARCO_T_EMPRESA + " TEXT," +
                    MARCO_FRENTE + " TEXT," +
                    MARCO_ZONA + " TEXT," +
                    MARCO_MANZANA + " TEXT," +
                    MARCO_CAT_VIA + " TEXT," +
                    MARCO_NOM_VIA + " TEXT," +
                    MARCO_PUERTA + " TEXT," +
                    MARCO_INTERIOR + " TEXT," +
                    MARCO_PISO + " TEXT," +
                    MARCO_MZ + " TEXT," +
                    MARCO_LOTE + " TEXT" + ");"
            ;

    public static final String SQL_CREATE_TABLA_CARATULAS =
            "CREATE TABLE " + tableCaratulas + "(" +
                    CARATULA_ID + " TEXT PRIMARY KEY," +
                    CARATULA_DEPARTAMENTO + " TEXT," +
                    CARATULA_DEPARTAMENTO_COD + " TEXT," +
                    CARATULA_PROVINCIA + " TEXT," +
                    CARATULA_PROVINCIA_COD + " TEXT," +
                    CARATULA_DISTRITO + " TEXT," +
                    CARATULA_DISTRITO_COD + " TEXT," +
                    CARATULA_GPSLATITUD + " TEXT," +
                    CARATULA_GPSLONGITUD + " TEXT," +
                    CARATULA_SECTOR + " TEXT," +
                    CARATULA_AREA + " TEXT," +
                    CARATULA_ZONA + " TEXT," +
                    CARATULA_MANZANA_MUESTRA + " TEXT," +
                    CARATULA_FRENTE + " TEXT," +
                    CARATULA_TIPVIA + " TEXT," +
                    CARATULA_NOMVIA + " TEXT," +
                    CARATULA_NPUERTA + " TEXT," +
                    CARATULA_BLOCK + " TEXT," +
                    CARATULA_INTERIOR + " TEXT," +
                    CARATULA_PISO + " TEXT," +
                    CARATULA_MANZANA_VIA + " TEXT," +
                    CARATULA_LOTE + " TEXT," +
                    CARATULA_KM + " TEXT," +");"
            ;

    public static final String SQL_CREATE_TABLA_VISITAS =
            "CREATE TABLE " + tableVisitas + "(" +
                    VISITA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    VISITA_ID_EMPRESA + " TEXT," +
                    VISITA_DNI_OPERADOR + " TEXT," +
                    VISITA_NOMBRE_OPERADOR + " TEXT," +
                    VISITA_DNI_JEFE + " TEXT," +
                    VISITA_NOMBRE_JEFE + " TEXT," +
                    VISITA_DNI_SUPERVISOR + " TEXT," +
                    VISITA_NOMBRE_SUPERVISOR + " TEXT," +
                    VISITA_N + " TEXT," +
                    VISITA_DIA + " TEXT," +
                    VISITA_MES + " TEXT," +
                    VISITA_ANIO + " TEXT," +
                    VISITA_HORAI + " TEXT," +
                    VISITA_MINUTOI + " TEXT," +
                    VISITA_HORAF + " TEXT," +
                    VISITA_MINUTOF + " TEXT," +
                    VISITA_RESULTADO + " TEXT," +
                    VISITA_RESULTADO_ESP + " TEXT," +
                    VISITA_PROX_DIA + " TEXT," +
                    VISITA_PROX_MES + " TEXT," +
                    VISITA_PROX_ANIO + " TEXT," +
                    VISITA_PROX_HORA + " TEXT," +
                    VISITA_PROX_MINUTO + " TEXT," +
                    VISITA_USUCREACION + " TEXT," +
                    VISITA_FECCREACION + " TEXT," +
                    VISITA_USUREGISTRO + " TEXT," +
                    VISITA_FECREGISTRO + " TEXT" + ");"
            ;

    public static final String SQL_CREATE_TABLA_IDENTIFICACIONES =
            "CREATE TABLE " + tableIdentificaciones + "(" +
                    IDENTIFICACION_ID + " TEXT PRIMARY KEY," +
                    IDENTIFICACION_RUC + " TEXT," +
                    IDENTIFICACION_RAZON + " TEXT," +
                    IDENTIFICACION_NOMBRE + " TEXT," +
                    IDENTIFICACION_ANIO_FUNDACION + " TEXT," +
                    IDENTIFICACION_WEB + " TEXT," +
                    IDENTIFICACION_WEBNO + " TEXT," +
                    IDENTIFICACION_CORREO + " TEXT," +
                    IDENTIFICACION_CORREONO + " TEXT," +
                    IDENTIFICACION_CODFIJO + " TEXT," +
                    IDENTIFICACION_FIJO + " TEXT," +
                    IDENTIFICACION_FIJONO + " TEXT," +
                    IDENTIFICACION_MOVIL + " TEXT," +
                    IDENTIFICACION_MOVILNO + " TEXT," +
                    IDENTIFICACION_ANIO_FUNCIONAMIENTO + " TEXT," +
                    IDENTIFICACION_CONDUCTOR_NOMBRE + " TEXT," +
                    IDENTIFICACION_CONDUCTOR_SEXO + " TEXT," +
                    IDENTIFICACION_CONDUCTOR_EDAD + " TEXT," +
                    IDENTIFICACION_CONDUCTOR_ESTUDIOS + " TEXT," +
                    IDENTIFICACION_CONDUCTOR_CARGO + " TEXT," +
                    IDENTIFICACION_CONDUCTOR_CARGO_ESP + " TEXT," +
                    IDENTIFICACION_USUCREACION + " TEXT," +
                    IDENTIFICACION_FECCREACION + " TEXT," +
                    IDENTIFICACION_USUREGISTRO + " TEXT," +
                    IDENTIFICACION_FECREGISTRO + " TEXT" + ");"
            ;

    public static final String SQL_CREATE_TABLA_FRAGMENTS =
            "CREATE TABLE " + tableFragments + "(" +
                    FRAGMENT_ID + " TEXT PRIMARY KEY," +
                    FRAGMENT_HABILITADO + " TEXT," +
                    FRAGMENT_AVANCE + " TEXT" +");"
            ;

    public static final String SQL_CREATE_TABLA_UBIGEOS =
            "CREATE TABLE " + tableUbigeo + "(" +
                    UBIGEO_ID + " TEXT PRIMARY KEY," +
                    UBIGEO_ID_UBI + " TEXT, " +
                    UBIGEO_DISTRITO + " TEXT" +");"
            ;


    //TABLA MODULO1
    public static final String SQL_CREATE_TABLA_MODULO3 =
            "CREATE TABLE " + tableModulo3 + "(" +
                    SECCION300_ID  + " TEXT PRIMARY KEY," +
                    SECCION300_P_301  + " TEXT," +
                    SECCION300_P_302  + " TEXT," +
                    SECCION300_P_302A_M_1  + " TEXT," +
                    SECCION300_P_302A_M_2  + " TEXT," +
                    SECCION300_P_302A_M_3  + " TEXT," +
                    SECCION300_P_302A_M_4  + " TEXT," +
                    SECCION300_P_302A_M_4_O  + " TEXT," +
                    SECCION300_P_302A_L_1  + " TEXT," +
                    SECCION300_P_302A_L_2  + " TEXT," +
                    SECCION300_P_302A_L_3  + " TEXT," +
                    SECCION300_P_302A_L_4  + " TEXT," +
                    SECCION300_P_302A_L_4_O  + " TEXT," +
                    SECCION300_P_302A_P_1  + " TEXT," +
                    SECCION300_P_302A_P_2  + " TEXT," +
                    SECCION300_P_302A_P_3  + " TEXT," +
                    SECCION300_P_302A_P_4  + " TEXT," +
                    SECCION300_P_302A_P_5  + " TEXT," +
                    SECCION300_P_302A_P_5_O  + " TEXT," +
                    SECCION300_P_302A_T_1  + " TEXT," +
                    SECCION300_P_302A_T_2  + " TEXT," +
                    SECCION300_P_302A_T_3  + " TEXT," +
                    SECCION300_P_302A_T_4  + " TEXT," +
                    SECCION300_P_302A_T_4_O  + " TEXT," +
                    SECCION300_P_302A_V_1  + " TEXT," +
                    SECCION300_P_302A_V_2  + " TEXT," +
                    SECCION300_P_302A_V_3  + " TEXT," +
                    SECCION300_P_302A_V_3_O  + " TEXT," +
                    SECCION300_P_302A_O_1  + " TEXT," +
                    SECCION300_P_302A_O_1_O  + " TEXT," +
                    SECCION300_P_302B_M_1  + " TEXT," +
                    SECCION300_P_302B_M_2  + " TEXT," +
                    SECCION300_P_302B_M_3  + " TEXT," +
                    SECCION300_P_302B_M_4  + " TEXT," +
                    SECCION300_P_302B_L_1  + " TEXT," +
                    SECCION300_P_302B_L_2  + " TEXT," +
                    SECCION300_P_302B_L_3  + " TEXT," +
                    SECCION300_P_302B_L_4  + " TEXT," +
                    SECCION300_P_302B_P_1  + " TEXT," +
                    SECCION300_P_302B_P_2  + " TEXT," +
                    SECCION300_P_302B_P_3  + " TEXT," +
                    SECCION300_P_302B_P_4  + " TEXT," +
                    SECCION300_P_302B_P_5  + " TEXT," +
                    SECCION300_P_302B_T_1  + " TEXT," +
                    SECCION300_P_302B_T_2  + " TEXT," +
                    SECCION300_P_302B_T_3  + " TEXT," +
                    SECCION300_P_302B_T_4  + " TEXT," +
                    SECCION300_P_302B_V_1  + " TEXT," +
                    SECCION300_P_302B_V_2  + " TEXT," +
                    SECCION300_P_302B_V_3  + " TEXT," +
                    SECCION300_P_302B_O_1  + " TEXT," +
                    SECCION300_P_302C_M_1  + " TEXT," +
                    SECCION300_P_302C_M_2  + " TEXT," +
                    SECCION300_P_302C_M_3  + " TEXT," +
                    SECCION300_P_302C_M_4  + " TEXT," +
                    SECCION300_P_302C_L_1  + " TEXT," +
                    SECCION300_P_302C_L_2  + " TEXT," +
                    SECCION300_P_302C_L_3  + " TEXT," +
                    SECCION300_P_302C_L_4  + " TEXT," +
                    SECCION300_P_302C_P_1  + " TEXT," +
                    SECCION300_P_302C_P_2  + " TEXT," +
                    SECCION300_P_302C_P_3  + " TEXT," +
                    SECCION300_P_302C_P_4  + " TEXT," +
                    SECCION300_P_302C_P_5  + " TEXT," +
                    SECCION300_P_302C_T_1  + " TEXT," +
                    SECCION300_P_302C_T_2  + " TEXT," +
                    SECCION300_P_302C_T_3  + " TEXT," +
                    SECCION300_P_302C_T_4  + " TEXT," +
                    SECCION300_P_302C_V_1  + " TEXT," +
                    SECCION300_P_302C_V_2  + " TEXT," +
                    SECCION300_P_302C_V_3  + " TEXT," +
                    SECCION300_P_302C_O_1  + " TEXT," +
                    SECCION300_P_303_1  + " TEXT," +
                    SECCION300_P_303_2  + " TEXT," +
                    SECCION300_P_303_3  + " TEXT," +
                    SECCION300_P_303_4  + " TEXT," +
                    SECCION300_P_303_5  + " TEXT," +
                    SECCION300_P_304  + " TEXT," +
                    SECCION300_P_305  + " TEXT," +
                    SECCION300_OBS  + " TEXT" + ");"
            ;


    //SECCION 400
     public static final String SQL_CREATE_TABLA_MODULO4 =
            "CREATE TABLE " + tableModulo4 + "(" +
                    SECCION400_ID  + " TEXT PRIMARY KEY," +
                    SECCION400_P_401_1  + " TEXT," +
                    SECCION400_P_401_2  + " TEXT," +
                    SECCION400_P_401_3  + " TEXT," +
                    SECCION400_P_401_4  + " TEXT," +
                    SECCION400_P_401_5  + " TEXT," +
                    SECCION400_P_402  + " TEXT," +
                    SECCION400_P_403_1  + " TEXT," +
                    SECCION400_P_403_2  + " TEXT," +
                    SECCION400_P_403_3  + " TEXT," +
                    SECCION400_P_403_4  + " TEXT," +
                    SECCION400_P_404  + " TEXT," +
                    SECCION400_P_405  + " TEXT," +
                    SECCION400_P_406  + " TEXT," +
                    SECCION400_P_407_1  + " TEXT," +
                    SECCION400_P_407_2  + " TEXT," +
                    SECCION400_P_407_3  + " TEXT," +
                    SECCION400_P_407_4  + " TEXT," +
                    SECCION400_P_407_5  + " TEXT," +
                    SECCION400_P_407_6  + " TEXT," +
                    SECCION400_P_407_7  + " TEXT," +
                    SECCION400_P_407_7_O  + " TEXT," +
                    SECCION400_P_408_1  + " TEXT," +
                    SECCION400_P_408_2  + " TEXT," +
                    SECCION400_P_408_3  + " TEXT," +
                    SECCION400_P_408_4  + " TEXT," +
                    SECCION400_P_408_5  + " TEXT," +
                    SECCION400_P_408_6  + " TEXT," +
                    SECCION400_P_408_6_O  + " TEXT," +
                    SECCION400_P_409_1  + " TEXT," +
                    SECCION400_P_409_2  + " TEXT," +
                    SECCION400_P_409_3  + " TEXT," +
                    SECCION400_P_409_4  + " TEXT," +
                    SECCION400_P_409_5  + " TEXT," +
                    SECCION400_P_409_5_O  + " TEXT," +
                    SECCION400_P_410  + " TEXT," +
                    SECCION400_P_410_O  + " TEXT," +
                    SECCION400_OBS  + " TEXT" + ");"
            ;

}
