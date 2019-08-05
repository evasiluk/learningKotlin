class Car(private var weight: Double, private var size: Int) {
    private val isNew: Boolean = true;
    private val model: String = "Impreza"

    fun getIsNew():Boolean {
        return isNew;
    }

    fun getModel(): String {
        return model;
    }

}