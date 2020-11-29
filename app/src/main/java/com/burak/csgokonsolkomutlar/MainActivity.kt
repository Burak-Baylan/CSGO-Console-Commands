package com.burak.csgokonsolkomutlar

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AlertDialog
import com.burak.csgokonsolkomutlar.Siniflar.*
import com.google.android.gms.ads.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    lateinit var mAdView : AdView
    private lateinit var mInterstitialAd: InterstitialAd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /******************************************************************************************/

        MobileAds.initialize(this)

        mAdView = findViewById(R.id.adViewMain)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)


        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-3940256099942544/1033173712"
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        mInterstitialAd.adListener = object : AdListener() {
            override fun onAdClosed() {
                mInterstitialAd.loadAd(AdRequest.Builder().build())
            }
        }

        /******************************************************************************************/

        supportActionBar?.hide()
        val window : Window = window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = Color.parseColor("#222831")

        konsolAcma.setOnClickListener {
            showInterstitialAd()
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Konsolu Nasıl Aktif Ederim?")
            alert.setMessage("Ayarlar -> Oyun İçi Ayarları -> Geliştirici Konsolu Etkinleştir\n\n" +
                    "Bu ayarı yaptıktan sonra klavye kısa yollarına bakmamız gerekiyor:\n" +
                    "Klavye ve Fare bölümüne geldikten sonra Geliştirici Komut Konsolu veya Komut Konsolu'nu buluyoruz ve ardında bir kısayol tuşu ataması gerçekleştiriyoruz. Atadığınız tuş konsolu daha kolay açmanızı sağlayacaktır."
            )
            alert.setPositiveButton("Tamam") {dialog : DialogInterface, _ : Int ->
                dialog.cancel()
            }
            alert.show()
        }
        rekabetciKomutlari.setOnClickListener {
            goIntent(RekabetciModKomutlar.rekabetciCommand, RekabetciModKomutlar.rekabetciCommandInfo, false, "Rekabetçi Komutları")
            showInterstitialAd()
        }
        serverKomutları.setOnClickListener {
            goIntent(SunucuKomutları.sunucuCommands, SunucuKomutları.sunucuCommandsInfo, true, "Sunucu Komutları")
            showInterstitialAd()
        }
        pratikKodlar.setOnClickListener {
            goIntent(PratikKodlar.pratikCommands, PratikKodlar.pratikCommandsInfo, false, "Pratik Komutlar")
            showInterstitialAd()
        }
        antrenmanKomutlari.setOnClickListener {
            goIntent(AntrenmanKomutları.antrenmanCommands, AntrenmanKomutları.antrenmanCommandsInfo, false, "Antrenman Komutları")
            showInterstitialAd()
        }
        botKomutlari.setOnClickListener {
            goIntent(BotKomutları.botCommands, BotKomutları.botCommandsInfo, false, "Bot Komutları")
            showInterstitialAd()
        }
        publicServerKomutları.setOnClickListener {
            goIntent(PublicServerKomutları.antrenmanCommands, PublicServerKomutları.antrenmanCommandsInfo, false, "Public Server Komutları")
            showInterstitialAd()
        }
        silahKodları.setOnClickListener {
            goIntent(SilahKomutları.silahCommand, SilahKomutları.silahCommandInfo, false, "Silah Komutları")
            showInterstitialAd()
        }
        ekstraKomutlar.setOnClickListener {
            goIntent(EkstraKomutlar.ekstraCommands, EkstraKomutlar.ekstraCommandsInfo, false, "Ekstra Komutlar")
            showInterstitialAd()
        }
    }

    private fun showInterstitialAd(){
        if (mInterstitialAd.isLoaded) {
            mInterstitialAd.show()
        }
    }

    private fun goIntent (commandArray : Array<String>, infoArray : Array<String>, extraPut : Boolean, actionBarText : String){
        val intent = Intent(this, ShowCommand::class.java)
        intent.putExtra("command", commandArray)
        intent.putExtra("info", infoArray)
        intent.putExtra("text", actionBarText)
        if (extraPut){
            intent.putExtra("svInfo", extraPut)
        }
        startActivity(intent)
    }

}