def call(def aws_access_key_id, def aws_secret_key_id, def aws_region) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    sh "echo ${aws_access_key_id}"

}
