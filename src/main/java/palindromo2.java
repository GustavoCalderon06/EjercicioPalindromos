public class palindromo2 {














    int ind = cadena.length();

        for(int i = 0; i < cadena.length(); ++i) {
        if (!cadena.substring(i, i + 1).equals(cadena.substring(ind - 1, ind))) {
            valor = false;
            break;
        }

        --ind;
    }

        return valor;
    }

