(ns ogbe.fulcro.mui.icons.note-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NoteSharp" :default NoteSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-note-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoteSharp)))