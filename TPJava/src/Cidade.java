import java.lang.Math;

public class Cidade {
    private static final int EARTH_RADIUS = 6371;
    private String nome, estado;
    private double latitude, longitude;
    
    public Cidade(String[] s){
        this.nome = s[0];
        this.estado = s[1];
        this.latitude = Double.parseDouble(s[2]);
        this.longitude = Double.parseDouble(s[3]);
        }

    public String nome(){
        return this.nome;
    }

    public String estado(){
        return this.estado;
    }

    public Double latitude(){
        return this.latitude();
    }

    public Double longitude(){
        return this.longitude();
    }

    public Double distancia(Cidade cid){
            // Converter graus para radianos
            double lat1Rad = Math.toRadians(latitude);
            double lon1Rad = Math.toRadians(longitude);
            double lat2Rad = Math.toRadians(cid.latitude());
            double lon2Rad = Math.toRadians(cid.longitude());
    
            // Diferença das latitudes e longitudes
            double latDiff = lat2Rad - lat1Rad;
            double lonDiff = lon2Rad - lon1Rad;
    
            // Fórmula de Haversine
            double a = Math.sin(latDiff / 2) * Math.sin(latDiff / 2)
                    + Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(lonDiff / 2) * Math.sin(lonDiff / 2);
            double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
            double distance = EARTH_RADIUS * c;
    
            return distance;
        }
        
}
