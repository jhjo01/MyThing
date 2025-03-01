import { useEffect, useState } from "react";
import checked from "../../../asset/images/checked.png";
import styles from "./NoteClass.module.scss";
import { END_POINT } from "../../../constants";

const NoteClass = (props) => {
  const [isSelected, setIsSelected] = useState("");

  useEffect(() => {
    if (props.isSelected === true) {
      setIsSelected(styles.is_selected);
    } else {
      setIsSelected("");
    }
  }, [props.isSelected]);

  const name = props.name;
  const no = props.no;
  const koName = props.koName;
  const handleClassClick = () => {
    props.onClick({ no, name, koName });
  };
  return (
    <>
      <div key={props.no} className={styles.preference_item}>
        <img className={`${styles.checked} ${isSelected}`} src={checked} alt="checked" />
        <img
          src={`${END_POINT}/find-image/images/note_class/${props.no}.png`}
          alt={name}
          onClick={handleClassClick}
          draggable="false"
        />
        <p>{props.koName}</p>
      </div>
    </>
  );
};

export default NoteClass;
