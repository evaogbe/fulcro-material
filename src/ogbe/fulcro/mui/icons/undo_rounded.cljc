(ns ogbe.fulcro.mui.icons.undo-rounded
  #?(:cljs (:require
            ["@mui/icons-material/UndoRounded" :default UndoRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-undo-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UndoRounded)))