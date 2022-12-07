(ns ogbe.fulcro.mui.icons.note-outlined
  #?(:cljs (:require
            ["@mui/icons-material/NoteOutlined" :default NoteOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-note-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoteOutlined)))