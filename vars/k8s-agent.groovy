def call(Map agentprops) {
 agent {
    kubernetes {
      label agentprops.name
      defaultContainer 'jnlp'
      yaml """
apiVersion: v1
kind: Pod
metadata:
  labels:
    some-label: some-label-value
spec:
  containers:
  - name: agentprops.name
    image: agentprops.image
    command:
    - cat
    tty: true
"""
    }
  }
}
