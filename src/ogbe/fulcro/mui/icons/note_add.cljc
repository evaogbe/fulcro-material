(ns ogbe.fulcro.mui.icons.note-add
  #?(:cljs (:require
            ["@mui/icons-material/NoteAdd" :default NoteAdd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-note-add
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoteAdd)))