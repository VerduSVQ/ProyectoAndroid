package com.verdusapplication.app.modules.iniciodesesion.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.base.BaseActivity
import com.verdusapplication.app.databinding.ActivityInicioDeSesionBinding
import com.verdusapplication.app.modules.iniciodesesion.`data`.viewmodel.InicioDeSesionVM
import com.verdusapplication.app.modules.pantalladecargaa.ui.PantallaDeCargaaActivity
import com.verdusapplication.app.modules.pantallaprinciplmenu.ui.PantallaPrincipLMenuActivity
import com.verdusapplication.app.modules.registro.ui.RegistroActivity
import kotlin.String
import kotlin.Unit

class InicioDeSesionActivity :
    BaseActivity<ActivityInicioDeSesionBinding>(R.layout.activity_inicio_de_sesion) {
  private val viewModel: InicioDeSesionVM by viewModels<InicioDeSesionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.inicioDeSesionVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = PantallaDeCargaaActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnIniciarSesin.setOnClickListener {
        val destIntent = PantallaPrincipLMenuActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtNotienescuen.setOnClickListener {
        val destIntent = RegistroActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "INICIO_DE_SESION_ACTIVITY"

    }
  }
