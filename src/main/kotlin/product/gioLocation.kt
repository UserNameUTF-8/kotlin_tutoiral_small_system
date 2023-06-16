package product


class gioLocation(private var latitude : Double, private var longitude: Double) {

    fun getLatitude(): Double {
        return latitude
    }
    fun getLongitude() : Double {
        return latitude
    }

    fun setLatitude(Lat: Double) {
        this.latitude = Lat
    }
    fun setLongitude(Lon: Double) {
        this.longitude = Lon
    }


    override fun equals(other: Any?): Boolean {
        if (other != null) {
            if (javaClass == other.javaClass) {
                other as gioLocation
                return other.getLatitude() == latitude && other.getLongitude() == longitude
            }


        }
        return false
    }


    override fun toString(): String {
        return "Latitude: $latitude Longitude: $longitude"
    }

}