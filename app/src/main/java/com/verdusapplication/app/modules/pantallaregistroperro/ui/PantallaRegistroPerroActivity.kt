package com.verdusapplication.app.modules.pantallaregistroperro.ui

import androidx.activity.viewModels
import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.base.BaseActivity
import com.verdusapplication.app.databinding.ActivityPantallaRegistroPerroBinding
import com.verdusapplication.app.modules.pantallaregistroperro.`data`.viewmodel.PantallaRegistroPerroVM
import kotlin.String
import kotlin.Unit

class PantallaRegistroPerroActivity :
    BaseActivity<ActivityPantallaRegistroPerroBinding>(R.layout.activity_pantalla_registro_perro) {
  private val viewModel: PantallaRegistroPerroVM by viewModels<PantallaRegistroPerroVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pantallaRegistroPerroVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PANTALLA_REGISTRO_PERRO_ACTIVITY"

  }
}
