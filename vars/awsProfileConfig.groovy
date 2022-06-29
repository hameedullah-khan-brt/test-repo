def call(def aws_access_key_id, def aws_secret_key_id, def aws_region) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    AWS_ACCESS_KEY = credentials(aws_access_key_id)
    AWS_SECRET_KEY = credentials(aws_secret_key_id)
    AWS_REGION = aws_region
    sh "aws configure set aws_access_key_id ${AWS_ACCESS_KEY} \
        && aws configure set aws_secret_access_key ${AWS_SECRET_KEY} \
        && aws configure set default.region ${AWS_REGION}"

}
