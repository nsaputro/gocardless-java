package gocardless.utils;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Wrapper around gson
 */
public class JsonUtils {
  
  public static final Gson gson = new GsonBuilder()
    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    .create();

  public static <T> T fromJson(String json, Class<T> clazz) {
    return gson.fromJson(json, clazz);
  }
  
}