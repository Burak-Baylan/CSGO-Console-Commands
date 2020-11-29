package com.burak.csgokonsolkomutlar.Siniflar

class PublicServerKomutları {
    companion object{
        val antrenmanCommands = arrayOf(
            "mp_autokick",
            "mp_c4timer 10",
            "mp_disable_autokick",
            "mp_friendlyfire 1",
            "mp_respawnwavetime_ct",
            "mp_respawnwavetime_t",
            "mp_respawn_on_death_ct",
            "mp_respawn_on_death_t",
            "mp_scrambleteams",
            "mp_switchteams",
            "mp_timelimit",
            "sv_voiceenable 1"
        )

        val antrenmanCommandsInfo = arrayOf(
            "AFK kalan oyuncuyu otomatik atar",
            "C4 patlama süresini belirler",
            "Otomatik atmayı kapatırsınız",
            "Dost ateşini açarsınız (kapatmak için 0 yazmanız gerekir)",
            "CT takımı için otomatik doğma süresini belirler",
            "T takımı için otomatik doğma süresini belirler",
            "CT takımı için otomatik doğmayı açar",
            "T takımı için otomatik doğmayı açar",
            "Takımları karıştırıp restart atar",
            "Takımları değişirip restart atar",
            "Harita süresini belirler",
            "Sunucuda mikrofon kullanımını açıp kapatır (0 Açık, 1 Kapalı)"
        )
    }
}