(ns ogbe.fulcro.mui.icons.redo-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RedoRounded" :default RedoRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-redo-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RedoRounded)))