FROM gitpod/workspace-full:2024-09-12-15-52-34

USER gitpod

SHELL ["/bin/bash", "-c"]
RUN source "/home/gitpod/.sdkman/bin/sdkman-init.sh"  \
    && sdk install java 21.0.4-tem < /dev/null

# serve the build folder
RUN sudo apt-get update && sudo apt-get install -y python3
EXPOSE 8000

# install VNC server and X virtual framebuffer
RUN sudo apt-get update && sudo apt-get install -y \
    x11vnc xvfb
EXPOSE 5900