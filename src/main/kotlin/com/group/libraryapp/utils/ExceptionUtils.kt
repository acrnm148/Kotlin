import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.findByIdOrNull

fun fail(): Nothing {
    throw IllegalArgumentException()
}

// 확장함수 -> findByIdOrThrow 이 함수를 마치 CrudRepository 안에 있는 함수처럼 사용할 수 있게해주는 기능
fun <T, ID> CrudRepository<T, ID> .findByIdOrThrow(id:ID) : T {
    return this.findByIdOrNull(id) ?: fail() //this: CrudRepository
}