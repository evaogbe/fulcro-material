(ns ogbe.fulcro.mui.icons.pending-actions-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PendingActionsRounded" :default PendingActionsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pending-actions-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PendingActionsRounded)))