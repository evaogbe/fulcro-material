(ns ogbe.fulcro.mui.icons.notes-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NotesSharp" :default NotesSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notes-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotesSharp)))