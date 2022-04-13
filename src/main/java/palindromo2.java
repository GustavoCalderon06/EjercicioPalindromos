
    public palindromo2() {
    }

    public boolean espalindromo(String cadena) {
        boolean valor = true;
        StringBuilder cadena2 = new StringBuilder();

        for (int x = 0; x < cadena.length(); ++x) {
            if (cadena.charAt(x) != ' ') {
                cadena2.append(cadena.charAt(x));
            }
        }

        cadena = cadena2.toString();














}



