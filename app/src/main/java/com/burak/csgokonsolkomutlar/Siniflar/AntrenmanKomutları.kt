package com.burak.csgokonsolkomutlar.Siniflar

class AntrenmanKomutları {
    companion object{
        val antrenmanCommands = arrayOf(
            "bind “KEY” noclip",
            "bind “KEY” “give weapon_hegrenade;give weapon_flashbang;give weapon_smokegrenade;give weapon_incgrenade;give weapon_molotov;give weapon_decoy”",
            "r_drawothermodels 2",
            "thirdperson"
        )

        val antrenmanCommandsInfo = arrayOf(
            "Uçmak ve duvarların içinden geçebilmek için bir tuş atarsınız",
            "Tüm bombaları alırsınız",
            "Duvarın arkasından diğer oyuncuları gösterir (Belli bir mesafeden). Ayrıca varsayılan hali 1'dir.",
            "Üçüncü şahıs bakiş açısı"
        )
    }
}