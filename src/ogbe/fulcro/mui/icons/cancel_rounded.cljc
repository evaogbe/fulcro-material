(ns ogbe.fulcro.mui.icons.cancel-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CancelRounded" :default CancelRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cancel-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CancelRounded)))