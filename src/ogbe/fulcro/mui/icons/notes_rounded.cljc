(ns ogbe.fulcro.mui.icons.notes-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NotesRounded" :default NotesRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notes-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotesRounded)))