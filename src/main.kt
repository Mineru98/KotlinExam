interface ICommonResponse {
    var code: Int
}

class CommonResponse: ICommonResponse {
    override var code: Int
    constructor(code: Int) {
        this.code = code
    }
}

fun main() {
    val res: CommonResponse = CommonResponse(200)
    println("code : ${res.code}")
    res.code = 204
    println("code : ${res.code}")
}
