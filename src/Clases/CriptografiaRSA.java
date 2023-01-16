package Clases;
/*
 * @author YG
 */
import java.math.BigInteger;
import java.util.*;

public final class CriptografiaRSA {

    int tamPrimo;
    BigInteger n, q, p;
    BigInteger totient;
    BigInteger e, d;
    
    public CriptografiaRSA(){
        
    }

    public CriptografiaRSA(int tamPrimo) {
        this.tamPrimo = tamPrimo;
        generaPrimos();             //Genera p y q
        generaClaves();             //Genera e y d
    }

    public void generaPrimos() {
        p = new BigInteger(tamPrimo, 10, new Random());
        do {
            q = new BigInteger(tamPrimo, 10, new Random());
        } while (q.compareTo(p) == 0);
    }

    public void generaClaves() {
        n = p.multiply(q);
        totient = p.subtract(BigInteger.valueOf(1));
        totient = totient.multiply(q.subtract(BigInteger.valueOf(1)));
        do {
            e = new BigInteger(2 * tamPrimo, new Random());
        } while ((e.compareTo(totient) != -1)
                || (e.gcd(totient).compareTo(BigInteger.valueOf(1)) != 0));
        d = e.modInverse(totient);
    }

    public BigInteger[] encripta(String mensaje) {
        int i;
        byte[] temp = new byte[1];
        byte[] digitos = mensaje.getBytes();
        BigInteger[] bigdigitos = new BigInteger[digitos.length];

        for (i = 0; i < bigdigitos.length; i++) {
            temp[0] = digitos[i];
            bigdigitos[i] = new BigInteger(temp);
        }

        BigInteger[] encriptado = new BigInteger[bigdigitos.length];

        for (i = 0; i < bigdigitos.length; i++) {
            encriptado[i] = bigdigitos[i].modPow(e, n);
        }

        return (encriptado);
    }


    public String desencripta(BigInteger[] encriptado) {
        BigInteger[] desencriptado = new BigInteger[encriptado.length];
        
             
        for (int i = 0; i < desencriptado.length; i++) {
            desencriptado[i] = encriptado[i].modPow(d, n);
        }

        char[] charArray = new char[desencriptado.length];

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (desencriptado[i].intValue());
        }

        return (new String(charArray));
    }

    public BigInteger getD() {
        return d;
    }

    public void setD(BigInteger d) {
        this.d = d;
    }

    public BigInteger getE() {
        return e;
    }

    public void setE(BigInteger e) {
        this.e = e;
    }

    public BigInteger getN() {
        return n;
    }

    public void setN(BigInteger n) {
        this.n = n;
    }

    public BigInteger getP() {
        return p;
    }

    public void setP(BigInteger p) {
        this.p = p;
    }

    public BigInteger getQ() {
        return q;
    }

    public void setQ(BigInteger q) {
        this.q = q;
    }

    public int getTamPrimo() {
        return tamPrimo;
    }

    public void setTamPrimo(int tamPrimo) {
        this.tamPrimo = tamPrimo;
    }

    public BigInteger getTotient() {
        return totient;
    }

    public void setTotient(BigInteger totient) {
        this.totient = totient;
    }


}