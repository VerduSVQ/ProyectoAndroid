package com.verdusapplication.app.modules.iniciodesesionfallido.ui

import androidx.activity.viewModels
import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.base.BaseActivity
import com.verdusapplication.app.databinding.ActivityInicioDeSesionFallidoBinding
import com.verdusapplication.app.modules.iniciodesesionfallido.`data`.viewmodel.InicioDeSesionFallidoVM
import kotlin.String
import kotlin.Unit

class InicioDeSesionFallidoActivity :
    BaseActivity<ActivityInicioDeSesionFallidoBinding>(R.layout.activity_inicio_de_sesion_fallido) {
  private val viewModel: InicioDeSesionFallidoVM by viewModels<InicioDeSesionFallidoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.inicioDeSesionFallidoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "INICIO_DE_SESION_FALLIDO_ACTIVITY"

  }
}
