def call(def AWS_ACCESS_KEY, def AWS_SECRET_KEY, def AWS_REGION) {
    sh "echo Test from pipeline folder"
    sh "aws configure set aws_access_key_id ${AWS_ACCESS_KEY} \
       && aws configure set aws_secret_access_key ${AWS_SECRET_KEY} \
       && aws configure set default.region ${AWS_REGION}"
}
