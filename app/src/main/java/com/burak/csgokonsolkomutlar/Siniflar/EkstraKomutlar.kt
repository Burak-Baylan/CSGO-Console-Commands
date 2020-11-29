package com.burak.csgokonsolkomutlar.Siniflar

class EkstraKomutlar {
    companion object{
        val ekstraCommands = arrayOf(
            "net_graph 1",
            "cl_showfps 1",
            "scr_conspeed",
            "scr_centertime",
            "hud_centerid 1",
            "hud_saytext_time",
            "hud_fastswitch 1",
            "hud_deathnotice_time",
            "gamma",
            "hideradar",
            "drawradar",
            "setinfo_ah"
        )

        val ekstraCommandsInfo = arrayOf(
            "Ping, FPS ve diğer ayrıntılı değerleri ekranın altında gösterir",
            "FPS'inizi ekranın bir köşesinde gösterir",
            "Konsolun açılış hızının değiştirir. En mantıklı kabul edilen değer: 9999",
            "Oyun esnasında ekranda gözüken 'Player dropped the bomb' gibisinden yazıların ekranda ne kadar süre boyunca kalacağı",
            "Silahınızı bir oyuncuya doğrulttuğunuzda oyuncu isminin gözükmesi",
            "Ekranın sol alt köşesindeki yazıların her bir satırının ekranda ne kadar süre boyunca duracağı",
            "Herhangi bir slottaki silahı hızlı seçme komutu",
            "Ekranın sağ üst köşesinde kimin öldüğüne dair çıkan yazıların ekranda ne kadar süre boyunca duracağı",
            "Ekran parlaklığını değiştirmeye yarayan komut Örnek: gamma 3.7",
            "Radarı kapatır",
            "Radarı açar",
            "Autohelp özelliğini kapatır",
        )
    }
}