
    public interface Vehiculo {
        public static final int VELOCIDAD_MAXIMA = 160;
        public static final char CLASIFICACION_EFICIENCIA = 'A';

        public boolean ecender();
        public boolean apagar();
        public void avanzar();
        public void frenar();
}

