package com.example.macbookair.basic_it;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by macbookair on 1/13/18.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private Context mContext;
    private List<Person> personList;

    public PersonAdapter(Context mContext, List<Person> personList) {
        this.mContext = mContext;
        this.personList = personList;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_view, null);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        Person person = personList.get(position);
        holder.nameText.setText(person.getName());
        holder.surnameText.setText(person.getSurname());
        holder.changeImage(person.getSex());
    }

    @Override
    public int getItemCount() {
        return personList.size() > 0 ? personList.size() : 0;
    }


    class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView imageView;
        private TextView nameText;
        private TextView surnameText;
        private RelativeLayout mainLayout;

        public PersonViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            nameText = itemView.findViewById(R.id.name_text);
            surnameText = itemView.findViewById(R.id.surname_text);
            mainLayout = itemView.findViewById(R.id.item_main_layout);
            mainLayout.setOnClickListener(this);
        }

        public void changeImage(boolean gender) {

            if (!gender)
                imageView.setImageBitmap(BitmapFactory.decodeResource(mContext.getResources(), R.drawable.female));

            else
                imageView.setImageBitmap(BitmapFactory.decodeResource(mContext.getResources(), R.drawable.male));
        }


        @Override
        public void onClick(View v) {
            Intent i = new Intent(mContext, InformationActivity.class);
            i.putExtra("Name", nameText.getText().toString());
            i.putExtra("Surname", surnameText.getText().toString());
            mContext.startActivity(i);
        }
    }
}

