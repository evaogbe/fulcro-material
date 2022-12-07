(ns ogbe.fulcro.mui.icons.notes-outlined
  #?(:cljs (:require
            ["@mui/icons-material/NotesOutlined" :default NotesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notes-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotesOutlined)))