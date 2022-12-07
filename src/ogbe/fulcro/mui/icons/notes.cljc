(ns ogbe.fulcro.mui.icons.notes
  #?(:cljs (:require
            ["@mui/icons-material/Notes" :default Notes]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notes
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Notes)))