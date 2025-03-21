# Doctoolchain Bug 1426 Demo
https://github.com/docToolchain/docToolchain/issues/1426

1. Change to repo root dir.
2. Copy .env.example to .env and fill out.
3. Run docker
```
docker run --rm -it --name dtc --mount type=bind,src=.,dst=/project --entrypoint bash doctoolchain/doctoolchain:v3.4.1
```
3. Inside container run:
```
cd /project
chmod +x /home/dtcuser/docToolchain/bin/doctoolchain
source .env
```
Example for Confluence API URL: https://your.confluence.instance/rest/api/  
  
4. Inside docker container run dtc:
```
doctoolchain . generateHTML publishToConfluence -PmainConfigFile="docToolchainConfig.groovy" ${GRADLE_PROXY_SETTINGS}
```