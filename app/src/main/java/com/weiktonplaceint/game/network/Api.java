package com.weiktonplaceint.game.network;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String apulink = "https://raw.githubusercontent.com/pretasouzamirandadesouza-maker/Raven-City-/refs/heads/main/launcher.json";

    @GET(apulink)
    Call<Links> getLinks();
}
