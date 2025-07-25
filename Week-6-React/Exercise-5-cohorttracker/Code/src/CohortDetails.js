import React from 'react';
import styles from './CohortDetails.module.css';

const cohortData = [
  {
    name: 'INTADMDF10 - NET FSD',
    startedOn: '22-Feb-2022',
    currentStatus: 'Scheduled',
    coach: 'Aathma',
    trainer: 'Jojo Jose',
  },
  {
    name: 'ADM21JF014 - Java FSD',
    startedOn: '10-Sep-2021',
    currentStatus: 'Ongoing',
    coach: 'Apoorv',
    trainer: 'Elisa Smith',
  },
  {
    name: 'CDBJF21025 - Java FSD',
    startedOn: '24-Dec-2021',
    currentStatus: 'Ongoing',
    coach: 'Aathma',
    trainer: 'John Doe',
  },
];

function CohortDetails() {
  return (
    <div>
      <h2>Cohorts Details</h2>
      <div style={{ display: 'flex' }}>
        {cohortData.map((cohort, index) => (
          <div key={index} className={styles.box}>
            <h3
              className={
                cohort.currentStatus === 'Ongoing' ? styles.ongoing : styles.other
              }
            >
              {cohort.name}
            </h3>
            <dl>
              <dt>Started On</dt>
              <dd>{cohort.startedOn}</dd>

              <dt>Current Status</dt>
              <dd>{cohort.currentStatus}</dd>

              <dt>Coach</dt>
              <dd>{cohort.coach}</dd>

              <dt>Trainer</dt>
              <dd>{cohort.trainer}</dd>
            </dl>
          </div>
        ))}
      </div>
    </div>
  );
}

export default CohortDetails;