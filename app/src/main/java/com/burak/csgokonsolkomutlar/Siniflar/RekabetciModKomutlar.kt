package com.burak.csgokonsolkomutlar.Siniflar

class RekabetciModKomutlar {

    companion object{
        val rekabetciCommand = arrayOf(
            "bind x +speed; r_cleardecal",
            "fps_max 10",
            "cl_radar_always_centered “0” cl_radar_scale “0.3”cl_hud_radar_scale “1.15”cl_radar_icon_scale_min “1” cl_radar_rotate “1”",
            "voice_scale 0.5 ",
            "+cl_show_team_equipment cl_teamid_overhead_always 1",
            "mat_monitorgamma 10",
            "cl_autowepswitch 0",
            "viewmodel_fov 68 viewmodel_offset_x 3 viewmodel_offset_y 3 viewmodel_offset_z -3 cl_bob_lower_amt 10 ",
            "alias “toggleside” “left” alias “left” “cl_righthand 0; alias toggleside right” alias “right” “cl_righthand 1; alias toggleside left” bind “x” “toggleside”",
        )

        val rekabetciCommandInfo = arrayOf(
            "Mermi ve kan izlerini temizleme",
            "FPS'yi belirtilen değere sabitleme",
            "En iyi sayılabilecek radar ayarı",
            "Konuşma (Sesli Sohbet) sesini azaltır veya yükseltme",
            "Takım arkadaşlarımızın ekipmanını her zaman görünün yapma",
            "Ekran gamma'sını belirtilen değere yükseltir veya azaltma",
            "Yerden silah alındığında otomatik ele gelmesini engelleme",
            "En iyi sayılabilecek View Model ayarı",
            "x'e basıldığında silahı sağ ve sol el arasında değiştirme",
        )
    }
}