(ns ogbe.fulcro.mui.icons.pending-actions-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PendingActionsOutlined" :default PendingActionsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pending-actions-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PendingActionsOutlined)))