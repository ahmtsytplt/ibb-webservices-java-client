package org.mesutormanli.ibbwsclient.service.iett;

import com.google.gson.Gson;
import org.mesutormanli.ibbwsclient.generated.iett.sefergerceklesme.SeferGerceklesme;
import org.mesutormanli.ibbwsclient.model.iett.BozukSatih;
import org.mesutormanli.ibbwsclient.model.iett.FiloAracKonum;
import org.mesutormanli.ibbwsclient.model.iett.KazaLokasyon;

import java.util.Arrays;
import java.util.List;

public class SeferGerceklesmeService {

    public List<BozukSatih> getBozukSatih(int saat) {
        final String json = new SeferGerceklesme().getSeferGerceklesmeSoap().getBozukSatihJson(saat);
        return Arrays.asList(new Gson().fromJson(json, BozukSatih[].class));
    }

    public List<FiloAracKonum> getFiloAracKonum() {
        final String json = new SeferGerceklesme().getSeferGerceklesmeSoap().getFiloAracKonumJson();
        return Arrays.asList(new Gson().fromJson(json, FiloAracKonum[].class));
    }

    public List<KazaLokasyon> getKazaLokasyon(String tarih) {
        final String json = new SeferGerceklesme().getSeferGerceklesmeSoap().getKazaLokasyonJson(tarih);
        return Arrays.asList(new Gson().fromJson(json, KazaLokasyon[].class));
    }
}