import java.net.URL
val url = "https://huggingface.co.evil.com/models"
println(url.startsWith("https://huggingface.co"))
println(URL(url).host == "huggingface.co")
