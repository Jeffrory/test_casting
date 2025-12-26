object Particle_CastingClient {
    fun init() {
        Particle_CastingClientConfig.init()
    }

    fun getConfigScreen(parent: Screen): Screen {
        return AutoConfig.getConfigScreen(Particle_CastingClientConfig.GlobalConfig::class.java, parent).get()
    }
}