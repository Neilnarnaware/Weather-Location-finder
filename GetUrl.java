package com.deeplin.pokespoofer.tools;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class GetUrl {

    int clear, cloudy, partly, rainy, windy, snow, fog, currentMonth;
    Context context;
    SharedPreferences sharedPreferences;
    Gson gson;
    ArrayList<String> allWeather;

    public GetUrl(Context context, int currentMonth, SharedPreferences sharedPreferences) {
        this.currentMonth = currentMonth;
        this.context = context;
        this.sharedPreferences = sharedPreferences;
        clear = sharedPreferences.getInt("clear", 0);
        cloudy = sharedPreferences.getInt("cloud", 0);
        partly = sharedPreferences.getInt("partly", 0);
        rainy = sharedPreferences.getInt("rainy", 0);
        windy = sharedPreferences.getInt("windy", 0);
        snow = sharedPreferences.getInt("snow", 0);
        fog = sharedPreferences.getInt("fog", 0);
        gson = new Gson();
        allWeather = new ArrayList<>();
        allWeather.add("clear");
        allWeather.add("cloud");
        allWeather.add("partly");
        allWeather.add("rainy");
        allWeather.add("windy");
        allWeather.add("snow");
        allWeather.add("fog");


    }

    private String getUrl(int currentMonth) {
        String finalUrl = null;
        ArrayList<String> demo = new ArrayList<>();
        String jsonIn = sharedPreferences.getString("seekbars", null);
        Type type = new TypeToken<ArrayList<String>>() {
        }.getType();
        demo = gson.fromJson(jsonIn, type);
        return finalUrl;

    }

    public String getUrlFinal1() {
        String finalUrl = null;
        if (clear == 0) {
            if (cloudy != 0 && snow == 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

            } else if (cloudy == 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

            } else if (cloudy != 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

            } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
            } else {
                if (cloudy != 0 && snow == 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                } else if (cloudy == 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                } else if (cloudy != 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }
            }
        } else if (clear != 0) {
            if (cloudy != 0 && snow == 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

            } else if (cloudy == 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

            } else if (cloudy != 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }

            } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
            } else {
                if (cloudy != 0 && snow == 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                } else if (cloudy == 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                } else if (cloudy != 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
                    }

                } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
                }
            }

        }
        //All singles
        else if (clear != 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy != 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow != 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + snow + "&SON=__&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";

        } else if (clear == 0 && cloudy != 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "10" + "&TMN=" + "__" + "&SON=" + cloudy + "&PRE=" + "15" + "&MOD=TAB&OFFS=00&SORT=SU";

        } else if (clear == 0 && cloudy == 0 && partly != 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "20" + "&TMN=" + "__" + "&SON=" + partly + "&PRE=" + "10" + "&MOD=TAB&OFFS=00&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog != 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "10" + "&TMN=" + "__" + "&SON=" + cloudy + "&PRE=" + "10" + "&MOD=TAB&OFFS=00&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy != 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "15" + "&TMN=" + "__" + "&SON=" + windy + "&PRE=" + "08" + "&MOD=TAB&OFFS=00&SORT=SD";

        }
        return finalUrl;
    }

    public String getUrlFinal2() {
        String finalUrl = null;
        if (clear == 0) {
            if (cloudy != 0 && snow == 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

            } else if (cloudy == 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

            } else if (cloudy != 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

            } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=11&SORT=TMAXWC";
            } else {
                if (cloudy != 0 && snow == 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                } else if (cloudy == 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                } else if (cloudy != 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }
            }
        } else if (clear != 0) {
            if (cloudy != 0 && snow == 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

            } else if (cloudy == 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

            } else if (cloudy != 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }

            } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=11&SORT=TMAXWC";
            } else {
                if (cloudy != 0 && snow == 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                } else if (cloudy == 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                } else if (cloudy != 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";
                    }

                } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=11&SORT=TMAXWC";
                }
            }
        }
        //All singles
        else if (clear != 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=11&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy != 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=" + rainy + "&MOD=TAB&OFFS=11&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow != 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + snow + "&SON=__&PRE=__&MOD=TAB&OFFS=11&SORT=TMAXWC";

        } else if (clear == 0 && cloudy != 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "10" + "&TMN=" + "__" + "&SON=" + cloudy + "&PRE=" + "15" + "&MOD=TAB&OFFS=11&SORT=SU";

        } else if (clear == 0 && cloudy == 0 && partly != 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "20" + "&TMN=" + "__" + "&SON=" + partly + "&PRE=" + "10" + "&MOD=TAB&OFFS=11&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog != 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "10" + "&TMN=" + "__" + "&SON=" + cloudy + "&PRE=" + "10" + "&MOD=TAB&OFFS=11&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy != 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "15" + "&TMN=" + "__" + "&SON=" + windy + "&PRE=" + "08" + "&MOD=TAB&OFFS=11&SORT=SD";

        }
        return finalUrl;
    }

    public String getUrlFinal3() {
        String finalUrl = null;
        if (clear == 0) {
            if (cloudy != 0 && snow == 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

            } else if (cloudy == 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

            } else if (cloudy != 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

            } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=21&SORT=TMAXWC";
            } else {
                if (cloudy != 0 && snow == 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                } else if (cloudy == 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                } else if (cloudy != 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }
            }
        } else if (clear != 0) {
            if (cloudy != 0 && snow == 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

            } else if (cloudy == 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

            } else if (cloudy != 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }

            } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=21&SORT=TMAXWC";
            } else {
                if (cloudy != 0 && snow == 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                } else if (cloudy == 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                } else if (cloudy != 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";
                    }

                } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=21&SORT=TMAXWC";
                }
            }
        }
        //All singles
        else if (clear != 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=21&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy != 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=" + rainy + "&MOD=TAB&OFFS=21&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow != 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + snow + "&SON=__&PRE=__&MOD=TAB&OFFS=21&SORT=TMAXWC";

        } else if (clear == 0 && cloudy != 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "10" + "&TMN=" + "__" + "&SON=" + cloudy + "&PRE=" + "15" + "&MOD=TAB&OFFS=21&SORT=SU";

        } else if (clear == 0 && cloudy == 0 && partly != 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "20" + "&TMN=" + "__" + "&SON=" + partly + "&PRE=" + "10" + "&MOD=TAB&OFFS=21&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog != 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "10" + "&TMN=" + "__" + "&SON=" + cloudy + "&PRE=" + "10" + "&MOD=TAB&OFFS=21&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy != 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "15" + "&TMN=" + "__" + "&SON=" + windy + "&PRE=" + "08" + "&MOD=TAB&OFFS=21&SORT=SD";

        }
        return finalUrl;
    }

    public String getUrlFinal4() {
        String finalUrl = null;
        if (clear == 0) {
            if (cloudy != 0 && snow == 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

            } else if (cloudy == 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

            } else if (cloudy != 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

            } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=31&SORT=TMAXWC";
            } else {
                if (cloudy != 0 && snow == 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                } else if (cloudy == 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                } else if (cloudy != 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }
            }
        } else if (clear != 0) {
            if (cloudy != 0 && snow == 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

            } else if (cloudy == 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

            } else if (cloudy != 0 && snow != 0) {

                //Single
                if (partly != 0 && windy == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

                //Double
                else if (partly != 0 && windy != 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly != 0 && windy == 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                } else if (partly == 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

                //Three
                else if (partly != 0 && windy != 0 && fog != 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }

            } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=31&SORT=TMAXWC";
            } else {
                if (cloudy != 0 && snow == 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                } else if (cloudy == 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                } else if (cloudy != 0 && snow != 0) {

                    //Single
                    if (partly != 0 && windy == 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                    //Double
                    else if (partly != 0 && windy != 0 && fog == 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly != 0 && windy == 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + partly + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    } else if (partly == 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + fog + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                    //Three
                    else if (partly != 0 && windy != 0 && fog != 0) {
                        finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=" + windy + "&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";
                    }

                } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                    finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=31&SORT=TMAXWC";
                }
            }
        }
        //All singles
        else if (clear != 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=31&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy != 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=" + rainy + "&MOD=TAB&OFFS=31&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow != 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + snow + "&SON=__&PRE=__&MOD=TAB&OFFS=31&SORT=TMAXWC";

        } else if (clear == 0 && cloudy != 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "10" + "&TMN=" + "__" + "&SON=" + cloudy + "&PRE=" + "15" + "&MOD=TAB&OFFS=31&SORT=SU";

        } else if (clear == 0 && cloudy == 0 && partly != 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "20" + "&TMN=" + "__" + "&SON=" + partly + "&PRE=" + "10" + "&MOD=TAB&OFFS=31&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog != 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "10" + "&TMN=" + "__" + "&SON=" + cloudy + "&PRE=" + "10" + "&MOD=TAB&OFFS=31&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy != 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "15" + "&TMN=" + "__" + "&SON=" + windy + "&PRE=" + "08" + "&MOD=TAB&OFFS=31&SORT=SD";

        }
        return finalUrl;
    }

    private String getUrl(int clear, int cloudy, int partly, int rainy, int windy, int snow, int fog, int currentMonth) {
        String finalUrl = null;

        // All zero
        if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
        }
        //All singles
        else if (clear != 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=__&SON=__&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy != 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=__&SON=__&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow != 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=__&TMN=" + snow + "&SON=__&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";

        } else if (clear == 0 && cloudy != 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "10" + "&TMN=" + "__" + "&SON=" + cloudy + "&PRE=" + "15" + "&MOD=TAB&OFFS=00&SORT=SU";

        } else if (clear == 0 && cloudy == 0 && partly != 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "20" + "&TMN=" + "__" + "&SON=" + partly + "&PRE=" + "10" + "&MOD=TAB&OFFS=00&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog != 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "10" + "&TMN=" + "__" + "&SON=" + cloudy + "&PRE=" + "10" + "&MOD=TAB&OFFS=00&SORT=TMAXWC";

        } else if (clear == 0 && cloudy == 0 && partly == 0 && rainy == 0 && windy != 0 && snow == 0 && fog == 0) {
            finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + "15" + "&TMN=" + "__" + "&SON=" + windy + "&PRE=" + "08" + "&MOD=TAB&OFFS=00&SORT=SD";

        }

        //All twos
        else if (clear != 0) {
            if (cloudy != 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=__&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
            }
            if (cloudy == 0 && partly != 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=__&SON=" + partly + "&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
            }
            if (cloudy == 0 && partly == 0 && rainy != 0 && windy == 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=__&SON=__&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
            }
            if (cloudy == 0 && partly == 0 && rainy == 0 && windy != 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=__&SON=" + windy + "&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
            }
            if (cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow != 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=__&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
            }
            if (cloudy == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog != 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=__&SON=" + fog + "&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
            }
        } else if (cloudy != 0) {
            if (clear != 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + cloudy + "&SON=__&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
            }
            if (clear == 0 && partly != 0 && rainy == 0 && windy == 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=__&SON=" + partly + "&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
            }
            if (clear == 0 && partly == 0 && rainy != 0 && windy == 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=__&SON=__&PRE=" + rainy + "&MOD=TAB&OFFS=00&SORT=TMAXWC";
            }
            if (clear == 0 && partly == 0 && rainy == 0 && windy != 0 && snow == 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=__&SON=" + windy + "&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
            }
            if (clear == 0 && partly == 0 && rainy == 0 && windy == 0 && snow != 0 && fog == 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=" + snow + "&SON=__&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
            }
            if (clear == 0 && partly == 0 && rainy == 0 && windy == 0 && snow == 0 && fog != 0) {
                finalUrl = "https://www.woweather.com/cgi-app/climatesearch?CONT=alle&MONAT=" + currentMonth + "&TMX=" + clear + "&TMN=__&SON=" + fog + "&PRE=__&MOD=TAB&OFFS=00&SORT=TMAXWC";
            }
        }


        return finalUrl;
    }
}
