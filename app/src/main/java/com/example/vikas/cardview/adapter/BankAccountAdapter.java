package com.example.vikas.cardview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vikas.cardview.R;
import com.example.vikas.cardview.model.Bank_details;

import java.util.Collections;
import java.util.List;

/**
 * Created by vikas on 28/9/17.
 */

public class BankAccountAdapter extends RecyclerView.Adapter<BankAccountAdapter.BankAccountViewHolder> {



    private List<Bank_details> bank_details = Collections.EMPTY_LIST;
    private Context mContext;

    public BankAccountAdapter(Context mContext, List<Bank_details> bank_details)
    {
        this.mContext= mContext;
        this.bank_details=bank_details;
    }



    @Override
    public BankAccountViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_list,parent,false);


        return new BankAccountViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(BankAccountViewHolder holder, int position) {

        Bank_details  details= bank_details.get(position);
        holder.BankName.setText(details.getBank_name());
        holder.Account_number.setText(details.getAccount_number());
        holder.Bank_Balance.setText(details.getBank_balance());
        holder.Transaction_date.setText(details.getDate_of_transaction());

    }

    @Override
    public int getItemCount() {
       return bank_details.size();
    }






    public class BankAccountViewHolder extends RecyclerView.ViewHolder {


        public TextView BankName;
        public TextView Bank_Balance;
        public TextView Transaction_date;
        public TextView Account_number;
        public TextView Title;


        public BankAccountViewHolder(View v) {
            super(v);
            BankName = (TextView) v.findViewById(R.id.BankName);
            Bank_Balance = (TextView) v.findViewById(R.id.bank_balance);
            Transaction_date = (TextView) v.findViewById(R.id.transaction_date);
            Account_number = (TextView) v.findViewById(R.id.account_number);
           // Title = (TextView) v.findViewById(R.id.title);
        }
    }
}
