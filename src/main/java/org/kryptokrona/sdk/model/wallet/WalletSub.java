package org.kryptokrona.sdk.model.wallet;

import io.reactivex.rxjava3.core.Observable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.kryptokrona.sdk.model.transaction.Transaction;

import java.util.List;
import java.util.Map;

/**
 * SubWallet.java
 * <p>
 * Represents a subwallet.
 *
 * @author Marcus Cvjeticanin (@mjovanc)
 */
@Getter
@Setter
@NoArgsConstructor
public class WalletSub {

	/**
	 * Whether the wallet is a view only wallet (cannot send transactions,
	 * only can view)
	 */
	private boolean isViewWallet;

	/**
	 * The public spend keys this wallet contains. Used for verifying if a
	 * transaction is ours.
	 */
	private List<String> publicSpendKeys;

	/**
	 * Mapping of public spend key to subwallet
	 */
	private Map<String, WalletSub> subWallets;

	/**
	 * Our transactions
	 */
	private List<Transaction> transactions;

	/**
	 * Transactions we sent, but haven't been confirmed yet
	 */
	private List<Transaction> lockedTransactions;

	/**
	 * The shared private view key
	 */
	private String privateViewKey;

	/**
	 * A mapping of transaction hashes, to transaction private keys
	 */
	private Map<String, String> transactionPrivateKeys;

	/**
	 * A mapping of key images to the subwallet public spend key that owns them
	 */
	private Map<String, String> keyImageOwners;

	public WalletSub(boolean isViewWallet, Map<String, WalletSub> subWallets, List<String> publicSpendKeys, String privateViewKey) {
		this.isViewWallet = isViewWallet;
		this.publicSpendKeys = publicSpendKeys;
		this.subWallets = subWallets;
		this.privateViewKey = privateViewKey;
	}

	public static Observable<List<WalletSub>> init() {
		return Observable.empty();
	}

	public void initKeyImageMap() {

	}

	public void pruneSpentInputs(long pruneHeight) {

	}

	public void reset(long scanHeight, long scanTimestamp) {

	}

	public void rewind(long scanHeight) {

	}


}
