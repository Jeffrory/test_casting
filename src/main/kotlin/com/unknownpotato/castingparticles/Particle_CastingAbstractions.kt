fun initRegistries(vararg registries: Particle_CastingRegistrar<*>) {
    for (registry in registries) {
        initRegistry(registry)
    }
}

@ExpectPlatform
fun <T : Any> initRegistry(registrar: Particle_CastingRegistrar<T>) {
    throw AssertionError()
}