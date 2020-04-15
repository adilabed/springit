package com.myc.springit.domain;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Getter @Setter
@ToString
@NoArgsConstructor
public class Vote extends Auditable {

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private int vote;

    //user
    //link
}
