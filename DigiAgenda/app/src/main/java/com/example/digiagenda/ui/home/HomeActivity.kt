package com.example.digiagenda.ui.home

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.*
import androidx.navigation.NavAction
import androidx.navigation.findNavController
import androidx.navigation.ui.*
import com.example.digiagenda.R
import com.example.digiagenda.model.Usuario
import com.example.digiagenda.ui.cadastro_evento.CadastrarEventoActivity
import com.example.digiagenda.ui.menu.ConvitesActivity
import com.example.digiagenda.ui.menu.EventosMesActivity
import com.example.digiagenda.ui.menu.MinhasInformacoesActivity
import com.example.digiagenda.ui.usuario.LoginActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.app_bar_home.*
import kotlinx.android.synthetic.main.menu_lateral_header.*

class HomeActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var homeViewModel: HomeViewModel

    private var usuarioEmail: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usuarioEmail = this.intent.getStringExtra("EXTRA_EMAIL")

        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        setSupportActionBar(findViewById(R.id.toolbar))


        adiciona_evento.setOnClickListener {
            startActivity(Intent(this, CadastrarEventoActivity::class.java))
        }

        setupNavigation()

        observer()

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun setupNavigation() {
        val drawerLayout: DrawerLayout = findViewById(R.id.home_activity)
        val navView: NavigationView = findViewById(R.id.menu_navegacao)
        val navController = findNavController(R.id.nav_host_fragment)
        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.ic_eventos, R.id.ic_informacoes, R.id.ic_eventos_mes, R.id.ic_convites, R.id.ic_logout),
            drawerLayout
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        navView.setNavigationItemSelectedListener {
            if(it.itemId == R.id.ic_logout){
                val alertDialog = AlertDialog.Builder(this).create()
                alertDialog.setMessage("Tem certeza que quer sair?")
                alertDialog.setCancelable(true)
                alertDialog.setButton(
                    AlertDialog.BUTTON_POSITIVE, getString(R.string.sim)
                ){ dialog, _ ->
                    dialog.dismiss()
                    logout()
                    startActivity(Intent(this, LoginActivity::class.java))
                    finish()
                }
                alertDialog.setButton(
                    AlertDialog.BUTTON_NEGATIVE, getString(R.string.nao)
                ){ dialog, _ ->
                    dialog.cancel()
                }
                alertDialog.show()
            } else {
                NavigationUI.onNavDestinationSelected(it, navController)
                drawerLayout.closeDrawer(GravityCompat.START);
            }
            true
        }
    }

    private fun logout(){
        val userPrefs = getSharedPreferences(getString(R.string.PREF_USER_DATA), Context.MODE_PRIVATE)

        val editor = userPrefs.edit()
            .putBoolean(getString(R.string.PREF_USER_FIRST_USE), true)
            .putString(getString(R.string.PREF_USER_EMAIL), "")

        editor.apply()
    }

    private fun observer(){
        usuarioEmail?.let {
            homeViewModel.getUsuarioByEmail(it).observe(this, {
                val header = menu_navegacao.getHeaderView(0)

                header.findViewById<TextView>(R.id.name_user).text = it.nome
            })
        }
    }

}