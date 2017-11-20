package pmh.prograudrink;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Loli Pop on 17-11-2017.
 */

public class GestorJson {

        public String coctelToJson(Coctel p) {

            Gson gson = new GsonBuilder().create();
            String salida = gson.toJson(p);
            return salida;
        }

        public Coctel jsonToCoctel(String json){
            Gson objJson = new Gson();
            Coctel jsonCoctel = objJson.fromJson(json, Coctel.class);
            return jsonCoctel;
        }
    }


