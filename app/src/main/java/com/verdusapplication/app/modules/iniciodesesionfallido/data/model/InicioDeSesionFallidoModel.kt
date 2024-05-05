package com.verdusapplication.app.modules.iniciodesesionfallido.`data`.model

import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InicioDeSesionFallidoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIniciodesesi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_inicio_de_sesi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContrasea: String? = MyApp.getInstance().resources.getString(R.string.lbl_contrase_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContraseainco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_contrase_a_inco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIniciarsesin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iniciar_sesi_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotienescuen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_tienes_cuen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null
)
