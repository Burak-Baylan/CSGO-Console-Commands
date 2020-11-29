package com.burak.csgokonsolkomutlar.Siniflar

class SunucuKomutları {

    companion object{
        val sunucuCommands = arrayOf(
            "mp_limitteams 0 ",
            "mp_autoteambalance 0",
            "mp_roundtime 60",
            "mp_maxmoney 60000",
            "mp_startmoney 30000",
            "mp_freezetime 0",
            "mp_buytime 9999",
            "mp_buy_anywhere 1",
            "sv_infinite_ammo 1",
            "sv_infinite_ammo 2",
            "ammo_grenade_limit_total 5",
            "bot_kick",
            "mp_warmup_end",
            "mp_restartgame 1",
            "god",
            "cl_showpos 1"
            )

        val sunucuCommandsInfo = arrayOf(
            "Takım limitini kaldırırsınız. Yani isterseniz 2 Terorist 10 Anti-Terörirst olarak oynayabilirsiniz",
            "Takım dengelemesini kapatma",
            "Round'u, girilen dakika kadar sürdürtme",
            "En fazla para 16000'den 30000'e çıkar",
            "Başlangıç parası 30000'e çıkar",
            "Round başı beklenilen süre ayarı",
            "Round başlangıcından itibaren girilen süre kadar satın alım yapabilirsiniz",
            "Haritanın her yerinde satın alım yapabilirsiniz",
            "Sınırsız mermi ve bomba",
            "Sınırsız mermi ve bomba, fakat reload yapmanız gerekir",
            "5 çeşit bombayı aynı anda satın alabilirsiniz",
            "Tüm botları oyundan atar",
            "Isınma turunu sonlandırır",
            "Oyunu 1 saniye içinde yeniden başlatır",
            "Ölümsüzlük",
            "Ekranın sol üst köşesinde pozisyon ve hızınızı gösterir"
            )
    }
}