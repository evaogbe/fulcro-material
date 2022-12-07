(ns ogbe.fulcro.mui.icons.notes-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/NotesTwoTone" :default NotesTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notes-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotesTwoTone)))