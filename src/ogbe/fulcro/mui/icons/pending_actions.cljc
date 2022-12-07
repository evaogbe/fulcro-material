(ns ogbe.fulcro.mui.icons.pending-actions
  #?(:cljs (:require
            ["@mui/icons-material/PendingActions" :default PendingActions]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pending-actions
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PendingActions)))