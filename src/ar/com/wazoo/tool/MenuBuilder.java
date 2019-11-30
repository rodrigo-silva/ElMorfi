package ar.com.wazoo.tool;

import java.util.List;
import java.util.Set;
import ar.com.wazoo.model.Plato;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class MenuBuilder {

    private Set<Plato> platos;

    public MenuBuilder(final Set<Plato> platos) {
        this.platos = platos;
    }

    public List<Plato> generateMenuVerano() {
        List<Plato> menu = Lists.newArrayList();

        //copia temp de los platos y si podes mezclalos
        //for hasta x numero (semana o mes completo)
          //while hasta que conseguis uno
            //iterar el temp
              // si cumple las condiciones (metodo separados: frio, colisiona, carbohidrato) break
            //conseguiste?
              //remove del temp, lo agregas
            //else
              //hay que recargar el temp  y volver a empezar (o buscar el en original ... y sacar el while)

        return null;
    }
}