(ns ogbe.fulcro.mui.icons.note-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NoteRounded" :default NoteRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-note-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoteRounded)))