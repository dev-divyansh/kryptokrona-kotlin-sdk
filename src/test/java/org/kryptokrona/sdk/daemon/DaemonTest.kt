package org.kryptokrona.sdk.daemon;

import inet.ipaddr.HostName
import org.junit.jupiter.api.Test
import org.kryptokrona.sdk.exception.network.NetworkBlockCountException
import java.net.UnknownHostException
import kotlin.test.assertFailsWith

class DaemonTest {

    private var correctDaemonUrl: String = "swepool.org:11898"
    private var incorrectDaemonUrl: String = "mjovanc.kryptokrona.se:11898"

    @Test
    fun `can initialize daemon`() {
        val daemon = DaemonImpl(HostName(correctDaemonUrl), false)
        daemon.init()
    }

    @Test
    fun `can not initialize daemon with bad dns resolution`() {
        assertFailsWith<UnknownHostException> {
            val daemon = DaemonImpl(HostName(incorrectDaemonUrl), false)
            daemon.init()
        }
    }

    @Test
    fun `can not initialize daemon with a network block count of 0`() {
        assertFailsWith<NetworkBlockCountException> {
            val daemon = DaemonImpl(HostName(correctDaemonUrl), false)
            daemon.init()
            daemon.networkBlockCount = 0
        }
    }

    @Test
    fun `node status is OK when getting fee info`() {
        val daemon = DaemonImpl(HostName(correctDaemonUrl), false)
        daemon.init()
        daemon.updateFeeInfo()
        // status = daemon.
    }

}
