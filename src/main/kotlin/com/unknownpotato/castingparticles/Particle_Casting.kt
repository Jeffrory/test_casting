object Particle_Casting {
    const val MODID = "castingparticles"

    @JvmField
    val LOGGER: Logger = LogManager.getLogger(MODID)

    @JvmStatic
    fun id(path: String) = ResourceLocation(MODID, path)

    fun init() {
        Particle_CastingServerConfig.init()
        initRegistries(
            Particle_CastingActions,
        )
        Particle_CastingNetworking.init()
    }

    fun initServer() {
        Particle_CastingServerConfig.initServer()
    }
}