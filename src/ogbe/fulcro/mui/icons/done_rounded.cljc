(ns ogbe.fulcro.mui.icons.done-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DoneRounded" :default DoneRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-done-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoneRounded)))