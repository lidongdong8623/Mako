DESCRIPTION = "Websocket Server Library"
HOMEPAGE = "http://warmcat.com"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=041a1dec49ec8a22e7f101350fd19550"
SRCREV = "3ae1badae7a05e0982e0dfbcb078da3d4b92a81d"

SRC_URI = "git://git.libwebsockets.org/libwebsockets;branch=master;protocol=git"

S = "${WORKDIR}/git"

DEPENDS = "openssl"

inherit cmake

PACKAGES += "${PN}-test"

FILES_${PN}-test = "/usr/share/libwebsockets-test-server/*"
