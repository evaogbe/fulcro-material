(ns ogbe.fulcro.mui.icons.pending-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PendingRounded" :default PendingRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pending-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PendingRounded)))