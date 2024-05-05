package com.verdusapplication.app.modules.registro.`data`.model

import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegistroModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRegistrate: String? = MyApp.getInstance().resources.getString(R.string.lbl_registrate)
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
  var txtConfirmarcontr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirmar_contr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRastreator: String? = MyApp.getInstance().resources.getString(R.string.lbl_rastreator)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombre: String? = MyApp.getInstance().resources.getString(R.string.lbl_nombre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComprador: String? = MyApp.getInstance().resources.getString(R.string.lbl_comprador)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVendedor: String? = MyApp.getInstance().resources.getString(R.string.lbl_vendedor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYatienescuen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ya_tienes_cuen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordOneValue: String? = null
)
