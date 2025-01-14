// Copyright (c) 2022-2023, The Kryptokrona Developers
//
// Written by Marcus Cvjeticanin
//
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without modification, are
// permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice, this list of
//    conditions and the following disclaimer.
//
// 2. Redistributions in binary form must reproduce the above copyright notice, this list
//    of conditions and the following disclaimer in the documentation and/or other
//    materials provided with the distribution.
//
// 3. Neither the name of the copyright holder nor the names of its contributors may be
//    used to endorse or promote products derived from this software without specific
//    prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
// EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
// MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
// THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
// PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
// INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
// STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF
// THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package org.kryptokrona.sdk.http.model.response.block

import kotlinx.serialization.Serializable

@Serializable
data class BlockDetailBlockTransaction(
    val blockHash: String,
    val blockIndex: Long,
    val extra: BlockDetailBlockTransactionExtra,
    val fee: Long,
    val hash: String,
    val inBlockchain: Boolean,
    val inputs: List<BlockDetailBlockTransactionInput>,
    val mixin: Long,
    val outputs: List<BlockDetailBlockTransactionOutput>,
    val paymentId: String,
    // val signatures: List<String>, // TODO need to make an object for signatures to deserialize properly (JSON input: .....00000000000000","signatures":[{"first":0,"second":"fca84566a.....)
    val signaturesSize: Long,
    val size: Long,
    val timestamp: Long,
    val totalInputsAmount: Long,
    val totalOutputsAmount: Long,
    val unlockTime: Long
)
