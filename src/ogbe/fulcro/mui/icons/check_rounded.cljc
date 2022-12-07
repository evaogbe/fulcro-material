(ns ogbe.fulcro.mui.icons.check-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CheckRounded" :default CheckRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckRounded)))