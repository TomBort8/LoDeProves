package es.iesmz;

public class EmpleadoBR {

    public static float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra){
        float salarioBase = 0;

        if(tipo == null || ventasMes<0 || horasExtra<0){
            return -1;
        }

        if(tipo.equals(TipoEmpleado.venedor)){ salarioBase=1000;}
        else if (tipo.equals((TipoEmpleado.encarregat) )) {salarioBase=1500;}

        if(ventasMes>=1500){salarioBase+=200;}
        else if (ventasMes>1000) {salarioBase+=100;}

        salarioBase = salarioBase + horasExtra*20;

        return salarioBase;
    }

    public static float calculaSalarioNeto(float salarioBruto){
        if(salarioBruto<0){return -1;}

        int retencion = 0;

        if(salarioBruto>1500){retencion = 18;}
        else if (salarioBruto > 1000){retencion=16;}

        return (salarioBruto*(1-(retencion/100)));

    }
}
